public class AnexoQuestao5 {
    public static void main(String[] args){
        /* a) For (i = 100, i >= 1, i++)
                System.out.println(i);
         */
        System.out.println("a) corrigida");
        int i;
        for(i = 100; i >= 1; i--)
            System.out.println(i);
        /* Explicação: Primeiro que a sintaxe correta do for é usando ';' E NÃO ',' para separar as intruções.
         * Segundo que, da forma como o código foi escrito antes da correção, ele entraria num looping infinito. Ao invés de usar um incremento para a variável, deve-se usar um decremento, já que queremos que a variável i assuma os valores de 100 até 1.
         */


        
        /* b) switch (value % 2) {
                case 0:
                    System.out.println("Inteiro par");
                case 1:
                    System.out.println("Inteiro ímpar");
              }
         */
        System.out.println("b) corrigida ");
        int value = 10;
        switch (value % 2) {
            case 0:
                System.out.println("Inteiro par");
                break;
            case 1:
                System.out.println("Inteiro ímpar");
                break;
        }
        /* Explicação: Em todo final de um conjunto de instruções de cada bloco de case em switch, é necessário utilizar a instrução break para que as instruções que seguem os próximos cases não sejam executadas.
         */


        // c) for(i =19; i >=1; i +=2) System.out.println(i); 
        System.out.println("c) corrigida ");
        for(i = 19; i >=1; i -=2) System.out.println(i);
        /* Explicação: Como é para imprimir todos os valores ímpares entre 19 e 1, é preciso usar um decremento no lugar de um incremento como foi proposto pela questão. */



        /* d)   counter = 2;
                do {
                    System.out.println(counter);
                    counter += 2;
                } while (counter < 100);
        */
        System.out.println("d) corrigida ");
        int counter = 2;
                do {
                    System.out.println(counter);
                    counter += 2;
                } while (counter <= 100);
        /* Explicação: A condição do do-while estava errada, por isso foi necessário mudar para <=, já que da forma anterior ele não chegaria a executar até o counter atingir o valor 100 (o que no caso é pedido na questão). */
    }
}
