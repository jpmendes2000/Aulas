import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        HashMap<Integer, HashMap<String, String>> produtos = new HashMap<>();

        int id = 1;

        System.out.println("quantos produtos deseja add ?");
        int addProd = ler.nextInt();

        while (id <= addProd) {
            System.out.println("Qual o nome do produto?");
            String prod = ler.nextLine();
            System.out.println("Qual a categoria do produto?");
            String cat = ler.nextLine();
            System.out.println("Qual o fornecedor do produto?");
            String forn = ler.nextLine();
            System.out.println("Qual o vendedor do produto?");
            String vend = ler.nextLine();

            HashMap<String, String> produto = new HashMap<>();
            produto.put("ID", String.valueOf(id));
            produto.put("Produto", prod);  
            produto.put("Categoria", cat);
            produto.put("Fornecedor", forn);
            produto.put("Vendedor", vend);

            produtos.put(id, produto);

            System.out.println("\n=== PRODUTO CADASTRADO ===");
            for (String campo : produto.keySet()) {
                System.out.println(campo + ": " + produto.get(campo));
            }
            id++;
        }

        System.out.println("\n=== TODOS OS PRODUTOS CADASTRADOS ===");
        for (int produtoId : produtos.keySet()) {
            System.out.println("\nProduto ID: " + produtoId);
            HashMap<String, String> produto = produtos.get(produtoId);
            for (String campo : produto.keySet()) {
                System.out.println(campo + ": " + produto.get(campo));
            }
        }

        ler.close(); 
    }
}
