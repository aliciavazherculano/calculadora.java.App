import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

  public class calculadoraApp{
    private static Scanner Scanner;

    public static void main(String[] args) {

        Scanner = new Scanner(System.in);

        Double valorUm;
        Double valorDois;
        String operacao;
        boolean continuar;
        try {
            do {
                System.out.println("Digite o valor um: ");
                valorUm = Scanner.nextDouble();

                System.out.println("Digite a operação ( +, -, /, *) ");
                operacao = Scanner.next();

                System.out.println("Digite o valor Dois: ");
                valorDois = Scanner.nextDouble();

                System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));

                continuar = verificarNovaOperacao();
            } while (continuar);


        } catch (InputMismatchException ex) {
            System.out.println("Os valores para calculo devem ser numericos =) ");
        }

    }
     public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Deseja realizar uma nova operção ? (Sim ou Não): ");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("Não");
     }
    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao)  {
        Double respostaCalculo = 0.0;

        switch (operacao) {
            case "+":
                respostaCalculo = valorUm + valorDois;
                break;
            case "-":
                respostaCalculo = valorUm - valorDois;
                break;
            case "*":
                respostaCalculo = valorUm * valorDois;
                break;
            case "/":
                respostaCalculo = valorUm / valorDois;
                break;

            default:
                System.out.println("Operação é invalida =(");

        }
        return respostaCalculo;
    }
}


