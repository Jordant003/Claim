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
    <script src="https://kit.fontawesome.com/c5851df400.js" crossorigin="anonymous"></script>
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
        <form:form modelAttribute="account" action="/profile/${account.id}/${account.address.id}" method="post">
            <div class="sign-up-box flex-col">
                     <h1>Account info</h1>
                    <label>Name</label>
                    <form:input type="text" class="" path="name" />
                    <label>Phone Number</label>
                    <form:input type="text" class="" path="phoneNumber" />
                    <label>Email</label>
                    <form:input type="text" class="" path="email" />
                    <label>Password</label>
                    <form:input type="password" class="" path="password" />
                     <h1>Address</h1>
                     <label>House Number</label>
                    <form:input type="text" class="" path="address.houseNumber" />
                    <label>Street</label>
                    <form:input type="text" class="" path="address.street" />
                    <label>City</label>
                    <form:input type="text" class="" path="address.city" />
                    <label>State</label>
                    <form:input type="text" class="" path="address.state" />
                    <label>Zipcode</label>
                    <form:input type="text" class="" path="address.zipCode" />
                    <form:button type="submit">Submit</form:button>
            </div>
        </form:form>
    </div>
    
</body>
</html>