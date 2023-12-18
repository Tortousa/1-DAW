import java.util.Scanner;
public class NumeroMes {
    public static void main(String[] args){
     
    Scanner patata = new Scanner(System.in);
    
    System.out.print("Introduce numero del mes:");
        int n1 = patata.nextInt();

    if (n1==1)
    {
    System.out.println("Enero tiene 31 dias");
    } 
    else if (n1==2)
    {
    System.out.println("Febrero tiene 28 dias");
    }
    else if (n1==3)
    {
    System.out.println("Marzo tiene 31 dias");
    }
    else if (n1==4)
    {
    System.out.println("Abril tiene 30 dias");
    }
    else if (n1==5)
    {
    System.out.println("Mayo tiene 31 dias");
    }
    else if (n1==6)
    {
    System.out.println("Junio tiene 30 dias");
    }
    else if (n1==7)
    {
    System.out.println("Julio tiene 31 dias");
    }
    else if (n1==8)
    {
    System.out.println("Agosto tiene 31 dias");
    }
    else if (n1==9)
    {
    System.out.println("Septiembre tiene 30 dias");
    }
    else if (n1==10)
    {
    System.out.println("Octubre tiene 31 dias");
    }
    else if (n1==11)
    {
    System.out.println("Noviembre tiene 30 dias");
    }
    else if (n1==12)
    {
    System.out.println("Diciembre tiene 31 dias");
    }
        else
    {
        System.out.println("Numero del mes no valido");
    }
    System.out.println("Fin del programa");
  }
}
