public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Marcos " + "Vinicius " + "Rodrigues";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao);

        int numero = 5;

        numero = -numero;

        System.out.println(numero);

        numero = numero * -1;

        System.out.println(numero);

        int numeroContador = 5;

        System.out.println(numeroContador++);

        System.out.println(++numeroContador);

        System.out.println(numeroContador--);

        System.out.println(--numeroContador);

        boolean variavel = true;

        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;

        String resultado = "";

        if (a == b) {
            resultado = "Verdadeiro";
        } else {
            resultado = "Falso";
        }

        System.out.println(resultado);

        String resultado2 = a == b ? "Verdadeiro" : "False";
        
        System.out.println(resultado2);
    }
}
