package xyz.flym.carlis.service.impl;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Product;
import xyz.flym.carlis.persistence.mapper.ProductMapper;
import xyz.flym.carlis.service.ProductService;
import xyz.flym.carlis.service.UploadService;

/**
 * 
 * @author Carlis
 * 
 */
public class ProductServiceImpl implements ProductService {

	private ProductMapper productMapper;
	private UploadService uploadService;

	/**
	 * Find all products
	 */
	@Override
	public List<Product> findProducts() {
		return productMapper.findAllProducts();
	}

	/**
	 * 
	 */
	@Override
	public List<Product> findProductsByName(String name) {
		return productMapper.findProductsByName(name);
	}

	/**
	 * Save Product Info.
	 */
	@Override
	public void saveProduct(Product product) {
		productMapper.saveProduct(product);

	}

	/**
	 * Find a product by its primary key.
	 */
	@Override
	public Product findProductById(int id) {
		return productMapper.findProductById(id);
	}

	/**
	 * Update product.
	 */
	@Override
	public void updateProduct(Product product) {
		productMapper.updateProduct(product);
	}

	@Override
	public Product findProductByFullName(String name) {
		return productMapper.findProductByFullName(name);
	}

	@Override
	public void deleteProduct(Product product) {
		uploadService.deleteByProductId(product.getId());
		productMapper.deleteProduct(product.getId());
	}

	/**
	 * 
	 */
	@Override
	public List<Product> findProductsByCategoryId(int categoryId) {
		return productMapper.findProductsByCategoryId(categoryId);
	}

	/**
	 * 
	 */
	@Override
	public List<Product> findProductsByParams(Product product) {
		return productMapper.findProductsByParams(product);
	}

	@Override
	public List<Product> findProductsByParamsWithLimit(Product product, int limit) {
		return productMapper.findProductsByParamsWithLimit(product, limit);
	}

	@Override
	public void updateCoverImage(String cover, int id) {
		productMapper.setProductCover(cover, id);
	}

	public ProductMapper getProductMapper() {
		return productMapper;
	}

	public void setProductMapper(ProductMapper productMapper) {
		this.productMapper = productMapper;
	}

	public UploadService getUploadService() {
		return uploadService;
	}

	public void setUploadService(UploadService uploadService) {
		this.uploadService = uploadService;
	}

}
