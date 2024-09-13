import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double numero1;
        double numero2;
        double resultado = 0;
        int operacao = 2;
        String texto = "Digite";

        while (operacao != 0) {
            System.out.println("Calculadora do Nashville");
            Scanner dadosDeConsole = new Scanner(System.in);
            System.out.println(texto + " um número");
            numero1 = dadosDeConsole.nextInt();
            System.out.println(texto + " outro numero");
            numero2 = dadosDeConsole.nextInt();
            System.out.println(texto + " a operação: \n" +
                    "1 - soma\n");
            operacao = dadosDeConsole.nextInt();
            if (operacao ==0){
                break;
            }
            if (operacao == 1) {
                resultado = numero1 + numero2;
            }

            if (operacao != 1 )
            {
                System.out.println("Operação Inválida"+"\n\n\n\n\n\n\n");

            } else {
                System.out.println("Total: " + resultado+"\n\n\n\n\n\n\n");
            }
        }


    }
}
