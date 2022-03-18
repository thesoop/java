import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("대문자 알파벳의 숫자 65~90을 입력하세요");
		
		Scanner sc=new Scanner(System.in);
		int value = sc.nextInt();
		char value2 = (char)value;
		char value3 = (char)(value+32);
		System.out.println(value2+"의 소문자는 "+value3+"입니다");
		
		System.out.println("대문자 알파벳을 입력하세요");
		
		
		char alp = sc.next().charAt(0); // String str=sc.nextInt();   
										//char alp = str.charAt(0)으로 정의 할 수 있다
		char alp1 = (char)alp;
		char alp2 = (char)(alp+32);
		System.out.println(alp+"의 소문자는 "+alp2+"입니다");
		
		
	}

}
