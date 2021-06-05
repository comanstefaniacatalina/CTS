package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.categoriiTeste.TesteGetPromovabilitate;
import ro.ase.cts.categoriiTeste.TesteUrgente;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;

public class TesteGrupa {

	@Category(TesteUrgente.class)
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1085);
		assertEquals(1085, grupa.getNrGrupa());
	}
	
	@Category(TesteUrgente.class)
	@Test
	public void testBoundaryLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000,grupa.getNrGrupa());
	}
	
	@Category(TesteUrgente.class)
	@Test
	public void testBoundaryLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100,grupa.getNrGrupa());
	}
	
	//cross check nu merg eca nu avem maimulte metode
	//merge la student ca avem constructur cu param si constructor gol 
	//si putem sa apelam set ca sa punem nume
	
	
	//cu fortatul de aruncat exceptii
	@Category(TesteUrgente.class)
	@Test(expected=IllegalArgumentException.class)
	public void testErrorLimitaInferioara() {
		Grupa grupa = new Grupa(100);
	}
	
	@Category(TesteUrgente.class)
	@Test(expected=IllegalArgumentException.class)
	public void testErrorLimitaSuperioara() {
		Grupa grupa = new Grupa(1800);
	}
	
	@Test(timeout = 500)
	public void testPerformance() {
		Grupa grupa = new Grupa(1085);
	}
	
	//reference daca depinde de alte chestii si aici nu depinde
	//extinses daca exista
	@Test
	public void testConstructurExistaLista() {
		Grupa grupa = new Grupa(1078);
		assertNotNull(grupa.getStudenti());
	}
	//cardinalitate 0 1 n ca nu avem, ca avem unu ca avem mai multi
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<8; i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<2; i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8f, grupa.getPromovabilitate(), 0.1);
	}
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateLimitataInferioare() {
		Grupa grupa = new Grupa(1001);
		for(int i=0; i<5; i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1078);
		for(int i=0; i<10; i++) {
			IStudent student = new Student();
			student.adaugaNota(6);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromoInverse() {
		int nrIntegralisti=31;
		int nrRestantieri=2;
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<nrIntegralisti; i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for(int i=0; i<nrRestantieri; i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		assertEquals(nrIntegralisti, grupa.getPromovabilitate()*grupa.getStudenti().size(), 0.01);
	}
	
	
	@Category(TesteGetPromovabilitate.class)
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1050);
		grupa.getPromovabilitate();
	}
	
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateCardinalityNuAreRestante() {
		Grupa grupa = new Grupa(1078);
		IStudent stud = new Student();
		stud.adaugaNota(5);
		stud.adaugaNota(6);
		grupa.adaugaStudent(stud);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	
	@Category(TesteGetPromovabilitate.class)
	@Test
	public void testGetPromovabilitateCardinalityAreRestante() {
		Grupa grupa = new Grupa(1078);
		IStudent stud = new Student();
		stud.adaugaNota(2);
		stud.adaugaNota(1);
		grupa.adaugaStudent(stud);
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}

	
}
