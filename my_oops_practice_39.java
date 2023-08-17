class employeee{
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
      class Cellphone{
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
      class Square{
	    	int side;
	    	public int area() {
	    		return side*side;
	    	}
	    		public int perimeter() {
	    			return 4*side;
	    		
	    	}
	    }
      class Tommy{
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
public class my_oops_practice_39 {
	public static void main(String[] args) {
/* employeee imtiaz = new employeee();
	 //imtiaz.name="codeWithMything";
	 imtiaz.setName("CodeWithMything");
	 imtiaz.salary=1500;
    System.out.println(imtiaz.getSalary());
		 System.out.println(imtiaz.getName());
		 
		 Cellphone asus= new Cellphone();
		 asus.callFriend();
		 asus.vibrate();
		 asus.ring();
		//problem 3 
		Square sq=new Square();
		sq.side=3;
		System.out.println(sq.area());
		System.out.println(sq.perimeter());*/
		//problem 4
		Tommy player1 =new Tommy();
		player1.fire();
		player1.run();
		player1.hit();
		
	}

}
