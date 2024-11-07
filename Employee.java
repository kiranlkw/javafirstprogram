public class Employee{
	private int id;
	private String name;

	public void input(){
		id=101;
		name="Ajay";
	}

	public void display(){
		System.out.println(id+" "+name);
	}

	public static void main(String []args){
		Employee e1=new Employee();
		e1.input();
		e1.display();
	}
}