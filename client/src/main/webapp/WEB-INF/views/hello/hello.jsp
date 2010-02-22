<%@page contentType="text/html;charset=UTF-8"%>
<%@page pageEncoding="UTF-8"%>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
	<META http-equiv="Content-Type" content="text/html;charset=UTF-8">
	<title>@Controller Example</title>
</head>	
<body>
<div>
	<h1>
		Hello World Web Service
	</h1>
	<div>	
		<form:form modelAttribute="hello" method="post">
		  	<fieldset>		
				<legend>Server Response</legend>
				<p>
					<form:label	for="result" path="result">Result</form:label><br/>
					<form:input path="result" readonly="true"/>		
				</p>
			</fieldset>
		  	<fieldset>		
				<legend>Client Parameter(s)</legend>
				<p>
					<form:label	for="name" path="name">Name</form:label><br/>
					<form:input path="name"/>		
				</p>
				<p>	
					<input type="submit" />
				</p>
			</fieldset>
		</form:form>
	</div>
</div>
</body>
</html>