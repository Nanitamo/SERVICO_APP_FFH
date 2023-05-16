package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
public class TipoImovel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_tipo_imoveis", nullable = false)
    private Integer idTipoImoveis;
    @Column(name = "descricao", nullable = false)
    private String descricao;
    @Column(name = "utilizadorCreateNome", nullable = false)
    private String utilizadorCreateNome;
    @Column(name = "utilizadorCreateNif", nullable = false)
    private String utilizadorCreateNif;
    @Column(name = "data_create", nullable = false)
    private Date dataCreate;
}
