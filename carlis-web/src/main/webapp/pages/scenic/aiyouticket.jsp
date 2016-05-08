<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<meta charset="utf-8">
	<title>爱游票务</title>
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
                <h2 class="title-one">
                    <span>特价门票</span>
                    <a href="javscript:;" class="add" data-id="ticketAdd">添加</a>
                </h2>
                <ul class="table t">
                    <li class="line">
                        <ul class="tr">
                            <li class="td1">序号</li>
                            <li class="td2">门票名称</li>
                            <li class="td3">预定时间</li>
                            <li class="td4">是否可退</li>
                            <li class="td5">原价</li>
                            <li class="td6">爱游价</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <ul class="table">
                    <li class="line">
                        <ul class="tr">
                            <li class="td1">1</li>
                            <li class="td2">八达岭成人票</li>
                            <li class="td3">提前一天预定</li>
                            <li class="td4">可退</li>
                            <li class="td5">1230元</li>
                            <li class="td6 o">1230元</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                    <li class="g line">
                        <ul class="tr">
                            <li class="td1">1</li>
                            <li class="td2">八达岭成人票</li>
                            <li class="td3">提前一天预定</li>
                            <li class="td4">可退</li>
                            <li class="td5">1230元</li>
                            <li class="td6 o">1230元</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                    <li class="line">
                        <ul class="tr">
                            <li class="td1">1</li>
                            <li class="td2">八达岭成人票</li>
                            <li class="td3">提前一天预定</li>
                            <li class="td4">可退</li>
                            <li class="td5">1230元</li>
                            <li class="td6 o">1230元</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <h2 class="title-one">
                    <span>游艺项目</span>
                    <a href="javscript:;" class="add" data-id="ticketAdd">添加</a>
                </h2>
                <ul class="table t">
                    <li class="line">
                        <ul class="tr">
                            <li class="td1">序号</li>
                            <li class="td2">门票名称</li>
                            <li class="td3">预定时间</li>
                            <li class="td4">是否可退</li>
                            <li class="td5">原价</li>
                            <li class="td6">爱游价</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                </ul>
                <ul class="table">
                    <li class="line">
                        <ul class="tr">
                            <li class="td1">1</li>
                            <li class="td2">八达岭成人票</li>
                            <li class="td3">提前一天预定</li>
                            <li class="td4">可退</li>
                            <li class="td5">1230元</li>
                            <li class="td6 o">1230元</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                    <li class="g line">
                        <ul class="tr">
                            <li class="td1">1</li>
                            <li class="td2">八达岭成人票</li>
                            <li class="td3">提前一天预定</li>
                            <li class="td4">可退</li>
                            <li class="td5">1230元</li>
                            <li class="td6 o">1230元</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                    <li class="line">
                        <ul class="tr">
                            <li class="td1">1</li>
                            <li class="td2">八达岭成人票</li>
                            <li class="td3">提前一天预定</li>
                            <li class="td4">可退</li>
                            <li class="td5">1230元</li>
                            <li class="td6 o">1230元</li>
                            <li class="btn">
                                <a href="javascript:;" class="del">删除</a>
                                <a href="javascript:;" class="edit">编辑</a>
                            </li>
                        </ul>
                    </li>
                </ul>
            </div>
            <!--基本信息e-->
        </div>
        <!--shadow s-->
        <div class="shadow"></div>
        <!--shadow e-->

        <!--爱游票务信息修改或添加s-->
        <div class="edit-ticket edit-box">
            <h1 class="title-edit">添加票务</h1>
            <div class="line">
                <h2 class="title">门票名称<i class="r"></i></h2>
                <div class="input-text">
                    <div class="input-box">
                        <input type="text" placeholder="请输入门票名称">
                    </div>
                    <div class="num">
                        <p>
                            <span class="r">0</span>/15
                        </p>
                    </div>
                </div>
            </div>
            <div class="line">
                <div class="line-more">
                    <h2 class="title">预定时间<i class="r"></i></h2>
                    <p class="select" id="timeReserve">
                        <span class="text">提前一天预定</span>
                        <i class="arrow"></i>
                    </p>
                    <!-- 下拉s-->
                    <div class="option-box" data-id="timeReserve">
                        <ul class="select-option">
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
                <div class="line-more">
                    <h2 class="title">是否需要电话预约<i class="r"></i></h2>
                    <p class="select s" id="isReserve">
                        <span class="text">是</span>
                        <i class="arrow"></i>
                    </p>
                    <!-- 下拉s-->
                    <div class="option-box" data-id="isReserve">
                        <ul class="select-option">
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
                <div class="line-more">
                    <h2 class="title">是否可退<i class="r"></i></h2>
                    <p class="select s" id="isReturn">
                        <span class="text">是</span>
                        <i class="arrow"></i>
                    </p>
                    <!-- 下拉s-->
                    <div class="option-box" data-id="isReturn">
                        <ul class="select-option">
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                        </ul>
                    </div>
                    <!-- 下拉e-->
                </div>
                <div class="line-more">
                    <h2 class="title">是否支持部分退</h2>
                    <p class="select s lf mr10 grayBg" id="isReturnPart">
                        <span class="text grayBg">是</span>
                        <i class="arrow"></i>
                    </p>
                    <!-- 下拉s-->
                    <div class="option-box" data-id="isReturnPart">
                        <ul class="select-option">
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                            <li>sdafasdfas</li>
                        </ul>
                    </div>
                    <!-- 下拉e-->
                    <div class="input-text lf">
                        <div class="input-box grayBg">
                            <input type="text" placeholder="输入部分退改规则" class="grayBg">
                        </div>
                        <div class="num grayBg">
                            <p>
                                <span class="r">0</span>/30
                            </p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="line">
                <div class="line-more">
                    <h2 class="title">原价<i class="r"></i></h2>
                    <p class="input">
                        <input type="text" placeholder="输入金额">
                        <span>元</span>
                    </p>
                </div>
                <div class="line-more">
                    <h2 class="title">爱游价<i class="r"></i></h2>
                    <p class="input">
                        <input type="text" placeholder="输入金额">
                        <span>元</span>
                    </p>
                </div>
            </div>
            <div class="line">
                <a href="javascript:;" class="href-btn">
                    改为游艺项目
                </a>
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
        <!--爱游票务信息修改或添加e-->
    </div>
    <!--内容e-->
	<script type="text/javascript">
		seajs.use('static/scenic/aiyouticket/event');
	</script>
</body>
</html>