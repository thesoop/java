package Exe0314;

public class if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gender=5;
		// gender�� 3�� ��� "����"�� ���
		// gender�� 4�� ��� "����"�� ���
		if(gender==2 || gender==4) // %2�� Ȧ¦���� �ص� ����
		{
			System.out.println("����");
		}
		else if (gender==1 || gender==3)
		{
			System.out.println("����");
		}
		else {
			System.out.println("�Է��� �߸�");
		}
	}

}