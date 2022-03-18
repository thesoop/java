
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int x = -10;
//		if(x>=x.=0?x:-x) {
//			System.out.println(x);
//		}
		
//		int a=0;   //배열을 배우면 해결된다
//		for(a=1; a<8; a++)
//		{
//			System.out.printf("월%d\n".formatted(a));
//		}
//		
		
		int num=1;
		num = num++;
		System.out.println("월"+num);
		num++;
		System.out.println("화"+num);
		num++;
		System.out.println("수"+num);
		num++;
		System.out.println("목"+num);
		num++;
		System.out.println("금"+num);
		num++;
		System.out.println("토"+num);
		num++;
		System.out.println("일"+num);
		
		int i =0;
		for (i=0; i<7;i++)
		{
			num++;
			System.out.println("알의 개수"+num);
		}
		
		

	}

}
