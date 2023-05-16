package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Beneficiario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_beneficiario", nullable = false)
    private Integer idBeneficiario;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "numeroContribuinte", nullable = false)
    private String numeroContribuinte;
    @Column(name = "numeroBi", nullable = false)
    private String numeroBi;
    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;
    @Column(name = "telefone", nullable = false)
    private String telefone;
    @Column(name = "email", nullable = false)
    private String email;
    @Column(name = "id_beneficiario", nullable = false)
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_resposavel_financeiro", referencedColumnName = "id_resposavel_financeiro")
    private ResposavelFinanceiro idResposavelFinanceiro;
    @Column(name = "utilizadorCreateNome", nullable = false)
    private String utilizadorCreateNome;
    @Column(name = "utilizadorCreateNif", nullable = false)
    private String utilizadorCreateNif;
    @Column(name = "data_create", nullable = false)
    private Date dataCreate;
}
