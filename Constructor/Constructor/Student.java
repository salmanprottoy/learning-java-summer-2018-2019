class Student{
	//Fields Declaration
	private String id,name;
	private float cgpa;
	private static String universityName="AIUB";
	//Constructors

	//Parameterless Constructor
	public Student(){
		this.id=this.name=null;
		this.cgpa=0.0f;
		System.out.println("Parameterless Constructor is called..");
	}
	//Example of Constructor Overloading and Chaining
	//Parameterized Constructor
	public Student(String id,String name,float cgpa){
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		System.out.println("Parameterized Constructor is called..");
	}

	//Parameterized Constructor
	public Student(String name,float cgpa,String id){
		this(id,name,cgpa);
		System.out.println("Parameterized Constructor reduced..");
	}

	//Copy Constructor
	public Student(Student std){
		this.id=std.id;
		this.name=std.name;
		this.cgpa=std.cgpa;
	}

	//Setter Methods
	public void setId(String id){
		this.id=id;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setCgpa(float cgpa){
		this.cgpa=cgpa;
	}

	//Getter Methods
	public String getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public float getCgpa(){
		return this.cgpa;
	}

	public static String getUniversity(){
		return Student.universityName;
	}

	public static String staticMethod(Student s){
		return s.name;
	}
	public void showInfo(){
		System.out.println("Name: "+this.name+"\nId: "+this.id+"\nCGPA: "+this.cgpa);
		System.out.println("University: "+Student.universityName);		
	}

}