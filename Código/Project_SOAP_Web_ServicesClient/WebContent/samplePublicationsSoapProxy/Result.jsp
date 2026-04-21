<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="samplePublicationsSoapProxyid" scope="session" class="service.PublicationsSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
samplePublicationsSoapProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = samplePublicationsSoapProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        samplePublicationsSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        service.PublicationsSoap getPublicationsSoap10mtemp = samplePublicationsSoapProxyid.getPublicationsSoap();
if(getPublicationsSoap10mtemp == null){
%>
<%=getPublicationsSoap10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String name_1id=  request.getParameter("name18");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String[] getResearcherPublications15mtemp = samplePublicationsSoapProxyid.getResearcherPublications(name_1idTemp);
if(getResearcherPublications15mtemp == null){
%>
<%=getResearcherPublications15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getResearcherPublications15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getResearcherPublications15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 20:
        gotMethod = true;
        String title_2id=  request.getParameter("title23");
            java.lang.String title_2idTemp = null;
        if(!title_2id.equals("")){
         title_2idTemp  = title_2id;
        }
        java.lang.String[] getSpecificPublication20mtemp = samplePublicationsSoapProxyid.getSpecificPublication(title_2idTemp);
if(getSpecificPublication20mtemp == null){
%>
<%=getSpecificPublication20mtemp %>
<%
}else{
        String tempreturnp21 = null;
        if(getSpecificPublication20mtemp != null){
        java.util.List listreturnp21= java.util.Arrays.asList(getSpecificPublication20mtemp);
        tempreturnp21 = listreturnp21.toString();
        }
        %>
        <%=tempreturnp21%>
        <%
}
break;
case 25:
        gotMethod = true;
        java.lang.String[] getPublications25mtemp = samplePublicationsSoapProxyid.getPublications();
if(getPublications25mtemp == null){
%>
<%=getPublications25mtemp %>
<%
}else{
        String tempreturnp26 = null;
        if(getPublications25mtemp != null){
        java.util.List listreturnp26= java.util.Arrays.asList(getPublications25mtemp);
        tempreturnp26 = listreturnp26.toString();
        }
        %>
        <%=tempreturnp26%>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>