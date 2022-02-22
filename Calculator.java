public class Calculator
{  

	int result;
	//Method for addition
	public int add(int num1, int num2){
		result = num1+num2;
		return result;
	}
	//Method for subtraction
	public int substract(int num1, int num2){
		result = num1-num2;
		return result;
	}
     
     public static void main(String args[])
     {
     Calculator c1=new Calculator();
          c1.add(10,20);
     }

}
