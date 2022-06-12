/*
Autor: Dominik Pataleta
Technologie Obiektowe - 1IZ21A
*/

import org.testng.annotations.Test;

public class TestNG_TO_3
{
	//Ignorowanie testu, u¿ycie adnotacji: @Test(enabled=false)
	@Test(enabled=false)
	public void TestNG_3_enableFalse()
	{  
		System.out.println("Test zostanie zignorowana");
	}
	
	//Ignorowanie testu, u¿ycie adnotacji: @Test(enabled=true)
	@Test(enabled=true)
	public void TestNG_33_enableTrue()
	{  
		System.out.println("Test nie zostanie zignorowana");
	}
}