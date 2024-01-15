package Self_practice;

public abstract class AbstractPractice
{
	
     public abstract  void add();
     
     public void sub(int a , int b)
     {
    	 int sub =a-b;
    	 System.out.println(sub);
     }
     
     public static void name(String n)
     {
    	 System.out.println(n);
     }
     private void secure()   //private method can not override
     {
    	 System.out.println("Hii I am secure class");
     }
     final void con()
     {
    	 System.out.println("Hii I am final");
     }

}
