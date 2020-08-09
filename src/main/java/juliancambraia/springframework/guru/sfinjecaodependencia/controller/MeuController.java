package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MeuController {

    public String digaOlaMundo() {
        System.out.println("Olá Mundo Spring Framework - IOc e Injeção de Dependência");
        return "Tudo funcionando!!!";
    }
}
