package testDebug;

public class HelloWorld {

	public static void main(String[] args) {
		
		int manyEachDay = 0;
		int day = 10;
		int sum = 0;
		for(int i = 0; i <= day; i++) {
			if(0==manyEachDay)
				manyEachDay = 1;
			else
				manyEachDay *= 2;
			sum += manyEachDay;
			
			System.out.println(i + "天之后，史迪仔手中的钱总数是：" +sum);
		}
	}
}
