class Management{
	int id;
	int salary;
	String name;
	
	public void printdetails(){
		System.out.println("Emply id is "+ id);
		System.out.println("Emply name is " + name);
		System.out.println("And Emply salary " + salary);
	}
}
public class my_oops_practice_39_2 {
	public static void main(String[] args) {
		System.out.println("Oops INDUSTRY");
		System.out.println(" ");
		Management comity = new Management();
		Management glue = new Management();
		Management blue = new Management();
		comity.id=780;
		comity.name="divviya";
		comity.salary=35000;
		
		glue.id=781;
		glue.name="Kalyan";
		glue.salary=36000;
		comity.printdetails();
		System.out.println("  ");
	    glue.printdetails();
		System.out.println(glue.id);
		System.out.println(glue.name);
		System.out.println(glue.salary);
	}
}
