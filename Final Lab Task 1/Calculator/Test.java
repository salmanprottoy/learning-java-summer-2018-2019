class Test{

	public static void main(String args[]){
		BasicCalculator bc=new BasicCalculator();
		System.out.println(bc.summation(5d,6d));
		System.out.println(bc.subtraction(4d,2d));
		System.out.println(bc.multiplication(4d,2d));
		System.out.println(bc.division(6d,2d));
		ScientificCalculator sc=new ScientificCalculator();
		System.out.println(sc.XtoY(2d,4d));
		System.out.println(sc.factorial(4));
	}
}
