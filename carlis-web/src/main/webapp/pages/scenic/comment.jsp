<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<meta charset="utf-8">
	<title>景区评论</title>
	</head>
<body>
	<!--内容s-->
	<div class="wrap-box">
		<div class="wrap">
			<!--发布栏s-->
			<div class="release">
				<span class="msg">带红色全部编辑完成才可以发布...</span> <a href="javascript:;"
					class="push">发布</a>
			</div>
			<!--发布栏e-->
			<!--综合评分s-->
			<div class="con-box">
				<h2 class="title-one">综合评分</h2>
				<div class="tab-box">
					<ul class="tab-btn">
						<li><a href="javascript:;" class="active"><span
								class="num">4.7</span>分</a></li>
					</ul>
					<div class="tab-con">
						<div class="score">
							<div class="score-wrap">
								<p class="score-name">
									<span class="score-class">好评</span> <span class="score-per">占总评论54%</span>
								</p>
								<p class="scroll-per">
									<span class="per-totle"></span> <span class="per-actual g"></span>
								</p>
							</div>
							<div class="score-wrap">
								<p class="score-name">
									<span class="score-class">中评</span> <span class="score-per">占总评论54%</span>
								</p>
								<p class="scroll-per">
									<span class="per-totle"></span> <span class="per-actual o"></span>
								</p>
							</div>
							<div class="score-wrap">
								<p class="score-name">
									<span class="score-class">差评</span> <span class="score-per">占总评论54%</span>
								</p>
								<p class="scroll-per">
									<span class="per-totle"></span> <span class="per-actual r"></span>
								</p>
							</div>
						</div>
					</div>
				</div>

				<h2 class="title-one">游客评价</h2>
				<div class="tab-box">
					<ul class="tab-btn">
						<li><a href="javascript:;" class="active">好评</a></li>
						<li><a href="javascript:;">中评</a></li>
						<li><a href="javascript:;">差评</a></li>
					</ul>
					<div class="tab-con">
						<dl class="list-comment">
							<dt>
								<img src="${staticPath }/images/head.jpg" />
							</dt>
							<dd>
								<ul>
									<li class="line1"><span class="title cutWord">旧行李和你</span>
										<a href="javascript:;" class="del">删除</a></li>
									<li class="line2"><span class="time">2015-10-02
											17：12</span> <a href="javascript:;" class="good">134</a></li>
									<li class="line3 cutWord">八达岭长城段是长城建筑最精华段，集巍峨险峻、秀丽苍翠于一体。</li>
								</ul>
							</dd>
						</dl>
						<dl class="list-comment">
							<dt>
								<img src="${staticPath }/images/head.jpg">
							</dt>
							<dd>
								<ul>
									<li class="line1"><span class="title cutWord">旧行李和你</span>
										<a href="javascript:;" class="del">删除</a></li>
									<li class="line2"><span class="time">2015-10-02
											17：12</span> <a href="javascript:;" class="good">134</a></li>
									<li class="line3 cutWord">八达岭长城段是长城建筑最精华段，集巍峨险峻、秀丽苍翠于一体。</li>
								</ul>
							</dd>
						</dl>
						<dl class="list-comment no-border">
							<dt>
								<img src="${staticPath }/images/head.jpg">
							</dt>
							<dd>
								<ul>
									<li class="line1"><span class="title cutWord">旧行李和你</span>
										<a href="javascript:;" class="del">删除</a></li>
									<li class="line2"><span class="time">2015-10-02
											17：12</span> <a href="javascript:;" class="good">134</a></li>
									<li class="line3 cutWord">八达岭长城段是长城建筑最精华段，集巍峨险峻、秀丽苍翠于一体。</li>
								</ul>
							</dd>
						</dl>
					</div>
				</div>
			</div>
			<!--综合评分d-->
		</div>
	</div>
	<!--内容e-->
	<script type="text/javascript">
		seajs.use('static/scenic/comment/event');
	</script>
</body>
</html>