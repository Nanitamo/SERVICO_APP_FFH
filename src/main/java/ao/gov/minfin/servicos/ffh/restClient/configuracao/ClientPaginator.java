package ao.gov.minfin.servicos.ffh.restClient.configuracao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public abstract class ClientPaginator<T>
{
    private List<T> content;
    private boolean empty;
    private boolean last;
    private boolean first;
    private Integer numberOfElements;
    private Integer size;
    private Integer page;
}
