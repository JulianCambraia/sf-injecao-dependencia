package juliancambraia.springframework.guru.sfinjecaodependencia.controller;

import juliancambraia.springframework.guru.sfinjecaodependencia.service.SaudacaoServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetaInjecaoControllerTest {

    SetaInjecaoController controller;

    @BeforeEach
    void setUp() {
        controller = new SetaInjecaoController();
        controller.setSaudacaoService(new SaudacaoServiceImpl());
    }

    @Test
    void saudarComSetter() {
        System.out.println(controller.saudarComSetter());
    }
}