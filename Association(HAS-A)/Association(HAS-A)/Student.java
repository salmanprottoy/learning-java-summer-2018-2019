class Student{
   private String id,name;
   private float cgpa;
   private Address address;
   
   
   //Parameterless Constructor
   public Student(){
       this.id=null;
       this.name=null;
       this.cgpa=0.0f;
       this.address=null;
       
   }

   //Parameterized Constructor
   public Student(String id,String name,float cgpa,Address address){
        this.id=id;
        this.name=name;
        this.cgpa=cgpa;
        this.address=address;
        
   }
   public void setId(String id){
        this.id=id;
   }
   public String getId(){
        return this.id;
   }
   public void setName(String name){
        this.name=name;
   }
   public String getName(){
        return this.name;
   }
   public void setCgpa(float cgpa){
        this.cgpa=cgpa;
   }
   public float getCgpa(){
        return this.cgpa;
   }

   public void setAddress(Address address){
      this.address=address;
   }

   public Address getAddress(){
      return this.address;
   }
   
   public void showInfo(){
       System.out.println("Name:"+this.name+
       "\nId:"+this.id+"\nCGPA:"+this.cgpa);
       this.address.showAddress();
   }
}