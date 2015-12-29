package xyz.flym.carlis.service.impl;

import java.util.List;

import xyz.flym.carlis.persistence.domain.Category;
import xyz.flym.carlis.persistence.mapper.CategoryMapper;
import xyz.flym.carlis.service.CategoryService;

/**
 * Category services.
 * 
 * @author Carlis
 * 
 */
public class CategoryServiceImpl implements CategoryService {

	private CategoryMapper categoryMapper;

	/**
	 * Save the category
	 */
	@Override
	public void save(Category category) {
		categoryMapper.save(category);
	}

	/**
	 * Update the category
	 */
	@Override
	public void update(Category category) {
		categoryMapper.update(category);
	}

	/**
	 * Find all existed categories
	 */
	@Override
	public List<Category> findAllCategories() {
		return categoryMapper.findAllCategories();
	}

	/**
	 * Delete category
	 */
	@Override
	public void delete(Category category) {
		this.delete(category.getId());
	}

	@Override
	public void delete(int id) {
		categoryMapper.delete(id);
	}

	/**
	 * Find category by its name.
	 */
	@Override
	public Category findCategoryByName(String name) {
		return categoryMapper.findCategoryByName(name);
	}

	@Override
	public Category findCategoryById(int id) {
		return categoryMapper.findCategoryById(id);
	}

	public CategoryMapper getCategoryMapper() {
		return categoryMapper;
	}

	public void setCategoryMapper(CategoryMapper categoryMapper) {
		this.categoryMapper = categoryMapper;
	}

}
