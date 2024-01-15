package Interface;

public interface Father 
{
    void hardwork();
    void honesty();
    default void love()   //here we have break the rule and completed the interface method by using default 
    {
    	System.out.println("Fathers love");
    }
    
    static void test() //here we have break the rule and complete the interface method by using static 
    {
    	System.out.println("Fathers test method");
    }
}
