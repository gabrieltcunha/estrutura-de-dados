public class Principal{
    public static void main(String[] args) {
        //Lista de Alunos
        Lista<String> lista = new Lista<String>("Alunos");

        lista.imprimeLista();
        lista.addInicio("Rafael");
        lista.imprimeLista();
        lista.addInicio("Gabriel");
        lista.imprimeLista();
        lista.addInicio("Danielly");
        lista.imprimeLista();
        lista.addFinal("Miguel");
        lista.imprimeLista();

        lista.removeFinal();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
        lista.removeFinal();
        lista.imprimeLista();
        
        /*
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeInicio();
        */       
    }
}