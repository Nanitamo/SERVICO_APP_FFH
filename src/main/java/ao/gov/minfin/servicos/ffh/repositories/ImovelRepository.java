package ao.gov.minfin.servicos.ffh.repositories;

import ao.gov.minfin.servicos.ffh.domain.entities.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImovelRepository extends JpaRepository<Imovel, Integer> {
}
