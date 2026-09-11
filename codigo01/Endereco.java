public class Endereco {
    private String nomeRua;
    private int numero;
    private String bairro;

    public Endereco(){
        this(null, 0, null);
    }

    public Endereco(String nomeRua, int numero, String bairro){
        this.nomeRua = nomeRua;
        this.numero = numero;
        this.bairro = bairro;
    }

    public void setNomeRua(String nomeRua){
        this.nomeRua = nomeRua;
    }

    public String getNomeRua(){
        return this.nomeRua;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public String getBairro(){
        return this.bairro;
    }

    @Override
    public String toString(){
        return String.format("Endereco[Rua: %s, Numero: %d, Bairo: %s]",getNomeRua(), getNumero(), getBairro());
    }
}