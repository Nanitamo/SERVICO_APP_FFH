package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
public class Moeda implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_moedas", nullable = false)
    private Integer idMoedas;
    @Column(name = "descricao", nullable = false)
    private String descricao;
    @Column(name = "sigla", nullable = false)
    private String sigla;

}
