<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <div align="center">
    <h1 style="fontstyle:'bold''">Product Manager</h1>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">New Product</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>category</th>
            <th>details</th>
            <th>price</th>
            <th>qty</th>
            <th>image</th>
        </tr>
        <c:forEach items="${listProduct}" var="product">
        <tr>
            <td>${product.prod_id}</td>
            <td>${product.name}</td>
            <td>${product.category}</td> 
            <td>${product.details}</td>
            <td>${product.price}</td>
            <td>${product.qty}</td>
            <td><img src="${product.image}"></td>
            <td>
            	 <a href="/edit?id=${product.prod_id}">Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="/delete?id=${product.prod_id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
    <br>
</div> 