package juliancambraia.springframework.guru.sfinjecaodependencia.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## Iniciando o ciclo de vida do Bean no Construtor!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## O Ciclo de vida do Bean tem estas propriedades!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## O Ciclo de vida do Bean Terminou!!!");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("## O nome do Bean é: " + name);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## Bean Factory foi setado!!!");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## Contexto da aplicação foi inicializado!!!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("## O Post Constructor anota o método que foi chamado!!!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("## O Pre Destroy anota o método que foi chamado!!!");
    }

    public void beforeInit() {
        System.out.println("## Before Init - Chamado o Bean no Post Processor!!!");
    }

    public void afterInit() {
        System.out.println("## After init - Chamado pelo Bean no Post Processor");
    }

}
