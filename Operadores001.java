public class Operadores001 {
    public static void main(String[] args) {
        //Simbolo "=", significa atribuição.

        System.out.println("Atribuição '=':");
        String nome = "Neemias";
        System.out.println(nome);

        int numeroChamada = 21;
        System.out.println(numeroChamada);

        Float PI = 3.14F;
        System.out.println(PI);

        Boolean presenca = false;
        System.out.println(presenca);


        //Simbolos aritméticos: +, -, *, / e &.
        // "+" adição:
        System.out.println("\nSimbolos aritméticos:");

        System.out.println("Adição '+:");
        int soma = 3 + 5;
        System.out.println(soma);

        double somQuebrado = 2.5 + 7.2;
        System.out.println(somQuebrado);

        // "-" subtração:
        System.out.println("\nSubtração:");
        int subtracao = 15 - 8;
        System.out.println(subtracao);

        double subQuebrado = 7.5 - 3.3;
        System.out.println(subQuebrado);

        // "*" multiplicação:
        System.out.println("\nMultiplicação:");
        int multiplicacao = 3 * 5;
        System.out.println(multiplicacao);

        double multQuebrado = 2.5 * 7.2;
        System.out.println(multQuebrado);

        // "/" divisão:
        System.out.println("\nDivisão:");
        int divisao = 25 / 5;
        System.out.println(divisao);

        double divQuebrado = 6.5 / 2.25;
        System.out.println(divQuebrado);

        // "&" Modulo:
        System.out.println("\nModulo:");
        int restante = 18 & 3;
        System.out.println(restante);

        //Operadores
        System.out.println("\nOperadores:");
        double resultado = (12 * 3) + (25/3.5);
        System.out.println(resultado);

        //Inversão
        System.out.println("\nInversão de valores com '!':");
        boolean verdade = true;
        System.out.println("verdadeiro = " + verdade);

        verdade = !verdade;
        System.out.println("verdadeiro = " + verdade);
    }
}
