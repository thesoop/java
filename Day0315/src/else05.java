import java.util.Scanner;

public class else05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=60, b=70,c=80,d=50,e=30;
		int sum = a+b+c+d+e;
		System.out.print("���߳��� ���� ���հ�� "+sum+"�� �̰� ");
		float aver = sum/5;
		System.out.println("��� ������ "+aver+"�� �Դϴ�");
		System.out.printf("���߳��� ���� ���հ�� %d���̰� ��������� %.1f\n���Դϴ�",sum,aver);
		
		
		int i=4, h=6;
		float w=5.0f;
		float vol = i*h*w;
		System.out.printf("������ ���Ǵ� %.1f\n�Դϴ�",vol);
		
		
		//�Է��� �޾� ¦Ȧ���� �Ǵ�
		Scanner sc =new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int x = sc.nextInt();
	
		if(x%2==0) 
		{
			System.out.println(x+"�� ¦���Դϴ�");
		}
		else 
		{
			System.out.println(x+"�� Ȧ���Դϴ�");
		}
		
		//�Է��� �޾� ���밪���ϱ�, �Է¼����� ������ ���ָ� ������ �ٲ�� �� �������� �ʈd��.
		System.out.println("���ڸ� �Է��ϼ���");
		int y = sc.nextInt();
		if(y>=0)
		{
			System.out.println(y+"�� ���밪��"+y+"�Դϴ�");
		}
		else 
		{
			
			System.out.println(y+"�� ���밪��"+y*-1+"�Դϴ�");
		}

	}

}