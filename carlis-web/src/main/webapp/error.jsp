<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="error-page">
    <head>
        <title>500 error page</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href="${static}/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="${static}/css/bootstrap-theme.min.css">

        <!-- Bootstrap Admin Theme -->
        <link rel="stylesheet" media="screen" href="${static}/css/bootstrap-admin-theme.css">

        <!-- Bootstrap Error Page -->
        <link rel="stylesheet" media="screen" href="${static}/css/bootstrap-error-page.css">

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="${adminAsset}/js/html5shiv.js"></script>
           <script type="text/javascript" src="${adminAsset}/js/respond.min.js"></script>
        <![endif]-->
    </head>
    <body>
        <!-- content -->
        <div class="container-fluid">
            <div class="row-fluid">
                <div class="col-lg-12">
                    <div class="centering text-center">
                        <div class="text-center">
                            <h2 class="without-margin">Don't worry. It's <span class="text-danger"><big>500</big></span> error only.</h2>
                            <h4 class="text-danger">Something is broken, but we will fix it soon</h4>
                        </div>
                        <div class="text-center">
                            <h3><small>Choose an option below</small></h3>
                        </div>
                        <hr>
                        <ul class="pager">
                            <li><a href="about.html">&larr; About</a></li>
                            <li><a href="dashboard.html">Dashboard</a></li>
                            <li><a href="ui-and-interface.html">UI & Interface</a></li>
                            <li><a href="error-pages.html">Other error pages &rarr;</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>

        <!-- footer -->
        <div class="navbar navbar-footer navbar-fixed-bottom">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <footer role="contentinfo">
                            <p class="left">Bootstrap 3.x Admin Theme</p>
                            <p class="right">&copy; 2013 <a href="http://www.meritoo.pl" target="_blank">Meritoo.pl</a></p>
                        </footer>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
