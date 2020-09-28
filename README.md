
Sample command
https://github.com/making/rsc
java -jar rsc.jar --debug --data "Jason" --route string tcp://localhost:7070

java -jar rsc.jar --debug --stream --route flux tcp://localhost:7070


skaffold init --XXenableJibInit


Gothas:

Make sure maven .m2/settings.xml configured properly
Make sure JAVA_HOME set properly