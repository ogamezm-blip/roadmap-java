package roadmap;

public class Type_Casting {

	public static void main(String[] args) {
		// sintaxis del type casting. Casting Explícito (Narrowing Casting).
		// <datatype> variableName = (<datatype>) value;
		
		// Widening Type Casting
		// sintaxis: larger_data_type variable_name = smaller_data_type_variable;
		
		//Narrowing Type Casting
		// sintaxis: larger_data_type variable_name = smaller_data_type_variable;
		
		
		// Ejemplos de conversión de tipos
		
		// 1. Conversión de Int a Double
		class Main1 {

			  public static void main(String[] args) {

			    // create int type variable

			    int num = 50;

			    System.out.println("The integer value: " + num);

			    // convert into double type

			    double data = num;

			    System.out.println("The double value: " + data);
			    // Imprime 
			    // Integer value: 50
			    // Double value: 50.0
			  }

			}
		
		// 2. Convertir double en int
		class Main2 {

			  public static void main(String[] args) {

			    // create double type variable

			    double num = 50.55;

			    System.out.println("The double value: " + num);

			    // convert into int type

			    int data = (int)num;

			    System.out.println("The integer value: " + data);
			    
			    // Imprime
				//Double value: 50.55
				//Integer value: 50
			  }

			}
			
		
		
		// 3. Convertir Int a String
		class main3 {

		  public static void main(String[] args) {

		    // create int type variable

		    int num = 50;

		    System.out.println("The integer value is: " + num);

		    // convert int to string type

		    String data = String.valueOf(num);

		    System.out.println("The string value is: " + data);

		  }

		}
		// Imprime
		//Integer value: 50
		//String value: 50

		// 4. Converting String to Int
		class Main4 {

		  public static void main(String[] args) {

		    // create string type variable

		    String data = "50";

		    System.out.println("The string value is: " + data);

		    // convert string variable to int

		    int num = Integer.parseInt(data);

		    System.out.println("The integer value is: " + num);
		    
		    // Imprime
			//String value: 50
			//Integer value: 50
		  }

		}
	}

}
