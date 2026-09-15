public class ListaDupla<T>{
    private String nomeLista;
    private int tamanho;
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    public ListaDupla(){
        this("Lista Dupla");
    }

    public ListaDupla(String nomeLista){
        this.nomeLista = nomeLista;
        this.tamanho = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

public void addInicio(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        if (primeiroNo ==null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }
        atualizaIndices();
        tamanho++;
    }

public void atualizaIndices() {
        NoDuplo<T> atual = primeiroNo;
        int i = 0;
        while (atual != null) {
            atual.setIndice(i);
            atual = atual.getProximoNo();
            i++;
        }
    }

public void addFinal(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        if (primeiroNo ==null) {
            primeiroNo = ultimoNo = novoNo;
        } else {
            ultimoNo.setProximoNo(novoNo);
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo = novoNo;
        }
        ultimoNo.setIndice(tamanho);
        tamanho++;
    }

public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        } else{
            System.out.println("Dados da lista" + nomeLista);
            NoDuplo<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println(aux.toString());
                aux = aux.getProximoNo();
            }
        }
    }

public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Dado: " + primeiroNo.getDado() + " removido!");
            if(primeiroNo == ultimoNo){
                primeiroNo = null;
                ultimoNo = null;
            } else {
                primeiroNo = primeiroNo.getProximoNo();
                primeiroNo.setAnteriorNo(null);
                atualizaIndices();
            }
            tamanho--;
        }
    }
public void removeFinal(){
        if(primeiroNo == null){
            System.out.println("Lista vazia!");
        } else {
            System.out.println("Dado: " + ultimoNo.getDado() + " removido!");
            if(primeiroNo == ultimoNo){
                primeiroNo = null;
                ultimoNo = null;
            } else {
                ultimoNo = ultimoNo.getAnteriorNo();
                ultimoNo.setProximoNo(null);
            }
            tamanho--;
        }
    }

public void addMeio(T dado, int posicao){
        if(posicao == 0){
            addInicio(dado);
            return;
        }
        
        if(posicao >= tamanho){
            addFinal(dado);
            return;
            }
    
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);
        NoDuplo<T> aux = primeiroNo; 
        
        int i = 1;
        while (i < posicao ) {
            aux = aux.getProximoNo();
            i++;
        }
        novoNo.setAnteriorNo(aux);
        novoNo.setProximoNo(aux.getProximoNo());
        aux.getProximoNo().setAnteriorNo(novoNo);
        aux.setProximoNo(novoNo);
        tamanho ++;
        atualizaIndices();
    }

public void removeMeio(int posicao){
        if(posicao <= 0){
            removeInicio();
            return;
        }
        
        if(posicao >= tamanho-1){
            removeFinal();;
            return;
            }
    
        NoDuplo<T> aux = primeiroNo; 
        
        int i = 1;
        while (i < posicao ) {
            aux = aux.getProximoNo();
            i++;
        }
        System.out.println("Dado: " + aux.getProximoNo().getDado() + " removido!");
        aux.getProximoNo().getProximoNo().setAnteriorNo(aux);
        aux.setProximoNo(aux.getProximoNo().getProximoNo());
        tamanho --;
        atualizaIndices();
    }
}