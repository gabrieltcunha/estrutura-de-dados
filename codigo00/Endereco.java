public class Endereco{
    private String rua;
    private int numero;
    private String bairro;
    
    public Endereco(){
        this(null, 0, null);    
    }

    public Endereco(String rua, int numero, String bairro){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public String getRua(){
        return this.rua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;;
    }

    public String getBairro(){
        return this.bairro;
    }

    @Override
    public String toString(){
        return String.format("Endereco[Rua: %s, Número: %d, Bairro: %s]", getRua(), getNumero(), getBairro());
    }
}