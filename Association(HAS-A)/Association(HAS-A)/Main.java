class Main{
	public static void main(String[] args) {
		Address address=new Address("23/A","10","Dhaka");
		Student s1=new Student("16-xxxxx-1","Shakib",3.4f,address);
		s1.showInfo();

		Student s2=new Student("16-yyyyy-2","Tamim",3.7f,new Address("13/C","1","Chittagong"));
		s2.showInfo();
	}
}