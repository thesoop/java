import java.util.Scanner;

public class House04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("1~10까지의 숫자를 입력하세요");
		int i=0;
		
		while(i<11) 
		{
			System.out.println();
			i++;
			i = sc.nextInt();
			if(i==0) 
			{
				System.out.println("0을 입력받았습니다");
				break;
			}
		}
	

	}

}