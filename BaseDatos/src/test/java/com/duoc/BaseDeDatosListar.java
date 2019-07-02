package com.duoc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.duoc.modelo.BaseDeDatos;
import com.duoc.modelo.Dato;

public class BaseDeDatosListar {
	 private BaseDeDatos base;
		@Before
		public void setUp() throws Exception {
			this.base=new BaseDeDatos();
		}

	@Test
	public void cunadoListarCeroEntoncesTrue() {
		
		int largo=this.base.listar().size();
		assertTrue(largo==0);
	}
	
	@Test
	public void cuandoListar1EntoncesTrue() {
		this.base.agregar(new Dato("A1","DATOS"));
		int largo=this.base.listar().size();
		assertTrue(largo==1);
	}
	
	@Test
	public void cuandoListar3EntoncesTrue() {
		this.base.agregar(new Dato("A1","DATOS"));
		this.base.agregar(new Dato("A2","DATOS2"));
		this.base.agregar(new Dato("A3","DATOS3"));
		int largo=this.base.listar().size();
		assertTrue(largo==3);
	}
}
