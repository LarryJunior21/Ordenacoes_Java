package lista;

public class Ordenacao {
    
    public static void main(String[] args) {
        list lista = new list();
        
        //GERA LISTA
        lista.geraLista(lista);
        //EXIBE LISTA GERADA
        lista.exibe();
        
        
        // -------- METODOS DE ORDENAÇÃO -----------
            lista.insercao_direta();
        
            
        //EXIBE LISTA ORDENADA
        System.out.println("====== ORDENACAO =======");
        lista.exibe();
    }
    
}
