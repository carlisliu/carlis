package xyz.flym.carlis.web.action.admin;

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
public class ProductAction extends SecurityBaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProductService productService;
	private List<Product> products;
	private List<Category> categories;
	private CategoryService categoryService;
	private Product product;
	private int id;
	private String cover;

	/**
	 * Init for creating new product.
	 * 
	 * @return
	 */
	public String createProductInit() {
		this.categories = categoryService.findAllCategories();
		return Action.SUCCESS;
	}

	/**
	 * Query product info for product index page.
	 * 
	 * @return
	 */
	public String queryProduct() {
		this.products = productService.findProducts();
		return Action.SUCCESS;
	}

	/**
	 * Save product.
	 * 
	 * @return
	 */
	public String saveProduct() {
		if (this.validateProduct()) {
			Product existed = productService.findProductByFullName(this.product.getName());
			if (existed != null) {
				this.addJsonExecutionError("该产品名称已存在");
			} else {
				productService.saveProduct(this.product);
				this.product = productService.findProductByFullName(this.product.getName());
			}
		} else {
			this.addJsonExecutionError("请填写完整的产品信息");
		}
		return Action.SUCCESS;
	}

	/**
	 * Save or update the specified product info.
	 * 
	 * @return
	 */
	public String updateProduct() {
		if (this.validateProduct()) {
			Product existed = productService.findProductById(this.product.getId());
			if (existed != null) {
				this.product.setId(existed.getId());
				productService.updateProduct(this.product);
			} else {
				this.addJsonExecutionError("产品信息不存在");
			}
		} else {
			this.addJsonExecutionError("请输入正确的产品信息");
		}
		return Action.SUCCESS;
	}

	/**
	 * Delete product info.
	 * 
	 * @return
	 */
	public String deleteProduct() {
		Product product = productService.findProductById(this.id);
		if (product == null) {
			this.addJsonExecutionError("产品信息不存在");
		} else {
			productService.deleteProduct(product);
		}
		return Action.SUCCESS;
	}

	/**
	 * Neither the product nor the product's name is allowed to be empty.
	 * 
	 * @return
	 */
	private boolean validateProduct() {
		return this.product != null && StringUtils.isNotEmpty(this.product.getName())
				&& this.product.getCategory() != null;
	}

	/**
	 * Query detail.
	 * 
	 * @return
	 */
	public String queryProductDetail() {
		product = productService.findProductById(id);
		if (product == null) {
			return Action.INPUT;
		}
		this.categories = categoryService.findAllCategories();
		return Action.SUCCESS;
	}
	

	/**
	 * 
	 * @return
	 */
	public String updateCoverImage() {
		if (StringUtils.isEmpty(this.cover) || this.id == 0) {
			this.addJsonExecutionError("请将信息补充完整");
		} else {
			productService.updateCoverImage(cover, id);
		}
		return Action.SUCCESS;
	}

	public String deleteProducts() {
		return Action.SUCCESS;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

}
