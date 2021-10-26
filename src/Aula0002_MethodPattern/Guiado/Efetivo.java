package Aula0002_MethodPattern.Guiado;

public class Efetivo extends Funcionarios {

    private double salarioBase;
    private double desconto;
    private double bonificacoes;

    public Efetivo(String nome, String sobrenome, String numeroConta, double salarioBase, double desconto, double bonificacoes) {
        super(nome, sobrenome, numeroConta);
        this.salarioBase = salarioBase;
        this.desconto = desconto;
        this.bonificacoes = bonificacoes;
    }

    @Override
    public double calcularPagamento() {
        return salarioBase+bonificacoes-desconto;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Foi gerado um recibo impresso no valor de: " + quantia);
    }


}
