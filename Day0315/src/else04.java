import java.util.Scanner;

public class else04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = sc.nextInt();
	
		if(score>=60) 
		{
			System.out.println("�հ�");
		} // if�� �����̸� { } �� ������ �� �ִ�. ������ {}�� ���� ���� ��Ȱȭ ����
		else 
		{
			System.out.println("���հ�");
		}
		System.out.println("Ű�� �Է��ϼ���");
		float height=sc.nextFloat();
		System.out.println("����� Ű��"+height+"�Դϴ�");
	}

}