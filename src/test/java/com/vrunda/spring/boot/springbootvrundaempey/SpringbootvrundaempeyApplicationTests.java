package com.vrunda.spring.boot.springbootvrundaempey;

import com.vrunda.spring.boot.springbootvrundaempey.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringbootvrundaempeyApplicationTests {

	@Autowired
	ApplicationContext context;

	@Test
	void testProductService() {
		ProductService productService = context.getBean(ProductService.class);
		productService.save();
 	}

}
