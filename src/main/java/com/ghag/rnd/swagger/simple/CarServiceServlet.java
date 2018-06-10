package com.ghag.rnd.swagger.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

//@Configuration
//public class CarServiceServlet extends SpringBootServletInitializer {

//this class has been deprecated because it replaces the spring dispatcher 
//servlet causing more issues than it solves
@Deprecated
public class CarServiceServlet {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CarServiceServlet.class);
	}

	@Bean
	public org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet dispatcherServlet() {
		return new org.apache.cxf.jaxrs.servlet.CXFNonSpringJaxrsServlet();
	}

	@Bean
	public ServletRegistrationBean dispatcherServletRegistration() {
		ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet());
		Map<String, String> params = new HashMap<String, String>();
		params.put("javax.ws.rs.Application", "org.apache.olingo.odata2.core.rest.app.ODataApplication");
		params.put("org.apache.olingo.odata2.service.factory", "org.apache.olingo.sample.annotation.processor.AnnotationSampleServiceFactory");
		registration.setInitParameters(params);
		registration.setUrlMappings(Arrays.asList("/MyFormula.svc/*"));
		return registration;
	}

}
