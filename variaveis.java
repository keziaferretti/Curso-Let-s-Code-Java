/*https://docs.oracle.com/javase/tutorial/reallybigindex.html */
/*Aula 3 Variaveis */

// public class variaveis {
//     public static void main(String[] args) {
        
//         String nome = "Kézia";
//         System.out.println("Olá, " + nome + "!");
//     }
// }

public class variaveis {
    public static void main(String[] args) {
        
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        float divisao = (float)a / b; /*Java entende que duas variaveis inteira, para divisão inteira. Cest (float)*/

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);
        System.out.println(divisao);

    }
}
