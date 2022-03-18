
public class FloatingPiont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float y = 3.14f;
		
		System.out.println("y="+(y+y));
		
		System.out.printf("flooting-point:%.8f\n", y);
		System.out.printf("flooting-point:%020.8f\n", y);
		
		System.out.printf("flooting-point:%20.8f\n", y);
		System.out.printf("flooting-point:%.8g\n", y);
		System.out.printf("flooting-point:%.8e\n", y);
		
		System.out.printf("flooting-point:%d\n", 10); //10진수 정수를 출력
		System.out.printf("flooting-point:%o\n", 10); //8진수 정수를 출력
		System.out.printf("flooting-point:%x\n", 10); // 16진수 정수를 출력
		System.out.printf("flooting-point:%b\n", true); // 2진수 출력 서식문자는 없음 %b:논리값
		System.out.printf("flooting-point:%f\n", 3.14);
		
		System.out.printf("flooting-point:%c\n", 'a');
		System.out.printf("flooting-point:%s\n", "abc");
		System.out.printf("flooting-point:%s,%c형,%d세,%.1fcm\n", "홍길동",'B', 20, 180.5);
		
		
		float aVar;
		double bVar;
		
		aVar = 20.1f;
		bVar = 20.1;
		System.out.println("float 타입 :" +aVar);
		System.out.println("double 타입 :" +bVar);

	}

}
