package com.irt.Iinvestmentrecommendation;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ControllerConfig implements WebMvcConfigurer{

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("home");
		//registry.addViewController("/").setViewName("home");
		registry.addViewController("/questionnaire").setViewName("questionnaire");
		registry.addViewController("/second").setViewName("second");
		registry.addViewController("/third").setViewName("third");
		registry.addViewController("/fourth").setViewName("fourth");
		registry.addViewController("/fifth").setViewName("fifth");
		registry.addViewController("/sixth").setViewName("sixth");
		registry.addViewController("/result").setViewName("result");
		registry.addViewController("/summary").setViewName("summary");
		registry.addViewController("/login").setViewName("login"); 
	}
	
//	@Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver bean = new InternalResourceViewResolver();
//        bean.setPrefix("/WEB-INF/jsp/");
//        bean.setSuffix(".jsp");
//        bean.setOrder(0);
//        return bean;
//    }
}
