package com.example.demo.practica01;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ApplicationTests {

	@Test
	public void main() {
		Application.main(new String[0]);
		Assert.assertTrue(true);
	}
}