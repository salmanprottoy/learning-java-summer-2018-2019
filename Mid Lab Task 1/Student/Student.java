class Student{

private String name;
private String id;
private String department;
private float cgpa;

public void setName(String name){
    this.name=name;
}
public void setId(String id){
    this.id=id;
}
public void setDepartment(String department){
    this.department=department;
}
public void setCgpa(float cgpa){
    this.cgpa=cgpa;
}
public String getName()
{
	return this.name;
}
public String getId()
{
	return this.id;
}
public String getDepartment()
{
	return this.department;
}
public float getCgpa()
{
	return this.cgpa;
}
public void showInfo()
{
	System.out.println(getName());
	System.out.println(getId());
	System.out.println(getDepartment());
	System.out.println(getCgpa());
}
}
