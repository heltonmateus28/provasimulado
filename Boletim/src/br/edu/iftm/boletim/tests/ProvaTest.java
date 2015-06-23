package br.edu.iftm.boletim.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.edu.iftm.boletim.Prova;

public class ProvaTest {


	@Test
	public void testProvaValendoMaisQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(180.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
	}
	
	@Test
	public void testProvaValendoMenosQueCem() {
		Prova p = new Prova();
		
		p.setNota_max(-60.0);
		
		double experado = 0.0;
		double atual = p.getNota_max();
		
		assertEquals(experado, atual, 0.0);
		
	}
	
	@Test
	public void testSePassou() {
		Prova p = new Prova();
		
		p.setNota_obtida(60.00);
		
		double experado = 00.0;
		double atual = p.getNota_obtida();
		
		assertEquals(experado, atual, 0.0);
		
	}
	
	public void testSeBombou() {
		Prova p = new Prova();
		
		p.setNota_obtida(50.00);
		
		double experado = 00.0;
		double atual = p.getNota_obtida();
		
		assertEquals(experado, atual, 0.0);
		
	}
	
	
	
	
}