import java.util.Scanner;

public class else03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu;
		// values scanned from the specified input stream
		Scanner sc=new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		jumsu=sc.nextInt();
		if(jumsu>=90) {
			System.out.println("A");
		}
		else if(jumsu>=80){
			System.out.println("B");
		}
		else if(jumsu>=70){
			System.out.println("C");
		}
		else if(jumsu>=60){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
		if(jumsu >=60) {
			System.out.println("�հ�");
		}
		else {
			System.out.println("���հ�");
		}
	}

}