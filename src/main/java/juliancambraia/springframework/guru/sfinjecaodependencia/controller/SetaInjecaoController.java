package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetaInjecaoController {

    @Autowired
    private SaudacaoService saudacaoService;

    public void setSaudacaoService(SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String saudarComSetter() {
        return saudacaoService.saudar("por Setter");
    }
}
