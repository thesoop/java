import java.util.Scanner;

public class else05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60, b=70,c=80,d=50,e=30;
		int sum = a+b+c+d+e;
		System.out.print("나잘난의 성적 총합계는 "+sum+"점 이고 ");
		float aver = sum/5;
		System.out.println("평균 점수는 "+aver+"점 입니다");
		System.out.printf("나잘난의 성적 총합계는 %d점이고 평균점수는 %.1f\n점입니다",sum,aver);
		
		
		int i=4, h=6;
		float w=5.0f;
		float vol = i*h*w;
		System.out.printf("도형의 부피는 %.1f\n입니다",vol);
		
		
		//입력을 받아 짝홀수를 판단
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int x = sc.nextInt();
	
		if(x%2==0) 
		{
			System.out.println(x+"는 짝수입니다");
		}
		else 
		{
			System.out.println(x+"는 홀수입니다");
		}
		
		//입력을 받아 절대값구하기, 입력선언을 위에서 해주면 변수만 바뀌면 더 선언하지 않늕다.
		System.out.println("숫자를 입력하세요");
		int y = sc.nextInt();
		if(y>=0)
		{
			System.out.println(y+"의 절대값은"+y+"입니다");
		}
		else 
		{
			
			System.out.println(y+"의 절대값은"+y*-1+"입니다");
		}

	}

}
