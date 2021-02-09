class Sample{
	static int z;
	int x=200;
	static{
		System.out.println("From static block:"+new Sample().x);
		z=300;
	}
	static{
		System.out.println("From another static block");
		z=600;
	}
	public static void main(String []args){
		System.out.println("From main method:"+Sample.z);
	}
}