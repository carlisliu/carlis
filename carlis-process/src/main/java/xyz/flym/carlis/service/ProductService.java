package xyz.flym.carlis.service;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Product;

/**
 * Product Service.
 * 
 * @author Carlis
 * 
 */
public interface ProductService {

	/**
	 * Find all products
	 * 
	 * @return
	 */
	List<Product> findProducts();

	/**
	 * Find specified product by its name.
	 * 
	 * @param name
	 * @return
	 */
	Product findProductByFullName(String name);

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<Product> findProductsByName(String name);

	/**
	 * Find a product by its primary key.
	 * 
	 * @param id
	 * @return
	 */
	Product findProductById(int id);

	/**
	 * Save product.
	 * 
	 * @param product
	 */
	void saveProduct(Product product);

	/**
	 * Update product.
	 * 
	 * @param product
	 */
	void updateProduct(Product product);

	/**
	 * Delete product.
	 * 
	 * @param product
	 */
	void deleteProduct(Product product);

	/**
	 * Find product by product's category.
	 * 
	 * @param categoryId
	 * @return
	 */
	List<Product> findProductsByCategoryId(int categoryId);

	/**
	 * 
	 * @param product
	 * @return
	 */
	List<Product> findProductsByParams(Product product);

	/**
	 * 
	 * @param product
	 * @param limit
	 * @return
	 */
	List<Product> findProductsByParamsWithLimit(Product product, int limit);

	/**
	 * 
	 * @param cover
	 * @param id
	 */
	void updateCoverImage(String cover, int id);

}
