<%@ page errorPage="errorpage.jsp" %>
<HTML>
<HEAD><TITLE> Simple error testing </TITLE></HEAD>
<BODY>
<%! 
   String nullString = null;
%>
<%-- Intentionally invoking a NullPointerException --%>
The length of the nullString is <%= nullString.length() %>
</BODY>
</HTML>