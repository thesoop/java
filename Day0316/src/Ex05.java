import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		// values scanned from the specified input stream
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		jumsu=sc.nextInt();
		if(jumsu>=90) 
		{
			System.out.println("A");
		}
		else if(jumsu>=80)
		{
			System.out.println("B");
		}
		else if(jumsu>=70)
		{
			System.out.println("C");
		}
		else if(jumsu>=60)
		{
			System.out.println("D");
		}
		else 
		{
			System.out.println("F");
		}
		
		System.out.println(jumsu>=60?"합격":"불합격");
		

	}

}
