

//Continuação da Aula 8 - Vetores

public class vetores2 {
    public static void main(String[] args) {
        int [] numeros = {9, 10, 58, 20, 10};

        int maior = numeros [0];
        int menor = numeros [0];
        int media = 0;

        for (int i=0; i < numeros.length; i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media += numeros[i];
        }
        
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros.length);

    }
}
