package Lista_04;

import java.util.Scanner;

public class Quest_06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       
        String comando = null;
        int[] vetor = new int[7];
        int cont = 0;

        do {

            System.out.println("Entre com o comando:");
            comando = ler.next();

            if (comando.contains("D")) {
                cont++;
                if (cont > 2) {
                    break;
                }
            }
            if (comando.contains("E")) {
                cont++;
                if (cont > 1) {
                    break;
                }
            }
            if (comando.contentEquals("S")) {
                break;
            }

            switch (comando) {

                case "D":
                    for (int i = 0; i < 7; i++) {
                        vetor[0] = 20;
                        vetor[1] = 12;
                        vetor[2] = 22;
                        vetor[3] = 7;
                        vetor[4] = 30;
                        vetor[5] = 40;
                        vetor[6] = 50;

                    }
                    for (int i = 0; i < 7; i++) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                    break;
                    
                case "E":

                    for (int i = 0; i < 7; i++) {
                        vetor[0] = 20;
                        vetor[1] = 50;
                        vetor[2] = 40;
                        vetor[3] = 30;
                        vetor[4] = 7;
                        vetor[5] = 22;
                        vetor[6] = 12;
                    }
                    for (int i = 0; i < 7; i++) {
                        System.out.print(vetor[i] + " ");
                    }
                    System.out.println();
                    break;
                    
                case "S":
                    break;
                default:
                    System.out.println("Comando inválido!");
            }

        } while (comando != " S ");
    }
}

