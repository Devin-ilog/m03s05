package tech.devinhouse.designpatterns.builder;

public class Teste {

    public static void main(String[] args) {

        // sem builder
//        var pessoa1 = new Pessoa();
//        var pessoa2 = new Pessoa("tiago", "albuquerque");
//        var pessoa3 = new Pessoa(123L, "tiago", "sapato");

        // com builder
        Pessoa pessoa1 = new PessoaBuilder().comCpf(123L).comNome("tiago").build();

        // com builder e lombok
        PessoaComLombok outraPessoa = PessoaComLombok
                .builder().cpf(222L).nome("luciano").build();


    }

}
