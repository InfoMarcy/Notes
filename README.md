Deploy an angular APP On Tomcat Web Server: 

	1.	Run => ng build --prod --base-href=/<my-angular-app-folder>/
  Este hace un bundle de la aplicación y reduce el tamaño de los archivos que se van a desplegar en producción  
  y crea una carpeta llamada dist con los archivos listo para ser desplegados en el servidor.
	
  
  Copiar todos los archivos contenidos en la carpeta de  dist  
  y pegarlas en la carpeta my-angular-app-folder que debe de estar contenida dentro de la capeta  webapps en tomcat WebServer
  
 To view the angular App on the browser =>  http://tomcatBaseURL/my-angular-app-folder/index.html 
