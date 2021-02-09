class StudentMain{

	static{
		System.out.println("Hello from static block");
		Student s3=new Student();
		s3.showInfo();
	}

	static{
		System.out.println("Hello from another ->static block");
		int x=10;
		System.out.println("x:"+x);
	}
	public static void main(String []test){


		Student s=new Student("16-xxxxx-1","ABC",3.5f);
		s.showInfo();

		Student s1=new Student("DEF",3.7f,"17-yyyyy-2");
		s1.showInfo();

		Student s2=new Student(s1);
		//s2=s1;   problematic scenario
		//s2.id=s1.id;
		//s2.name=s1.name;
		//s2.cgpa=s1.cgpa;
		s2.showInfo();

		System.out.println("From Outside->University:"+Student.getUniversity());


	}
}