package test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class day1 {
	@AfterTest
	public void LastExecution()
	{
		System.out.println("I will execute last");
		
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
		
		System.out.println("New Hello 1");
		System.out.println("New Hello 2");
		System.out.println("New Hello 3");
		//Pata nahi kis roop me aakar
		//Narayan mil jayega
		System.out.println("New Hello 4");
		System.out.println("New Hello 5");
		System.out.println("New Hello 6");
		System.out.println("New Hello 7");
		
	}
	
	@AfterSuite
	public void Afsuite()
	{
		System.out.println("I am the last one");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
		//Jo guzari na ja saki humse
		//Humne vo zindagi guzari hai
	}
	
	@Test
	public void AshichTest()
	{
		System.out.println("We");
		System.out.println("will");
		System.out.println("we");
		System.out.println("will");
		System.out.println("rock");
		System.out.println("you");
		
	}
	

}
