package ao.gov.minfin.servicos.ffh.repositories;

import ao.gov.minfin.servicos.ffh.domain.entities.Gestor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GestorRepository extends JpaRepository<Gestor, Integer> {
}
