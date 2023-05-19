package tech.devinhouse.solid.dependencyinversion;

public class PessoaService {

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    private PessoaRepository repository;

}
