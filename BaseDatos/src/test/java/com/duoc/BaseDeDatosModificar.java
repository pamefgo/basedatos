package com.duoc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.duoc.modelo.BaseDeDatos;
import com.duoc.modelo.Dato;

public class BaseDeDatosModificar {

	 private BaseDeDatos base;
		@Before
		public void setUp() throws Exception {
			this.base=new BaseDeDatos();
			this.base.agregar(new Dato("A1","DATOS"));
		}
		@Test
		public void cuandoModificarEntoncesTrue() {
			
			boolean retorno=this.base.modificar(new Dato("A1","DATOSA1"));
			assertTrue(retorno);
		}
		@Test
		public void cuandoModificarEntoncesFalse() {
			
			boolean retorno=this.base.modificar(new Dato("A6","DATOSA1"));
			assertFalse(retorno);
		}
}
