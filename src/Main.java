public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int ano;
        ano=2022;

        int anoDeLancamento=2022;
        boolean incluidoPlano=false;
        double notaDoFilme=8.1;
        double media=(9.8 + 6.3 + 8)/3;
        String sinopse;
        int classificados;
//        utilizando cast de conversão
        classificados=(int)media/2;
        sinopse="Filme de aventura com galã dos anos 80";
//        formato text block
        sinopse = """
        Filme Top Gun
        Filme de aventura com galã dos anos 80
        Muito bom!
        Ano de Lançamento
        """ + anoDeLancamento;
        System.out.println(anoDeLancamento);
        System.out.println("ano de lançamento: "+anoDeLancamento);
        System.out.println(media);
        System.out.println(sinopse);
        System.out.println(classificados);


//        comentario de uma linha
        /*
          comentario de multiplas linhas
        * */


    }
}