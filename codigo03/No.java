public class No<T>{
    private T dado;
    private No<T> nextNo;

    public No(){
        this(null);
    }

    public No(T dado){
        this.dado = dado;
        this.nextNo = null;
    }

    public void setDado(T dado){
        this.dado = dado;
    }

    public T getDado(){
        return this.dado;
    }

    public void setNextNo(No<T> nextNo){
        this.nextNo = nextNo;
    }

    public No<T> getNextNo(){
        return this.nextNo;
    }

    @Override
    public String toString(){
        return "Dado{ " + getDado() + "}";
    }
}