package dio.courses.Projeto_Buscar_CEP.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CepResponse {
    @JsonProperty("localidade")
    private String cidade;

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
