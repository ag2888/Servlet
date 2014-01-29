<%@ page errorPage="errorpage.jsp" %>
<html>
  <head>
    <title>UseSession</title>
  </head>
  <body>
    <%
    Integer count;
      if ( session.getAttribute("COUNT") == null ) {
      
        count = new Integer(1);
        session.setAttribute("COUNT", count);
      }
      else {
        count = (Integer)session.getAttribute("COUNT");
        count = new Integer(count.intValue() + 1);
        session.setAttribute("COUNT", count);
      }  
      out.println("<b>You have visited this site: "
        + count + " times.</b>");
    %>
  </body>
</html>