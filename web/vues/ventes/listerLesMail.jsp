<%-- 
    Document   : listerLesMails
    Created on : 10 sept. 2020, 16:36:22
    Author     : sio2
--%>

<%@page import="modele.Mail"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>LISTE LES MAILS POUR UNE CATEGORIE DE VENTE</title>
    </head>
    <body>
        <h1>LISTE DES MAILS POUR UNE CATEGORIE DE VENTE</h1>
         <%
        ArrayList<Mail> lesMail = (ArrayList)request.getAttribute("plesMail");
        %>
        <table  class="table table-bordered table-striped table-condensed">  
            <thead>
                <tr>             
                    <th>id</th>
                    <th>date</th>
                    <th>objet</th>
                    <th>corps</th>               
            <br>
            <br>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <%
                    for(int i = 0; i < lesMail.size();i++)
                    {
                        
                        Mail unMail = lesMail.get(i);
                        out.println("<tr><td>");
                        out.println(unMail.getId());
                        out.println("</a></td>");

                         out.println("<td>");
                         out.println(unMail.getDate());
                        out.println("</td>");

                        out.println("<td>");
                        out.println(unMail.getObjet());
                        out.println("</td>");
                        
                        out.println("<td>");
                        out.println(unMail.getCorps());
                        out.println("</td>");
                        
                      
                        
                        
                               
                    }
                    %>
                </tr>
            </tbody>
        </table>
    </body>
</html>
}
