package tech.devinhouse.designpatterns.builder;

public class PessoaBuilder {

    private Pessoa pessoa = new Pessoa();


    public Pessoa build() {
        return pessoa;
    }


    public PessoaBuilder comCpf(Long cpf) {
        pessoa.setCpf(cpf);
        return this;
    }

    public PessoaBuilder comRg(String rg) {
        pessoa.setRg(rg);
        return this;
    }

    public PessoaBuilder comNome(String nome) {
        pessoa.setNome(nome);
        return this;
    }

    public PessoaBuilder comSobrenome(String sobrenome) {
        pessoa.setSobrenome(sobrenome);
        return this;
    }


}
