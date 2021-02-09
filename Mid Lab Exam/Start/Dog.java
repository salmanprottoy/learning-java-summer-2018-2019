class Dog extends Animal{
	private String breed;
	public Dog(){
		super();
		this.breed=null;
	}
	public Dog(String color, float weight,String breed){
		super(color,weight);
		this.breed=breed;
	}
	public void setBreed(String breed){
		this.breed=breed;
	}
	public String getBreed(){
		return this.breed;
	}
}