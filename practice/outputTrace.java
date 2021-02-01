class outputTrace{
	private int t1;
	private static int t2;
	public void printValues(){
		System.out.println("Output: "+t1+" "+t2);
	}
	public static void main(String[] args){
		outputTrace ot1=new outputTrace();
		ot1.t1=2;
		ot1.t2=5;
		outputTrace ot2=new outputTrace();
		ot2.t2=3;
		outputTrace.t2=4;
		ot2.t1=ot1.t1-- + ++ot1.t2;
		ot1.printValues();
		ot2.printValues();
		outputTrace ot3=ot1;
		ot3.t2=ot2.t1;
		ot3.printValues();
	}
}
