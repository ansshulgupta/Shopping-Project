<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />


<%-- ${contextRoot} says - ${greeting} --%>


<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Shopping Project - ${title}</title>

<script type="text/javascript">
	window.menu = "${title}";
</script>


<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">
		<!-- Navigation comes here-->

		<%@include file="./shared/navbar.jsp"%>

		<div class="content">

			<!-- Page Content comes here -->

			<c:if test="${userClickHome==true }">
				<%@include file="home.jsp"%>
			</c:if>

			<!--   about page comes here -->

			<c:if test="${userClickAbout==true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!--   contact page comes here -->

			<c:if test="${userClickContact==true }">
				<%@include file="contact.jsp"%>
			</c:if>
			
			<!--Load only when user clicks products -->

			<c:if test="${userClickAllProducts==true  or userClickCategoryProducts==true}">
				<%@include file="listProducts.jsp"%>
			</c:if>



		</div>

		<!-- Footer comes here-->
		<%@include file="./shared/footer.jsp"%>

	</div>
	
	<!-- Bootstrap core JavaScript -->
	<script src="${js}/jquery.js"></script>

	<!--  self coded java script -->
	<script src="${js}/myapp.js"></script>

	<!--    bootstrap core java script -->
	<script src="${js}/bootstrap.bundle.min.js"></script>



</body>

</html>






