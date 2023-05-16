package ao.gov.minfin.servicos.ffh.restClient.services.interfaces;

import ao.gov.minfin.servicos.ffh.domain.entities.Beneficiario;
import ao.gov.minfin.servicos.ffh.domain.entities.Empreendimento;

public interface IEmpreendimentoServiceFFHClient {
    public Empreendimento findEmpreendimentoByCodigo(String codigo);
}
