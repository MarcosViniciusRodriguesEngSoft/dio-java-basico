public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        String primeiroNome = "Marcos Vinicius";
        String segundoNome = "Rodrigues";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}