package xyz.flym.carlis.service;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Category;

/**
 * 
 * @author Carlis
 * 
 */
public interface CategoryService {

	/**
	 * Save the category.
	 * 
	 * @param category
	 */
	void save(Category category);

	/**
	 * Update the category.
	 * 
	 * @param category
	 */
	void update(Category category);

	/**
	 * Delete category by its entity.
	 * 
	 * @param category
	 */
	void delete(Category category);

	/**
	 * Delete category by its id.
	 * 
	 * @param id
	 */
	void delete(int id);

	/**
	 * Find all existed categories.
	 * 
	 * @return
	 */
	List<Category> findAllCategories();

	/**
	 * Find category by category's name.
	 * 
	 * @param name
	 * @return
	 */
	Category findCategoryByName(String name);

	/**
	 * Find category by its id attribute.
	 * 
	 * @param id
	 * @return
	 */
	Category findCategoryById(int id);
}
