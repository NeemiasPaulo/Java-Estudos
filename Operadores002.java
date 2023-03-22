public class Operadores002 {
    public static void main(String[] args) {
        //Contatenação:
        System.out.println("\nContatenação:");
        String nomeCorreto = "Ja" + "va";
        System.out.println(nomeCorreto);

        String concatenacao = "?";
        concatenacao = 2+1+3+"1";
        System.out.println(concatenacao);

        concatenacao = 2+"1"+3+1;
        System.out.println(concatenacao);

        concatenacao = 2+3+"1"+1;
        System.out.println(concatenacao);

        concatenacao = "1"+2+3+1;
        System.out.println(concatenacao);

        //Unários
        System.out.println("\nUnário:");
        int valor = 7;
        valor = - valor;

        System.out.println(valor);

        valor = valor * -1;

        System.out.println(valor);

        //Incrementação e Decrementação
        System.out.println("\nIncrementação '++' e Decrementação '--':");
        System.out.println(valor ++);

        System.out.println(valor);

        System.out.println(-- valor);

        //Ternário
        //Semelhante ao IF e ELSE, usando a lógica boolean (Verdadeiro ou Falso)
        System.out.println("\nTernário '?':");
        int x, y;
        x = 2;
        y = 2;

        String verdadeiro = (x == y) ? "verdadeiro" : "falso";
        System.out.println(verdadeiro);

        int a, b;
        a = 5;
        b = 6;
        int  resposta = (a > b) ? 1 : 0;
        System.out.println(resposta);
    }
}
