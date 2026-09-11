
public class Principal{
    public static void main(String[] args){
           
        //Alunos
        No<String> obj1 = new No<String>("Rafael");
        No<Pessoa> obj2 = new No<Pessoa>(new Pessoa("Gabriel",29));
        No<Integer> obj3 = new No<Integer>(8);
        /*
        obj1.setNextNo(new No("Cecília"));
        obj1.getNextNo().setNextNo(new No("Joaquim"));
        obj1.getNextNo().getNextNo().setNextNo(new No("Lara"));

        System.out.println(obj1.getDado());
        System.out.println(obj1.getNextNo().getDado());
        System.out.println(obj1.getNextNo().getNextNo().getDado());
        System.out.println(obj1.getNextNo().getNextNo().getNextNo().getDado());
        
        No aux = obj1;
        while (aux != null) {
            System.out.println(aux.getDado());
            aux = aux.getNextNo();
        }
        */
        System.out.println(obj1.getDado());
        System.out.println(obj2.getDado().getNome());
        System.out.println(obj3.getDado());
    }
}