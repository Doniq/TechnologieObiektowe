/*
Autor: Dominik Pataleta
Technologie Obiektowe - 1IZ21A
*/

import org.junit.Test;

public class JUnit_TO_5
{
	//Okreœlenie limitu czasu testu, u¿ycie adnotacji: @Test(timeuut=x)
	@Test(timeout=2000)
	public void JUnit_5_TimeOut() throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("Test: timeout");
	}

	//Okreœlenie limitu czasu testu, u¿ycie adnotacji: @Test(timeuut=x)
	@Test(timeout=1000)
	public void JUnit_6_TimeOut() throws InterruptedException
	{
		Thread.sleep(2000);
		System.out.println("Test: timeout");
	}
}