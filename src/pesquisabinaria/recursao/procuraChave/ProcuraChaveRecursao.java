package pesquisabinaria.recursao.procuraChave;

public class ProcuraChaveRecursao { //Recursão é quando o método chama ele mesmo
    public static void procuraChaveRecursao(Caixa caixa){
        for (Item item : caixa.getItens()) {
            if (item.eUmaCaixa()) {
                procuraChaveRecursao((Caixa) item);
            } else if (item.eUmaChave()){
                System.out.println("Achei a chave!");
            }
        }
    }
}
