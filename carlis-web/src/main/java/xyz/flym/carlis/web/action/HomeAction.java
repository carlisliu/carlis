package xyz.flym.carlis.web.action;

import java.util.List;

import javax.servlet.ServletContext;

import org.apache.struts2.ServletActionContext;

import xyz.flym.carlis.persistence.domain.Picture;
import xyz.flym.carlis.persistence.domain.Product;
import xyz.flym.carlis.persistence.domain.Setting;
import xyz.flym.carlis.persistence.domain.Video;
import xyz.flym.carlis.service.PictureService;
import xyz.flym.carlis.service.ProductService;
import xyz.flym.carlis.service.SettingService;
import xyz.flym.carlis.service.VideoService;
import xyz.flym.carlis.utils.Env;
import xyz.flym.carlis.web.utils.ServletContextHelper;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * @author Carlis
 * 
 */
public class HomeAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int DEFAULT_NUM = 3;

	private List<Picture> banners;
	private List<Picture> process;
	private List<Product> hotProducts;
	private List<Product> coreProducts;
	private List<Video> videos;

	private ProductService productService;
	private VideoService videoService;
	private PictureService pictureService;
	private SettingService settingService;

	/**
	 * 
	 */
	@SuppressWarnings("unchecked")
	public String execute() {
		if (Env.isCache()) {
			ServletContext servletContext = (ServletContext) ActionContext.getContext().get(
					ServletActionContext.SERVLET_CONTEXT);
			this.hotProducts = (List<Product>) servletContext.getAttribute(Item.HOT_PRODUCT);
			this.coreProducts = (List<Product>) servletContext.getAttribute(Item.CORE_PRODUCT);
			this.videos = (List<Video>) servletContext.getAttribute(Item.VIDEO);
			this.banners = (List<Picture>) servletContext.getAttribute(Item.BANNER);
			this.process = (List<Picture>) servletContext.getAttribute(Item.PROCESS);
		} else {
			Product product = new Product();
			product.setHot(true);
			this.hotProducts = productService.findProductsByParamsWithLimit(product, 5);
			product = new Product();
			product.setCore(true);
			this.coreProducts = productService.findProductsByParamsWithLimit(product, 10);
			this.videos = videoService.findVideosWithLimit(3);
			this.banners = pictureService.findHomePageBanners(getLimitNumber("banner"));
			this.process = pictureService.findHomePageProcess(getLimitNumber("process"));
		}
		return Action.SUCCESS;
	}

	/**
	 * 
	 * @param type
	 * @return
	 */
	private int getLimitNumber(String type) {
		ServletContext servletContext = (ServletContext) ActionContext.getContext().get(
				ServletActionContext.SERVLET_CONTEXT);
		Setting setting = ServletContextHelper.get(servletContext, "setting");
		if (setting == null) {
			setting = settingService.find();
			if (setting == null) {
				return DEFAULT_NUM;
			}
			ServletContextHelper.put(servletContext, "setting", setting);
		}
		if (type.equals("banner")) {
			return setting.getBannerNum();
		}
		if (type.equals("process")) {
			return setting.getProcessNum();
		}
		return DEFAULT_NUM;
	}

	public List<Product> getHotProducts() {
		return hotProducts;
	}

	public void setHotProducts(List<Product> hotProducts) {
		this.hotProducts = hotProducts;
	}

	public List<Product> getCoreProducts() {
		return coreProducts;
	}

	public void setCoreProducts(List<Product> coreProducts) {
		this.coreProducts = coreProducts;
	}

	public List<Video> getVideos() {
		return videos;
	}

	public void setVideos(List<Video> videos) {
		this.videos = videos;
	}

	public ProductService getProductService() {
		return productService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public VideoService getVideoService() {
		return videoService;
	}

	public void setVideoService(VideoService videoService) {
		this.videoService = videoService;
	}

	public List<Picture> getBanners() {
		return banners;
	}

	public void setBanners(List<Picture> banners) {
		this.banners = banners;
	}

	public List<Picture> getProcess() {
		return process;
	}

	public void setProcess(List<Picture> process) {
		this.process = process;
	}

	public PictureService getPictureService() {
		return pictureService;
	}

	public void setPictureService(PictureService pictureService) {
		this.pictureService = pictureService;
	}

	public SettingService getSettingService() {
		return settingService;
	}

	public void setSettingService(SettingService settingService) {
		this.settingService = settingService;
	}

}
