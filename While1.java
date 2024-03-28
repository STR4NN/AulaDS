public class While1 {
    public static void main(String[] args) {

        int numero = 1;
        while (numero < 100){
           int valor  = numero++;

           if (numero %2 == 0){

               System.out.println("Numeros impares até 100: " + valor);
           }


        }
    }
}
