package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class ReaderAplicanti {

	protected String fileName;
	
	public ReaderAplicanti(String fileName) {
		super();
		this.fileName = fileName;
	}

	public abstract List<Aplicant> readAplicanti() throws FileNotFoundException;
	
	
}
