import java.util.Scanner;

public class PTIAlgoritimos {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de elementos para seu vetor: ");
        int elementosDoVetor = scan.nextInt();

        int[] meuVetor = new int[elementosDoVetor];

        for(int i=0; i < meuVetor.length; i++) {
            System.out.printf("Entre com o elemento numero: %d ", i+1);
            meuVetor[i] = scan.nextInt();
        }

        int diferenca = retornaDiferencaDeMaiorEMenorValor(meuVetor);
        System.out.println("A maior diferenca entre dois elementos do seu vetor e " + diferenca);

        boolean eCrescente = ordemCrescente(meuVetor);
        System.out.println("\nA ordem e crescente? " + eCrescente);

        scan.close();
    }

    public static int retornaDiferencaDeMaiorEMenorValor(int[] array) {
        int menorValor = Integer.MAX_VALUE; //Apenas avisa o Java que eu quero usar o maior numero possivel como referencia. So usa no primeiro loop.
        for(int i=0; i < array.length; i++) {
            if(menorValor > array[i]) {
                menorValor = array[i];
            }
        }
        int maiorValor = Integer.MIN_VALUE; //Apenas avisa o Java que eu quero usar o menor numero possivel como referencia.
        for(int i=0; i < array.length; i++) {
            if(maiorValor < array[i]){
                maiorValor = array[i];
            }
        }
        return maiorValor - menorValor;
    }

    public static boolean ordemCrescente(int[] array) {
        for(int i=0; i < array.length-1; i++) {
            if(array[i] > array[i + 1]){
                return false;
            }
        }
        return true;
    }
}
