package Integradores.Aula0003_TemplateIntegradorAluno.src;

import java.util.ArrayList;

import java.util.ArrayList;

public class Funcionario extends Vendedor {

    private int anosAntiguidade;
    private ArrayList<Vendedor> afiliados = new ArrayList<>();

    public Funcionario(String nome, int anosAntiguidade){
        super.nome = nome;
        super.pontosVenda = 5;
        super.tipo = "funcionario";
        this.anosAntiguidade = anosAntiguidade;
        this.pontosTotais = 0;
    }

    /*agrega um afiliado ao funcionario, e por sua vez soma os pontos*/
    public void addAfiliado(Vendedor afiliado){
        this.afiliados.add(afiliado);
        System.out.println(afiliado.nome+ " agora é afiliado de "+super.nome);
    }

    /*implementação do método abstrato*/
    /*por cada ano de antiguidade obtem 5 pontos, por cada afiliado obtem 5*/
    @Override
    public void calcularPontos() {
        super.pontosTotais = (this.afiliados.size()*10) + (this.anosAntiguidade*5) + (super.vendas*super.pontosVenda);
    }
}