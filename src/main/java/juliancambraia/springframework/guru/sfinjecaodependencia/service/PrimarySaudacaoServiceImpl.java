package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimarySaudacaoServiceImpl implements SaudacaoService {
    @Override
    public String saudar() {
        return " Olá Springframework 5 - PRIMARY BEEN";
    }
}
