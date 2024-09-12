import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        double numero1;
        double numero2;
        double resultado = 0;
        int operacao = 2;
        String texto = "Digite";

        //enquanto a operator for diferente de 0 ele permaneça executando, se a operação for 0 ele deve encerrar o programa ( break;)
        while (operacao != 0) {
            System.out.println("Calculadora do Nashville");
            Scanner dadosDeConsole = new Scanner(System.in);
            System.out.println(texto + " um número");
            numero1 = dadosDeConsole.nextInt();
            System.out.println(texto + " outro numero");
            numero2 = dadosDeConsole.nextInt();
            System.out.println(texto + " a operação: \n" +
                    "1 - soma\n" +
                    "2 - subtração\n" +
                    "3 - divisao\n" +
                    "4 - multiplicacao");
            operacao = dadosDeConsole.nextInt();
            if (operacao ==0){
                break;
            }
            if (operacao == 1) {
                resultado = numero1 + numero2;
            }
            if (operacao == 2) {
                resultado = numero1 - numero2;
            }
            if (operacao == 3) {
                resultado = numero1 / numero2;
            }
            if (operacao == 4) {
                resultado = numero1 * numero2;
            } //se a operação for diferente de 1 ou 2 ou 3 ou 4 ele exiba "Operação Invalida"
            if (operacao != 1 && operacao != 2 && operacao != 3 && operacao != 4) {
                System.out.println("Operação Inválida"+"\n\n\n\n\n\n\n");

            } else {
                System.out.println("Total: " + resultado+"\n\n\n\n\n\n\n");
            }
        }


    }
}
