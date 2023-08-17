
public class my_array_2 {
public static void main(String[] args) {
	
	//String[] student= {"harry" , "rupam" , "chaitanna" , "chitra" , "anupama"};
	
	//System.out.println(student[2]);
	int[]marks= {100,99,98,97,96};
	System.out.println(marks.length);
	System.out.println(marks[0]);
	System.out.println(marks[1]);
	System.out.println(marks[2]);
	System.out.println(marks[3]);
	System.out.println(marks[4]);
	System.out.println("using for loop");
	for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
	}
	System.out.println("using for loop in reverse order");
	for(int i=marks.length-1;i>=0;i--) {
		System.out.println(marks[i]);
	}
	System.out.println("using for-each loop");
	for(int element: marks) {
		System.out.println(element);
	}
}
}
