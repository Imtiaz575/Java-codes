class MyMainemploye{
	private int id;
	private String name;
	private int salary;
	
//	public MyMainemploye() {
	//	id=45;
	//	name="my-name";
	//}
	public MyMainemploye(String myName,int myid,int mysalary ) {
		id=myid;
		name=myName;
		 salary=mysalary;
	}
		public String getName() {
			return name;
		}
		public void setName(String n) {
			name=n;
		}
		public void setId(int i) {
			id=i;
		}
		public int getId() {
			return id;
		}
		public int setsalary(int s) {
			return salary =s;
		}
		
		public int getsalary() {
			return salary;
		}
	
}
public class my_oops_class_42 {
  public static void main(String[] args) {
	  MyMainemploye jkl = new MyMainemploye("jack",67,100);
	  MyMainemploye iop = new MyMainemploye("imtiaz",70,1000);
	 // jkl.setName("myconstant");
	  //jkl.setId(40);
	  System.out.println(jkl.getName());
	  System.out.println(jkl.getId());
	  System.out.println(jkl.getsalary());
	  System.out.println(" ");
	  System.out.println(iop.getName());
	  System.out.println(iop.getId());
	  System.out.println(iop.getsalary());
  }
}
