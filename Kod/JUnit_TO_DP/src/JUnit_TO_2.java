/*
Autor: Dominik Pataleta
Technologie Obiektowe - 1IZ21A
*/

import org.junit.jupiter.api.RepeatedTest;

public class JUnit_TO_2
{
	//Powt�rzenie ilo�ci test�w - adnotacja @RepeatedTest(x)
	@RepeatedTest(500)
	public void JUnit_2_Test()
	{
		System.out.println("Powtorzenie testu: 500-JUnit");
	}
}