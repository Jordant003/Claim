<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="/css/new.css">
    <link rel="stylesheet" href="/css/home.css">
</head>
<body class="flex-col">
    <div class="header flex-row">
        <div class="header-title">
            JTs Whips
        </div>
        <div class="buy-button flex-col">
            <div class="header-links flex-col">BUY</div>
            <div class="dropdown flex-col">
                <a href="/new" class="header-links">New</a>
                <a href="/used" class="header-links">Used</a>
            </div>
        </div>
        <c:choose>
                <c:when test="${account != null}">
                    <div class="header-right flex-row">
                        <a href="/" class="header-right">Home</a>
                        <a href="/profile" class="header-right">Profile</a>
                        <a href="/signOut" class="header-right">Sign Out</a>
                        <p class="header-right user-tag">${account.getName().charAt(0)}</p>
                    </div>
		        </c:when>
		        <c:otherwise>
                    <div class="header-right">
                        <a href="/" class="header-right">Home</a>
                        <a href="/signIn" class="header-right">Sign In</a>
                        <a href="/signUp" class="header-right">Sign Up</a>
                    </div>
		        </c:otherwise>
            </c:choose>
    </div>
    <div class="main-content flex-col">
        <div class="main-text">Want a new car? <br> Shop by Make</div>
        <div class="flex-col">
            <img class="bmw-img" src="https://assets.shopbmwusa.com/assets/images/highquality/emblem-neu_03_4767.jpg" alt="">
            <a class="bmw-img bmw-text" href="/carDetail/bmw/new">BMW</a>
        </div>
        <div class="flex-col">
            <img class="bmw-img" src="https://eautomarket.com/wp-content/uploads/Emblem-15.jpg" alt="">
            <a class="bmw-img bmw-text" href="/carDetail/mercedes/new">Mercedes</a>
        </div>
        <div class="flex-col">
            <img class="bmw-img" src="https://assets.rebelmouse.io/media-library/1963-1999.jpg?id=31544597&width=210" alt="">
            <a class="bmw-img bmw-text" href="/carDetail/cadillac/new">Cadillac</a>
        </div>

    </div>
    
</body>
</html>