package lista;

import java.util.Random;

public class list {
    protected no ini;
    protected no fim;

    public list() {
    }
 
    public list(no ini) {
        this.ini = ini;
    }

    public no getIni() {
        return ini;
    }

    public void setIni(no ini) {
        this.ini = ini;
    }

    public no getFim() {
        return fim;
    }

    public void setFim(no fim) {
        this.fim = fim;
    }
    
    public void geraLista(list lista){
        Random gerador = new Random();
        no no = new no(gerador.nextInt(26));
        lista.setIni(no);
        
        //GERA LISTA RANDOMICA
        for(int i=0; i < 10; i++){
                                        //DE 0 a 10
            no novo = new no(gerador.nextInt(10));
            //INSERE RECURSIVAMENTE E LIGA OS NODOS
            lista.insere(novo, lista.getIni());
        }
    }
    
    //INSERE RECURSIVO
    public void insere(no no, no aux){
        if (aux.getProx() == null) {
            no.setAnt(aux);
            aux.setProx(no);
            setFim(no);
        } else {
            insere(no, aux.getProx());
        }
    }
    
    public void exibe(){
        no aux = getIni();
        while(aux != null){
            if(aux.getAnt() != null && aux.getProx() != null)
                System.out.println("[" + aux.getAnt().getInfo() + "] " + aux.getInfo() + " [" + aux.getProx().getInfo() + "]");
            else if(aux.getProx() == null){
                System.out.println("[" + aux.getAnt().getInfo() + "] " + aux.getInfo() + " [N]");
            }
            else
                System.out.println("[N] " + aux.getInfo() + " [" + aux.getProx().getInfo() + "]");
            aux = aux.getProx();
        }
    }
    
    //METODOS DE ORDENAÇÃO
    
    //insertion_sort with integer
    public void insercao_direta(){
        int aux;
        no i, pos, inicio = getIni();
        i = inicio.getProx();
        while( i != null ){
            aux = i.getInfo();
            pos = i;
            while( pos != inicio && aux < pos.getAnt().getInfo())
            {
                pos.setInfo(pos.getAnt().getInfo());
                pos = pos.getAnt();
            }
            pos.setInfo(aux);
            i = i.getProx();
        }
    }
}
