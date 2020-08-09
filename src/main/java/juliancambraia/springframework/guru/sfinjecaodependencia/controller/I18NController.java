package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18NController {

    private final SaudacaoService saudacaoService;

    public I18NController(@Qualifier("i18nService") SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String saudarEmVariosIdiomas() {
        return saudacaoService.saudar();
    }
}
