import java.util.Scanner;

public class entde10notascontinue {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int condicao = 1;
        float soma = 0;

        while (condicao <= 10) {

            System.out.println("Escreva a nota da prova");
            float nota = entrada.nextFloat();
            if (nota < 0 || nota > 10 ){
                continue; //nao sai do loop, ignora oque tem embaixo
            }
            condicao++;
            soma = soma +nota;

        } //fecha o while

        float media =  soma /10;

        System.out.println("A média da turma é " +media);


    }
}
