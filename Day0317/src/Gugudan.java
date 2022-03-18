import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("몇 단을 알려줄까요");
		int a = sc.nextInt();
		
		
		for(int i=1; i<10; i++ ) {
			System.out.println(a+"*"+i+"="+a*i);
		}

	}

}
