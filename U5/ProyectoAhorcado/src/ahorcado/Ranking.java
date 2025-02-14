package ahorcado;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Ranking {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy:MM:dd:HH:mm:ss");
    private static final String NOMBRE_ARCHIVO = "./files/ranking.txt";

    public static void guardarPartida(String nombre, int intentosFallidos, Dificultad dificultad, String palabraOculta, int fallos) {

        String fecha = DATE_FORMAT.format(new Date());
        String lineaAguardar = nombre + "," + palabraOculta + "," + dificultad + "," + fallos + "," + fecha;

        try (FileWriter fw = new FileWriter(NOMBRE_ARCHIVO, true)) {
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(lineaAguardar);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println("ERROR al guardar la partida.");
        }
    }

    public static ArrayList<RegistroRanking> leerRanking() throws FileNotFoundException {
        ArrayList<RegistroRanking> lista = new ArrayList<>();
        File archivo = new File(NOMBRE_ARCHIVO);

        if (!archivo.exists()) {
            return lista;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");

                if (campos.length != 5) {
                    System.out.println("Linea ignorada por formato incorrecto: " + linea);
                    continue;
                }

                try {
                    String nombre = campos[0].trim();
                    String palabra = campos[1].trim();
                    Dificultad dificultad = Dificultad.valueOf(campos[2].trim());
                    int fallos = Integer.parseInt(campos[3].trim());
                    Date fecha = DATE_FORMAT.parse(campos[4].trim());

                    RegistroRanking r = new RegistroRanking(nombre, palabra, dificultad, fallos, fecha);
                    lista.add(r);
                } catch (IllegalArgumentException | ParseException e) {
                    System.out.println("Error al procesar la linea: " + linea + " - " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de ranking: " + e.getMessage());
        }

        return lista;
    }

    private static class RegistroRanking {
        String nombre;
        String palabra;
        Dificultad dificultad;
        int fallos;
        Date fecha;

        public RegistroRanking(String nombre, String palabra, Dificultad dificultad, int fallos, Date fecha) {
            this.nombre = nombre;
            this.palabra = palabra;
            this.dificultad = dificultad;
            this.fallos = fallos;
            this.fecha = fecha;
        }
    }

    public static void mostrarRanking() throws FileNotFoundException {
        ArrayList<RegistroRanking> registros = leerRanking();

        if (registros.isEmpty()) {
            System.out.println("No hay partidas guardadas");
            return;
        }

        Collections.sort(registros, new Comparator<RegistroRanking>() {
            @Override
            public int compare(RegistroRanking r1, RegistroRanking r2) {
                int diffDif = r2.dificultad.ordinal() - r1.dificultad.ordinal();
                if (diffDif != 0) {
                    return diffDif;
                }
                int diffFallos = r1.fallos - r2.fallos;
                if (diffFallos != 0) {
                    return diffFallos;
                }
                return r1.fecha.compareTo(r2.fecha);
            }
        });

        System.out.println("Ranking");
        for (RegistroRanking rr : registros) {
            System.out.printf("Jugador: %s | Palabra: %s | Dificultad: %s | Fallos: %d | Fecha: %s%n", rr.nombre, rr.palabra, rr.dificultad, rr.fallos, DATE_FORMAT.format(rr.fecha));
        }
    }
}