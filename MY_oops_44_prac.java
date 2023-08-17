class Circle{
	private int Radius;
public Circle(int radius) {	
		this.Radius = radius;
		
	}
public int getRadius() {
	return Radius;
}
public void setRadius(int radius) {
	Radius = radius;
}
public double perimeter(){
	return 2*Math.PI*Radius;
}
public double area() {
	return Math.PI*Radius*Radius;
}
}
public class MY_oops_44_prac {
  public static void main(String[] args) {
	  Circle cvb= new Circle(7);
	  System.out.println(cvb.getRadius());
	  System.out.println(cvb.area());
	  System.out.println(cvb.perimeter());
  }
}
