<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Cafe</title>
	<style>
		@import url(http://fonts.googleapis.com/earlyaccess/jejugothic.css);
		@import url(https://fonts.googleapis.com/css?family=Oleo+Script);

  	* {
    	margin:0;
      padding:0;
     }
		body {
			background: #fff;
			font-family: "Jeju Gothic", serif;
		}
		a {
			text-decoration: none;
		}
		nav a:link, a:visited {
			color: #fff;
		}
		nav a:active {
			color: yellow;
		}
	  h1 {
			font-size: 1.8em;
		}
		h2 {
			font-size: 1.3em;
		}
		p {
			font-size: 1.3em;
			line-height: 2.5;
		}
		li {
			font-size: 1em;
			line-height: 2;
		}

		/* 모바일 - 767px 이하 */
		#container {
			width: 100%;
			margin: 0 auto;
		}
		header {
			width: 100%;
			height: 300px;
			background: url(images/header.jpg) center no-repeat;
			background-size: cover;
			margin: 0;
		}
		nav {
			height: 50px;
			background: #000;
		}
		#main-nav {
			list-style: none;
			margin: 0;
			padding: 10px;
		}
		#main-nav li {
			display: inline-block;		
			color: #fff;
			font-family: "맑은 고딕", 돋움;
			font-size: 0.8em;
			margin: 5px 15px;
		}		
		section {
			position: relative;
			width: 100%;
			padding: 15px 5% 10px 5%;
		}
		#container section:nth-child(odd) {
			background: #eee;
		}
		.page-title {
			position: absolute;
			top: 20px;
			left: 0;
			padding: 30px 50px;
		}
		.page-title h1 {
				margin-bottom: 30px;
			}		
    .content {
    	margin: 80px auto 10px;
      -moz-box-sizing: border-box;
      -webkit-box-sizing: border-box;
      box-sizing: border-box;
      width: 90%;
      padding: 20px;
    }		
		.content ol {
			margin-top: 20px;
		}
		.sub-titles {
			color: #0094ff;
			font-weight: 600;
		}		
		.photo {
			display: none;
		}
		footer {
			position: relative;
			width: 100%;
			height: 100px;
			background: #000;
		}		
		footer p {
			font-family: 'Oleo Script', cursive;
			font-size: 1.5em;
			line-height: 100px;
			color: white;
			text-align: center;
		}

    /* 태블릿 - 768px 이상 */
		@media screen and (min-width:760px) {
      header {
				height: 400px;
			}
      #intro, #map {
        -moz-box-sizing: border-box;
        -webkit-box-sizing: border-box;
        box-sizing: border-box;
        width: 50%;
        height: 400px;
        float: left;
        margin: 0;
        border: 1px dotted #ccc;
      }
      #choice {
				clear: left;
			}
    }

    /* PC - 992px 이상 */
		@media screen and (min-width:992px) {
      #container {
				width: 995px;
				margin: 0 auto;
				border: 1px solid #ccc;
			}
			header {
				height: 500px;
			}
      #intro, #map, #choice {
        -moz-box-sizing: border-box;
        -webkit-box-sizing: border-box;
        box-sizing: border-box;
        clear: both;
        position: relative;
        width: 100%;
        height: 420px;
        padding: 15px 2% 10px 5%;
      }
      .content {
				margin: 80px auto 10px;
				width: 90%;
				padding: 20px;
			}
      .photo {
				width: 42%;
				display: block;
			}
      .photo > img {
				width: 100%;
				max-width: 320px;
				height: auto;
				margin-bottom: 30px;
			}
      .text {
				width: 42%;
			}
      #intro .photo, #map .photo {
				float: left;
				margin-right: 5%;
			}
			#intro .text, #map .text {
				float: left;
			}
			#choice .photo {
				float: right;
				margin-right: 5%;
			}
			#choice .text {
				float: left;
			}
			footer {
				clear: both;
			}
    }
	</style>
</head>
<body>
	<div id="container">
		<header>
		<%@ include file="menu.jsp" %>
		</header>
		
		<section id="intro">
			<div class="page-title">
				<h1>카페 소개(sub2)</h1>
			</div>
			<div class="content">
				<div class="photo">
					<img src="images/coffee.jpg" alt="">
				</div>
				<div class="text">
					<p> 영업 시간 : 오전 9시 ~ 밤 10시 </p>
					<p> 휴무 : 매주 수요일 (<i><small>수요일이 공휴일일 경우 수요일 영업, 다음날 휴무</small></i>)</p>
				</div>
			</div>
		</section>
		
        <section id="map">
            <div class="page-title">
		        <h1>오시는 길</h1>
            </div>
            <div class="content">
                <div class="photo">
		            <img src="images/map.jpg" alt="사계 포구에서 서쪽 방향으로 000미터 진행">
                </div>
                <div class="text">
		            <p>서귀포시 안덕면 사계리 oooo-ooo</p>
                    <p>제주 올레 10코스 산방산 근처</p>	
                </div>
		    </div>
        </section>

        <section id="choice">
            <div class="page-title">
		        <h1>이 달의 추천 </h1>
            </div>
            <div class="content">
                <div class="photo">
		            <img src="images/ice.jpg" alt="아이스 커피" style="border:1px solid white; border-radius:50%">
                </div>
                <div class="text">
		            <h2>핸드드립 아이스커피</h2>
		            <ol>
			            <li>1인분 기준으로 서버에 각얼음 5조각(한조각의 20cc) 넣고 추출을 시작한다.</li>
			            <li>평상시 보다 원두의 양은 2배 정도 (20g)와 추출액은 얼음 포함해서 200cc까지 내린다.</li>
			            <li>아이스 잔에 얼음 6~7개 섞어서 시원하게 마신다</li>
		            </ol>
                </div>
			</div>
		</section>

        <footer>
		    <p>My times with Coffee</p>
        </footer>
	</div>
</body>
</html>