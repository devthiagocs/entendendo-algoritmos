package pesquisabinaria.recursao;

import java.util.Stack;

public class ProcuraChave {
    public static void procurePelaChave(Caixa caixaPrincipal){ //O método recebe uma caixa
        Stack<Caixa> pilha = new Stack<>(); //Cria a pilha vazia
        pilha.push(caixaPrincipal); //"push()" significa colocar algo no topo da pilha

        while (!pilha.isEmpty()) { //Enquanto tiver caixas para abrir...
            Caixa caixa = pilha.pop(); //"pop()" pega a caixa do topo e remove da pilha

            for (Item item : caixa.getItens()) { //Percorre todos os objetos dentro da caixa
                if (item.eUmaCaixa()) { //Esse objeto é uma caixa?
                    pilha.push((Caixa) item); //Coloca a nova caixa na pilha
                } else if (item.eUmaCaixa()){ //É uma chave?
                    System.out.println("Achei a chave!");
                    
                    return;
                }
            }
        }
    }
}
