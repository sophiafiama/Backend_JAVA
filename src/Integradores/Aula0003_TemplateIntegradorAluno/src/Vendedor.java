package Integradores.Aula0003_TemplateIntegradorAluno.src;

public abstract class Vendedor {
    protected String nome;
    protected int vendas;
    protected int pontosVenda;
    protected int pontosTotais;
    protected String tipo;


    public void vender(int qtdVendas){
        this.vendas += qtdVendas;
        System.out.println(this.nome +" realizou "+qtdVendas + " vendas.");
    }

    /*Método que calcula os pontos do Vendedor de acordo com seus aspectos a serem considerados*/
    public abstract void calcularPontos();

    /*TEMPLATE METHOD - recebe o total de pontos calculados a partir da subclasse e valida cada item para retornar a categoria*/
    public String mostrarCategoria(){
        String categoria;
        if(tipo.equalsIgnoreCase("estagiario")) {
            if(pontosTotais<50){
                categoria = "Estagiário Novato";
            } else
                categoria = "Estagiário Experiente";
        }else {
            if (pontosTotais < 20)
                categoria = "Novato";
            else if (pontosTotais <= 30)
                categoria = "Aprendiz";
            else if (pontosTotais <= 40)
                categoria = "Bom";
            else
                categoria = "Mestre";
        }
        return "O vendedor "+nome+" tem a pontuação de "+pontosTotais+ " e sua categoria é do tipo "+categoria;
    }
}







