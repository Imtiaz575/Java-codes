class Animal{
	public int x;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("Its barking");
		this.x = x;
	}
	
}
class Dog extends Animal{
	public int y;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		System.out.println("Its red in color");
		this.y = y;
	}
	
}
public class my_oops_inherit_45_prac {
 public static void main(String[] args) {
	 Animal fg=new Animal();
	 fg.setX(5);
	 System.out.println(fg.getX());
	 Dog gh=new Dog();
	 gh.setY(57);
	 System.out.println(gh.getY());
 }
}
