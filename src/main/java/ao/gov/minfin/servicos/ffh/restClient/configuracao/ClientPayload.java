package ao.gov.minfin.servicos.ffh.restClient.configuracao;

import org.springframework.http.HttpStatus;

import java.io.Serializable;
import java.util.Date;

public class ClientPayload implements Serializable
{
    private String message;
    private HttpStatus status;
    private Integer code;
    private Object data;
    public Date timestamp = new Date();
}
