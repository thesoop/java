
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
		
		System.out.printf("flooting-point:%d\n", 10); //10���� ������ ���
		System.out.printf("flooting-point:%o\n", 10); //8���� ������ ���
		System.out.printf("flooting-point:%x\n", 10); // 16���� ������ ���
		System.out.printf("flooting-point:%b\n", true); // 2���� ��� ���Ĺ��ڴ� ���� %b:����
		System.out.printf("flooting-point:%f\n", 3.14);
		
		System.out.printf("flooting-point:%c\n", 'a');
		System.out.printf("flooting-point:%s\n", "abc");
		System.out.printf("flooting-point:%s,%c��,%d��,%.1fcm\n", "ȫ�浿",'B', 20, 180.5);
		
		
		float aVar;
		double bVar;
		
		aVar = 20.1f;
		bVar = 20.1;
		System.out.println("float Ÿ�� :" +aVar);
		System.out.println("double Ÿ�� :" +bVar);

	}

}
