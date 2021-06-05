package ro.ase.cts.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.mocks.StudentDummy;
import ro.ase.cts.mocks.StudentFake;
import ro.ase.cts.mocks.StudentStub;
import ro.ase.cts.clase.IStudent;
public class TesteGrupaWithMocks {

	@Test
	public void testAdaugaStudent() {
		StudentDummy studentDummy=new StudentDummy();
		Grupa grupa = new Grupa(1003);
		grupa.adaugaStudent(studentDummy);
		
		assertEquals(1, grupa.getStudenti().size());
	}
	
	@Test
	public void testGetPromovabilitate() {
		StudentStub studentStub=new StudentStub();
		Grupa grupa = new Grupa(1003);
		grupa.adaugaStudent(studentStub);
		
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testGrupaWithFakeRight() {
		Grupa grupa=new Grupa(1078);
		//10 studenti - 7 integralist, 3 restantieri
		
		for(int i=0;i<7;i++) {
			StudentFake studentFake=new StudentFake();
			studentFake.setValoareAreRestante(false);
			grupa.adaugaStudent(studentFake);
		}
		
		for(int i=0;i<3;i++) {
			StudentFake studentFake=new StudentFake();
			studentFake.setValoareAreRestante(true);
			grupa.adaugaStudent(studentFake);
		}
		
		assertEquals(0.7, grupa.getPromovabilitate(),0.01);
	}

}
