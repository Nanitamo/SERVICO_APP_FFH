package ao.gov.minfin.servicos.ffh.repositories;

import ao.gov.minfin.servicos.ffh.domain.entities.Empreendimento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpreendimentoRepository extends JpaRepository<Empreendimento, Integer> {
}
