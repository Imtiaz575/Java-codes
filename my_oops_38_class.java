 class employee{
		int id;
		int salary;
		String name;
	
 public void printdetails() {
	System.out.println("My id is "+ id);
	System.out.println("and my name is " + name);
	System.out.println("and my salary " + salary);
	
 }
 }

public class my_oops_38_class {
	
  public static void main(String[] args) {
	  System.out.println("This is oops custom class");
	  employee imtiaz = new employee();
	  employee jack = new employee();
	  imtiaz.id = 22;
	  imtiaz.name="codeWithMe";
	  imtiaz.salary=40000;
	  jack.id = 32;
	  jack.name="codeWithMyfamily";
	  jack.salary=70000;
	  imtiaz.printdetails();
	  jack.printdetails();
	 // System.out.println(imtiaz.id);
	 //System.out.println(imtiaz.name);
	  
  }
}
