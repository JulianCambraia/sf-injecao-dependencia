package juliancambraia.springframework;

import juliancambraia.springframework.examplebeans.FakeDataSource;
import juliancambraia.springframework.guru.controller.MyController;
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

        System.out.println("---------------Injetando no Contexto do Spring as Propriedades Externas------------------");
        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
    }

}
