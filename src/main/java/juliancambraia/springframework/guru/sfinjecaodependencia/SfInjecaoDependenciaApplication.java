package juliancambraia.springframework.guru.sfinjecaodependencia;

import juliancambraia.springframework.guru.sfinjecaodependencia.controller.MeuController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfInjecaoDependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfInjecaoDependenciaApplication.class, args);
		MeuController meuController = (MeuController) ctx.getBean("meuController");
		System.out.println(meuController.digaOlaMundo());
	}

}
