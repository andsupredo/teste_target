import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fibonacci = 0;
        int fibo_ant = 0;

        System.out.print("Insira o número de iterações da sequência Fibonacci: ");
        int n = sc.nextInt();
        System.out.print(fibonacci);
        for(int i =0; i<=n; i++) {
            if (i == 1) {
                fibonacci = 1;
                fibo_ant = 0;
            } else {
                fibonacci += fibo_ant;
                fibo_ant = fibonacci - fibo_ant;
            }
            System.out.print(fibonacci + ", ");
        }
        sc.close();
    }
}
