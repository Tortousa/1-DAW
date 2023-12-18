public class Practica28 {
	public static void main(String[] args) {
		
        int[][] numeros = {
                        {2, 7,8,5,0},
                        {3,4,2,7,8},
                        {2, 7,8,5,0},
                        {1,3,2,7,8},
                        {3,11,2,40,7}
                      };

	    for(int i=0; i< numeros.length; i++){
            for(int j=0; j<numeros[i].length; j++){
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();//pone un espacio 
        }
	
    System.out.println("\nFin del programa");
		
	}

}
