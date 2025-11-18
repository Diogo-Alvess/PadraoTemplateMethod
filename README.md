Este repositório apresenta a implementação do padrão de projeto Template Method em um cenário de cálculo de salário final para diferentes tipos de funcionários dentro de uma empresa. O sistema simula o processo de remuneração, aplicando regras específicas de bônus de acordo com o cargo ocupado.

A classe Funcionario atua como o template, definindo a estrutura geral do algoritmo para cálculo do salário final. Ela fornece métodos comuns, como acesso ao salário base, identificação e nome, além de um método concreto (calcularSalarioFinal) que estabelece o fluxo principal do cálculo.

No entanto, parte desse processo é delegada às subclasses por meio do método abstrato calcularBonus(), permitindo que cada tipo de funcionário defina sua própria regra de bonificação.

As classes FuncionarioComum e FuncionarioGerente representam os diferentes cargos (subclasses concretas), implementando suas versões personalizadas do bônus. Dessa forma, embora sigam o mesmo fluxo definido pelo Template Method, o resultado final muda conforme o cargo.

Essa implementação demonstra como o padrão Template Method promove reutilização de código, organização e facilidade de manutenção, permitindo padronizar algoritmos ao mesmo tempo em que oferece flexibilidade para modificações específicas em subclasses.
