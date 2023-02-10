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
    <link rel="stylesheet" href="/css/home.css">
    <link rel="stylesheet" href="/css/signUp.css">
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
        <div class="header-right flex-row">
            <a href="/" class="header-right">Home</a>
            <a href="/signIn" class="header-right">Sign In</a>
            <a href="/signUp" class="header-right">Sign Up</a>
        </div>
        </div>
    </div>
    <div class="main-content">
        <form:form modelAttribute="account" action="signUp" method="post">
           <div class="sign-up-box flex-col">
                    <h1>Sign Up</h1>
                   <label>Name</label>
                   <form:input type="text" class="" path="name" />
                   <label>Phone Number</label>
                   <form:input type="text" class="" path="phoneNumber" />
                   <label>Email</label>
                   <form:input type="text" class="" path="email" />
                   <label>Password</label>
                   <form:input type="password" class="" path="password" />
                   <form:button type="submit">Submit</form:button>
           </div>
       </form:form>
    </div>
    
</body>
</html>