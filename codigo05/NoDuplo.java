public class NoDuplo<T>{
    private T dado;
    private int indice;
    private NoDuplo<T> anteriorNo;
    private NoDuplo<T> proximoNo;

    public NoDuplo(T dado){
        this.dado = dado;
        this.indice = 0;
        this.anteriorNo = null;
        this.proximoNo = null;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setIndice(int indice){
        this.indice = indice;
    }

    public int getIndice(){
        return this.indice;
    }

    public void setAnteriorNo(NoDuplo<T> anteriorNo){
        this.anteriorNo = anteriorNo;
    }

    public NoDuplo<T> getAnteriorNo(){
        return this.anteriorNo;
    }
        
    public void setProximoNo(NoDuplo<T> proximoNo){
        this.proximoNo = proximoNo;
    }

    public NoDuplo<T> getProximoNo(){
        return this.proximoNo;
    }

    @Override 
    public String toString(){
        return "{Indice: " + getIndice() + "| Dado: " + getDado() + "}";
    }

  
}