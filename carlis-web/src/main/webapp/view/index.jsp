<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ page import="xyz.flym.carlis.persistence.domain.Company" %>
<!DOCTYPE html>
<html>
<head>
	<title>首页</title>
	<style type="text/css">
.message-container {
	width: 200px;
	height: 330px;
	position: fixed;
	right: 0px;
	bottom: 0px;
	background-color: #fefef2;
	border: 1px solid #e7e7e7;
	z-index: 999;
	-webkit-border-radius: 3px;
	-moz-border-radius: 3px;
	-o-border-radius: 3px;
	-ms-border-radius: 3px;
	box-shadow: 2px 4px 7px #ecebeb;
	-webkit-box-shadow: 2px 4px 7px #ecebeb;
	-moz-box-shadow: 2px 4px 7px #ecebeb;
	-o-box-shadow: 2px 4px 7px #ecebeb;
	-ms-box-shadow: 2px 4px 7px #ecebeb;
}

.message-container form {
	margin: 10px;
}

.message-container .title {
	clear: both;
	font-size: 12px;
	font-weight: bold;
	height: 26px;
	background: #c9c9c9;
	border-bottom: solid 1px #c0c0c0;
	margin: 1px;
	text-indent: 8px;
}

.message-container h3 {
	font-size: 14px;
	font-weight: bold;
	cursor: pointer;
}

.message-container orm div {
	width: 100%;
	margin: 10px;
}

.message-container form label {
	width: 20px;
}

.message-container form input[type="text"] {
	width: 170px;
	border: 1px solid #e7e7e7;
}

.message-container form input[type="submit"] {
	border: 1px solid #e7e7e7;
	margin-top: 5px;
	width: 50px;
	align-items: flex-start;
	text-align: center;
	cursor: default;
	color: buttontext;
	padding: 2px 6px 3px;
	border: 2px outset buttonface;
	border-image-source: initial;
	border-image-slice: initial;
	border-image-width: initial;
	border-image-outset: initial;
	border-image-repeat: initial;
	background-color: buttonface;
	box-sizing: border-box;
}

.message-container form textarea {
	width: 170px;
	border: 1px solid #e7e7e7;
	height: 60px;
}

::selection {
	background: #00b38a;
	color: white; /* Safari */
}

::-moz-selection {
	background: #00b38a;
	color: white; /* Firefox */
}

.error {
	display: block;
	color: red;
}

.hide {
	display: none;
}

</style>
</head>
<body>
	<div class="banner-container">
		<div class="banner">
			<div id="slide" class="slide">
				<div class="hd">
					<ul>
						<s:iterator value="banners" id="banner" status="state">
							<s:if test="#state.index==banners.size() - 1">
								<li class="on"></li>
							</s:if>
							<s:else>
								<li class=""></li>
							</s:else>
						</s:iterator>
					</ul>
				</div>
				<div class="bd">
					<ul>
						<s:iterator value="banners" id="banner" status="state">
							<s:if test="#state.index==banners.size() - 1">
								<li style="display: list-item;">
									<a href="#">
										<img src="${rootPath}/resources/<s:property value="type"/>/<s:property value="fileName"/>">
									</a>
								</li>
							</s:if>
							<s:else>
								<li style="display: none;">
									<a href="#">
										<img src="${rootPath}/resources/<s:property value="type"/>/<s:property value="fileName"/>">
									</a>
								</li>
							</s:else>
						</s:iterator>
					</ul>
				</div>
			</div>
		</div>
	</div>

	<div class="content">
		<div class="hot-product">
			<div class="container">
				<div>
					<p>热门产品</p>
					<s:iterator value="hotProducts" id="hotProduct" status="state">
						<a href="${rootPath}/view/productDetail.html?id=<s:property value="id" />">
							<s:property value="name"/>
						</a>
					</s:iterator>
				</div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
		<div class="core-product">
			<div class="container">
				<div class="header">
					<p>核心产品</p>
					<div class="slogan">
						<span>值得信赖的品牌</span>
					</div>
					<div class="more">
						<a href="${rootPath}/view/products.html">更多</a>
					</div>
				</div>
				<div class="product-container">
					<div class="hd">
						<a class="next"></a> <a class="prev"></a>
					</div>
					<div class="bd">
						<div class="tempWrap" style="overflow: hidden; position: relative; width: 1220px">
							<ul style="width: 2928px; position: relative; overflow: hidden; padding: 0px; margin: 0px; left: -337px;">
								<s:iterator value="coreProducts" id="coreProduct" status="state">
									<li class="clone" style="float: left; width: 228px;">
										<div class="pic">
											<a href="${rootPath}/view/productDetail.html?id=<s:property value="id" />">
												<s:if test="cover!=null">
													<img src="${rootPath}/resources/product/<s:property value="id"/>/<s:property value="cover"/>" alt="暂无封面图片" title="暂无封面图片">
												</s:if>
												<s:else>
													<img src="${assetsPath}/images/not-provided.jpg" alt="暂无封面图片" title="暂无封面图片">
												</s:else>
												<span><s:property value="name" /></span>
											</a>
										</div>
									</li>
								</s:iterator>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
		<div class="company">
			<div class="introduction">
				<ul>
					<li><p>公司简介</p></li>
					<span>
						<%
							Company company = (Company)application.getAttribute("company");
						    String introduction = "暂无";
							if (company != null) {
								introduction = company.getIntroduction();
								if (introduction != null && introduction.length() > 200){
									introduction = introduction.substring(0, 200) + "...";
								}
							}
							
						%>
						<%=introduction %>
						<a href="${rootPath}/view/introduction.html">了解详情</a>
					</span>
				</ul>
			</div>
			<div class="picture">
				<img src="${assetsPath}/images/tu1_03.png">
			</div>

			<div class="clear"></div>
		</div>
		<div class="clear"></div>

		<div class="process">
			<div class="container">
				<div class="header">
					<div class="title">
						<p>产品生产流程展示</p>
					</div>
					<div class="process-flow">
						<div id="slide" class="slide">
							<div class="hd">
								<ul>
									<s:iterator value="process" id="pro" status="state">
										<s:if test="#state.index==process.size() - 1">
											<li class="on"></li>
										</s:if>
										<s:else>
											<li class=""></li>
										</s:else>
									</s:iterator>
								</ul>
							</div>
							<div class="bd">
								<ul>
									<s:iterator value="process" id="pro" status="state">
										<s:if test="#state.index==process.size() - 1">
											<li style="display: list-item;">
												<a href="#">
													<img src="${rootPath}/resources/<s:property value="type"/>/<s:property value="fileName"/>">
												</a>
											</li>
										</s:if>
										<s:else>
											<li style="display: none;">
												<a href="#">
													<img src="${rootPath}/resources/<s:property value="type"/>/<s:property value="fileName"/>">
												</a>
											</li>
										</s:else>
									</s:iterator>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="clear"></div>

		<div class="video">
			<div class="header">
				<div class="title">
					<p>公司视频展示</p>
				</div>
				<div class="clear"></div>
			</div>
			<div class="clear"></div>
			<div class="container">
				<ul>
					<s:if test="videos==null or videos.size()==0">
						暂无
					</s:if>
					<s:else>
						<s:iterator value="videos" id="video" status="state">
							<li>
								<div class="img">
									<s:if test="embedCode == null || embedCode == ''">
										<a href="<s:property value="url"/>"><img src="${assetsPath}/images/not-provided.jpg"></a>
									</s:if>
									<s:else>
										<s:property escape="0" value="embedCode"/>
									</s:else>
								</div>
								<div class="content">
									<div class="head">
										<a
											href="<s:property value="url"/>"><s:property value="name"/></a>
									</div>
									<div class="middle">
										
									</div>
									<div class="bottom">
										<span>
											<s:property value="memo"/>
										</span>
									</div>
								</div>
							</li>
						</s:iterator>
					</s:else>
				</ul>
				<div class="clear"></div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
		<div class="empty-row"></div>
	</div>
	<div class="clear"></div>
	
	<div class="go-top" style="display: none;">
		<a href="javascript:;" title="Top" id="to-top"></a>
	</div>

	<div class="scrollsidebar side_green" id="scrollsidebar">
		<div class="side_content">
			<div class="side_list">
				<div class="side_title"></div>
				<div class="side_center">
					<div class="custom">
						<p>
							${setting.qq }
						</p>
					</div>
					<s:if test="%{setting.wechat!= null && setting.wechat!=''}">
						<div class="other">
							<p>
								<img src="${rootPath}/resource/webchat/%{setting.wechat}">
							</p>
							<p
								style="font-size: 12px; color: #00a2e9; margin-left: 30px; line-height: 22px; font-weight: 0;">官方微信</p>
						</div>
					</s:if>
				</div>
			</div>
		</div>
	</div>

	<div class="feedback">
		<a href="#">
			<div class="fb-icon"></div>
			<span>我要留言</span>
		</a>
	</div>
	
	<div class="message-container hide" id="message-holder">
		<div class="title">
			<h3>留言板(点击这里关闭)</h3>
		</div>
		<div>
			<form id="message-content">
				<div>
					<label for="messager">姓名</label>
					<div>
						<input id="messager" name="messager" type="text">
					</div>
				</div>
				<div>
					<label for="tel">电话</label>
					<div>
						<input id="tel" name="tel" type="text">
					</div>
				</div>
				<div>
					<label for="cell">手机</label>
					<div>
						<input id="cell" name="cell" type="text">
					</div>
				</div>
				<div>
					<label for="email">邮箱</label>
					<div>
						<input id="email" name="email" type="text">
					</div>
				</div>
				<div>
					<label for="content">内容</label>
					<div>
						<textarea id="content" name="content" placeholder="把您的留言内容写这里(200字)" row="5" col="10" maxlength="200"></textarea>
					</div>
				</div>
				<div>
					<input type="submit" id="message-content-saver" value="提交" />
					<label class="error" style="width: 200px;"></label>
				</div>
			</form>
		</div>
	</div>
	<!-- 代码 结束 -->
	<script type="text/javascript">
		seajs.use(['jquery', 'superslide'], function($){
			$(function() {
				$(".slide").slide({
					mainCell : ".bd ul",
					autoPlay : true
				});
				$("embed").css({
					width: 220,
					height: 200
				});
				$(".product-container").slide({
					mainCell : ".bd ul",
					autoPlay : true,
					effect : "leftMarquee",
					vis : 5,
					interTime : 50
				});
				$(window).scroll(function() {
					if ($(window).scrollTop() >= 600) { 
						$('.go-top').fadeIn(300); 
					} else {
						$('.go-top').fadeOut(300);
					}
				});
				$('#to-top').click(function() {
					$('html,body').animate({
						scrollTop : '0px'
					}, 800);
				});
				function tip(message){
					if(!message){
						return $('.error').html('');
					}
					$('.error').css({'color': 'red'}).html(message);
				}
				$(document).on('click', '#message-content-saver', function(e){
					e.preventDefault();
					tip();
					var data = {};
					$('#message-content').find('input[type=text], textarea').each(function(index, item){
						var $this = $(this);
						data['message.' + $.trim($this.attr('id'))] = $.trim($this.val());
					});
					if(!data['message.messager']){
						return tip('姓名不能为空');
					}
					if(!data['message.tel'] && !data['message.cell'] && !data['message.email']){
						return tip('请至少留一种联系方式');
					}
					if(!data['message.content']){
						return tip('请填写留言内容');
					}
					$.post('${rootPath}/view/message.html', data).done(function(data){
						if(data.status === 'success'){
							$('.error').css({'color': 'green'}).html('保存成功');
							setTimeout(function(){
								$('.error').html('');
							}, 2000);
						}else{
							tip('保存失败');
							setTimeout(function(){
								$('.error').html('');
							}, 2000);
						}
					}).fail(function(e){
						tip('保存失败');
						setTimeout(function(){
							$('.error').html('');
						}, 2000);
					});
				}).on('click', '.feedback', function(e){
					e.preventDefault();
					$('#message-holder').removeClass('hide');
				}).on('click', '.title h3', function(e){
					e.preventDefault();
					$('#message-holder').addClass('hide');
				});
			});
		});
		
	</script>
</body>
</html>