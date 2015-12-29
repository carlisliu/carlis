package xyz.flym.carlis.persistence.mapper;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Category;

/**
 * 
 * @author Carlis
 * 
 */
public interface CategoryMapper {

	/**
	 * 
	 * @return
	 */
	List<Category> findAllCategories();

	/**
	 * find specified category by its id.
	 * 
	 * @param id
	 * @return
	 */
	Category findCategoryById(int id);

	/**
	 * find specified category by its name.
	 * 
	 * @param name
	 * @return
	 */
	Category findCategoryByName(String name);

	/**
	 * Save category.
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
	 * Delete category by its id.
	 * 
	 * @param id
	 */
	void delete(int id);
}
