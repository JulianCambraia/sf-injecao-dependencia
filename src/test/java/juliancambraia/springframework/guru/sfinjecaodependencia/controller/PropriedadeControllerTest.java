package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropriedadeControllerTest {
    PropriedadeInjecaoController controller;

    @BeforeEach
    void setUp() {
        controller = new PropriedadeInjecaoController();
        controller.saudacaoService = new SaudacaoServiceImpl();

    }

    @Test
    void getSaudar() {
        System.out.println(controller.getSaudar());
    }
}