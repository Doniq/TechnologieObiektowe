/*
Autor: Dominik Pataleta
Technologie Obiektowe - 1IZ21A
*/

import org.junit.Test;

public class JUnit_TO_4
{
	//Testowanie wyj¹tków, u¿ycie adnotacji: @Test(expected=ArithmeticException.class)
	@Test(expected=ArithmeticException.class)  
	public void JUnit_4_Exception()
	{
		int i=1/0;
	}
}