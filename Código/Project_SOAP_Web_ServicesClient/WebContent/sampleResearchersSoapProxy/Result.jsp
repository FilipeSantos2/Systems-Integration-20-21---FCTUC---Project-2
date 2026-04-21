<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleResearchersSoapProxyid" scope="session" class="service.ResearchersSoapProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleResearchersSoapProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleResearchersSoapProxyid.getEndpoint();
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
        sampleResearchersSoapProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        service.ResearchersSoap getResearchersSoap10mtemp = sampleResearchersSoapProxyid.getResearchersSoap();
if(getResearchersSoap10mtemp == null){
%>
<%=getResearchersSoap10mtemp %>
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
        java.lang.String[] getSpecificResearcher15mtemp = sampleResearchersSoapProxyid.getSpecificResearcher(name_1idTemp);
if(getSpecificResearcher15mtemp == null){
%>
<%=getSpecificResearcher15mtemp %>
<%
}else{
        String tempreturnp16 = null;
        if(getSpecificResearcher15mtemp != null){
        java.util.List listreturnp16= java.util.Arrays.asList(getSpecificResearcher15mtemp);
        tempreturnp16 = listreturnp16.toString();
        }
        %>
        <%=tempreturnp16%>
        <%
}
break;
case 20:
        gotMethod = true;
        java.lang.String[] getResearchers20mtemp = sampleResearchersSoapProxyid.getResearchers();
if(getResearchers20mtemp == null){
%>
<%=getResearchers20mtemp %>
<%
}else{
        String tempreturnp21 = null;
        if(getResearchers20mtemp != null){
        java.util.List listreturnp21= java.util.Arrays.asList(getResearchers20mtemp);
        tempreturnp21 = listreturnp21.toString();
        }
        %>
        <%=tempreturnp21%>
        <%
}
break;
case 23:
        gotMethod = true;
        String skill_2id=  request.getParameter("skill26");
            java.lang.String skill_2idTemp = null;
        if(!skill_2id.equals("")){
         skill_2idTemp  = skill_2id;
        }
        java.lang.String[] getSkillOwners23mtemp = sampleResearchersSoapProxyid.getSkillOwners(skill_2idTemp);
if(getSkillOwners23mtemp == null){
%>
<%=getSkillOwners23mtemp %>
<%
}else{
        String tempreturnp24 = null;
        if(getSkillOwners23mtemp != null){
        java.util.List listreturnp24= java.util.Arrays.asList(getSkillOwners23mtemp);
        tempreturnp24 = listreturnp24.toString();
        }
        %>
        <%=tempreturnp24%>
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