class BasicCalculator implements IBasicCalculatorInterface{

	public double summation(double x, double y){

		System.out.println("Summation of "+x+" and "+y+" is: ");
		return x+y;
	}
	public double subtraction(double x, double y){

		System.out.println("Subtraction of "+x+" and "+y+" is: ");
		return x-y;
	}
	public double multiplication(double x, double y){

		System.out.println("Multiplication of "+x+" and "+y+" is: ");
		return x*y;
	}
	public double division (double x, double y){

		System.out.println("Division of "+x+" and "+y+" is: ");
		return x/y;
	}

}
