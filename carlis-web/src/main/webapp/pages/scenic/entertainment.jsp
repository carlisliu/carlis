<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>娱乐项目</title>
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
                    <a href="javascript:;" class="choose-img">添加</a>
                </div>
                <ul class="album-list">
                    <li>
                        <p class="photo-box">
                            <img src="images/album.jpg">
                            <span class="tip">
                             	康熙草原-风筝
                                <span class="tip2">价格：<i>60</i>/位</span>
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

        <!--娱乐项目编辑s-->
        <div class="edit-entertainment edit-box">
            <h1 class="title-edit">娱乐项目编辑</h1>
            <div class="line">
                <h2 class="title">项目名称<i class="r"></i></h2>
                <div class="input-text">
                    <div class="input-box">
                        <input type="text" placeholder="请输入项目名称">
                    </div>
                    <div class="num">
                        <p>
                            <span class="r">0</span>/10
                        </p>
                    </div>
                </div>
            </div>
            <div class="line">
                <h2 class="title">项目价格<i class="r"></i></h2>
                <div class="input-text">
                    <div class="input-box">
                        <input type="text" placeholder="请输入项目价格">
                    </div>
                    <div class="num">
                        <p>
                            <span class="r">0</span>/15
                        </p>
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
                        <img src="images/sport-detile.jpg">
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
        <!--娱乐项目编辑e-->
    </div>
    <!--内容e-->
    <script>
    	seajs.use('static/scenic/entertainment/event');
    </script>
</body>
</html>