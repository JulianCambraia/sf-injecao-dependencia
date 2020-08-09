package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstrutorInjecaoControllerTest {

    ConstrutorInjecaoController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstrutorInjecaoController(new SaudacaoServiceImpl());
    }

    @Test
    void saudarComContstrutor() {
        System.out.println(controller.saudarComContstrutor());
    }
}