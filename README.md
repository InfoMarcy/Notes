Deploy an angular APP On Tomcat Web Server: 

	1.	Run => ng build --prod --base-href=/<my-angular-app-folder>/
  Este hace un bundle de la aplicación y reduce el tamaño de los archivos que se van a desplegar en producción  
  y crea una carpeta llamada dist con los archivos listo para ser desplegados en el servidor.
	
  
  Copiar todos los archivos contenidos en la carpeta de  dist  
  y pegarlas en la carpeta my-angular-app-folder que debe de estar contenida dentro de la capeta  webapps en tomcat WebServer
  
 To view the angular App on the browser =>  http://tomcatBaseURL/my-angular-app-folder/index.html 


Install TOMCAT
https://www.dev2qa.com/how-to-install-tomcat-in-macos/

Download tomcat install package from https://tomcat.apache.org/download-90.cgi page. You can select zip file or tar.gz file.
After download, unzip the compress file to a local directory.
Run cd go to the unzip file directory.
Then run below command to make the .sh file executable.
sh-3.2# cd /Users/zhaosong/Documents/WorkSpace/tool/apache-tomcat-9.0.8

sh-3.2# sudo chmod +x ./bin/*.sh

Now all the .sh file in tomcat bin directory is executable, you can run ls -al command to see that.
now run ./bin/startup.sh to start tomcat. When you see below message, it means tomcat has been started successfully.
sh-3.2# ./bin/startup.sh 


Using CATALINA_BASE:   /Users/zhaosong/Documents/WorkSpace/tool/apache-tomcat-9.0.8
Using CATALINA_HOME:   /Users/zhaosong/Documents/WorkSpace/tool/apache-tomcat-9.0.8
Using CATALINA_TMPDIR: /Users/zhaosong/Documents/WorkSpace/tool/apache-tomcat-9.0.8/temp
Using JRE_HOME:        /Library/Java/JavaVirtualMachines/jdk1.8.0_172.jdk/Contents/Home
Using CLASSPATH:       /Users/zhaosong/Documents/WorkSpace/tool/apache-tomcat-9.0.8/bin/bootstrap.jar:/Users/zhaosong/Documents/WorkSpace/tool/apache-tomcat-9.0.8/bin/tomcat-juli.jar
Tomcat started.
Now open a web browser, input http://localhost:8080/ in the url address input box. Click enter then you can see below web page.
