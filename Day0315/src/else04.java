import java.util.Scanner;

public class else04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
	
		if(score>=60) 
		{
			System.out.println("합격");
		} // if가 한줄이면 { } 를 생략할 수 있다. 하지만 {}를 쓰는 것을 생활화 하자
		else 
		{
			System.out.println("불합격");
		}
		System.out.println("키를 입력하세요");
		float height=sc.nextFloat();
		System.out.println("당신의 키는"+height+"입니다");
	}

}
