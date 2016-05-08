<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<title>景区介绍</title>
</head>
<body>
	<div class="wrap-box">
		<div class="wrap">
			<!--发布栏s-->
			<div class="release">
				<span class="msg">带红色全部编辑完成才可以发布...</span> 
				<s:if test="scenicSpot.status">
					<a href="#" class="push" id="publish-scenic" data-published="true" data-scenic-spot-id="<s:property value="scenicSpot.scenicSpotId" />">取消发布</a>
				</s:if>
				<s:else>
					<a href="#" class="push" id="publish-scenic" data-scenic-spot-id="<s:property value="scenicSpot.scenicSpotId" />">发布</a>
				</s:else>
			</div>
			<!--发布栏e-->
			<!--基本信息s-->
			<div class="con-box">
				<h2 class="title-one">
					<span>基本信息</span> 
					<s:if test="scenicBasicInfo">
						<a href="#" class="editg" id="editBasic" data-behavior="modal" data-target="#basic-info-dialog">编辑</a>
					</s:if>
					<s:else>
						<a href="#" class="editr" id="editBasic" data-behavior="modal" data-target="#basic-info-dialog">编辑</a>
					</s:else>
				</h2>
				<ul class="basic-spot">
					<li class="j">
						<span class="title">所属区域：</span>
						<span class="con"><s:property value="scenicSpot.regionName" default="" /></span>
					</li>
					<li class="o">
						<span class="title">景区名称：</span>
						<span class="con"><s:property value="scenicSpot.name" default="" /></span>
					</li>
					<li class="j">
						<span class="title">英文名称：</span>
						<span class="con" data-property="scenicSpot.nameEn"><s:property value="scenicSpot.nameEn" default="" /></span>
					</li>
					<li class="o">
						<span class="title">亮点宣传语：</span>
						<span class="con" data-property="scenicSpot.slogan"><s:property value="scenicSpot.slogan" default="" /></span>
					</li>
					<li class="j">
						<span class="title">关键词标签：</span> 
						<span class="con"><s:property value="scenicSpot.tags" default="" /></span>
					</li>
					<li class="o">
						<span class="title">自定义词条：</span>
						<span class="con"><s:property value="scenicSpot.description" default="" /></span>
					</li>
				</ul>
				<h2 class="title-one">
					<span>景点介绍</span>
					<s:if test="scenicSpotInfo">
						<a href="#" class="editg" data-behavior="modal" id="spotEdit" data-target="#scenic-spot-introduction">编辑</a>
					</s:if>
					<s:else>
						<a href="#" class="editr" data-behavior="modal" id="spotEdit" data-target="#scenic-spot-introduction">编辑</a>
					</s:else>
				</h2>
				<div class="introduce-spot">
					<s:if test="scenicSpot!=nulll">
						<s:if test="scenicSpot.scenicSportExtends.size()!=0">
							<s:iterator value="scenicSpot.scenicSportExtends" status="spotExtend">  
							    <p class="con"><s:property value="spotExtend.description" default=""/></p>
							    <s:if test="spotExtend.imgPath!=nulll">
							    	<img src="<s:property value="spotExtend.imgPath"/>" class="introduce-spot-img">
							    </s:if>
							</s:iterator> 
						</s:if>
					</s:if>
				</div>
				<h2 class="title-one">
					<span>人文历史</span>
					<s:if test="scenicHistory">
						<a href="#" class="editg" data-behavior="modal" data-target="#scenic-history">编辑</a>
					</s:if>
					<s:else>
						<a href="#" class="editr" data-behavior="modal" data-target="#scenic-history">编辑</a>
					</s:else>
					
				</h2>
				<div class="introduce-spot">
					<s:property value="scenicSpot.history" default="" />
					<s:if test="scenicSpot.hisThumbnailPath!=nulll&& scenicSpot.hisThumbnailPath!=''">
				    	<img src="<s:property value="scenicSpot.hisThumbnailPath"/>" class="introduce-spot-img">
				    </s:if>
				</div>
				<h2 class="title-one">
					<span>游玩时间</span>
					<s:if test="scenicPlayTime">
						<a href="#" class="editg" id="editTime" data-behavior="modal" data-target="#recommend-time">编辑</a>
					</s:if>
					<s:else>
						<a href="#" class="editr" id="editTime" data-behavior="modal" data-target="#recommend-time">编辑</a>
					</s:else>
				</h2>
				<ul class="basic-spot">
					<li class="j">
						<span class="title">开放时间：</span>
						<span class="con">
							夏秋季 <s:property value="scenicSpot.startTime1" default=""/>至<s:property value="scenicSpot.endTime1" default=""/> 
							冬春季 <s:property value="scenicSpot.startTime2" default=""/>至<s:property value="scenicSpot.endTime2" default=""/>
						</span>
					</li>
					<li class="o">
						<span class="title">建议游玩时间：</span>
						<span class="con"><s:property value="scenicSpot.recommendedPlayTime" default=""/></span>
					</li>
					<li class="j">
						<span class="title">最佳季节：</span>
						<span class="con"><s:property value="scenicSpot.recommendedPlaySeason" default=""/></span>
					</li>
				</ul>
			</div>
		</div>
		<!--基本信息e-->
		
		<!--shadow s-->
		<div class="shadow"></div>
		<!--shadow e-->
		
		
		
		
	</div>
	<script type="x-template" id="basic-info-dialog">
		<!--基本信息编辑s-->
		<div class="edit-basic edit-box" id="basic-info-dialog">
			<h1 class="title-edit">基本信息</h1>
			<input type="hidden" value="<s:property value="scenicSpot.scenicSpotId" />" data-property="scenicSpot.scenicSpotId"/>
			<div class="line">
				<h2 class="title">所属区域</h2>
				<ul class="select-list">
					<li>
						<p class="select" id="editS">
							<span class="text">省/直辖市</span> 
						</p>
					</li>
					<li>
						<p class="select" id="editCity">
							<span class="text"><s:property value="scenicSpot.regionName" default="" /></span>
						</p>
					</li>
				</ul>
			</div>
			<div class="line">
				<h2 class="title">景区名称</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" value="<s:property value="scenicSpot.name" default="" />" readonly/>
					</div>
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					英文名称<i class="r"></i>
				</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" value="<s:property value="scenicSpot.nameEn" default="" />" placeholder="请输入景区英文名称" maxlength="15" data-property="scenicSpot.nameEn"/>
					</div>
					<div class="num">
						<p>
							<span class="r">0</span>/15
						</p>
					</div>
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					亮点宣传语<i class="r"></i>
				</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" value="<s:property value="scenicSpot.slogan" default="" />" placeholder="请输入亮点宣传语" maxlength="30" data-property="scenicSpot.slogan"/>
					</div>
					<div class="num">
						<p>
							<span class="r">0</span>/30
						</p>
					</div>
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					关键词标签<i class="r"></i>
				</h2>
				<div class="lable-box">
					<ul class="lable">
						<li>
							<a href="javascript:;" class="lable-btn">草原</a>
							<span class="lable-del">×</span></li>
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
						<li class="add"><a href="javascript:;" class="lable-btn"
							id="editAddLable"></a></li>
					</ul>
					<!-- 下拉s-->
					<div class="option-box" data-id="editAddLable">
						<ul class="select-option">
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
						</ul>
					</div>
					<!-- 下拉e-->
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					自定义词条<i class="r"></i>
				</h2>
				<div class="lable-box">
					<ul class="lable">
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
						<li class="add"><a href="javascript:;" class="lable-btn" id="lableBtn"></a></li>
					</ul>
					<div class="lable-mine" data-id="lableMine">
						<div class="text">
							<input type="text" placeholder="输入要添加的词条">
							<p class="num">
								<span class="r">0</span>/15
							</p>
						</div>
						<a href="javascript:;" class="btn">确定</a>
					</div>
				</div>
			</div>
			<div class="edit-btn-box">
				<ul>
					<li class="ok"><a href="#" data-remote-close="close">确定</a></li>
					<li class="no"><a href="#" data-close="close">取消</a></li>
				</ul>
			</div>
		</div>
		<!--基本信息编辑d-->
	</script>
	<script type="x/template" id="scenic-spot-introduction">
		<!--景点介绍编辑s-->
		<div class="edit-sport edit-box">
			<h1 class="title-edit">景点介绍</h1>
			<input type="hidden" value="<s:property value="scenicSpot.scenicSpotId" />" data-property="scenicSpot.scenicSpotId"/>
			<div class="line">
				<h2 class="title">
					景点介绍<i class="r"></i>
				</h2>
				<div class="textarea-box">
					<textarea placeholder="请输入景点介绍"></textarea>
					<p class="num">
						<span class="r">0</span>/2000
					</p>
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					配图<i class="r"></i>
				</h2>
				<div class="image-box">
					<p class="file-uplode">
						<input name="uploadFile" type="file" id="spot-uploader">
						<span class="tip">(建议图片尺寸1920*960、1280*640)</span>
					</p>
					<div class="img-detile">
						<img src="${staticPath }/images/sport-detile.jpg">
					</div>
				</div>
			</div>
			<div class="edit-btn-box">
				<ul>
					<li class="ok"><a href="#" data-remote-close="close">确定</a></li>
					<li class="no"><a href="#" data-close="close">取消</a></li>
				</ul>
			</div>
		</div>
		<!--景点介绍编辑e-->
	</script>
	<script type="x-template" id="scenic-history">
		<!--景点历史编辑s-->
		<div class="edit-history edit-box">
			<h1 class="title-edit">人文历史</h1>
			<input type="hidden" value="<s:property value="scenicSpot.scenicSpotId" />" data-property="scenicSpot.scenicSpotId"/>
			<div class="line">
				<h2 class="title">
					人文历史<i class="r"></i>
				</h2>
				<div class="textarea-box">
					<textarea placeholder="请输入人文历史"></textarea>
					<p class="num">
						<span class="r">0</span>/2000
					</p>
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					配图<i class="r"></i>
				</h2>
				<div class="image-box">
					<p class="file-uplode">
						<a class="flie-btn">选择图片</a> <span class="tip">(建议图片尺寸1920*960、1280*640)</span>
					</p>
					<div class="img-detile">
						<img src="${staticPath }/images/sport-detile.jpg">
					</div>
				</div>
			</div>
			<div class="edit-btn-box">
				<ul>
					<li class="ok"><a href="#" data-remote-close="close">确定</a></li>
					<li class="no"><a href="#" data-close="close">取消</a></li>
				</ul>
			</div>
		</div>
		<!--景点历史编辑e-->
	</script>
	<script type="x/template" id="recommend-time">
		<!--游玩时间s-->
		<div class="edit-time edit-box">
			<h1 class="title-edit">游玩时间</h1>
			<input type="hidden" value="<s:property value="scenicSpot.scenicSpotId" />" data-property="scenicSpot.scenicSpotId"/>
			<div class="line">
				<h2 class="title">
					开放时间<i class="r"></i>
				</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" placeholder="请输入开放时间">
					</div>
					<div class="num">
						<p>
							<span class="r">0</span>/30
						</p>
					</div>
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					建议游玩时间<i class="r"></i>
				</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" placeholder="请输入建议游玩时间">
					</div>
					<div class="num">
						<p>
							<span class="r">0</span>/30
						</p>
					</div>
				</div>
			</div>
			<div class="line">
				<h2 class="title">
					最佳季节<i class="r"></i>
				</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" placeholder="请输入最佳季节">
					</div>
					<div class="num">
						<p>
							<span class="r">0</span>/30
						</p>
					</div>
				</div>
			</div>
			<div class="edit-btn-box">
				<ul>
					<li class="ok"><a href="#" data-close="close">确定</a></li>
					<li class="no"><a href="#" data-close="close">取消</a></li>
				</ul>
			</div>
		</div>
		<!--游玩时间e-->
	</script>
	<script type="text/javascript" src="${staticPath}/js/vendors/uploadify/flash.js"></script>
	<script type="text/javascript">
		seajs.use('static/scenic/introduction/event');
	</script>
</body>
</html>