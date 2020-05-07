Primitive Version for Consumer:-
Demo Program to increment employee Salary by using ObjDoubleConsumer:-

  import java.util.function.*;
  import java.util.*;
  class Employee
  {
	Employee(String name,double salary)
	this.name=name;
	this.salary=salary;
	}
 }
 class New1
 {
	public static void main(String[] args)
	{
	ArrayList<Employee> l= new ArrayList<Employee>();
	populate(l);
	ObjDoubleConsumer<Employee> c=(e,d)->e.salary=e.salary+d;
	for(Employee e:l)
	{
	c.accept(e,500.0);
	}
	for(Employee e:l)
	{
	System.out.println("Employee Name:"+e.name);
	System.out.println("Employee Salary:"+e.salary);
	System.out.println();
	}

	}
	public static void populate(ArrayList<Employee> l)
	{
	l.add(new Employee("sowji",10000));
	l.add(new Employee("harika",20000));
	l.add(new Employee("bunny",30000));
	l.add(new Employee("Chinny",40000));
	}
 }



Output:-
Employee Name:sowji 
Employee Salary:15000.0

Employee Name:harika 
Employee Salary:25000.0

Employee Name:bunny 
Employee Salary:35000.0

Employee Name:Chinny 
Employee Salary:45000.0

