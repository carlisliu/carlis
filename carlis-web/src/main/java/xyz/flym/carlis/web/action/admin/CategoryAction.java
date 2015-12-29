package xyz.flym.carlis.web.action.admin;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import xyz.flym.carlis.persistence.domain.Category;
import xyz.flym.carlis.service.CategoryService;

import com.opensymphony.xwork2.Action;

/**
 * Category Action.
 * 
 * @author Carlis
 * 
 */
public class CategoryAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CategoryService categoryService;
	private List<Category> categories;
	private Category category;

	/**
	 * Initialization - find all existed categories.
	 * 
	 * @return
	 */
	public String init() {
		categories = categoryService.findAllCategories();
		return Action.SUCCESS;
	}

	/**
	 * Add a new category.
	 * 
	 * @return
	 */
	public String addCategory() {
		if (this.validateCategory(this.category)) {
			Category category = categoryService.findCategoryByName(this.category.getName());
			if (category == null) {
				categoryService.save(this.category);
				this.category = categoryService.findCategoryByName(this.category.getName());
			} else {
				this.addJsonExecutionError("该类别信息已存在");
			}
		} else {
			this.addJsonExecutionError("该类别信息不完整");
		}
		return Action.SUCCESS;
	}

	/**
	 * Update specified category.
	 * 
	 * @return
	 */
	public String updateCategory() {
		if (this.validateCategory(this.category)) {
			Category existed = categoryService.findCategoryById(this.category.getId());
			if (existed == null) {
				this.addJsonExecutionError("该类别信息不存在");
			} else {
				categoryService.update(category);
			}
		} else {
			this.addJsonExecutionError("该类别信息不完整");
		}
		return Action.SUCCESS;
	}

	/**
	 * Delete specified category.
	 * 
	 * @return
	 */
	public String deleteCategory() {
		if (this.category != null) {
			categoryService.delete(this.category.getId());
		}
		return Action.SUCCESS;
	}

	private boolean validateCategory(Category category) {
		return category != null && StringUtils.isNotEmpty(category.getName());
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
