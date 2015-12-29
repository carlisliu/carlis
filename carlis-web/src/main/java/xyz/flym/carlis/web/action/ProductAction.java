package xyz.flym.carlis.web.action;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import xyz.flym.carlis.persistence.domain.Category;
import xyz.flym.carlis.persistence.domain.Product;
import xyz.flym.carlis.service.CategoryService;
import xyz.flym.carlis.service.ProductService;

import com.opensymphony.xwork2.Action;

/**
 * 
 * @author Carlis
 * 
 */
public class ProductAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private List<Category> categories;
	private List<Product> products;
	private Product product;
	private CategoryService categoryService;
	private ProductService productService;
	private int categoryId;
	private int id;

	/**
	 * Query product
	 */
	public String execute() {
		this.categories = categoryService.findAllCategories();
		this.products = productService.findProductsByCategoryId(categoryId);
		return Action.SUCCESS;
	}

	/**
	 * Query product detail.
	 * 
	 * @return
	 */
	public String detail() {
		this.product = productService.findProductById(id);
		if (this.product == null || StringUtils.isEmpty(this.product.getName())) {
			return Action.NONE;
		}
		return Action.SUCCESS;
	}


	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

}
