<%-- 
    Document   : home
    Created on : Aug 11, 2019, 9:44:44 PM
    Author     : HUONG XINH GAI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Trang chủ</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <div class="base">
                <div class="menu">
                   <div class="icon">
                      <div class="bar"></div>
                   </div>
                </div>
                <div class="icons">
                   <i class="fa fa-user" aria-hidden="true"></i>
                   <i class="fa fa-calendar-o" aria-hidden="true"></i>
                   <i class="fa fa-tachometer" aria-hidden="true"></i>
                </div>
                <div class="section">
                   <div class="cover1">
                      <div class="cover2">
                         <a class="content" href="#calender"></a>
                      </div>
                   </div>
                </div>
                <a class="section-static top" href="#profile"></a>
                <a class="section-static bottom" href="#dashboard"></a>
             </div>
            <div style="background-image: url(https://images.freecreatives.com/wp-content/uploads/2016/03/White-Snow-Background.jpg); background-repeat: no-repeat; text-indent:10px; height: 400px">
                <div id="header">
                    <span class="left"><a href="home.jsp"><img src="http://www.hocvienact.edu.vn/images/actlogo1.png"/></a></span>
                </div>
                <div id="navbar">
                    <nav class="navbar navbar-expand-lg navbar-light bg-light" style="border-radius: 5px; margin-left: 10px; margin-right: 10px">
                        <a class="navbar-brand" href="home.jsp">ACT Techkid</a>
                        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <span class="navbar-toggler-icon"></span>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="navbar-nav mr-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="#">Về chúng tôi <span class="sr-only">(current)</span></a>
                                </li>
                                <li class="nav-item dropdown">
                                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    Các khóa học
                                    </a>
                                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <a class="dropdown-item" href="#">Action</a>
                                        <a class="dropdown-item" href="#">Another action</a>
                                        <div class="dropdown-divider"></div>
                                        <a class="dropdown-item" href="#">Something else here</a>
                                    </div>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="#">Học online</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Thư viện</a>
                                </li>
                            </ul>
                            <form class="form-inline my-2 my-lg-0">
                                <input class="form-control mr-sm-2" type="search" placeholder="Tìm kiếm" aria-label="Search">
                                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Tìm kiếm</button>
                            </form>
                        </div>
                    </nav>
                </div>
                <div class="bd-example" style="margin-top: 20px">
                    <div id="carouselExampleCaptions" class="carousel slide" data-ride="carousel">
                        <ol class="carousel-indicators">
                            <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
                            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
                            <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
                        </ol>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="http://www.hocvienact.edu.vn/images/slider/Java1.png" class="d-block w-100" alt="">
                            </div>
                            <div class="carousel-item">
                                <img src="http://www.hocvienact.edu.vn/images/slider/PHP1.png" class="d-block w-100" alt="">
                            </div>
                            <div class="carousel-item">
                                <img src="http://www.hocvienact.edu.vn/images/slider/KhoaArduino.png" class="d-block w-100" alt="">
                            </div>
                        </div>
                        <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="sr-only">Previous</span>
                        </a>
                        <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="sr-only">Next</span>
                        </a>
                    </div>
                </div>
            </div>
            <div class="course-name" style="margin-top: 50px">
                <button type="button" class="btn btn-primary btn-lg btn-block" style="background-color: white; color: black; border: none; font-size: 30px">Các khóa học Dạy lập trình cho trẻ em tại ACT TECHKID</button>
                    <hr style="border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px;"/>
            </div>
            <div class="row" style="margin-top: 30px">                
                <div class="col-sm-6" style="margin-bottom: 30px">
                    <div class="card">
                        <div class="course-image">
                            <img src="http://img.f34.dulich.vnecdn.net/2017/07/12/10-1499826046_680x0.jpg" style="width: 538px; height: 200px"/>
                    </div>
                        <div class="card-body">
                            <h5 class="card-title">Lập trình bằng ngôn ngữ tự nhiên</h5>
                            <p class="card-text">Phù hợp với trẻ em từ 8 tuổi trở lên.</p>
                            <p class="card-text">Với xứ mệnh đưa trẻ đến gần hơn với khả năng lập trình, khóa học giúp trẻ: </p>
                            <p class="card-text">Với cách thức giảng dạy mới mẻ, thân thiện, môi trường học tập đầy đủ trang thiết bị sẽ kích thích sự hứng thú và ham học hỏi ở trẻ. Tạo nền tảng lập trình ban đầu vững chắc cho các bé.</p>
                            <a href="#" class="btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6" style="margin-bottom: 30px">
                    <div class="card">
                        <div class="course-image">
                            <img src="http://img.f34.dulich.vnecdn.net/2017/07/12/10-1499826046_680x0.jpg" style="width: 538px; height: 200px"/>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">Lập trình C căn bản</h5>
                            <p class="card-text">Phù hợp với trẻ em từ 8 tuổi trở lên.</p>
                            <p class="card-text">Tiếp nối khóa học Lập trình bằng ngôn ngữ tự nhiên, khóa học này sẽ giúp trẻ thay đổi thói quen sử dụng máy tính.</p>
                            <p class="card-text">Với chương trình học phù hợp với khả năng tiếp nhận theo lứa tuổi, khóa học sẽ đưa đến cho các bé các kiến thức căn bản của ngôn ngữ Lập trình C.</p>
                            <a href="#" class="btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card">
                        <div class="course-image">
                            <img src="http://img.f34.dulich.vnecdn.net/2017/07/12/10-1499826046_680x0.jpg" style="width: 538px; height: 200px"/>
                        </div>
                        <div class="card-body">
                            <h5 class="card-title">Khóa học Giải thuật căn bản</h5>
                            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                            <a href="#" class="btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="card">
                        <div class="course-image">
                            <img src="http://img.f35.dulich.vnecdn.net/2017/07/12/5-1499826045_680x0.jpg" style="width: 538px; height: 200px"/>
                    </div>
                        <div class="card-body">
                            <h5 class="card-title">Khóa học giải thuật căn bản và nâng cao</h5>
                            <p class="card-text">With supporting text below as a natural lead-in to additional content.</p>
                            <a href="#" class="btn btn-primary">Chi tiết</a>
                        </div>
                    </div>
                </div>
            </div>
            <div class="benefits">
                <div class="course-name" style="margin-top: 50px">
                    <button type="button" class="btn btn-primary btn-lg btn-block" style="background-color: white; color: black; border: none; font-size: 30px">Tại sao chọn ACT TECHKID là nơi gửi gắm các bé?</button>
                        <hr style="border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px;"/>
                </div>
            </div>
        </div>
        <script>
            $(".menu").click(function(){
                $(this).parent().toggleClass("close");
             });

        </script>
    </body>
</html>
