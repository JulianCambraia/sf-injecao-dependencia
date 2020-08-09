package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.stereotype.Service;

@Service
public class GenericoSaudacaoServiceImpl implements SaudacaoService {

    @Override
    public String saudar() {
        return "Olá Mundo Spring Framework - IOc e Injeção de Dependência: Construtor";
    }
}
