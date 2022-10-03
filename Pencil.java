package myProject;

class Pencil {
	private String color = "red";
	public int length;
	public float diameter;
	public static long nextID = 0;
	
	public void setColor (String myColor, int i) {
		color = myColor;
		length = i;
	}

	public String getColor() {
		return color;
	}
}
