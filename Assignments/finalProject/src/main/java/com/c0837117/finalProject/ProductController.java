package com.c0837117.finalProject;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ProductController {
	
	@Autowired
	private ProductCache productCache;
	
	@Autowired
	private HitCounter count;
	
	@Autowired
	private ProductRepository productRepo;
	
	@GetMapping("/")
	public String home(Model model) {
		count.incrementCounter();
		model.addAttribute("hitcount", count.getHitCount());
		return "index";
	}
	
	@GetMapping("/addproduct")
	public String productForm(Model model) {
		count.incrementCounter();
		model.addAttribute("product", new Product());
		model.addAttribute("hitcount", count.getHitCount());
		return "productform";
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@Valid Product toSave, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "productform";
		} else {
//			this.productCache.storeProduct(toSave);
			this.productRepo.save(toSave);
			return "productForm";
		}
	}
	
	
	@GetMapping("/products")
	public String listAllProducts(@RequestParam(value="department", required=false)String param, Model model) {
		count.incrementCounter();
		model.addAttribute("hitcount", count.getHitCount());

		
		if(param == null) {
			model.addAttribute("products", productRepo.findAll());
//			model.addAttribute("products", productCache.getAllProducts());
		}
		else {
			model.addAttribute("products", productRepo.findProductByDept(param));
//			model.addAttribute("products", productCache.getProductsByDepartment(param));
		}
		
		return "productlist";
	}
}
