import java.util.Scanner;

public class EvaluaEdad {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner entrada= new Scanner(System.in);
	        
	        System.out.println("Introduce tu edad");
	        
	        int edad = entrada.nextInt();// nextInt hace referencia a la entrada de un entero.
	        
	        if(edad>=18){
	           
	            System.out.println("Eres mayor de edad");
	            
	                    
	        }else{
	        	
	        	System.out.println("Eres menor de edad");
	            
	        }
	    }
	    
	}

