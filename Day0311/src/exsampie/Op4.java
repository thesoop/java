package exsampie;

public class Op4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20;
		System.out.println(a==10 && b==20);
		System.out.println(a>10 && b==20);
		System.out.println(a==10 && b==10);
		System.out.println(a<10 && b>20);
		
		System.out.println(a==10 || b==20);
		System.out.println(a>10 || b==20);
		System.out.println(a==10 || b==10);
		System.out.println(a<10 || b>20);
		
		int i = 7;
		System.out.println(i>3 && i<5);
		
		
		int x = -10;
		int absX = x>=0?x:-x;
		System.out.println(absX);
		
		int score =50;
		char grade = score >=90?'A': (score >=80? 'B':'C');
		System.out.println(grade);
		
		byte t = (byte)128;
			System.out.println(t);
			
		
				
		
	}

}
