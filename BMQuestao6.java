import java.util.Scanner;

public class BMQuestao6{
    public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
            int numero;
            do{
                System.out.print("Informe um número entre 1 e 7: ");
                numero = ler.nextInt();
                switch (numero) {
                    case 1:
                        System.out.println("Domingo");
                        break;
                    case 2:
                        System.out.println("Segunda-feira");
                        break;
                    case 3:
                        System.out.println("Terça-feira");
                        break;
                    case 4:
                        System.out.println("Quarta-feira");
                        break;
                    case 5:
                        System.out.println("Quinta-feira");
                        break;
                    case 6:
                        System.out.println("Sexta-feira");
                        break;
                    case 7:
                        System.out.println("Sábado");
                        break;
                    default:
                        System.out.println("Número inválido");
                        break;
                }
            }while(numero!=0);
        }
    }
}