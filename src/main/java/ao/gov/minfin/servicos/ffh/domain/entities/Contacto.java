package ao.gov.minfin.servicos.ffh.domain.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Getter
@Setter
public class Contacto implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_contactos", nullable = false)
    private Integer idContactos;

    private String numero;

    @ManyToOne
    @JoinColumn(name = "id_responsavel_financeiro", referencedColumnName = "id_responsavel_financeiro")
    private ResposavelFinanceiro idResposavelFinanceiro;
}
