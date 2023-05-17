package tech.devinhouse.designpatterns.builder;

public class Pessoa {

    private Long cpf;

    private String rg;

    private String nome;

    private String sobrenome;


    public Pessoa() { }

//    public Pessoa(Long cpf, String rg, String nome, String sobrenome, String corDoCabelo, String endereco) {
//        this.cpf = cpf;
//        this.rg = rg;
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//    }
//
//    public Pessoa(String nome, String sobrenome) {
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//    }
//
//    public Pessoa(Long cpf, String nome, String sobrenome) {
//        this.cpf = cpf;
//        this.nome = nome;
//        this.sobrenome = sobrenome;
//    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

}
