package ro.ase.cts.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class ReaderStudent extends ReaderAplicanti{
	

	public ReaderStudent(String fileName) {
		super(fileName);

	}

	@Override
	public List<Aplicant> readAplicanti() throws FileNotFoundException {

		Scanner fisierStudenti = new Scanner(new File(super.fileName));
		fisierStudenti.useDelimiter(",|\n");
		List<Aplicant> listaStudenti = new ArrayList<Aplicant>();

		while (fisierStudenti.hasNext()) {
			Student student= new Student();
			super.citesteAplicant(fisierStudenti, student);
			int an_studii = fisierStudenti.nextInt();
			String facultate = (fisierStudenti.next()).toString();
			student.setAnStudii(an_studii);
			student.setFacultate(facultate);
			listaStudenti.add(student);
		}
		fisierStudenti.close();
		return listaStudenti;
		
	}
}
