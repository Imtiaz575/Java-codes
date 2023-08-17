import java.util.Scanner;
public class cbscresult {
	public static void main(String[] args) {
		System.out.println("marksheets");
		
		Scanner a=new Scanner(System.in);
		int sub1,sub2,sub3,sub4,sub5;
		System.out.println("Enter secured marks of subject1 out of 100");
		sub1=a.nextInt();
		System.out.println("Enter secured marks of subject2  out of 100");
		sub2=a.nextInt();
		System.out.println("Enter secured marks of subject3  out of 100");
		sub3=a.nextInt();
		System.out.println("Enter secured marks of subject4  out of 100");
		sub4=a.nextInt();
		System.out.println("Enter secured marks of subject5  out of 100");
		sub5=a.nextInt();
		double percentage;
		 double secured_marks=sub1+sub2+sub3+sub4+sub5;
		System.out.println("total secured marks is"+secured_marks);
		double total_marks=500.00;
		percentage=(secured_marks/total_marks)*100;
		System.out.println("Total percentage is "+percentage);
                System.out.println("ek dil dedo yaro");
		
	}

}
