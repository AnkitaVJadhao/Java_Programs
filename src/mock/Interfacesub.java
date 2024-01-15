package mock;

public class Interfacesub implements Interface1,Interface2{

	public static void main(String[] args) 
	{
		Interfacesub i1=new Interfacesub();
		i1.display();
		i1.show();
		i1.add();
		i1.sub();
		i1.samementhod();
		Interface2.samementhod();
		

	}

	@Override
	public void display() {
		System.out.println("Hii this is display method");
		
	}

	@Override
	public void show() {
		System.out.println("Hii this is show method");
		
	}

	@Override
	public void add() {
		System.out.println("Hii this is add method");
		
	}

	@Override
	public void sub() {
		System.out.println("Hii this is sub method");
		
	}

	@Override
	public void samementhod() 
	{
		Interface1.super.samementhod();
		
	}

	

}
