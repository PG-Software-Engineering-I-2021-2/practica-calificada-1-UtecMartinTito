package com.example.demo.practica01;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OliverTests {
	@Test
	public void testOliver() {
		Oliver oliver = Oliver.getInstance();

		Autor sommerfield = new Autor("Sommerfield", "01/01/1950");

		oliver.registrarLibro("Software Engineering", "1980", sommerfield, "6th edition");

		oliver.registrarLibro("Software Engineering", "1981", sommerfield, "7th edition");

		oliver.registrarLibro("Software Engineering", "1982", sommerfield, "8th edition");

		oliver.registrarLibro("Software Engineering", "1983", sommerfield, "9th edition");

		oliver.registrarLibro("Software Engineering", "1983", sommerfield, "10th edition");

		Autor demo = new Autor("Juan Perez", "21/03/1965");

		oliver.registrarLibro("UML 2.5", "2000", demo, "1 edition");

		oliver.registrarLibro("UML 2.5", "2010", demo, "2 edition");

		Autor demo2 = new Autor("Juan Perez", "22/05/1988");

		oliver.registrarLibro("Operative systems", "2005", demo2, "1 edition");

		oliver.registrarLibro("Operative systems", "2007", demo2, "2 edition");

		Assert.assertEquals(oliver.getLibros().size(), 9);

		Assert.assertEquals(oliver.buscarLibrosPorAuthor(sommerfield).size(), 5);
		Assert.assertEquals(oliver.buscarLibrosPorAuthor(demo).size(), 2);
		Assert.assertEquals(oliver.buscarLibrosPorAuthor(demo2).size(), 2);

	}
}