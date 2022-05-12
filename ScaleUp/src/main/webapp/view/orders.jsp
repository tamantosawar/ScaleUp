<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<div align="center">

	<h1 style="fontstyle: 'bold''">Orders</h1>
		<table border="1" cellpadding="5">
		${listOrders}
		<tr>

			<th>OrderId</th>
			<th>Categoryname</th>
			<th>Customer ID</th>
			<th>Deliver Address</th>
			<th>Details</th>
			<th>image</th>
			<th>Merchant Id</th>
			<th>Order Date</th>
			<th>Price</th>
			<th>Product ID</th>
			<th>Product Name</th>
			<th>Quantity</th>
			<th>Total Quantity</th>
			<th>Total Price</th>
			<th>Status</th>


		</tr>
		<c:forEach items="${listOrders}" var="orders">
			<tr>
				<td>${orders.orderid}</td>
				<td>${orders.category_name}</td>
				<td>${orders.customer_id}</td>
				<td>${orders.deliver_address}</td>
				<td>${orders.details}</td>
				<td><img src="${orders.image}"></td>
				<td>${orders.Merchant_id}</td>
				<td>${orders.order_date}</td>
				<td>${orders.price}</td>
				<td>${orders.product_id}</td>
				<td>${orders.product_name}</td>
				<td>${orders.qty}</td>
				<td>${orders.total_quantity}</td>
				<td>${orders.total_price}</td>
				<td><a href="/delete?id=${orders.order_id}">Delivered</a></td>
			</tr>
		</c:forEach>
	</table>
	<br>
</div>
