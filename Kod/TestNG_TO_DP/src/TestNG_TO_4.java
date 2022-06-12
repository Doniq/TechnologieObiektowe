/*
Autor: Dominik Pataleta
Technologie Obiektowe - 1IZ21A
*/

import org.testng.annotations.Test;

public class TestNG_TO_4
{
	//Testowanie wyj¹tków, u¿ycie adnotacji: @Test(expectedExceptions=ArithmeticException.class)
	@Test(expectedExceptions=ArithmeticException.class)
	public void TestNG_4_Exception()
	{
		int i=1/0;
	}
}