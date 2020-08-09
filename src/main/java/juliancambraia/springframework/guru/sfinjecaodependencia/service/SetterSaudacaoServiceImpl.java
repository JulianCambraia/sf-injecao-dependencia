package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.stereotype.Service;

@Service
public class SetterSaudacaoServiceImpl implements SaudacaoService {
    @Override
    public String saudar() {
        return "Olá Springframework - por Setter";
    }
}
