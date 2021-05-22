package ro.ase.cts.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clasa.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametru() {
		String nume="gigel";
		Student student=new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student=new Student();
		assertNotNull("Nu exista note",student.getNote());
		assertNotNull("Nu exista nume",student.getNume());
	}
	
	@Test
    public void testAdaugaNota(){
        Student student=new Student();
        int nota=5;
        student.adaugaNota(nota);
        assertEquals(nota,student.getNota(0));
    }
	
	@Test
    public void testAdaugaNotaDimensiune(){
        Student student=new Student();

        student.adaugaNota(5);

        student.adaugaNota(8);

        assertEquals(2,student.getNote().size());
    }
	
	@Test
	public void testCalculeazaMedieNote() {
		Student student=new Student();
		student.adaugaNota(5);
		student.adaugaNota(10);
		assertEquals(7.5f, student.calculeazaMedie(),0.01);
	}
	
	@Test
    public void testStudentulAreRestante(){
        Student student = new Student() ;
        student.adaugaNota(3);
        boolean rezultat  = student.areRestante() ;
        assertTrue(rezultat);
    }
	
	@Test
	public void testNuAreRestante() {
		Student student=new Student();
		student.adaugaNota(10);
		student.adaugaNota(10);
		
		assertFalse(student.areRestante());
	}
	
	
	

}
