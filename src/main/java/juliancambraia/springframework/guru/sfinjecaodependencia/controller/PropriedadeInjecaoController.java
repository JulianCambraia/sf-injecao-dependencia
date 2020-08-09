package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropriedadeInjecaoController {

    @Autowired
    public SaudacaoService saudacaoService;

    public String getSaudar() {
        return saudacaoService.saudar();
    }
}
