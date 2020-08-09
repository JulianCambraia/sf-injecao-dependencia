package juliancambraia.springframework.guru.sfinjecaodependencia;

import juliancambraia.springframework.guru.sfinjecaodependencia.controller.MeuController;
import juliancambraia.springframework.guru.sfinjecaodependencia.controller.PropriedadeInjecaoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfInjecaoDependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfInjecaoDependenciaApplication.class, args);
		MeuController meuController = (MeuController) ctx.getBean("meuController");
		System.out.println(meuController.digaOlaMundo());

		System.out.println("Má práica - Uso de Property para Inject Dependy e IOc");
		PropriedadeInjecaoController propriedadeInjecaoController = (PropriedadeInjecaoController) ctx.getBean("propriedadeInjecaoController");
		System.out.println(propriedadeInjecaoController.getSaudar());
	}

}
