package Project1;

public class Temperature {
	private float value;
	private char scale;
	
	// default constructor
	Temperature(){ // notice NO return type
	value = 0;
	scale = 'C';
	}

	// constructor #2, #3 & #4
	Temperature (float v){
		this();
		value = v;
	}
	Temperature (char s){
		this();
		scale = s;
	}
	Temperature (float v, char s){
		value = v;
		scale = s;
	}
	
	// modifier methods
	public void setValue(float v) {
		this.value = v; // we can use this to explicit which one is 
	}
	public void setScale(char s) {
		scale = s;
	}
	
	// accessor methods
	public float getValue() {
		return value;		
	}
	public char getScale() {
		return scale;
	}
	
	
// Two methods to return the Temperature
// one to return the degrees in Celsius, the other to return the degrees in Fahrenheit
// use the two following format to write the two methods
	// degreesC = 5(degreesF -32)/9
	// degreesF = 9(degreesC/5)+32
	
	public float getTempF() {
		if (scale =='C') { // we assume everything will be in caps
			return 9*(value/5)+32; }
		else if (scale == 'F') {
			return value; }
		return 0;
	}
	
	public float getTempC() {
		if (scale == 'F') {
			return 5*(value+32)/9; }
		else if (scale =='C') {
			return value; }
		return 0;
	}
		
// A comparison method with two parameters. Both of the two parameters are objects of the Temperature
// class (may be in different scales!). This method should return an integer:
	// 0: means the two temperatures are equal
	// 1: means the first temperature is higher than the second one
	// -1:means the first temperature is lower than the second one

		// instance method
	public int compareOne(Temperature A) {
		System.out.print("With instance method we could compare " + this.value + " with ");
		System.out.println(A.value);
	return 0;
	}
	
		// class method
	public static int compare(Temperature A, Temperature B) {
		// NOTICE THE KEY WORD STATIC - Means this is a CLASS method not an instance one
		
		if (A.getScale()=='C' && B.getScale()=='C') {
			System.out.println("\nThey are both C.");
			System.out.println("First temp is: " + A.getValue() + " and second temp is: " + B.getValue());
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println("1 - first temp is higher than second");
			}
			else if (A.getValue() < B.getValue()) {
				System.out.println("-1 - first temp is lower than second");
			}
		}
	
		if (A.getScale()=='F' && B.getScale()=='F') {
			System.out.println("\nThey are both F.");
			System.out.println("First temp is: " + A.getValue() + " and second temp is: " + B.getValue());
			if (A.getValue() == B.getValue()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getValue()) {
				System.out.println("1 - first temp is higher than second");
			}
			else if (A.getValue() < B.getValue()) {
				System.out.println("-1 - first temp is lower than second");
			}
		}
	
		if (A.getScale()=='C' && B.getScale()=='F') {
			System.out.println("\nFirst is C and second is F.");
			System.out.println("First temp is: " + A.getValue() + " and second temp in C is: " + B.getTempC());
			if (A.getValue() == B.getTempC()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getTempC()) {
				System.out.println("1 - first temp is higher than second");
			}
			else if (A.getValue() < B.getTempC()) {
				System.out.println("-1 - first temp is lower than second");
			}
		}
		
		if (A.getScale()=='F' && B.getScale()=='C') {
			System.out.println("\nFirst is F and second is C.");
			System.out.println("First temp is: " + A.getValue() + " and second temp in F is: " + B.getTempF());
			if (A.getValue() == B.getTempF()) {
				System.out.println("0 - two temps are equal");
			}
			else if (A.getValue() > B.getTempF()) {
				System.out.println("1 - first temp is higher than second");
			}
			else if (A.getValue() < B.getTempF()) {
				System.out.println("-1 - first temp is lower than second");
			}
		}
		return 0;
	}
}
	
// Setters are normally void, getters return values
// The constructors are in the Top		
// This is the end of the class code
// Based in the course "Object-Oriented Programming in Java" by MIT lecturer Barbara Hecker