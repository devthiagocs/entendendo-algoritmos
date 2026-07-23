package pesquisabinaria;

public class PesquisaBinaria {
    //O retorno do int não pode ser null, então por isso o uso do Integer na declaração do método
    public static Integer pesquisaBinaria(int[] lista, int item){
        int baixo = 0;
        int alto = lista.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];

            if(chute == item){
                return meio;
            } else if(chute > item){
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        //Como deve ser declarada um array, uma lista de int
        int[] minhaLista = {1, 3, 5, 7, 9};

        System.out.println(pesquisaBinaria(minhaLista, 7));
        System.out.println(pesquisaBinaria(minhaLista, -1));
    }
}
