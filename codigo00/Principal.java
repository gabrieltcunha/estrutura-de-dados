import java.util.Scanner;
import java.util.ArrayList;

public class Principal{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Rafael", 35);
        Pessoa obj3 = new Pessoa();
        Pessoa obj4 = new Pessoa("Gabriel", 29, new Endereco("A", 1, "B"));

        System.out.print("Digite o nome: ");
        obj3.setNome(input.nextLine());
        //String nome = input.nextLine();
        System.out.print("Digite a idade: ");
        //int idade = input.nextInt();
        obj3.setIdade(input.nextInt());

        //obj3.setNome(nome);
        //obj3.setIdade(idade);

        //System.out.println(obj1.toString());
        //System.out.println(obj2.toString());
        //System.out.println(obj3.toString());

        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);
        listaP.add(obj4);

        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());
        }
        
        /*
        listaP.get(0).setNome("Joaquim");
        listaP.get(0).setIdade(1);
        System.out.println(listaP.get(0).toString());
        System.out.println(obj1.toString());
        */
        
        obj4.setNome("Joaquim");
        obj4.setIdade(1);
        obj4.getEnd().setRua("R");
        obj4.getEnd().setNumero(8);
        obj4.getEnd().setBairro("Centro");

        System.out.println(obj4.toString());
        
        input.close();
    }
}