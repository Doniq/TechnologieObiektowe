/*
Autor: Dominik Pataleta
Technologie Obiektowe - 1IZ21A
*/

import org.testng.annotations.Test;

public class TestNG_TO_5
{
	//Okreœlenie limitu czasu testu, u¿ycie adnotacji: @Test(timeOut=x)
	@Test(timeOut=2000)
	public void TestNG_5_TimeOut() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test: timeOut");
	}

	//Okreœlenie limitu czasu testu, u¿ycie adnotacji: @Test(timeOut=x)
	@Test(timeOut=1000)
	public void TestNG_6_TimeOut() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test: timeOut");
	}
}