import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean continuar = true;
        while(continuar) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite:\n1-Opção \n2-Opção \n3-Opção \n4-Opção \n5-Opção \n6-Sair");
            int opcao = sc.nextInt();
            String menu = switch(opcao) {
                case 1 ->{
                    yield "Opcão";
                }
                case 2 ->{
                    yield "Opção";
                }
                case 3 -> {
                    yield "Opcão";
                }
                case 4 -> {
                 yield  "Opcão";
                }
                case 5 -> {
                   yield  "Opção";
                }
                case 6 -> {
                    continuar = false;
                    yield "saindo";
                }
                default -> ("Opção Inválida!");
            };
        }
    }
}