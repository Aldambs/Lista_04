package Lista_04;

import java.util.Scanner;

public class Quest_01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int vt[] = new int[5];
        String ordem = " ";
        int num;

        do {
            System.out.println("Informe quantos elementos o vetor receberá:");
            num = ler.nextInt();
        } while (num <= 0 || num > 5);

        for (int i = 0; i < num; i++) {
            System.out.print("Entre com o elemento " + i + " do vetor: ");
            vt[i] = ler.nextInt();

        }
        //processo de verificação se o vetor está em ordem cresc ou decresc
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                if (vt[i] < vt[j] && vt[j] > vt[i]) {
                    ordem = "crescente";
                } else if (vt[i] > vt[j] && vt[j] < vt[i]) {
                    ordem = "Decrescente";
                } else if (vt[i] == i) {
                    ordem = "Não Ordenado";
                }
            }
        } //fim do for i
        System.out.println("Vetor = ");
        for (int i = 0; i < num; i++) {
            System.out.print(vt[i]+ " ");
        }
        System.out.println("\nA ordem digitada foi: " +ordem );
        
    }

}
