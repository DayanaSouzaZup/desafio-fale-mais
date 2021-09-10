package br.com.service;

import br.com.entity.Tarifa;
import br.com.repository.TarifaRepository;
import br.com.service.impl.TarifaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarifaServiceImpl implements TarifaService {

    @Autowired
    TarifaRepository tarifaRepository;

    public Tarifa buscaCodigoArea(Long idTarifa) {
        return tarifaRepository.findById(idTarifa).orElse(null);
    }

    public List<Tarifa> listaCodigosArea(){
        return (List<Tarifa>) tarifaRepository.findAll();
    }
}
