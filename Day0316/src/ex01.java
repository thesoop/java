import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�빮�� ���ĺ��� ���� 65~90�� �Է��ϼ���");
		
		Scanner sc=new Scanner(System.in);
		int value = sc.nextInt();
		char value2 = (char)value;
		char value3 = (char)(value+32);
		System.out.println(value2+"�� �ҹ��ڴ� "+value3+"�Դϴ�");
		
		System.out.println("�빮�� ���ĺ��� �Է��ϼ���");
		
		
		char alp = sc.next().charAt(0); // String str=sc.nextInt();   
										//char alp = str.charAt(0)���� ���� �� �� �ִ�
		char alp1 = (char)alp;
		char alp2 = (char)(alp+32);
		System.out.println(alp+"�� �ҹ��ڴ� "+alp2+"�Դϴ�");
		
		
	}

}