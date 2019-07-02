package com.duoc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.duoc.modelo.BaseDeDatos;
import com.duoc.modelo.Dato;




public class BaseDeDatosAgregar {
 private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base=new BaseDeDatos();
	}

	@Test
	public void cuandoAgregaEntoncesTrue() {
		boolean retorno=this.base.agregar(new Dato("A1","DATOS"));
		assertTrue(retorno);
	}
	
	@Test
	public void cuandoDatoNullentoncesFalse() {
		Dato dato=null;
		boolean retorno=this.base.agregar(dato);
		assertFalse(retorno);
	}

	@Test
	public void cuandoDatoIdNullentoncesFalse() {
		Dato dato=new Dato(null,"DATOS");
		boolean retorno=this.base.agregar(dato);
		assertFalse(retorno);
	}
	@Test
	public void cuandoDatoIdMenorIgual1NullentoncesFalse() {
		Dato dato=new Dato("","DATOS");
		boolean retorno=this.base.agregar(dato);
		assertFalse(retorno);
	}

}
