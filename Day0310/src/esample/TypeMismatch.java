package esample;

public class TypeMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12, b=13;
		float c =0;
		c = (float)(a+b)/2;
		System.out.println(c);
		
		float f = 12.5f;
		a = (int)f;
		System.out.println(a);
		
		char c1='A';
		System.out.println(c1);
		
		//char c2= ++c1;
		char c2 = (char)(c1+1);
		System.out.println(c2);
		
		
		char c3 = 'y';
		char c4 = (char)(c3-32);
		System.out.println(c4);
				
		
		

	}

}
