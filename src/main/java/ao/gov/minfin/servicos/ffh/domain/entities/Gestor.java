package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
public class Gestor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_gestor", nullable = false)
    private Integer idGestor;
    @Column(name = "descricao", nullable = false)
    private String descricao;
    @Column(name = "sigla", nullable = false)
    private  String sigla;

}
