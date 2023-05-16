package ao.gov.minfin.servicos.ffh.restClient.services.interfaces;

import ao.gov.minfin.servicos.ffh.domain.entities.Imovel;

public interface IImovelServiceFFH {

    public Imovel findImovelByCodigo(Integer cod);
}
