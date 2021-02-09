class Dog extends Animal implements IActivity,IEat{
	public void makeSound(){
		System.out.println("Dog is barking.");
	}
	public void eat(){
		System.out.println("Dog is eating.");
	}
	
	public void run(){
		System.out.println("Dog is running.");
	}
}