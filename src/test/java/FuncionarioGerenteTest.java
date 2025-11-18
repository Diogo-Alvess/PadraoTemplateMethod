package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FuncionarioGerenteTest {

    @Test
    void deveCalcularBonusCorreto() {
        FuncionarioGerente gerente = new FuncionarioGerente();
        gerente.setSalarioBase(5000.0f);
        assertEquals(1000.0f, gerente.calcularBonus());
    }

    @Test
    void deveCalcularSalarioFinal() {
        FuncionarioGerente gerente = new FuncionarioGerente();
        gerente.setSalarioBase(5000.0f);
        assertEquals(6000.0f, gerente.calcularSalarioFinal());
    }

    @Test
    void deveRetornarInformacoes() {
        FuncionarioGerente gerente = new FuncionarioGerente();
        gerente.setId(2);
        gerente.setNome("Mariana");
        gerente.setSalarioBase(5000.0f);

        assertEquals(
                "Gerente{id=2, nome='Mariana', salarioFinal=6000.0}",
                gerente.getInfo()
        );
    }
}
