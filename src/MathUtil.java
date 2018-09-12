public class MathUtil {	
	public static int doMath(int number1, int number2, char operator){
		switch(operator){
			case '*':	return number1*number2;
			case '+':	return number1+number2;
			case '-':	return number1-number2;
			default:	return 0;
		}
		
	}
}