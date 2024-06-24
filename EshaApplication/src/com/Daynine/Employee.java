package com.Daynine;

public class Employee implements Comparable<Employee>{ // inherit 
	
		String name;
		int age;
		double salary;
		public Employee(String name, int age, double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
//	
		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		@Override
		public int compareTo(Employee other) {
			// TODO Auto-generated method stub
//			return this.name.compareTo( other.name ); syntax for sorting in string 
//			return Integer.compare(this.age , other.age); //syntax for sorting in integer
			return Double.compare(this.salary , other.salary);
		}
		
//	 comparable 
		
		
		
		
		
		 
}

	


