<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>景区照片</title>
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
                <div class="left-img">
                    <h2 class="title-one">
                        <span>景区封面照片<i class="hui">（用于景区首页面宣传）</i></span>
                        <a href="javscript:;" class="editg" id="editFeng">编辑</a>
                    </h2>
                    <div class="img-f">
                        <img src="images/ing-f.jpg">
                    </div>
                </div>
                <div class="right-img">
                    <h2 class="title-one">
                        <span>景区的搜索首页照片<i class="hui">(显示在app首页热门搜索)</i></span>
                        <a href="javscript:;" class="editg" id="editSouIndex">编辑</a>
                    </h2>
                    <div class="img-index">
                        <img src="images/img-index.jpg">
                    </div>
                    <h2 class="title-one">
                        <span>经过搜索的景区照片<i class="hui">（搜索后的景区缩略照片）</i></span>
                        <a href="javscript:;" class="editg" id="editSouSpotr">编辑</a>
                    </h2>
                    <div class="img-s">
                        <img src="images/img-s.jpg">
                    </div>
                </div>
            </div>
            <!--基本信息e-->
        </div>


        <!--shadow s-->
        <div class="shadow"></div>
        <!--shadow e-->

        <!--封面图片s-->
        <div class="edit-f-img edit-box">
            <h1 class="title-edit">景区封面照片（用于景区首页面宣传）</h1>
            <div class="line">
                <h2 class="title">配图<i class="r"></i></h2>
                <div class="image-box">
                    <p class="file-uplode">
                        <a class="flie-btn">选择图片</a>
                        <span class="tip">(建议图片尺寸1920*960、1280*640)</span>
                    </p>
                    <div class="img-detile">
                        <img src="images/ing-f.jpg">
                    </div>
                </div>
            </div>
            <div class="edit-btn-box">
                <ul>
                    <li class="ok">
                        <a href="javascript:;">确定</a>
                    </li>
                    <li class="no">
                        <a href="javascript:;">取消</a>
                    </li>
                </ul>
            </div>
        </div>
        <!--封面图片e-->
        <!--景区搜索编辑s-->
        <div class="edit-s-img edit-box">
            <h1 class="title-edit">景区的搜索首页照片(显示在app首页热门搜索)</h1>
            <div class="line">
                <h2 class="title">配图<i class="r"></i></h2>
                <div class="image-box">
                    <p class="file-uplode">
                        <a class="flie-btn">选择图片</a>
                        <span class="tip">(建议图片尺寸400*250)</span>
                    </p>
                    <div class="img-detile">
                        <img src="images/img-s.jpg">
                    </div>
                </div>
            </div>
            <div class="edit-btn-box">
                <ul>
                    <li class="ok">
                        <a href="javascript:;">确定</a>
                    </li>
                    <li class="no">
                        <a href="javascript:;">取消</a>
                    </li>
                </ul>
            </div>
        </div>
        <!--景区搜索编辑e-->
        <!--景区首页编辑s-->
        <div class="edit-index-img edit-box">
            <h1 class="title-edit">经过搜索的景区照片（搜索后的景区缩略照片）</h1>
            <div class="line">
                <h2 class="title">配图<i class="r"></i></h2>
                <div class="image-box">
                    <p class="file-uplode">
                        <a class="flie-btn">选择图片</a>
                        <span class="tip">(建议图片尺寸300*240)</span>
                    </p>
                    <div class="img-detile">
                        <img src="images/img-index.jpg">
                    </div>
                </div>
            </div>
            <div class="edit-btn-box">
                <ul>
                    <li class="ok">
                        <a href="javascript:;">确定</a>
                    </li>
                    <li class="no">
                        <a href="javascript:;">取消</a>
                    </li>
                </ul>
            </div>
        </div>
        <!--景区首页编辑e-->
    </div>
    <!--内容e-->
    <script>
    	seajs.use('static/scenic/photo/event');
    </script>
</body>
</html>