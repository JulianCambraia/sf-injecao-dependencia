package juliancambraia.springframework;

import juliancambraia.springframework.guru.controller.ConstructorInjectController;
import juliancambraia.springframework.guru.controller.MyController;
import juliancambraia.springframework.guru.controller.PropertyInjectController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"juliancambraia.springframework.guru.services", "juliancambraia.springframework"})
public class SfInjecaoDependenciaApplication {

	public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfInjecaoDependenciaApplication.class, args);

        System.out.println("--------------------------------------------------");

        MyController myController = (MyController) ctx.getBean("myController");
        System.out.println(myController.hello());
        System.out.println("--------------------------------------------------");

        System.out.println("Péssima abordagem - Uso de Property para Inject Dependency e IOc");
        System.out.println(ctx.getBean(PropertyInjectController.class).sayHello());
        System.out.println("--------------------------------------------------");

        System.out.println("Abordagem ruim - Uso de Setter para Inject Dependency e IOc");
        System.out.println(ctx.getBean(PropertyInjectController.class).sayHello());
        System.out.println("--------------------------------------------------");

        System.out.println("Abordagem Correta - Uso de Construtor para Inject Dependency e IOc");
        System.out.println(ctx.getBean(ConstructorInjectController.class).sayHello());
        System.out.println("--------------------------------------------------");
    }

}
