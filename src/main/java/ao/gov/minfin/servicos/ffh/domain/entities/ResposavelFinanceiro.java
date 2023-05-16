package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class ResposavelFinanceiro implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_responsavel_financeiro", nullable = false)
    private Integer idResponsavelFinanceiro;
    @Column(name = "id_cliente", nullable = false)
    private Integer idCliente;
    @Column(name = "nome", nullable = false)
    private String nome;
    @Column(name = "iban", nullable = false)
    private String iban;
    @Column(name = "dataNascimento", nullable = false)
    private Date dataNascimento;
    @Column(name = "numeroAgente", nullable = false)
    private String numeroAgente;
    @Column(name = "numeroContribuinte", nullable = false)
    private String numeroContribuinte;
    @Column(name = "numeroBi", nullable = false)
    private String numeroBi;
    @Column(name = "idContactos", nullable = false)
    private List<Contacto> idContactos;
    @Column(name = "utilizadorCreateNome", nullable = false)
    private String utilizadorCreateNome;
    @Column(name = "utilizadorCreateNif", nullable = false)
    private String utilizadorCreateNif;
    @Column(name = "data_create", nullable = false)
    private Date dataCreate;

}
