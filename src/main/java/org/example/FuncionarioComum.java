package org.example;

public class FuncionarioComum extends Funcionario {

    @Override
    protected float calcularBonus() {
        return this.getSalarioBase() * 0.10f;
    }
}
