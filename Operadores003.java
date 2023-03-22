public class Operadores003 {
    public static void main(String[] args) {
        //Lógicos, comparação de verdadeiro ou falso, && = "E" (São verdadeiros?), || = "ou" (Algum é verdadeiro?)
        System.out.println("\nOperadores lógicos, %% e ||:");

        boolean condicao1 = true;

        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("Ambas são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma delas é verdadeiro");
        }
        System.out.println("São diferentes");
    }
}
