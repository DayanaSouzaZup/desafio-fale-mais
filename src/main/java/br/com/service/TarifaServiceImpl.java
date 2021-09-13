package br.com.service;

import br.com.dto.CalculaTarifaDTO;
import br.com.dto.ValoresPorMinutoDTO;
import br.com.entity.Tarifa;
import br.com.entity.TarifaDTO;
import br.com.enums.Plano;
import br.com.exception.BussinessException;
import br.com.repository.TarifaRepository;
import br.com.service.impl.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarifaServiceImpl implements TarifaService {

    @Autowired
    TarifaRepository tarifaRepository;


    @Override
    public void criar(TarifaDTO tarifaDTO) {
        tarifaRepository.save(tarifaDTO.toModel());
    }

    @Override
    public List<TarifaDTO> listar() {
        List<TarifaDTO> tarifasDTO = new ArrayList<>();

        for (Tarifa tarifa : tarifaRepository.findAll()) {
            tarifasDTO.add(tarifa.toDTO());
        }

        return tarifasDTO;
    }

    @Override
    public ValoresPorMinutoDTO calculaMinutosFalados(CalculaTarifaDTO calculaTarifaDTO) throws BussinessException {

        if (calculaTarifaDTO.getMinutosFalado() < 0){
            throw new BussinessException("Valor dos minutos falado não pode ser menor que zero");
        }

        Tarifa tarifa = tarifaRepository.findByOrigemAndDestino(calculaTarifaDTO.getOrigem(), calculaTarifaDTO.getDestino());
        double valorMinutosSemPlano = calculaTarifaDTO.getMinutosFalado() * tarifa.getValorPorMinuto();
        double valorMinutosComPlano =0;

        if (calculaTarifaDTO.getMinutosFalado() > calculaTarifaDTO.getPlano().getValorPlano()) {
            valorMinutosComPlano = (calculaTarifaDTO.getMinutosFalado() - calculaTarifaDTO.getPlano().getValorPlano()) * tarifa.getValorPorMinuto();
        }

        return new ValoresPorMinutoDTO(valorMinutosSemPlano, valorMinutosComPlano);



        // int plano = Plano.FALE_MAIS_30.getValorPlano();
        // criar um enum com o planos
        //no dto vai chegar a origem, destino e o plano do cliente, quantidade de minutos
    }

}


