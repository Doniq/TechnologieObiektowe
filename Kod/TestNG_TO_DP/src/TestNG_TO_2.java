/*
Autor: Dominik Pataleta
Technologie Obiektowe - 1IZ21A
*/

import org.testng.annotations.Test;

public class TestNG_TO_2
{
	//Powt�rzenie ilo�ci test�w - adnotacja invocationCount
	@Test(invocationCount=500)
	public void TestNG_2_Test()
	{  
		System.out.println("Powtorzenie testu: 500-TestNG");
	}
}