<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="java.util.Arrays"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Publications</title>
</head>
<body>


	<jsp:useBean id="samplePublicationsSoapProxyid" scope="session"
		class="service.PublicationsSoapProxy" />
	<%
		String[] s = samplePublicationsSoapProxyid.getPublications();
		ArrayList<String> wordList = new ArrayList<>();
		wordList = new ArrayList<String>(Arrays.asList(s));
		int i = 0;
		int j = 0;
		int numberResearchers;
	%>
	  <%  for(i = 0; i < wordList.size(); ++i) { %>
	   			<h2>Publication <%=wordList.get(i)%> <%++i;%> </h2>
	   			<br>
	   			<b>Title:</b> <%=wordList.get(i)%> <%++i;%>
	   			<br>
	   			<b>Date:</b> <%=wordList.get(i)%> <%++i;%>
	   			<br>
	   			<b>DOI:</b> <%=wordList.get(i)%> <%++i;%>
	   			<br>
	   			<b>Source:</b> <%=wordList.get(i)%> <%++i;%>
	   			<br>
	   			<b>Project:</b> <%=wordList.get(i)%> <%++i;%>
	   			<br>
	   			<br>
	   			============================================================================================================================
	   			<br>
	   			<b>Abstract:</b> <%=wordList.get(i)%> <%++i;%>
	   			<br>
	   			============================================================================================================================		
	   			<br>
	   			<br>
	   			<%numberResearchers = Integer.parseInt(wordList.get(i)); ++i; %>
	   			<b>Researcher(s):</b>
	   			<%  for(j = 0; j < numberResearchers; ++j, ++i) { %>
			   		<%=wordList.get(i)%>;
			   			
			  	<% } %>
			  	<br>
			  	<br>
			  	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			  	<br>
			  	<br>
			  <% --i;%>
	  <% } %>

</body>
</html>
