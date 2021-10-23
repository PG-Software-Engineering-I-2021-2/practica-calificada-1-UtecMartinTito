package com.example.demo.practica01;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SkyAlertTests {

	@Test
	public void test(){
		var skyAlert = SkyAlert.getInstance();
		Assert.assertFalse(skyAlert.vincularUsuarioTarifa(1, 1));
		Assert.assertFalse(skyAlert.desvincularUsuarioTarifa(1, 1));
		Assert.assertFalse(skyAlert.actualizarTarifaEmpresa(1, 1, 1));

		skyAlert.registrarEmpresa(1, "Latam", 3);
		skyAlert.registrarEmpresa(2, "Continental", 4);
		skyAlert.registrarEmpresa(3, "United", 4);

		skyAlert.registrarUsuario(1, "Pedro", "pedro@gmail.com");
		skyAlert.registrarUsuario(2, "Pedro", "pedro@gmail.com");
		skyAlert.registrarUsuario(3, "Jose", "jose@gmail.com");
		skyAlert.registrarUsuario(4,"Jesus", "jesus@gmail.com");
		skyAlert.registrarUsuario(5,"Alonso", "alonso@gmail.com");

		skyAlert.registrarTarifa(1, "Cuzco", "Lima");
		skyAlert.registrarTarifa(2, "Texas", "Lima");

		Assert.assertTrue(skyAlert.vincularUsuarioTarifa(2, 2));
		Assert.assertTrue(skyAlert.desvincularUsuarioTarifa(2,2));


		Assert.assertTrue(skyAlert.vincularUsuarioTarifa(1, 1));
		Assert.assertTrue(skyAlert.actualizarTarifaEmpresa(1, 1, 312));
	}

}