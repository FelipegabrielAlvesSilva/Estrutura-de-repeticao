import java.util.Scanner;

public class entde10notas {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        int condicao = 1;
        float soma = 0;

        while (condicao <= 10) {

            System.out.println("Escreva a nota da prova");
            float nota = entrada.nextFloat();
            if (nota < 0 || nota > 10 ){
                break; //força a saida do while
            }
            condicao++;
            soma = soma +nota;

        } //fecha o while
        if(condicao == 11){
            float media =  soma /10;

            System.out.println("A média da turma é " +media);
        }

        else{
            System.out.println("Nota inválida. Não é permitido notas negativas ou maiores que 10");
        }
    }
}
