package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.stereotype.Service;

@Service
public class SaudacaoServiceImpl implements SaudacaoService {

    @Override
    public String saudar(String metodo) {
        return "Olá Mundo Spring Framework - IOc e Injeção de Dependência: " + metodo;
    }
}
