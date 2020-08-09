package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetaInjecaoController {

    private SaudacaoService saudacaoService;

    @Qualifier("setterSaudacaoServiceImpl")
    @Autowired
    public void setSaudacaoService(SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String saudarComSetter() {
        return saudacaoService.saudar();
    }
}
