public class String06 {
	public static void main(String args[]) {
		String array[] = {"Ahora", "es", "el ", "momento", "de", "actuar"};
		
		for (int j = 0; j < array.length; j++) {
			for (int i = j + 1; i < array.length; i++) {
				if (array[i].compareTo(array[j]) < 0) {
					String aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
			System.out.println(array[j]);
		}
	}

}
