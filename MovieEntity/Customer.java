package MovieEntity;

public class Customer {
	private String CustomerId;
	private String name;
	private String email;
	private String phno;
	
	public Customer(String CustomerId,String name,String email,String phno)
	{
		this.CustomerId=CustomerId;
		this.name=name;
		this.email=email;
		this.phno=phno;
	}
	public String getCustomerId()
	{
		return CustomerId;
	}
	public String getName()
	{
		return name;
	}
	public String getEmail()
	{
		return email;
	}
	public String getPhno()
	{
		return phno;
	}
	public void setCustomerId(String CustomerId)
	{
		this.CustomerId=CustomerId;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmail(String email)
	{
		this.email=email;
	}
	public void setPhno(String phno)
	{
		this.phno=phno;
	}
}

