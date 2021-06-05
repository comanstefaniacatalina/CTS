package ro.ase.cts.teste;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import ro.ase.cts.categoriiTeste.TesteGetPromovabilitate;
import ro.ase.cts.categoriiTeste.TesteUrgente;

@RunWith(Categories.class)
@Suite.SuiteClasses({TesteGrupa.class, TesteGrupaWithMocks.class})
@Categories.IncludeCategory(TesteGetPromovabilitate.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuitaCustom {

}
