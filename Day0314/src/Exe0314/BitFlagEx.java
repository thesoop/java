package Exe0314;

public class BitFlagEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte flag1 = 0b0000001;
		byte flag2 = 0b0000010;
		byte flag3 = 0b0000100;
		byte flag4 = 0b0001000;
		
		byte result = 0b00000000;
		
		result = (byte)(result|flag1);
		System.out.println(Integer.toBinaryString(result));
		
		result = (byte)(result|flag2);
		System.out.println(Integer.toBinaryString(result));
		
		result = (byte)(result|flag3);
		System.out.println(Integer.toBinaryString(result));
		
		result = (byte)(result&~flag1);
		System.out.println(Integer.toBinaryString(result));
		
			

	}

}
