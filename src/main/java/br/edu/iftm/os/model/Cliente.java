
package br.edu.iftm.os.model;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter @Setter

public class Cliente implements Serializable{
    private Integer id;
    private String nomeFantasia;
    private String sobrenomeRazão;
    private Date dataNascimento;
    private Date dataCadastro;
    private String cpfCnpj;
    private String rgInscrição;
    private String email;
    private String sexo;
}
