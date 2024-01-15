package inheritance;

public class Multilevel_Inheritance 
{

		public static void main(String[] args) 
		{
			
		
			
			Grandfather g1=new Grandfather();
			g1.house(); 
			
		
			
			Grandfather.loan();
			System.out.println("===================");
			
			Father f1=new Father();
			
		    f1.house();
			f1.land();
			
			Father.loan();
			Father.loanpaid();
			System.out.println("===================");
			
			son s1=new son();
			
			s1.car();
			s1.land();
			s1.house();
			son.loan();   
			son.loanpaid();
			son.noloan();
			System.out.println("===================");
			
		}
}
