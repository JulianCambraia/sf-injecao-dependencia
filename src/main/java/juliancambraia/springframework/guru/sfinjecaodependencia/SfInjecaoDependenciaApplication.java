package juliancambraia.springframework.guru.sfinjecaodependencia;

import juliancambraia.springframework.guru.sfinjecaodependencia.controller.ConstrutorInjecaoController;
import juliancambraia.springframework.guru.sfinjecaodependencia.controller.I18NController;
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

		System.out.println("--------------------------------------------------");

		System.out.println("--------------------P R O F I L E S------------------------------");
		I18NController i18NController = (I18NController) ctx.getBean("i18NController");
		System.out.println(i18NController.saudarEmVariosIdiomas());
		System.out.println("--------------------------------------------------");

		MeuController meuController = (MeuController) ctx.getBean("meuController");
		System.out.println(meuController.digaOlaMundo());
		System.out.println("--------------------------------------------------");

		System.out.println("Péssima abordagem - Uso de Property para Inject Dependency e IOc");
		PropriedadeInjecaoController propriedadeInjecaoController = (PropriedadeInjecaoController) ctx.getBean("propriedadeInjecaoController");
		System.out.println(propriedadeInjecaoController.getSaudar());
		System.out.println("--------------------------------------------------");

		System.out.println("Abordagem ruim - Uso de Setter para Inject Dependency e IOc");
		SetaInjecaoController setaInjecaoController = (SetaInjecaoController) ctx.getBean("setaInjecaoController");
		System.out.println(setaInjecaoController.saudarComSetter());
		System.out.println("--------------------------------------------------");

		System.out.println("Abordagem Correta - Uso de Construtor para Inject Dependency e IOc");
		ConstrutorInjecaoController construtorInjecaoController = (ConstrutorInjecaoController) ctx.getBean("construtorInjecaoController");
		System.out.println(construtorInjecaoController.saudarComContstrutor());
		System.out.println("--------------------------------------------------");
	}

}
