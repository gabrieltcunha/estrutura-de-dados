public class Pessoa{
    private String nome;
    private int idade;
    private Endereco end;

    public Pessoa(){
        this(null, 0, new Endereco());
    }

    public Pessoa(String nome, int idade){
        this(nome, idade, new Endereco());
    }

    public Pessoa(String nome, int idade, Endereco end){
        setNome(nome);
        setIdade(idade);
        setEnd(end);
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setEnd(Endereco end){
        this.end = end;
    }

    public Endereco getEnd(){
        return this.end;
    }

    @Override
    public String toString(){
        return String.format("Pessoa{Nome: %s, Idade: %d, %s}",getNome(), getIdade(), end.toString());
    }
}