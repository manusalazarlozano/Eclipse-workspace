package Project1;

public class Driver {
	
	public static void main (String args[]) {
		if(args.length == 0) {
			System.out.println("No command line arguments entered (from the main).");
		}
		else {
			String arg1 = args[0];
			String arg2 = args[1];
			System.out.println("This is " + arg1+ "and" + arg2);
		}

	float val =12.0f;	
	
	Temperature one = new Temperature();
	Temperature two = new Temperature(val);
	Temperature three = new Temperature('F');
	Temperature four = new Temperature(70,'F');
	
	four.compareOne(one);
//	two.compareOne(four);
	
	one.setValue(12);

//	System.out.println("Temp in C is: " + four.getTempC());
//	System.out.println("Temp in F is: " + four.getTempF());
	
//	The compare method is static wich means it gets called from the class level not the object instances.
	Temperature.compare(one,two);
	Temperature.compare(three, four);
	
	}
}
