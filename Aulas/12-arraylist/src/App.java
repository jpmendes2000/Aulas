import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lista de Dados");

        ArrayList <String> profissao = new ArrayList<>();

        profissao.add("professor");
        profissao.add("motorista");
        profissao.add("eletricista");
        profissao.add("frentista");
        profissao.add("economista");

        System.out.println(profissao);

        profissao.add(1,"balconista");

        profissao.get(3);
        System.out.println(profissao.get(3));

        profissao.set(3, "empacotador");
        System.out.println(profissao.get(3));
        System.out.println(profissao);

        profissao.remove(2);
        System.out.println(profissao);

        Collections.sort(profissao);
        System.out.println(profissao);

        for(String i: profissao){
            System.out.println("profissao: " + i);
        }

        Collections.sort(profissao, Collections.reverseOrder(null));
        System.out.println(profissao);
    }
}
