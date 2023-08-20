import java.util.Scanner;

import exeptions.ParametrosInvalidosException;

public class Contador{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.printf("O primeiro valor (%d)  é maior que segundo (%d)",parametroUm,parametroDois);
        }

        sc.close();
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
        int count= parametroDois-parametroUm;
        for(int i=0;i<=count;i++){
            System.out.printf("Imprimindo o número %d \n",i);
        }
    }

}