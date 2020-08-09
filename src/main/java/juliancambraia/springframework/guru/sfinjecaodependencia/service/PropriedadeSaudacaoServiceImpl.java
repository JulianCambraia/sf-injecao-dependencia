package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.stereotype.Service;

@Service
public class PropriedadeSaudacaoServiceImpl implements SaudacaoService {
    @Override
    public String saudar() {
        return " Olá Spring Framework - por Property";
    }
}
