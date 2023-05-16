package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class TipoEmpreedimento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_tipo_empreeendimento", nullable = false)
    private Integer idTipoEmpreeendimento;
    @Column(name = "tp_empreendimento", nullable = false)
    private String tpEmpreendimento;
    @Column(name = "descricao_tp_empreendimento", nullable = false)
    private String descricaoTpEmpreendimento;
    @Column(name = "utilizadorCreateNome", nullable = false)
    private String utilizadorCreateNome;
    @Column(name = "utilizadorCreateNif", nullable = false)
    private String utilizadorCreateNif;
    @Column(name = "data_create", nullable = false)
    private Date dataCreate;

}
