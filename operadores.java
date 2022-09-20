/* Aula 04 - Boolen armazena operadores logicos */ 

public class operadores {
    public static void main(String[] args) {
        // boolean resultado = false;       
        // System.out.println(resultado);

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;

        System.out.println(vamosAPraia);

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);

    }
}

//Tabele verdade
//Operadores && (and)
//Operadores || (or)
// ? atribuir um valor baseado
// : caso contrario