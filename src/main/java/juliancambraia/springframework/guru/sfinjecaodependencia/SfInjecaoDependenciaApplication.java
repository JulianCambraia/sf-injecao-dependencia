package juliancambraia.springframework.guru.sfinjecaodependencia;

import juliancambraia.springframework.guru.sfinjecaodependencia.controller.MeuController;
import juliancambraia.springframework.guru.sfinjecaodependencia.controller.PropriedadeInjecaoController;
import juliancambraia.springframework.guru.sfinjecaodependencia.controller.SetaInjecaoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfInjecaoDependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfInjecaoDependenciaApplication.class, args);
		MeuController meuController = (MeuController) ctx.getBean("meuController");
		System.out.println(meuController.digaOlaMundo());

		System.out.println("Abordagem péssima - Uso de Property para Inject Dependency e IOc");
		PropriedadeInjecaoController propriedadeInjecaoController = (PropriedadeInjecaoController) ctx.getBean("propriedadeInjecaoController");
		System.out.println(propriedadeInjecaoController.getSaudar());

		System.out.println("Má ruim - Uso de Setter para Inject Dependency e IOc");
		SetaInjecaoController setaInjecaoController = (SetaInjecaoController) ctx.getBean("setaInjecaoController");
		System.out.println(setaInjecaoController.saudarComSetter());
	}

}
