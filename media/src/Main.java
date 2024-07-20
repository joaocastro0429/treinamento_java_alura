public class Main {
    public static void main(String[] args) {
        double nota1=8;
        double nota2=7;

       double media=nota1+nota2;

        System.out.println(media);

        double numero1=10.0;

        int numeroInteiro=(int)numero1;

        System.out.println(numeroInteiro);

        char letra='A';
        String palavra="joao";

        System.out.println(letra+palavra);

        double precoProduto=10.0;
        int quantidade=2;

        double resultado=precoProduto*quantidade;

        System.out.println(resultado);


        double valorEmDolares=100;
        double valorEmReais=4.94;

        double valoresConvertidos = valorEmDolares * valorEmReais;

        System.out.println(valoresConvertidos);


        double precoOriginal = 150.0;

        double percentualDesconto = 10.0;
        double valorDesconto = (percentualDesconto / 100.0) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$" + precoOriginal);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Novo preço com desconto: R$" + novoPreco);


    }
}