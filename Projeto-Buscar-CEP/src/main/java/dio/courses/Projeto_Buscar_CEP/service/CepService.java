package dio.courses.Projeto_Buscar_CEP.service;

import dio.courses.Projeto_Buscar_CEP.model.CepResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

@Service
public class CepService {
    private final String ViaCepUrl = "https://viacep.com.br/ws/{cep}/json/";

    public String buscarCidade(String cep){
        RestTemplate restTemplate = new RestTemplate();

        try{
            CepResponse response = restTemplate.getForObject(ViaCepUrl,CepResponse.class,cep);

            if(response != null && response.getCidade() != null && !response.getCidade().isEmpty()){
                return response.getCidade();
            }
            else{
                return "CEP inválido ou não encontrado.";
            }
        } catch (HttpClientErrorException e){
            //Tratamento de erros específicos,como quando o CEP não existe
            return "Erro ao acessar a ViaCEP.Verifique se o CEP está correto.";

        } catch(Exception e){
            //Caso outro tipo de erro ocorra
            return "Erro desconhecido ao buscar o CEP.";
        }
    }
}
