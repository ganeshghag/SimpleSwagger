package com.ghag.rnd.swagger.simple;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableAutoConfiguration
@ComponentScan  //important and required
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public ServletRegistrationBean exampleServletBean() {
	    ServletRegistrationBean bean = new ServletRegistrationBean(
	      new org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet(), "/MyFormula.svc/*");
	    bean.setLoadOnStartup(1);
	    Map<String, String> params = new HashMap<String, String>();
		params.put("javax.ws.rs.Application", "org.apache.olingo.odata2.core.rest.app.ODataApplication");
		params.put("org.apache.olingo.odata2.service.factory", "org.apache.olingo.sample.annotation.processor.AnnotationSampleServiceFactory");
	    bean.setInitParameters(params);
	    
	    return bean;
	}
}