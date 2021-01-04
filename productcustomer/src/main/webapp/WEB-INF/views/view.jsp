<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
   <h1>                    Customer And Product List</h1> <br>  
  <html>
  <body>
<h1>Customer List</h1>  
<table border="2" width="60%" cellpadding="2">  
<tr><th>Id</th><th>Name</th></tr>  
   <c:forEach var="customer" items="${list1}">   
   <tr>  
   <td>${customer.id}</td>  
   <td>${customer.name}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   &nbsp; 
   
   <h1>Product List</h1>  
<table border="2" width="60%" cellpadding="2" height=>  
<tr><th>Id</th><th>Userid</th><th>Name</th></tr>  
   <c:forEach var="product" items="${list2}">   
   <tr>  
   <td>${product.id}</td>  
   <td>${product.userid}</td>  
   <td>${product.name}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   </body>
   </html>
   <br/>
   <a href="customerform">Add New Customer</a>  