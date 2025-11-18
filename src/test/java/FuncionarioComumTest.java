package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularBonusCorreto() {
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setSalarioBase(3000.0f);
        assertEquals(300.0f, funcionario.calcularBonus());
    }

    @Test
    void deveCalcularSalarioFinal() {
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setSalarioBase(3000.0f);
        assertEquals(3300.0f, funcionario.calcularSalarioFinal());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setId(1);
        funcionario.setNome("Carlos");
        funcionario.setSalarioBase(3000.0f);

        assertEquals(
                "Funcionario{id=1, nome='Carlos', salarioFinal=3300.0}",
                funcionario.getInfo()
        );
    }
}
