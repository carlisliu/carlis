<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
				<span class="msg">带红色全部编辑完成才可以发布...</span> <a href="javascript:;"
					class="push">发布</a>
			</div>
			<!--发布栏e-->
			<!--基本信息s-->
			<div class="con-box">
				<h2 class="title-one">
					<span>基本信息</span> <a href="javscript:;" class="editr"
						id="editBasic">编辑</a>
				</h2>
				<ul class="basic-spot">
					<li class="j"><span class="title">所属区域：</span> <span
						class="con">北京市延庆区</span></li>
					<li class="o"><span class="title">景区名称：</span> <span
						class="con">康熙草原</span></li>
					<li class="j"><span class="title">英文名称：</span> <span
						class="con">Kang Xi grassland</span></li>
					<li class="o"><span class="title">亮点宣传语：</span> <span
						class="con">京郊避暑胜地，体验塞外风情</span></li>
					<li class="j"><span class="title">关键词标签：</span> <span
						class="con">草原 赛马 烧烤</span></li>
					<li class="o"><span class="title">自定义词条：</span> <span
						class="con">草原 赛马 烧烤</span></li>
				</ul>
				<h2 class="title-one">
					<span>景点介绍</span> <a href="javscript:;" class="editg"
						id="editSport">编辑</a>
				</h2>
				<div class="introduce-spot">
					<p class="con">
						康西草原位于北京市空气质量最好的区县延庆县康庄镇西，距北京市区70公里，是北京最大的也是唯一真正的原生态大草原。她距世界文明的八达岭长城仅10公里，为北京八十年代兴建的草原特色旅游景区，九十年代被评为北京新十六景。
						康西草原北依海陀山，西濒官厅湖，依山傍水，具有山、水、林、湿地融为一体的独特景观。沿官厅湖畔东岸曲折延伸，有草原2000多公顷，地势平坦，风景秀丽，动植物种类繁多。濒湖一带，栖息着银鸥、野鸭、大雁、灰鹤等珍贵鸟类近20余种，并时有美丽的天鹅飞临草原。
					</p>
					<img src="${staticPath }/images/introduce-sopt.jpg" class="introduce-spot-img">
				</div>
				<h2 class="title-one">
					<span>人文历史</span> <a href="javscript:;" class="editg"
						id="editHistory">编辑</a>
				</h2>
				<div class="introduce-spot">
					<p class="con">
						康西草原位于北京市空气质量最好的区县延庆县康庄镇西，距北京市区70公里，是北京最大的也是唯一真正的原生态大草原。她距世界文明的八达岭长城仅10公里，为北京八十年代兴建的草原特色旅游景区，九十年代被评为北京新十六景。
						康西草原北依海陀山，西濒官厅湖，依山傍水，具有山、水、林、湿地融为一体的独特景观。沿官厅湖畔东岸曲折延伸，有草原2000多公顷，地势平坦，风景秀丽，动植物种类繁多。
						濒湖一带，栖息着银鸥、野鸭、大雁、灰鹤等珍贵鸟类近20余种，并时有美丽的天鹅飞临草原。</p>
					<img src="${staticPath }/images/introduce-history.jpg" class="introduce-spot-img">
				</div>
				<h2 class="title-one">
					<span>游玩时间</span> <a href="javscript:;" class="editr" id="editTime">编辑</a>
				</h2>
				<ul class="basic-spot">
					<li class="j"><span class="title">开放时间：</span> <span
						class="con">夏秋季 6:30至19:00 冬春季 7:00至17:00</span></li>
					<li class="o"><span class="title">建议游玩时间：</span> <span
						class="con">3-4小时</span></li>
					<li class="j"><span class="title">最佳季节：</span> <span
						class="con">3月-5月和9月-10月</span></li>
				</ul>
			</div>
		</div>

		<!--基本信息e-->
		<!--shadow s-->
		<div class="shadow"></div>
		<!--shadow e-->
		<!--choice s-->
		<div class="choice">
			<h2 class="title">选择区域</h2>
			<p class="select" id="choiceS">
				<!--<select>
                        <option>askjfdasdj</option>
                    </select>-->
				<span class="text">省/直辖市</span> <i class="arrow"></i>
			</p>
			<!--下拉s-->
			<div class="option-box" data-id="choiceS">
				<ul class="select-option">
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
				</ul>
			</div>
			<!--下拉e-->
			<p class="select" id="choiceCity">
				<span class="text">市/区</span> <i class="arrow"></i>
			</p>
			<!--下拉e-->
			<div class="option-box" data-id="choiceCity">
				<ul class="select-option">
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
				</ul>
			</div>
			<!--下拉s-->
			<p class="select" id="choiceSport">
				<span class="text">景点</span> <i class="arrow"></i>
			</p>
			<!--下拉s-->
			<div class="option-box" data-id="choiceSport">
				<ul class="select-option">
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
					<li>sdafasdfas</li>
				</ul>
			</div>
			<!--下拉e-->
			<p class="error">对不起，您没有该区域的权限</p>
			<a href="javascript:;" class="btn">确定</a>
		</div>
		<!--choice e-->
		<!--基本信息编辑s-->
		<div class="edit-basic edit-box">
			<h1 class="title-edit">基本信息</h1>
			<div class="line">
				<h2 class="title">
					所属区域<i class="r"></i>
				</h2>
				<ul class="select-list">
					<li>
						<p class="select" id="editS">
							<span class="text">省/直辖市</span> <i class="arrow"></i>
						</p> <!-- 下拉s-->
						<div class="option-box" data-id="editS">
							<ul class="select-option">
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
							</ul>
						</div> <!--下拉e-->
					</li>
					<li>
						<p class="select" id="editCity">
							<span class="text">市/区</span> <i class="arrow"></i>
						</p> <!-- 下拉s-->
						<div class="option-box" data-id="editCity">
							<ul class="select-option">
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
							</ul>
						</div> <!-- 下拉e-->
					</li>
					<li>
						<p class="select" id="editSport">
							<span class="text">景点</span> <i class="arrow"></i>
						</p> <!-- 下拉s-->
						<div class="option-box" data-id="editSport">
							<ul class="select-option">
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
								<li>sdafasdfas</li>
							</ul>
						</div> <!-- 下拉e-->
					</li>
				</ul>
			</div>
			<div class="line">
				<h2 class="title">
					景区名称<i class="r"></i>
				</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" placeholder="请输入景区名称">
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
					英文名称<i class="r"></i>
				</h2>
				<div class="input-text">
					<div class="input-box">
						<input type="text" placeholder="请输入景区英文名称">
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
						<input type="text" placeholder="请输入亮点宣传语">
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
						<li><a href="javascript:;" class="lable-btn">草原</a> <span
							class="lable-del">×</span></li>
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
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
							<li>sdafasdfas</li>
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
						<li class="add"><a href="javascript:;" class="lable-btn"
							id="lableBtn"></a></li>
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
					<li class="ok"><a href="javascript:;">确定</a></li>
					<li class="no"><a href="javascript:;">取消</a></li>
				</ul>
			</div>
		</div>
		<!--基本信息编辑d-->
		<!--景点介绍编辑s-->
		<div class="edit-sport edit-box">
			<h1 class="title-edit">景点介绍</h1>
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
						<a class="flie-btn">选择图片</a> <span class="tip">(建议图片尺寸1920*960、1280*640)</span>
					</p>
					<div class="img-detile">
						<img src="${staticPath }/images/sport-detile.jpg">
					</div>
				</div>
			</div>
			<div class="edit-btn-box">
				<ul>
					<li class="ok"><a href="javascript:;">确定</a></li>
					<li class="no"><a href="javascript:;">取消</a></li>
				</ul>
			</div>
		</div>
		<!--景点介绍编辑e-->
		<!--景点历史编辑s-->
		<div class="edit-history edit-box">
			<h1 class="title-edit">人文历史</h1>
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
					<li class="ok"><a href="javascript:;">确定</a></li>
					<li class="no"><a href="javascript:;">取消</a></li>
				</ul>
			</div>
		</div>
		<!--景点历史编辑e-->
		<!--游玩时间s-->
		<div class="edit-time edit-box">
			<h1 class="title-edit">游玩时间</h1>
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
					<li class="ok"><a href="javascript:;">确定</a></li>
					<li class="no"><a href="javascript:;">取消</a></li>
				</ul>
			</div>
		</div>
		<!--游玩时间e-->
	</div>
	<script type="text/javascript">
		seajs.use('static/scenic/introduction/event');
	</script>
</body>
</html>