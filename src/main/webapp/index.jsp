<!DOCTYPE html >
<!--[if IE 8]>          <html class="ie ie8"> <![endif]-->
<!--[if IE 9]>          <html class="ie ie9"> <![endif]-->
<!--[if gt IE 9]><!-->  <html> <!--<![endif]-->
<head>
    <meta charset="utf-8" />
    <meta name="keywords" content="" />
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Sai Psychiatry</title>
    <!-- Mobile Meta -->
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Favicons -->
    <link rel="shortcut icon" href="img/favicon.ico">
    <link rel="apple-touch-icon" href="img/apple-touch-icon.png">
    <link rel="apple-touch-icon" sizes="72x72" href="img/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="img/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="144x144" href="img/apple-touch-icon-144x144.png">
    <!-- Google Webfonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,400italic,600,700,800,700italic,600italic' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Neuton:400,200,300' rel='stylesheet' type='text/css'>
    <!--[if lt IE 9]>
    <script src="js/respond.min.js"></script>
    <![endif]-->
    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">
    <!-- Theme Styles CSS-->
    <link rel="stylesheet" href="css/font-awesome.css" />
    <link rel="stylesheet" href="css/style.css" >
    <link rel="stylesheet" href="css/flexslider.css"/>
    <link rel="stylesheet" href="css/nivo-lightbox.css" />
    <link rel="stylesheet" href="css/default.css" />
    <link rel="stylesheet" href="css/animate.css" />
    <!--[if lt IE 9]>
    <script src="/js/libs/html5.js"></script>
    <![endif]-->
    <!-- Style Switch -->
    <link rel="stylesheet" type="text/css" href="css/yellow-black.css" media="screen" />
</head>
<body ng-app='apnapp'>
    <!-- LOADING MASK -->
    <div id="mask">
        <div class="loader">
            <img src="img/loading.gif" alt='loading'>
        </div>
    </div>

    <!-- MAIN CONTENT -->
    <div class="main-content" >
        <div class="container no-padding">
            <div class="row">
                <div class="col-md-3 l-content">
                    <div class="profile-pic">
                        <div class="pic-bg"></div>
                    </div>
                    <nav>
                    <ul class="navigation">
                        <li><a ng-href="#/form">Psychiatric Evaluation <i class="fa fa-file-text"></i></a></li>
                        <li><a ng-href="#/viewclients">Clients<i class="fa fa-user"></i></a></li>
                        <li><a ng-href="#/dsm">DSM 5 Information<i class="fa fa-file-text"></i></a></li>
                        <li><a ng-href="#">Schedule<i class="fa fa-envelope"></i></a></li>
                    </ul>
                    </nav>
                </div>

                <div class="col-md-9 r-content" >
                    <div class="flexslider" >
                        <div class="slides">
                           
						 <div ng-view></div>
                            
                        </div>
                    </div>

                    <!-- FOOTER -->
                    <footer>
                        <div class="row">
                        
                            
                            <div class="col-md-7">
                                <p><img src="img/psych.png">&nbsp;&nbsp;&nbsp;<a href="http://www.sp-opc.com/">Sai Psychiatry Out Patient Clinic</a></p>
                            </div>
                        </div>
                    </footer>
                </div>
            </div>
        </div>
    </div>
    <!-- MAIN CONTENT -->

    <!-- JavaScript -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/nivo-lightbox.min.js"></script>
    <script src="js/main.js"></script>
    <script src="js/contact.js"></script>
    <script src="js/animations.js"></script>
    
		<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.0-rc.1/angular.min.js"></script>
		<script src="https://code.angularjs.org/1.4.0-rc.1/angular-route.min.js"></script>	
		

		<script type="text/javascript" src="js/app/apnapp.js" ></script>
		<script type="text/javascript" src="js/app/services.js" ></script>
		<script type="text/javascript" src="js/app/controllers.js" ></script>
		
</body>
</html>
