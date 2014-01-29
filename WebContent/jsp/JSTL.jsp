<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

	<c:out value="${2 * 3}" /><br>
	<c:out value="${pageContext.request.queryString}"/><br>
	<c:set var="varcount" scope="session" value="${120}"/>
	<c:if test="${varcount > 100}">
		   <p>100 Count reached. Count value is : <c:out value="${varcount}"/><p>
	</c:if><br>
	
	       <c:set var="balance" value="120000.2309" /> 
           <p>Formatted Number (3):
           <fmt:formatNumber type="number" maxFractionDigits="3" value="${balance}" /></p>
	
		<c:set var="string1" value="This is first String."/>
	<c:set var="string2" value="This is test string and second String.</abc>"/>
	<p>Index (1) : ${fn:indexOf(string1, "first")}</p><br>
	<p>Index (2) : ${fn:indexOf(string2, "second")}</p><br>
	<c:set var="string1" value="This is first String."/>
	<c:set var="string2" value="${fn:toUpperCase(string1)}" />
	<p>String  is: ${string2}</p>
	