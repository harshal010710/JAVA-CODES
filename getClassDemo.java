class getClassDemo
{
    public static void main(String Arg[])
    {
        try
        {
            Employee eobj1 =  new Employee("Amit", 78000, 28, "Karve Road Pune");
            
            Employee eobj2 = (Employee)eobj1.clone();

            eobj1.Display();
            eobj2.Display();

            System.out.printf("%h\n",eobj1.hashCode());
            System.out.println(eobj2.hashCode());
        }
        catch(CloneNotSupportedException e)
        {
            System.out.println("inside catch");
        }
    }    
}

class Employee implements Cloneable
{
    public String Name;
    public int Salary;
    public int Age;
    public String Address;

    Employee(String str, int ammount, int A, String addr)
    {
        this.Name = str;
        this.Salary = ammount;
        this.Age = A;
        this.Address = addr;
    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    void Display()
    {
        System.out.println("Employee name : "+this.Name);
        System.out.println("Employee Age : "+this.Age);
        System.out.println("Employee Salary : "+this.Salary);
        System.out.println("Employee Address : "+this.Address);
    }
}
