<jsp:useBean id="myBookBean"
             class="com.kaizen.Book"
             scope="session">
  <jsp:setProperty name="myBookBean" property="isbn"     value="439874359872"                      />
  <jsp:setProperty name="myBookBean" property="author" value="Bert Bates"                    />
  <jsp:setProperty name="myBookBean" property="title"  value="Head First Servlets and JSP, 2nd Edition" />
</jsp:useBean>

<html>
  <head><title>JavaBean usage - useBean and setProperty tags</title></head>
  <body>
    This page creates a JavaBean and prints the values.<P></P>
    <table border="1">
      <th>JavaBean property</th><th>Value</th>
      <tr><td>id</td>    <td><jsp:getProperty name="myBookBean" property="isbn"     /></td></tr>
      <tr><td>title</td> <td><jsp:getProperty name="myBookBean" property="title"  /></td></tr>
      <tr><td>author</td><td><jsp:getProperty name="myBookBean" property="author" /></td></tr>
    </table>


  </body>
</html>
    
