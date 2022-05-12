<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   
<div>
<h3>Search Results</h3>
   
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Category</th>
            <th>Details</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Image</th>
        </tr>
        <c:forEach items="${result}" var="product">
        <tr>
            <td>${product.prod_id}</td>
            <td>${product.name}</td>
            <td>${product.category}</td>
            <td>${product.details}</td>
            <td>${product.price}</td>
            <td>${product.qty}</td>
            <td><img src=${product.image}></td>
           
        </tr>
        </c:forEach>
    </table>
</div>