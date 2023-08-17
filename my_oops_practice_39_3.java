class employeeee{
	int salary;
	String name;
	
	public int getSalary(){
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		 name=n;
	}
}
class smartphone{
    public void ring() {
    	System.out.println("ringing");
    }
    public void vibrate() {
    	System.out.println("vibrating");
    }
    public void callFriend() {
    	System.out.println("calling vivek");
    }
    
}
         class square1{
        	 int side;
        	 public int area() {
        		 return side*side;
        	 }
        	 public int perimeter() {
        		 return 4*side;
        	 }
         }
   class symon{
	   public void hit() {
 		  System.out.println("hitting the enemy");
 	  }
 	  public void run() {
 		  System.out.println("running from the enemy");
 	  }
 	  public void fire() {
 		  System.out.println("firing the enemy");
 	  }
   
   }
  public class my_oops_practice_39_3 {
    public static void main(String[] args) {
    	System.out.println("ROLEX INDUSTRY");
    	/*employeee crown=new employeee();
    	crown.setName("Arnabi");
    	crown.salary=34000;
    	System.out.println(crown.getName());
    	System.out.println(crown.getSalary());
    	
    	smartphone lava=new smartphone();
    	lava.ring();
    	lava.vibrate();
    	lava.callFriend();
    	square1 nq=new square1();
    	nq.side=6;
    	System.out.println(nq.area());
    	System.out.println(nq.perimeter());*/
    	symon tube = new symon();
    	tube.hit();
    	tube.run();
    	tube.fire();
    }
}
