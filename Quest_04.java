package Lista_04;

import java.util.*;

public class Quest_04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random gera = new Random();
        int soma[] = new int[13];
        int dado1;
        int dado2, s;
        
        for (int i = 0; i < soma.length; i++) {
            soma[i] = 0;
        }
        for (int i = 0; i < 3000; i++) {
            dado1 = gera.nextInt(6) + 1;
            dado2 = gera.nextInt(6) + 1;
            s = dado1 + dado2;
            soma[s] = soma[s] + 1;
        }
        System.out.print("A soma = ");
        for (int i = 0; i < soma[i]; i++) {
            System.out.print(soma[i]+ " ");
        }
        
    }
    
}
