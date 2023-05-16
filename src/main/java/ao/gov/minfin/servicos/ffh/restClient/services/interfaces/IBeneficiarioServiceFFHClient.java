package ao.gov.minfin.servicos.ffh.restClient.services.interfaces;

import ao.gov.minfin.servicos.ffh.domain.entities.Beneficiario;

public interface IBeneficiarioServiceFFHClient
{
    public Beneficiario findBeneficiarioByNif( String nif );
}
