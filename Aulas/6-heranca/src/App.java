public class App {
    public static void main(String[] args) throws Exception {
        carro meuCarro = new carro();
        System.out.println(meuCarro.marca);  
        meuCarro.buzinar();                   
        System.out.println(meuCarro.modelo);  
    }
}
