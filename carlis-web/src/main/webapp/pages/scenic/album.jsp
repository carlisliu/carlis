<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>景区相册</title>
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
                    <a href="javascript:;" class="choose-img">选择图片</a>
                    <a href="javascript:;" class="del-img">删除</a>
                    <a href="javascript:;" class="del-img r">删除</a>
                </div>
                <ul class="album-list">
                    <li>
                        <p class="photo-box">
                            <img src="images/album.jpg">
                            <span class="tip">康熙草原-风筝</span>
                        </p>
                        <p class="photo-shadow"></p>
                        <p class="photo-edit">
                            <a href="javascript:;" class="edit">编辑</a>
                            <a href="javascript:;" class="del">删除</a>
                        </p>
                        <p class="edit-s">
                            <a href="javascript:;" class="select-arrow"></a>
                            <!--<a href="javascript:;" class="select-arrow select"></a>-->
                            <a href="javascript:;" class="del-arrow"></a>
                            <!--<a href="javascript:;" class="del-arrow select"></a>-->
                        </p>
                    </li>
                </ul>
            </div>
            <!--基本信息e-->
        </div>
        <!--shadow s-->
        <div class="shadow"></div>
        <!--shadow e-->
        <!--相片描述s-->
        <div class="edit-album-des edit-box">
            <h1 class="title-edit">相片描述</h1>
            <div class="line album-line">
                <div class="album-left">
                    <img src="images/album-des.jpg">
                </div>
                <div class="album-right">
                    <h2 class="title">相片标题<i class="r"></i></h2>
                    <div class="input-text">
                        <div class="input-box">
                            <input type="text" placeholder="输入相片标题">
                        </div>
                        <div class="num">
                            <p>
                                <span class="r">0</span>/15
                            </p>
                        </div>
                    </div>
                    <h2 class="title">相片描述</h2>
                    <div class="textarea-box">
                        <textarea placeholder="输入相片描述信息"></textarea>
                        <p class="num">
                            <span class="r">0</span>/200
                        </p>
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
        <!--相片描述e-->
        <!--相片上传s-->
        <div class="edit-album-uplode edit-box">
            <h1 class="title-edit">相片上传</h1>
            <div class="line album-line">
                <div class="album-left">
                    <img src="images/album-des.jpg">
                    <a href="javascript:;" class="del-btn">删除</a>
                </div>
                <div class="album-right">
                    <h2 class="title">相片标题<i class="r"></i></h2>
                    <div class="input-text">
                        <div class="input-box">
                            <input type="text" placeholder="输入相片标题">
                        </div>
                        <div class="num">
                            <p>
                                <span class="r">0</span>/15
                            </p>
                        </div>
                    </div>
                    <h2 class="title">相片描述</h2>
                    <div class="textarea-box">
                        <textarea placeholder="输入相片描述信息"></textarea>
                        <p class="num">
                            <span class="r">0</span>/200
                        </p>
                    </div>
                </div>
            </div>

            <!--list-->
            <div class="line album-line">
                <div class="album-left">
                    <img src="images/album-des.jpg">
                    <a href="javascript:;" class="del-btn">删除</a>
                </div>
                <div class="album-right">
                    <h2 class="title">相片标题<i class="r"></i></h2>
                    <div class="input-text">
                        <div class="input-box">
                            <input type="text" placeholder="输入相片标题">
                        </div>
                        <div class="num">
                            <p>
                                <span class="r">0</span>/15
                            </p>
                        </div>
                    </div>
                    <h2 class="title">相片描述</h2>
                    <div class="textarea-box">
                        <textarea placeholder="输入相片描述信息"></textarea>
                        <p class="num">
                            <span class="r">0</span>/200
                        </p>
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
        <!--相片上传e-->
    </div>
    <!--内容e-->
    <script>
    	seajs.use('static/scenic/album/event');
    </script>
</body>
</html>