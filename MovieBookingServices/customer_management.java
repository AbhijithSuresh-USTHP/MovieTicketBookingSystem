package MovieBookingServices;
import java.util.*;
import MovieEntity.Customer;
import utility1.customer_validation;

public class customer_management {
	public static Scanner sc=new Scanner(System.in);
	public static HashSet<Customer> customers=new HashSet<>();
	public static void addcustomer()
	{
		System.out.println("Enter Customer ID");
		String id=sc.next().trim();
		if(id.isEmpty())
		{
			System.out.println("Customer ID Cannot be empty");
			return;
		}
		for(Customer c:customers)
		{
			if(c.getCustomerId().equalsIgnoreCase(id))
			{
				System.out.println("Customer ID Already exists");
				return;
			}


		}
		System.out.println("Enter Customer Name");
		String name=sc.next().trim();
		if(name.isEmpty())
		{
			System.out.println("Customer name cannot be empty");
			return;
		}
		System.out.println("Enter Customer Email");
		String email=sc.next().trim();
		if(!customer_validation.isValidEmail(email))
		{
			System.out.println("Customer Email is not valid");
			return;
		}
		System.out.println("Enter Customer Phone Number");
		String phone=sc.next().trim();
		if(!customer_validation.isValidPhone(phone))
		{
			System.out.println("The phone number is not valid");
			return;
		}
		for(Customer c:customers)
		{
			if(c.getEmail().equalsIgnoreCase(email))
			{
				System.out.println("Email Already Registered");
				return;
			}
			if(c.getPhno().equals(phone))
			{
				System.out.println("Phone Number Already Registered");
				return;
			}
		}
		customers.add(new Customer(id,name,email,phone));
		System.out.println("Customer Details Added Successfully");
	

	}
	public static void viewcustomer()
	{
		if(customers.isEmpty())
		{
			System.out.println("No Customer Found in the Database");
			return;
		}
		System.out.println("Customer Details");
		System.out.println("1.View All Customers");
		System.out.println("2.View Customers by their Customer Id");
		System.out.println("Enter your choice");
		int option=sc.nextInt();
		sc.nextLine();
		if(option==1)
		{
			System.out.println("Total Customer List");
			for(Customer c:customers)
			{
				System.out.println("Customer ID: "+c.getCustomerId());
				System.out.println("Customer Name: "+c.getName());
				System.out.println("Customer Email: "+c.getEmail());
				System.out.println("Customer Phone Number: "+c.getPhno());
			}
		}
		else if(option==2)
		{
			System.out.println("Enter Customer Id to Search:");
			String id=sc.next().trim();
			
			if(id.isEmpty())
			{
				System.out.println("Customer Id can't be empty");
				return;
			}
			boolean found=false;
			for(Customer c:customers)
			{
				if(c.getCustomerId().equalsIgnoreCase(id))
				{
						System.out.println("Customer Found");
						System.out.println("Customer ID: "+c.getCustomerId());
						System.out.println("Customer Name: "+c.getName());
						System.out.println("Customer Email: "+c.getEmail());
						System.out.println("Customer Phone Number: "+c.getPhno());
						found=true;
						break;
				}
			}
			if(!found)
			{
				System.out.println("No customer found with the Customer Id"+id);
			}
		}
		else
		{
			System.out.println("Invalid choice! Please enter valid choice");
		}
	
		
	}
	public static void removecustomer()
	{
		if(customers.isEmpty())
		{
			System.out.println("No Customer to Remove");
			return;
		}
		System.out.println("Enter Customer ID to remove:");
		String id=sc.next().trim();
		if(id.isEmpty())
		{
			System.out.println("The Customer ID to remove cannot be empty");
			return;
		}
		boolean found=false;
		Iterator<Customer> iterator=customers.iterator();
		while(iterator.hasNext())
		{
			Customer c=iterator.next();
			if(c.getCustomerId().equalsIgnoreCase(id))
			{
				iterator.remove();
				found=true;
				System.out.println("The Customer with the ID "+id+" is removed Susccessfully");
				break;
			}
		}
		if(!found)
		{
			System.out.println("No Customers found with the Customer Id"+id);
		}
		
	}
	

}
