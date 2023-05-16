package ao.gov.minfin.servicos.ffh.restClient.services.implementations;

import ao.gov.minfin.servicos.ffh.domain.entities.Empreendimento;
import ao.gov.minfin.servicos.ffh.restClient.ClientServiceManager;
import ao.gov.minfin.servicos.ffh.restClient.configuracao.ClientConfiguracao;
import ao.gov.minfin.servicos.ffh.restClient.exceptions.ClientNaoInciailizadoException;
import ao.gov.minfin.servicos.ffh.restClient.services.interfaces.IEmpreendimentoServiceFFHClient;
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

@Service
public class EmpreendimentoServiceFFHClient implements IEmpreendimentoServiceFFHClient {


    private final Logger LOGGER = LoggerFactory.getLogger( EmpreendimentoServiceFFHClient.class );
    @Autowired
    private ClientConfiguracao clienteConfiguracao;
    @Autowired
    private ClientServiceManager clientServiceManager;
    private WebClient client;

    public EmpreendimentoServiceFFHClient(){

    }
    protected void init()
    {
        clientServiceManager.criarClient(clienteConfiguracao.URL_SERVICE_ORGAOS_ESTADO);
    }
    @Override
    public Empreendimento findEmpreendimentoByCodigo(String codigo) {

        try
        {
            String res = (String) this.clientServiceManager.getSingleEntity("/listarEmpre", null, String.class);
            JSONObject jsonObject = new JSONObject(res);
            JSONArray resultSet = jsonObject.getJSONArray("ListarEmpre-Detalhe");

            ObjectMapper objectMapper = new ObjectMapper();

            return null;
        }
        catch (ClientNaoInciailizadoException | URISyntaxException | JSONException | WebClientResponseException ex) {
            LOGGER.error("findAllUOs() : OrgaoEstadoSifpService : init() : " + ex.getMessage());
        }
        return null;
    }


}
