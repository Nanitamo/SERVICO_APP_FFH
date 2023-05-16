package ao.gov.minfin.servicos.ffh.restClient;


import ao.gov.minfin.servicos.ffh.restClient.configuracao.ClientConfiguracao;
import ao.gov.minfin.servicos.ffh.restClient.exceptions.ClientNaoInciailizadoException;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.io.Serializable;
import java.net.URISyntaxException;
import java.util.HashMap;

@Component
public class ClientServiceManager implements Serializable
{
    @Autowired
    private ClientConfiguracao configuracao;
    private WebClient client;

    public void criarClient(String baseUrl)
    {
        this.client = WebClient
            .builder()
            .clientConnector(this.configuracao.connector())
            .baseUrl(baseUrl)
            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
            .build();
    }

    public Object getSingleEntity(String url, HashMap<String, String> params, Class entityClass) throws ClientNaoInciailizadoException, URISyntaxException
    {
        if (this.client == null)
            throw new ClientNaoInciailizadoException("Não foi possível inicalizar o cliente");
        return client
            .get()
            .uri(url)
            .retrieve()
            .bodyToMono(entityClass)
                .block();
    }

    public Object postSingleEntity(String url, Object object, Class entityClass) throws ClientNaoInciailizadoException, URISyntaxException, JsonProcessingException
    {
        if (this.client == null)
            throw new ClientNaoInciailizadoException("Não foi possível inicializar o cliente");
        return client
            .post()
            .uri(url)
            .bodyValue(object)
            
            .retrieve()
            .bodyToMono(entityClass)
            .block();
    }
}
