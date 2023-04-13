import java.util.Scanner;

public class BMQuestao7 {
    public static void main(String[] args){
        try (Scanner ler = new Scanner(System.in)) {
            int x, y;
            System.out.print("Informe um valor numerico inteiro: ");
            x = ler.nextInt();
            do{
                if(x%2==0){
                    y = x/2;
                } else{
                    y = 3*x+1;
                }
                System.out.print(" " + y + " -> ");
                x = y;
            }while(y!=1);
        }
    }
}
