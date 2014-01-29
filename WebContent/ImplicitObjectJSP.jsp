<%@ page errorPage = "FirstJSP.jsp"%>
<%@ page isELIgnored ="true" %>
<html>
<head>
<title>Use Session</title>
</head>

<body>
<% Integer count;
	//Integer.parseInt("ABC");

   if(session.getAttribute("COUNT")== null) {
	   count = new Integer(1);
   
   session.setAttribute("COUNT",count); 
   } else { 
	   	count = (Integer)session.getAttribute("COUNT");
	   	count = new Integer(count.intValue() + 1);
	   	session.setAttribute("COUNT",count); 
   }
   out.println("<b> You have visited this site:" + count + "times.</b>");





%>
Query String is : ${pageContext.request.queryString}
</body>
</html>