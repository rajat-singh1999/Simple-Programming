class employee
{
 	String name;
	int age;
	String desig;
	double sal;
	public employee(String n,int a,String d,double s)
	{
		name=n;
		age=a;
		desig=d;
		sal=s;
	}
	public void show()
	{
		System.out.println("Name="+name+"\t Age="+age+"\t Designation="+desig+"\t\t Salary="+sal);
	}
}
class TestEmployee
{
	public static void main(String arg[])
	{
		employee e1=new employee("Roshni",27,"Executive",5000.0);
		employee e2=new employee("Sima",26,"CEO",45000.0);
		employee e3=new employee("Sayan",25,"Assistant Manager",350000.0);
		e1.show();
		e2.show();
		e3.show();
		if(e1.sal>e2.sal)
		{
			if(e1.sal>e3.sal)
				System.out.println(e1.name+" has highest salary");
			else
				System.out.println(e2.name+" has highest salary");
		}
		else if(e3.sal>e2.sal)
			System.out.println(e2.name+" has highest salary");
		else
			System.out.println(e3.name+" has highest salary");
		 
  
	}
}
