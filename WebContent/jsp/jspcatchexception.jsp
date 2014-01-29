
<HTML>
    <HEAD>
        <TITLE>Using a try/catch Block</TITLE>
    </HEAD>

    <BODY>
        <H1>Using a try/catch Block</H1>
    <%
        try{
            int i = 1;
            i = i / 0;
            out.println("The answer is " + i);
        }
        catch (Exception e){
            out.println("An exception occurred: " + e.getMessage());
        }
    %>
    </BODY>
</HTML>
