<%@ page %>

<html>
    <body>
        <h1 align="center">Session cycle page</h1>

        <p>
        At <% out.println(request.getAttribute("name")); %>

        <p>
        Got number value <%
            Object attribute = session.getAttribute("number");
            Integer number = (attribute instanceof Integer) ? (Integer)attribute : Integer.MAX_VALUE;
            out.println(number);
        %>
        
        <br>
        <br>

        <form action="CycleOne.do">
            <input type="SUBMIT" value="CycleOne" />
        </form>
        <form action="CycleTwo.do">
            <input type="SUBMIT" value="CycleTwo" />
        </form>
    </body>
</html>
