package com.prowings.collection.Map;

public class Student implements Comparable {
	
	private int Rollnumber;
	private String Name;
	private String Address;
	
	

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(int rollnumber, String name, String address) {
		super();
		this.Rollnumber = rollnumber;
		this.Name = name;
		this.Address = address;
	}


	public int getRollnumber() {
		return Rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Student [Rollnumber=" + Rollnumber + ", Name=" + Name + ", Address=" + Address + "]";
	}
	
	/*public int compareTo(Object o) {
		Student s = (Student)o;
		return this.Address.compareTo(s.Address);
		
	}*/

	public int compareTo(Object o) {
		Student s = (Student)o;
		return this.Name.compareTo(s.Name);
		
	}
	
	
	/*public int compareTo(Object o)
	{
		Student s = (Student)o;
		
		if(this.Rollnumber == s.Rollnumber)
			return 0;
		else if (this.Rollnumber > s.Rollnumber)
			return 1;
		else
			return -1;
	}*/

}
