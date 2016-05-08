<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<meta charset="utf-8">
	<title>景观讲解</title>
	</head>
<body>
	<!--内容s-->
    <div class="wrap-box">
        <div class="wrap">
            <!--发布栏s-->
            <div class="release">
                <span class="msg">带红色全部编辑完成才可以发布...</span>
                <a href="javascript:;" class="push">发布</a>
            </div>
            <!--发布栏e-->
            <!--基本信息s-->
            <div class="con-box">
                <div class="album-btn">
                    <!--<a href="javascript:;" class="choose-img">添加</a>-->
                    <p class="select" id="search">
                        <span class="text">筛选条件</span>
                        <i class="arrow"></i>
                    </p>
                    <!-- 下拉s-->
                    <div class="option-box"data-id="searchList">
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
                <ul class="enter-list">
                    <li>
                        <p class="photo-box">
                            <img src="images/enter-list.jpg">
                            <span class="tip-land">
                                <span class="tit">康熙草原-风筝</span>
                                <span class="v-timg">
                                    <i>3'33''</i>
                                </span>
                            </span>
                        </p>
                        <p class="photo-shadow"></p>
                        <p class="photo-edit">
                            <a href="javascript:;" class="edit">编辑</a>
                            <a href="javascript:;" class="del">删除</a>
                        </p>
                        <p class="edit-s">
                            <a href="javascript:;" class="select-arrow"></a>
                            <!--<a href="javascript:;" class="select-arrow select"></a>-->
                        </p>
                    </li>
                    <li>
                        <p class="photo-box">
                            <img src="images/enter-list.jpg">
                            <span class="tip-land">
                                <span class="tit">康熙草原-风筝</span>
                                <span class="v-timg">
                                    <i>3'33''</i>
                                </span>
                            </span>
                        </p>
                        <p class="photo-shadow"></p>
                        <p class="photo-edit">
                            <a href="javascript:;" class="edit">编辑</a>
                            <a href="javascript:;" class="del">删除</a>
                        </p>
                        <p class="edit-s">
                            <a href="javascript:;" class="select-arrow"></a>
                            <!--<a href="javascript:;" class="select-arrow select"></a>-->
                        </p>
                    </li>
                    <li>
                        <p class="photo-box">
                            <img src="images/enter-list.jpg">
                            <span class="tip-land">
                                <span class="tit">康熙草原-风筝</span>
                                <span class="v-timg">
                                    <i>3'33''</i>
                                </span>
                            </span>
                        </p>
                        <p class="photo-shadow"></p>
                        <p class="photo-edit">
                            <a href="javascript:;" class="edit">编辑</a>
                            <a href="javascript:;" class="del">删除</a>
                        </p>
                        <p class="edit-s">
                            <a href="javascript:;" class="select-arrow"></a>
                            <!--<a href="javascript:;" class="select-arrow select"></a>-->
                        </p>
                    </li>
                    <li>
                        <p class="photo-box">
                            <img src="images/enter-list.jpg">
                            <span class="tip-land">
                                <span class="tit">康熙草原-风筝</span>
                                <span class="v-timg">
                                    <i>3'33''</i>
                                </span>
                            </span>
                        </p>
                        <p class="photo-shadow"></p>
                        <p class="photo-edit">
                            <a href="javascript:;" class="edit">编辑</a>
                            <a href="javascript:;" class="del">删除</a>
                        </p>
                        <p class="edit-s">
                            <a href="javascript:;" class="select-arrow"></a>
                            <!--<a href="javascript:;" class="select-arrow select"></a>-->
                        </p>
                    </li>
                </ul>
            </div>
            <!--基本信息e-->
        </div>
        <!--shadow s-->
        <div class="shadow"></div>
        <!--shadow e-->

        <!--景观编辑s-->
        <div class="edit-land edit-box">
            <h1 class="title-edit">景观讲解编辑</h1>
            <div class="line">
                <h2 class="title">景观名称<i class="r"></i></h2>
                <div class="input-text">
                    <div class="input-box">
                        <input type="text" placeholder="请输入景观名称">
                    </div>
                    <div class="num">
                        <p>
                            <span class="r">0</span>/10
                        </p>
                    </div>
                </div>
            </div>

            <div class="line">
                <h2 class="title">音频<i class="r"></i></h2>
                <div class="image-box">
                    <p class="file-uplode">
                        <a class="flie-btn">选择音频</a>
                        <a class="flie-btn2">试听(3’22)</a>
                    </p>
                </div>
            </div>
            <div class="line">
                <h2 class="title">缩略图<i class="r"></i></h2>
                <div class="image-box">
                    <p class="file-uplode">
                        <a class="flie-btn">选择图片</a>
                        <span class="tip">(建议图片尺寸840*360)</span>
                    </p>
                    <div class="img-detile">
                        <img src="images/land-s1.jpg">
                    </div>
                </div>
            </div>
            <div class="line">
                <h2 class="title">头图<i class="r"></i></h2>
                <div class="image-box">
                    <p class="file-uplode">
                        <a class="flie-btn">选择图片</a>
                        <span class="tip">(建议图片尺寸1920*960、1280*640)</span>
                    </p>
                    <div class="img-detile">
                        <img src="images/land-s.jpg">
                    </div>
                </div>
            </div>
            <div class="line">
                <h2 class="title">项目说明<i class="r"></i></h2>
                <div class="textarea-box">
                    <div class="btn-line">
                        <a href="javascript:;">插入图片</a>
                    </div>
                    <textarea placeholder="请输入项目说明"></textarea>
                    <p class="num">
                        <span class="r">0</span>/2000
                    </p>
                </div>
            </div>
            <div class="edit-btn-box">
                <ul class="t">
                    <li class="ok">
                        <a href="javascript:;">确定</a>
                    </li>
                    <li class="yl">
                        <a href="javascript:;">预览</a>
                    </li>
                    <li class="no">
                        <a href="javascript:;">取消</a>
                    </li>
                </ul>
            </div>
        </div>
        <!--景观编辑e-->
        <!--景观预览s-->
        <div class="preview-box pre-land">
            <div class="head-img-pre">
                <img src="images/land-view.jpg">
            </div>
            <div class="v-box">
                3′22″
            </div>
            <div class="des-pre">
                <div class="left-pre">
                    <span>滑雪</span>
                </div>
                <div class="right-pre">
                    <a href="javascript:;">编辑</a>
                    <a href="javascript:;">删除</a>
                </div>
                <p class="text">
                    滑雪运动是运动员把滑雪板装在靴底上在雪地上进行速度、跳跃和滑降的竞赛运动。滑雪板用木材、金属材料和塑料混合制成。高山滑雪由滑降，小回转和大回转（障碍滑雪）组成。高山滑雪混合项目，由上述三个项目组成。人们成站立姿态，手持滑雪杖、足踏滑雪板在雪面上滑行的运动。“立”、“板”、“雪”、“滑”是滑雪运动的关键要素。
                    <img src="images/land-views.jpg">滑雪运动
                    滑雪运动是运动员把滑雪板装在靴底上在雪地上进行速度、跳跃和滑降的竞赛运动。滑雪板用木材、金属材料和塑料混合制成。高山滑雪由滑降，小回转和大回转（障碍滑雪）组成。高山滑雪混合项目，由上述三个项目组成。人们成站立姿态，手持滑雪杖、足踏滑雪板在雪面上滑行的运动。“立”、“板”、“雪”、“滑”是滑雪运动的关键要素。
                </p>
            </div>
        </div>
        <!--景观预览e-->
    </div>
    <!--内容e-->
	<script type="text/javascript">
		seajs.use('static/scenic/landscape/event');
	</script>
</body>
</html>