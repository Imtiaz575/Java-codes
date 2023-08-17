class Myemploye{
	int salary;
	String name;
	public int getsalary() {
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name=n;
	}
	
}
   class triangle{
	   int side;
	   int base;
	   int side2;
	   int height;
	    public int areaa() {
	    	return height*base/2;
	    }
	    public int perimeter() {
	    	return side+base+side2;
	    }
   }
public class my_oops_40_class {
  public static void main(String[] args) {
	 triangle bnm = new triangle();
	 bnm.side=5;
	 bnm.base=7;
	 bnm.height=6;
	 bnm.side2=5;
	 System.out.println(bnm.areaa());
	 System.out.println(bnm.perimeter());
  }
}
