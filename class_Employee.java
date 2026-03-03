
public class Main
{
	public static void main(String[] args) {
	    Employee e1 = new Employee(101, "abc", 15000); 
	
		e1.getdetails();
	}
}

class Employee{
    private int id;
    private String name;
    private int salary;
    
    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    
    void getdetails(){
        System.out.println("user_id:"+id);
         System.out.println("user_name:"+name);
          System.out.println("user_slary:"+salary);
    }
}
