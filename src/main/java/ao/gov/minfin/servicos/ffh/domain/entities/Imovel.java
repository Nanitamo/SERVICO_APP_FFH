package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
public class Imovel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_imovel", nullable = false)
    private Integer idImovel;
    @OneToMany
    @JoinColumn(name = "id_tipo_imovel",  referencedColumnName = "id_tipo_imovel")
    private TipoImovel idTipoImovel;
}
