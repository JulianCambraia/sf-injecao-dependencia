package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoService;
import org.springframework.stereotype.Controller;

@Controller
public class MeuController {

    private final SaudacaoService saudacaoService;

    public MeuController(SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String digaOlaMundo() {
        return saudacaoService.saudar();
    }
}
