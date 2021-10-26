package Aula0002_MethodPattern.Guiado;

public abstract class Funcionarios {
    private String nome;
    private String sobrenome;
    private String numeroConta;

    public Funcionarios(String nome, String sobrenome, String numeroConta) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numeroConta = numeroConta;
    }

   public void pagamentoSalario(){
        double quantia;
        quantia = calcularPagamento();
        imprimirRecibo(quantia);
        depositar(quantia);
   };

    public void depositar(double quantia){
        System.out.println("Foi depositado uma quantia de: "+quantia + " na conta " + numeroConta);
       };

    public abstract double calcularPagamento();
    public abstract void imprimirRecibo(double quantia);




}

