class Triangle{
	
	private int side1;
	private int side2;
	private int side3;
	
public void setSide1(int side1){
	this.side1=side1;
}
public void setSide2(int side2){
	this.side2=side2;
}
public void setSide3(int side3){
	this.side3=side3;
}
public int getSide1(){
	return this.side1;
}
public int getSide2(){
	return this.side2;
}
public int getSide3(){
	return this.side3;
}
public void testTriangle(){
	if(getSide1()==getSide2() && getSide2()==getSide3()){
		System.out.println("The triangle is equilateral");
	}
	else if(getSide1()==getSide2() || getSide2()==getSide3() || getSide1()==getSide3()){
		System.out.println("The triangle is isosceles");
	}
	else if(getSide1()!=getSide2() && getSide1()!=getSide3() && getSide2()!=getSide3()){
		System.out.println("The triangle is scalene");
	}
}
}