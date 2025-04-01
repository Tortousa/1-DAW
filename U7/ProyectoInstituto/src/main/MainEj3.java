package main;

import java.util.List;

import dao.AlumnoDAO;
import dao.AlumnoModuloDAO;
import dao.ModuloDAO;
import modelo.Alumno;
import modelo.AlumnoModulo;
import modelo.Modulo;
import utils.Utils;

public class MainEj3 {
	List<Alumno> listaAlumnos = Utils.leerAlumnos("./files/alumnos.txt");
	List<Modulo> listaModulos = Utils.leerModulos("./files/modulos.txt");
	List<AlumnoModulo> listaAluMod = Utils.leerAluMod("./modulo_alumno.txt");
	
	AlumnoDAO alumnoDAO = new AlumnoDAO();
	ModuloDAO moduloDAO = new ModuloDAO();
	AlumnoModuloDAO amDAO = new AlumnoModuloDAO();
	
	
}
