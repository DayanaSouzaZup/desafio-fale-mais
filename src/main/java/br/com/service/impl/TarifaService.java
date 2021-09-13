package br.com.service.impl;

import br.com.dto.CalculaTarifaDTO;
import br.com.dto.MensagemDTO;
import br.com.dto.ValoresPorMinutoDTO;
import br.com.entity.Tarifa;
import br.com.entity.TarifaDTO;
import br.com.exception.BussinessException;
import br.com.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TarifaService {

    public void criar(TarifaDTO tarifaDTO);

    public List<TarifaDTO> listar();

    public ValoresPorMinutoDTO calculaMinutosFalados(CalculaTarifaDTO calculaTarifaDTO) throws BussinessException;

}
