import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("삼각형의 밑변과 높이를 입력하세요");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		float c = (float)a*b/2;
//		System.out.println("삼각형의 넓이는 "+c+"입니다.");
//		
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("국어 점수는?");
		int a = sc.nextInt();
		System.out.println("영어 점수는?");
		int b = sc.nextInt();
		System.out.println("수학 점수는?");
		int c = sc.nextInt();
		System.out.println("과학 점수는?");
		int d = sc.nextInt();
		System.out.println("음악 점수는?");
		int e = sc.nextInt();
		int x = a+b+c+d+e;
		float y = (float)x/5;
		System.out.printf("합계는 %d입니다.\n 평균은 %.1f입니다",x,y);
//		System.out.println("합계는 "+x+"입니다");
//		System.out.println("평균은 "+y+"입니다");

	}

}
