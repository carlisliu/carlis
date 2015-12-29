<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>产品中心</title>
</head>
<body>
	<div class="content">
		<div class="p-container">
			<div class="p-nav-container">
				<div class="p-nav">
					<h3 class="title">
						<span>产品分类</span><b>Product Category</b>
					</h3>
					<div class="p-category-container">
						<s:if test="categories.size()==0">
							暂无
						</s:if>
						<s:else>
							<s:iterator value="categories" id="category" status="state">
								<dl class="list-none">
									<dt>
										<a href="${rootPath }/view/products.html?categoryId=<s:property value="id"/>" title="<s:property value="name"/>">
											<span>
												<s:property value="name"/>
											</span>
										</a>
									</dt>
								</dl>
							</s:iterator>
						</s:else>
						<div class="clear"></div>
					</div>
				</div>
			</div>

			<div class="p-product-container">
				<h3 class="title">
					<span>产品展示</span><b>Our Products</b>
				</h3>
				<div class="clear"></div>
				<div class="product-content">
					<ul class="list-none">
						<s:if test="products.size()==0">
							暂无
						</s:if>
						<s:else>
							<s:iterator value="products" id="product" status="state">
								<li style="width: 164px; margin-left: 25px; margin-right: 24px; height: 174px;">
									<a href="${rootPath }/view/productDetail.html?id=<s:property value="id"/>" title="<s:property value="name"/>" target="_self" class="img">
										<s:if test="cover!=null">
											<img src="${rootPath}/resources/product/<s:property value="id"/>/<s:property value="cover"/>" alt="<s:property value="name"/>" title="<s:property value="name"/>" width="162" height="130">
										</s:if>
										<s:else>
											<img src="${assetsPath}/images/not-provided.jpg" alt="暂无封面图片" title="暂无封面图片" width="162" height="130">
										</s:else>
									</a>
									<h3>
										<a href="${rootPath }/view/productDetail.html?id=<s:property value="id"/>" title="通用技术实验室" target="_self"><s:property value="name"/></a>
									</h3>
								</li>
							</s:iterator>
						</s:else>
					</ul>
					<div class="clear"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</body>
</html>