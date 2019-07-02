package com.duoc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.duoc.modelo.BaseDeDatos;
import com.duoc.modelo.Dato;

public class BaseDeDatosEliminar {

	 private BaseDeDatos base;
		@Before
		public void setUp() throws Exception {
			this.base=new BaseDeDatos();
			this.base.agregar(new Dato("A1","DATOS"));
			this.base.agregar(new Dato("A2","DATOS2"));
			this.base.agregar(new Dato("A3","DATOS3"));
		}

	@Test
	public void cuandoEliminarEntoncesTrue() {
		
		boolean retorno=this.base.eliminar("A1");
		assertTrue(retorno);
	}
	@Test
	public void cuandoEliminarLargo2True() {
		
		this.base.eliminar("A1");
		int largo=this.base.listar().size();
		assertTrue(largo==2);
	}
	@Test
	public void cuandoEliminarEntoncesFalse() {
		
		boolean retorno=this.base.eliminar("A6");
		assertFalse(retorno);
	}

}
