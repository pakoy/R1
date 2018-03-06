
public class UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] mi_matriz = new int[5];
		
		mi_matriz[0]= 5;
		mi_matriz[1]= 25;
		mi_matriz[2]= 45;
		mi_matriz[3]= 56;
		mi_matriz[4]= 54;
		
		for (int i = 0; i < mi_matriz.length ; i++) {// es interesante poner lenght para asegurar el tamaño maximo de la matriz
			
			System.out.println("El valor del indice "+ (i+1)+ " es " + mi_matriz[i]);
			
		}
	}

}
