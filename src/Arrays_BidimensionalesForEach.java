
public class Arrays_BidimensionalesForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int matrix[][] = {
				{10,12,18,15,21},
				{0,2,8,5,1},
				{710,412,148,115,421},
				{0,2,1,12,23}
				
		};
	
		for (int[]fila:matrix) {
			
			System.out.println();// con este println formatamos la salida por pantalla en forma de tabla. mas abajo			
			
			for(int z: fila) {
				 System.out.print(z+" ");// junto con este print
				 
			}
		}
	}

}
