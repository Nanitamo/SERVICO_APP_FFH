package ao.gov.minfin.servicos.ffh.repositories;

import ao.gov.minfin.servicos.ffh.domain.entities.Beneficiario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Integer> {
}
