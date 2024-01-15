package Interface;

public interface Mother
{
	void look();
	void nature();
	default void love() //here we have break the rule and completed the interface method by using default 
	{
		System.out.println("Mothers love");
	}
	static void test() ////here we have break the rule and complete the interface method by using static 
	{
		System.out.println("Mother's test method");
	}
}
