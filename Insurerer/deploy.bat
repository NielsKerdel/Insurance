:: BUILD

::cd shared
::mvn clean compile assembly:single
::cd ..
::cd server
::mvn clean compile assembly:single
::cd ..

xcopy server\target\server-1.0-SNAPSHOT-jar-with-dependencies.jar C:\xampp\htdocs\classes\ /y
xcopy client\target\client-1.0-SNAPSHOT.jar C:\xampp\htdocs\classes\ /y
xcopy shared\target\shared-1.0-SNAPSHOT-jar-with-dependencies.jar C:\xampp\htdocs\classes\ /y
pause

confuego