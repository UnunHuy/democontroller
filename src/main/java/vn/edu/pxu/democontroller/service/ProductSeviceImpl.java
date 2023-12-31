package vn.edu.pxu.democontroller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import vn.edu.pxu.democontroller.model.Product;
import vn.edu.pxu.democontroller.repository.ProductRepository;

public class ProductSeviceImpl implements ProductService {

	@Autowired
	public ProductRepository productRepository;

	@Override
	public List<Product> fimAll() {
		// TODO Auto-generated method stub
		return this.productRepository.fimAll();
	}

	@Override
	public Product finByid(int id) {
		// TODO Auto-generated method stub
		return this.productRepository.finByid(id);
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		this.productRepository.save(product);
	}

}
