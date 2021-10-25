package Integradores.Aula0003_TemplateIntegradorAluno.src;

public class Estagiario extends Vendedor{
    public Estagiario(String nome){
        super.nome = nome;
        super.pontosVenda = 5;
        this.pontosTotais = 0;
        super.tipo = "estagiario";
    }

    @Override
    public void calcularPontos(){
        super.pontosTotais = super.vendas * super.pontosVenda;
    }
}
