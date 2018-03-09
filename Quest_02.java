package Lista_04;

import java.util.Scanner;

public class Quest_02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt[] = new int[10];
        
        for (int i = 0; i < vt.length; i++) {
            System.out.println("Informe o valor da posição " +i+ ": ");
            vt[i] = ler.nextInt();
        }
        System.out.println("Informe o número: ");
        int num = ler.nextInt();
        int maior = 0, menor = 0, igual = 0;
        
        for (int i = 0; i < vt.length; i++) {
            if(vt[i] > num){
                maior++;
            }
            if(vt[i] < num){
                menor++;
            }
            if(vt[i] == num){
                igual++;
            }
        }
        System.out.println("O número a ser comparado = " +num);
        System.out.println(" ");
        System.out.println("O vetor = ");
        for (int i = 0; i < vt.length; i++) {
            System.out.print(vt[i]+ " ");
        }
        System.out.println(" ");
        System.out.print("São maiores = " +maior);
        System.out.print("\nSão menores = " +menor);
        System.out.print("\nSão iguais = " +igual);
    }    
}
