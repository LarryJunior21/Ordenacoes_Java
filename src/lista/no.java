package lista;

public class no {
    
    protected no prox;
    protected no ant;
    int info;

    public no(int info) {
        this.info = info;
    }

    public no(no prox, no ant, int info) {
        this.prox = prox;
        this.ant = ant;
        this.info = info;
    }

    public no getProx() {
        return prox;
    }

    public void setProx(no prox) {
        this.prox = prox;
    }

    public no getAnt() {
        return ant;
    }

    public void setAnt(no ant) {
        this.ant = ant;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }    
}
