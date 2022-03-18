import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력을 받아 짝홀수를 판단
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int x = sc.nextInt();
//		String s = "짝수";	
//		String s2 = "홀수";
		String s3 = (x%2==0) ? "짝수"  : "홀수" ;
//		{
			System.out.println(s3);
//		}
//		else 
//		{
//			System.out.println(x+"는 홀수입니다");
//		}		

	}

}
