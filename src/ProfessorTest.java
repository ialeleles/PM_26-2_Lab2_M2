import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class ProfessorTest {

@Test 

public void calcularSalarioSubstituto() {
    Professor substituto = new Substituto("Iale", 777, LocalDate.now());
    List<EDisciplina> disciplinas = new LinkedList<>();

    disciplinas.add(EDisciplina.IAA);
    disciplinas.add(EDisciplina.PROGMOD);
    substituto.incluirDisciplinas(disciplinas);

    double salario = substituto.salarioMensal();

    assertEquals(16*42*4.5 , salario, 0.1);
    }
}
