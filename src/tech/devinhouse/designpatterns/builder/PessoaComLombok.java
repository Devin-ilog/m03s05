package tech.devinhouse.designpatterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PessoaComLombok {

    private Long cpf;

    private String rg;

    private String nome;

    private String sobrenome;

}
