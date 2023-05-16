package ao.gov.minfin.servicos.ffh.restClient.services.implementations;


import ao.gov.minfin.servicos.ffh.domain.entities.Beneficiario;
import ao.gov.minfin.servicos.ffh.restClient.ClientServiceManager;
import ao.gov.minfin.servicos.ffh.restClient.configuracao.ClientConfiguracao;
import ao.gov.minfin.servicos.ffh.restClient.exceptions.ClientNaoInciailizadoException;
import ao.gov.minfin.servicos.ffh.restClient.services.interfaces.IBeneficiarioServiceFFHClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.net.URISyntaxException;
import java.util.List;

@Service
public class BeneficiarioServiceFFHClient implements IBeneficiarioServiceFFHClient
{
    private final Logger LOGGER = LoggerFactory.getLogger( BeneficiarioServiceFFHClient.class );
    @Autowired
    private ClientConfiguracao clienteConfiguracao;
    @Autowired
    private ClientServiceManager clientServiceManager;
    private WebClient client;
    public BeneficiarioServiceFFHClient() {
    }
    protected void init()
    {
        clientServiceManager.criarClient(clienteConfiguracao.URL_SERVICE_ORGAOS_ESTADO);
    }
    @Override
    public Beneficiario findBeneficiarioByNif(String nif)
    {
        try
        {
            String res = (String) this.clientServiceManager.getSingleEntity("/listarBenef", null, String.class);
            JSONObject jsonObject = new JSONObject(res);
            JSONArray resultSet = jsonObject.getJSONArray("ListarBenef-Detalhe");

            ObjectMapper objectMapper = new ObjectMapper();


            return null;
        }
        catch (ClientNaoInciailizadoException | URISyntaxException | JSONException | WebClientResponseException ex) {
            LOGGER.error("findAllUOs() : OrgaoEstadoSifpService : init() : " + ex.getMessage());
        }
        return null;
    }



}
