<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  		<a href="index.jsp">HOME</a>&nbsp;
  		<a href="index.jsp">BACK</a><br><br>
        <h1>Add New Customer</h1>  
       <form:form method="post" action="save1">    
        <table >    
         <tr>    
          <td>Id : </td>   
          <td><form:input path="id"/></td>  
         </tr>    
         <tr>    
          <td>Name :</td>    
          <td><form:input path="name" /></td>  
         </tr>   
         <tr>    
         <td> </td>    
          <td><input type="submit" value="Save" /></td>    
         </tr>    
        </table>    
       </form:form>    