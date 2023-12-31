import java.util.Scanner;

public class Contador {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = sc.nextInt();
        sc.close();

        if (parametroUm < parametroDois){
            for(int i = 0; i < (parametroDois - parametroUm); i++){
                System.out.println("Imprimindo o número: " + i);
            }
        }
        else{
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro!");
        }
    }
}
