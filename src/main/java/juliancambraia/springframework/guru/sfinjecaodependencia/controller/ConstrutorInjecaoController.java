package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstrutorInjecaoController {

    SaudacaoService saudacaoService;

    public ConstrutorInjecaoController(@Qualifier("genericoSaudacaoServiceImpl") SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String saudarComContstrutor() {
        return saudacaoService.saudar();
    }
}
