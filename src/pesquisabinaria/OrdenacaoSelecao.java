package pesquisabinaria;

import java.util.ArrayList;

public class OrdenacaoSelecao {
    public static int buscaMenor(ArrayList<Integer> lista){
        int menor = lista.get(0);
        int menorIndice = 0;

        for (int i = 1; i < lista.size(); i++) {
            if(lista.get(i) < menor){
                menor = lista.get(i);
                menorIndice = i;
            }
        }
        return menorIndice;
    }
    
    public static ArrayList<Integer> ordenacaoSelecao(ArrayList<Integer> lista){
        ArrayList<Integer> novaLista = new ArrayList<>();

        while (!lista.isEmpty()) {
            int menor = buscaMenor(lista);
            novaLista.add(lista.remove(menor));
        }
        return novaLista;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(3);
        lista.add(6);
        lista.add(2);
        lista.add(10);

        System.out.println(ordenacaoSelecao(lista));
    }
}
