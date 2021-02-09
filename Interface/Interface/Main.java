class Main{
	public static void main(String[] args) {
		// Dog d=new Dog();
		// d.showInfo();
		//IActivity.x=500;
		//System.out.println(IActivity.x);
		IActivity ia=new Dog();
		ia.makeSound();
		//IEat ie=(Dog)ia;
		//IEat ie=(IEat)ia;
		((IEat)ia).eat();
		((Dog)ia).run();
	}
}