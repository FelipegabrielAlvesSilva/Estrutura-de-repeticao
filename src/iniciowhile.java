public class iniciowhile {
    public static void main(String[] args){

        int condicao = 2;

        while (condicao <= 10) {
            System.out.println("oi exibido quando condição =" + condicao);
            //numeros aleatorios ate 10
            System.out.println((int) (Math.random()*10) ) ;
            condicao++;
        }
    }
}
