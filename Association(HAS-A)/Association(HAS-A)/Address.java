class Address{
	private String houseNo,roadNo,city;

	public Address(String houseNo,String roadNo,String city){
		this.houseNo=houseNo;
		this.roadNo=roadNo;
		this.city=city;
	}

	public void setHouseNo(String houseNo){
		this.houseNo=houseNo;
	}
	public String getHouseNo(){
		return this.houseNo;
	}

	public void setRoadNo(String roadNo){
		this.roadNo=roadNo;
	}
	public String getRoadNo(){
		return this.roadNo;
	}
	public void setCity(String city){
		this.city=city;
	}
	public String getCity(){
		return this.city;
	}

	public void showAddress(){
		System.out.println("House No:"+this.houseNo+
			"\nRoad No:"+this.roadNo+"\nCity:"+this.city);
	}
}