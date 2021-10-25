package Integradores.Aula0003_TemplateIntegradorAluno.src;

public class Main {
    public static void main(String[] args) {
        /*Mofidicar o main para testar a lógica com o template method */
        Funcionario func1 = new Funcionario("Pedro",2); func1.vender(2);
        Funcionario func2 = new Funcionario("Maria",1); func2.vender(1);

        Vendedor afi1 = new Afiliado("Ramon"); afi1.vender(4);
        Vendedor afi2 = new Afiliado("Paulo"); afi2.vender(1);
        Vendedor afi3 = new Afiliado("José");

        Vendedor estag1 = new Afiliado("Marcos"); estag1.vender(1);
        Vendedor estag2 = new Afiliado("Maria"); estag2.vender(20);



        func1.addAfiliado(afi1);
        func1.addAfiliado(afi2);
        func1.calcularPontos();
        func2.calcularPontos();
        afi1.calcularPontos();
        afi2.calcularPontos();
        afi3.calcularPontos();
        estag1.calcularPontos();
        estag2.calcularPontos();


        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
        System.out.println(estag1.mostrarCategoria());
        System.out.println(estag2.mostrarCategoria());

    }
}

