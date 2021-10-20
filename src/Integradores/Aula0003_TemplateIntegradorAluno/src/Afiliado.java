package Integradores.Aula0003_TemplateIntegradorAluno.src;

public class Afiliado extends Vendedor{

    public Afiliado(String nome){
        super.nome = nome;
        super.pontosVenda = 15;
        this.pontosTotais = 0;
    }

    @Override
    public int calcularPontos() {
        super.pontosTotais = super.vendas * super.pontosVenda;
        return pontosTotais;
    }
}