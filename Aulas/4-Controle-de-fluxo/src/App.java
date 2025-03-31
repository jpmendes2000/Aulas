public class App {
    public static void main(String[] args) throws Exception {
        // if, else if e else 
        int idade = 17;

        if (idade >= 18) {
            System.out.println("pode ir pra baladinha");
        } else if (idade <= 17) {
            System.out.println("MENOR DE IDADE, SAI DAQUI SEU LOUCO");
        } else {
            System.out.println("oxiii quantos anos você me daria");
        }


        System.out.println("");
        // for

        for (int i = 0; i <= 10; i++) {
            System.out.println("O número é " + i);
          }


        System.out.println("");
        // while 



        int contador = 0;
        while (contador <= 10) {
            System.out.println("Contando... " + contador);
        contador++;
}
    }
}
