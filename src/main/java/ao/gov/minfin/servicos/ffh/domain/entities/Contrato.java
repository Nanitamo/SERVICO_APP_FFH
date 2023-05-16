package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class Contrato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_contrato", nullable = false)
    private Integer idContrato;
    @OneToOne
    @JoinColumn(name = "id_beneficiario",referencedColumnName = "id_beneficiario")
    private Beneficiario idBeneficiario;
    @Column(name = "status", nullable = false)
    private  String status;
    @Column(name = "numero_contrato", nullable = false, unique = true)
    private  String numeroContrato;
    @Column(name = "data_finalizacao", nullable = false)
    private Date dataFinalizacao;
    @Column(name = "data_inicio", nullable = false)
    private Date dataInicio;
    @Column(name = "data_assinatura", nullable = false)
    private Date dataAssinatura;
    @Column(name = "utilizadorCreateNome", nullable = false)
    private String utilizadorCreateNome;
    @Column(name = "utilizadorCreateNif", nullable = false)
    private String utilizadorCreateNif;
    @Column(name = "data_create", nullable = false)
    private Date dataCreate;

}
