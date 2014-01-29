<%!
  String name = "Mark";
  String date = "28th April, 2004";

  private String getName()
  {
    return "Rosy";
  }
%>
<HTML>
  <TITLE>JSP Declaration Example</TITLE>
  <BODY>
    This page was last modified on <%= date %> by <%= name %> <%= getName() %> .
  </BODY>
</HTML>