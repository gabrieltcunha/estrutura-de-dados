import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        
        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();

        Pessoa obj1 = new Pessoa("Rafael",35);
        Pessoa obj2 = new Pessoa();
        Pessoa obj3 = new Pessoa();

        System.out.println("digite o nome:");
        obj3.setNome(input.nextLine());

        System.out.println("digite a idade:");
        obj3.setIdade(input.nextInt());

        System.out.println("Nome: " + obj1.getNome());
        System.out.println("Idade: " + obj1.getIdade());
        System.out.println(obj2.toString());

        System.out.println(obj3.toString());

        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);

        for (Pessoa auxPessoa : listaP) {
        System.out.println(auxPessoa.toString());
        }
        
        listaP.get(1).setNome("joaquim");
        listaP.get(1).setIdade(1);
        System.out.println(listaP.get(1));

        System.out.println(obj2.toString());
    }
}