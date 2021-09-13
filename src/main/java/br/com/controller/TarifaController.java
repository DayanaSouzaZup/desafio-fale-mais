package br.com.controller;

import br.com.dto.CalculaTarifaDTO;
import br.com.dto.ValoresPorMinutoDTO;
import br.com.entity.TarifaDTO;
import br.com.exception.BussinessException;
import br.com.service.TarifaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tarifas")
public class TarifaController {

    @Autowired
    TarifaServiceImpl tarifaService;

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE })
    public void adicionaTarifa(@RequestBody TarifaDTO tarifaDTO){

    }

    @GetMapping(path = "/calcula")
    public ValoresPorMinutoDTO calculaMinutosFalados(@RequestBody CalculaTarifaDTO calculaTarifaDTO) throws BussinessException {
        return tarifaService.calculaMinutosFalados(calculaTarifaDTO);
    }




}
