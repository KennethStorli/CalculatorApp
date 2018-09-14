public class MathUtil {	
	public static long add(int number1,int number2){
		return number1+number2;
	}
	public static long sub(int number1, int number2){
		return number1-number2;
	}
	public static long mul(int number1, int number2){
		return number1*number2;
	}
	public static long div(int number1, int number2){
		if (number2 == 0){
			throw new IllegalArgumentException("Division by zero");
		}
		return number1/number2;
	}
}