class ScientificCalculator implements IScientificCalculatorInterface{

	public double XtoY(double x, double y){
		double z=1d;
		for(int i=1;i<=y;i++){
			z=z*x;
		}
		System.out.println("X to Y of "+x+" and "+y+" is: ");
		return z;
	}
	public int factorial(int x){
    int i,fact=1;
		for(i=1;i<=x;i++){
			fact=fact*i;
		}
		System.out.println("Factorial of "+x+" is: ");
		return fact;
	}
}
