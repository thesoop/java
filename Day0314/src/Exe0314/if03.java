package Exe0314;

public class if03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gender=5;
		// gender가 3인 경우 "남자"로 출력
		// gender가 4인 경우 "여자"로 출력
		if(gender==2 || gender==4) // %2로 홀짝으로 해도 좋다
		{
			System.out.println("여자");
		}
		else if (gender==1 || gender==3)
		{
			System.out.println("남자");
		}
		else {
			System.out.println("입력을 잘못");
		}
	}

}
