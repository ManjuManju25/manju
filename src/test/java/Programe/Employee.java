package Programe;

public class Employee {
	String empname;
	int Empid;

	void display()
	{
		System.out.println(empname);
		System.out.println(Empid);
	}

	public static void main(String[] args)
	{
        Employee e= new Employee();
        e.empname="manju";
        e.Empid=10;
        e.display();
	}
}
