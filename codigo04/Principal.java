public class Principal{
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>("Números Inteiros");

        fila.enfileirar(55);
        fila.enfileirar(4);
        fila.enfileirar(32);
        fila.enfileirar(2);
        fila.enfileirar(10);
        fila.imprimeFila();

        //System.out.println("Dado " + fila.desenfileirar() + " removido!");

        Integer total = 0;
        for(int i = 0; i < 4; i++){
            total += fila.desenfileirar();
        }
        System.out.println("Total: " + total);
    }
}