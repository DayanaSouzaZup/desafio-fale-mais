package br.com.service.impl;

import br.com.dto.MensagemDTO;
import br.com.entity.Tarifa;
import br.com.repository.TarifaRepository;
import org.springframework.beans.factory.annotation.Autowired;

public interface TarifaService {

    public Tarifa buscaCodigoArea(Long idTarifa);

}
