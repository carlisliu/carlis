package xyz.flym.carlis.persistence.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import xyz.flym.carlis.persistence.domain.Product;

/**
 * 
 * @author Carlis
 * 
 */
public interface ProductMapper {

	/**
	 * find all products info.
	 * 
	 * @return
	 */
	List<Product> findAllProducts();

	/**
	 * find specified product by its id
	 * 
	 * @param id
	 * @return
	 */
	Product findProductById(int id);

	/**
	 * 
	 * @param name
	 * @return
	 */
	Product findProductByFullName(String name);

	/**
	 * find all products with name matched.
	 * 
	 * @param name
	 * @return
	 */
	List<Product> findProductsByName(String name);

	/**
	 * Find all products which its name matched with the specified category id.
	 * 
	 * @param id
	 * @return
	 */
	List<Product> findProductsByCategoryId(@Param("categoryId") int id);

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
	List<Product> findProductsByParamsWithLimit(@Param("product") Product product, @Param("limit") int limit);

	/**
	 * Save Product
	 * 
	 * @param product
	 */
	void saveProduct(Product product);

	/**
	 * Update product
	 * 
	 * @param product
	 */
	void updateProduct(Product product);

	/**
	 * delete
	 * 
	 * @param id
	 */
	void deleteProduct(int id);

	/**
	 * Update product's cover image.
	 * 
	 * @param cover
	 * @param id
	 */
	void setProductCover(@Param("cover") String cover, @Param("id") int id);

}
