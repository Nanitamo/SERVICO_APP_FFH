package ao.gov.minfin.servicos.ffh.restClient.configuracao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.reactive.ClientHttpConnector;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import reactor.netty.http.client.HttpClient;
import reactor.netty.resources.ConnectionProvider;


@Getter
@Setter
@ToString
@Configuration
public class ClientConfiguracao
{
    @Value("${microservice.sistema}")
    public String URL_SERVICE_SISTEMA;
    @Value("${sifp.orgaosestado}")
    public String URL_SERVICE_ORGAOS_ESTADO;

    public ClientConfiguracao() {
    }

    public ClientHttpConnector connector() {
        return new ReactorClientHttpConnector(HttpClient.create( ConnectionProvider.newConnection() ));
    }
}
