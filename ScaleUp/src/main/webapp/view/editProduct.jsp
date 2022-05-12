<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightgreen">
<div align="center" >
		        
		<h2>Edit Product</h2>
		        
		<form:form action="save" method="post" modelAttribute="product" >
            <table border="0" cellpadding="5">
				 <tr>
                    <td>ID: </td>
                    <td>${product.prod_id}
                        <form:hidden path="prod_id"/>
                    </td>
                </tr>                 
				<tr>
					                    
					<td>Name:</td>                     
					<td><form:input path="name" /></td>                 
				</tr>
				                
				<tr>
					                    
					<td>Category:</td>                     
					<td><form:input path="category" /></td>                 
				</tr>
				                
				<tr>
					                    
					<td>Details:</td>                     
					<td><form:input path="details" /></td>                 
				</tr>
				      
				<tr>               
					<td>Price:</td>                     
					<td><form:input path="price" /></td>                 
				</tr>
				 <tr>
                    <td>Quantity: </td>
                    <td><form:input path="qty" /></td>
                </tr>  
 <tr>
                    <td>Image: </td>
                    <td><form:input path="image" /></td>
                </tr>  				                   
				<tr>
					                    
					<td colspan="2"><input type="submit" value="Save"></td>
					                
				</tr>
				                                 
			</table>
        </form:form>
		    
	</div>


</body>
</html>