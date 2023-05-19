package tech.devinhouse.solid.openclose;

public class OpenClosePrinciple {

    public static void main(String[] args) {

        Autenticacao autenticacao = new AutenticacaoGoogle();
        boolean isAutenticado = autenticacao.autenticar("usuario", "1234");
        System.out.println(isAutenticado);

    }

}
