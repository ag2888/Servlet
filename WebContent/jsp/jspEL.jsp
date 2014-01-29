<jsp:useBean id="person" class="com.java2s.Person" scope="request" />
<html>
<body>
    <h1>EL and Complex JavaBeans</h1>
    <table border="1">
      <tr>
        <td>${person.name}</td>
        <td>${person.age}</td>
        <td>${person["address"].line1}</td>
        <td>${person["address"].town}</td>
        <td>${person.address.phoneNumbers[0].std} ${person.address.phoneNumbers[0].number}</td>
        <td>${person.address.phoneNumbers[1].std} ${person.address.phoneNumbers[1].number}</td>
      </tr>    

      
  
    </table>
    
    
  </body>

</html>

