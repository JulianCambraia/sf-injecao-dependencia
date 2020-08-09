package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoService;
import org.springframework.stereotype.Controller;

@Controller
public class MeuController {

    SaudacaoService saudacaoService;

    public MeuController(SaudacaoService saudacaoService) {
        this.saudacaoService = saudacaoService;
    }

    public String digaOlaMundo() {
        System.out.println(saudacaoService.saudar());
        return "Tudo funcionando!!!";
    }
}