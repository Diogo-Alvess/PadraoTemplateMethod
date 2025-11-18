package org.example;

public class FuncionarioGerente extends Funcionario {

    @Override
    protected float calcularBonus() {
        return this.getSalarioBase() * 0.20f;
    }

    @Override
    public String getTipo() {
        return "Gerente";
    }
}
