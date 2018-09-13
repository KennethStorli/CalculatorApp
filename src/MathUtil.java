public class MathUtil {	
	public static int doMath(int number1, int number2, char operator){
		switch(operator){
			case '*':	return number1*number2;
			case '+':	return number1+number2;
			case '-':	return number1-number2;
			case '/':	if((number1 != 0)&&(number2 != 0)){
				return number1/number2;
			}else{return 0;}
			default:	return 0;
		}
		
	}
	public static int add(int number1,int number2){
		return number1+number2;
	}
}