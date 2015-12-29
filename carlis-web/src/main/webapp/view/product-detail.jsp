<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>${product.name }-产品明细</title>
</head>
<body>
	<div class="content">
		<div class="pd-container">
			<div class="content">
				<h1 class="title">${product.name }</h1>
				<dl class="pshow">
					<dt style="width: 500px;">
						<span>
							<s:if test="product.cover!=null">
								<img src="${rootPath }/resources/product/${product.id }/${product.cover }" alt="${product.name }" width="500" height="380" title="${product.name }">
							</s:if>
							<s:else>
								<img src="${assetsPath}/images/not-provided.jpg" alt="暂无图片" width="500" height="380" title="暂无图片">
							</s:else>
						</span>
					</dt>
					<dd style="width: 420px;">
						<div style="color: rgb(51, 51, 51); font-size: 14px; line-height: 28px;">
						<strong>主要参数:</strong><br/>
						<s:if test="product.parameters!=null">
							${product.parameters }
						</s:if>
						<s:else>
							暂无
						</s:else>
					</div>
					</dd>
				</dl>
				<div style="clear: both;"></div>
				<h3 class="desc-title">
					<span>详细描述</span>
					<div class="clear"></div>
				</h3>
				<div class="desc">
					<div style="color: rgb(51, 51, 51); font-size: 14px; line-height: 28px;">
						<s:if test="product.description!=null">
							${product.description }
						</s:if>
						<s:else>
							暂无
						</s:else>
					</div>
					<div class="clear"></div>
				</div>
				
				<h3 class="desc-title">
					<span>产品图片</span>
					<div class="clear"></div>
				</h3>
				
				<div class="desc">
					<ul>
						<s:if test="product.uploads.size()==0">
							暂无
						</s:if>
						<s:else>
							<s:iterator value="product.uploads" id="upload" status="state">
								<li>
									<img alt="" src="${ rootPath}/resources/product/${ product.id}/<s:property value="fileName"/>">
								</li>
							</s:iterator>
						</s:else>
					</ul>
				</div>
			</div>
		</div>
	</div>
	<div class="clear"></div>
</body>
</html>