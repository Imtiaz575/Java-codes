class Base{
	public int x;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("I am a constructor");
		this.x = x;
	}

	public void printMe() {
		System.out.println("I am constructor");
		
	}
}
 class derived extends Base{
	 public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	 
 }
public class my_oops_inheri_45 {
 public static void main(String[] args) {
	 Base b = new Base();
	 b.setX(9);
	 System.out.println(b.getX());
	 derived d = new derived();
	 d.setY(99);
	 System.out.println(d.getY());
	 
 }
}
