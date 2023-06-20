package march8;

public class Address {
	private String city;
	private String area;
	private int pincode;
	
	public Address()
	{
		
	}
	public Address(String city,String area,int pincode)
	{
		this.city= city;
		this.area= area;
		this.pincode= pincode;
	}
	  public void display(){
		  
		  System.out.println("city: "+city);
		  System.out.println("area: "+area);
		  System.out.println("pincode: "+pincode);
	  }
	  
	 
	
	
	
}
