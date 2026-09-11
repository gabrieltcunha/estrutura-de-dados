public class Principal{
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("Letras");

        pilha.imprimePilha();
        pilha.push("A");
        pilha.push("B");
        pilha.push("C");
        pilha.imprimePilha();
        
        System.out.println("Dado: " + pilha.pop() + " removido!");

        pilha.imprimePilha();
        System.out.println("Topo da Pilha: " + pilha.peek());
    }
}