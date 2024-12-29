package com.prowings.collection.Set;

public class Student implements Comparable {
	
	private int RollNumber;
	private String  FirstName;
	private String LastName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollNumber, String firstName, String lastName) {
		super();
		RollNumber = rollNumber;
		FirstName = firstName;
		LastName = lastName;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [RollNumber=" + RollNumber + ", FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
	
	

	@Override
	public int compareTo(Object o) {
		
		return this.LastName.compareTo(LastName);
//Student s = (Student)o;
		
		//if(this.RollNumber == s.RollNumber)
			//return 0;
		//else if (this.RollNumber > s.RollNumber)
			//return 1;
		//else
			//return -1;
		
		
	}
	

}
