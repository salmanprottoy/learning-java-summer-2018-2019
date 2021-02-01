class Animal{
    private String color;
    private float height;
    private float weight;

    Animal(){
        this.color=null;
        this.height=0.0f;
        this.weight=0.0f;
    }
    Animal(String color,float height,float weight){
        this.color=color;
        this.height=height;
        this.weight=weight;
    }

    public void setColor(String color){
        this.color=color;
    }
    public void setHeight(Float height){
        this.height=height;
    }
    public void setWeight(float weight){
        this.weight=weight;
    }
    public String getColor(){
        return this.color;
    }
    public float getHeight(){
        return this.height;
    }
    public float getWeight(){
        return this.weight;
    }
    public void showDetails(){
        
    }

}