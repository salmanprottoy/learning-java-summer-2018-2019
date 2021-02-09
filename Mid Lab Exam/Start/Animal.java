class Animal{
	private String color;
	private float weight;
	public Animal(){
		this.color=null;
		this.weight=0.0f;
	}
	public Animal(String color, float weight){
		this.color=color;
		this.weight=weight;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setWeight(float weight){
		this.weight=weight;
	}
	public String getColor(){
		return this.color;
	}
	public float getWeight(){
		return this.weight;
	}
}