import java.util.Scanner;

public class somatorio {
    public static void main(String[] args) {
        System.out.println("Quantidade de números:");
        Scanner prompt = new Scanner(System.in);
        int n = prompt.nextInt();
        int numero;
        int soma = 0;
        int i = 0;
        while(i < n){
            i = i + 1;
            System.out.println("Numero:");
            numero = prompt.nextInt();
            soma = soma + numero;
        }
        System.out.println("Soma = " +soma);
        
    }
   // public static void main(String[] args){
        /*Scanner teclado = new Scanner(System.in);
        float a = 0;
        float b = 0;
        float soma = 0;

        System.out.println("Digite um número: ");
        a = teclado.nextInt();
        System.out.println("Digite um número: ");
        b = teclado.nextInt();

        soma = a + b;

        System.out.format("A Soma entre %.0f e %.0f é igual a %.0f ", a, b, soma);


*/

   
}


    
    

