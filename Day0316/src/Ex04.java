import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("섭씨온도를 입력하세요");
		
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		float b = 1.8f*a+32;
		System.out.println("섭씨 온도는?\n"+a+"\n화씨온도는"+b+"입니다.");

	}

}
