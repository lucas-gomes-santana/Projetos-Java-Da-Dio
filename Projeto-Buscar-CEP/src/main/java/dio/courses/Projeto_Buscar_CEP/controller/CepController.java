package dio.courses.Projeto_Buscar_CEP.controller;

import dio.courses.Projeto_Buscar_CEP.service.CepService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("/{cep}")
    public String getCidade(@PathVariable String cep){
        return cepService.buscarCidade(cep);
    }
}
