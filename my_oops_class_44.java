class ccylinder{
	private int radius;
	private int height;
	
	public ccylinder(int radius, int height) {
		
		this.radius = radius;
		this.height = height;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double surfaceArea() {
		return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
	}
	public double volume() {
		return Math.PI*radius*radius*height;
	}
}
public class my_oops_class_44 {
 public static void main(String[] args) {
	 ccylinder clin = new ccylinder(9,12);
	 //clin.setHeight(12);
	 System.out.println(clin.getHeight());
	 //clin.setRadius(9);
	 System.out.println(clin.getRadius());
	 System.out.println(clin.surfaceArea());
	 System.out.println(clin.volume());
 }
}
