import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc =new Scanner(System.in);
//		System.out.println("�ﰢ���� �غ��� ���̸� �Է��ϼ���");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		float c = (float)a*b/2;
//		System.out.println("�ﰢ���� ���̴� "+c+"�Դϴ�.");
//		
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("���� ������?");
		int a = sc.nextInt();
		System.out.println("���� ������?");
		int b = sc.nextInt();
		System.out.println("���� ������?");
		int c = sc.nextInt();
		System.out.println("���� ������?");
		int d = sc.nextInt();
		System.out.println("���� ������?");
		int e = sc.nextInt();
		int x = a+b+c+d+e;
		float y = (float)x/5;
		System.out.printf("�հ�� %d�Դϴ�.\n ����� %.1f�Դϴ�",x,y);
//		System.out.println("�հ�� "+x+"�Դϴ�");
//		System.out.println("����� "+y+"�Դϴ�");

	}

}