package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
public class Empreendimento implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_empreendimento", nullable = false)
    private Integer idEmpreendimento;
    @OneToMany
    @JoinColumn(name = "id_tipo_empreendimento", referencedColumnName = "id_tipo_empreendimento")
    private TipoImovel idTipoImovel;

}
