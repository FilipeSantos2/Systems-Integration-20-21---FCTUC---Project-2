Consideramos que esteja a utilizar o servidor Wildfly nos passos seguintes.
Todos os projetos de seguida mencionados foram feitos com a versão 1.8 do compilador java. Ao carregar os projetos, certifique-se que tem esta versão para evitar erros de compatibilidade.

Como correr o projeto:
	- Loader
		- Alterar as configurações do persistence.xml para indicar qual a base de dados onde deve criar as tabelas (Neste projeto foi utilizada outra para além do default postgres).
		- Para correr qualquer aplicação basta fazer run as java application.
			- Antes de adicionar os dados, corra o DeleteData.java para garantir que a inserção não tem problemas.

	- Serviços
		- No ficheiro standalone-full do wildfly, altere a base de dados que deve ser utilizada pela aplicação, para a mesma do loader.
		- Após ligar o servidor, faça run on server no projeto "Project_EAR". Isto adiciona automaticamente os projetos de EJB (Project_EJB), REST (Project_REST) e SOAP (Project_SOAP_Web_Services).
		- De seguida, corra o projeto "Project_SOAP_Web_ServicesClientEAR" no servidor. Na janela que abre, adicione A/WebFrontEnd.jsp ao endereço superior para testar a objetivo f).
		- Para correr o cliente (Project_Client) basta fazer run as java application na classe desse projeto. Os comandos e respetivos resultados aparecem na linha de comandos, sendo que o input deve também ser feito por aí.