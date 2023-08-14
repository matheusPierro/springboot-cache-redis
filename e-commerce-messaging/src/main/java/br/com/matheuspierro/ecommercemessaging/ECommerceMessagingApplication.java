package br.com.matheuspierro.ecommercemessaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ECommerceMessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ECommerceMessagingApplication.class, args);
	}

}

@RestController
@RequestMapping("/kafka")
class ProductsController {
	private ProductProducer service;

	public ProductsController(ProductProducer service) {
		this.service = service;
	}

	@GetMapping("/product/{name}")
	public String product(@PathVariable("name") String name) {
		service.sendProduct("Product: " + name);
		return "OK";
	}
}