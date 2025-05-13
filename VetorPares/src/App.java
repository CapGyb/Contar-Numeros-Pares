public class App {
    public static void main(String[] args) throws Exception {

        int [] vetor = new int[20];
        int par = 0, auxiliar = 1;

        for (int i = 0; i < 20; i++) {

            vetor[i] = auxiliar;
            auxiliar += i;
            
        }

        for (int i = 0; i < 20; i++) {

            if (vetor[i] %2 == 0) {

                par++;
                System.out.println(vetor[i]);
                
            }
            
        }

        System.out.printf("São %d números pares!\n", par);

    }
}
