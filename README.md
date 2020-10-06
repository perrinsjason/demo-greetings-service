
Sample command
https://github.com/making/rsc
java -jar rsc.jar --debug --data "Jason" --route string tcp://localhost:7070

java -jar rsc.jar --debug --stream --route flux tcp://localhost:7070


skaffold init --XXenableJibInit
In this quickstart, you will:

Install Skaffold, and download a sample go app,
Use skaffold dev to build and deploy your app every time your code changes,
Use skaffold run to build and deploy your app once, similar to a CI/CD pipeline

Gothas:

Make sure maven .m2/settings.xml configured properly
Make sure JAVA_HOME set properly

itsio

https://istio.io/latest/docs/setup/getting-started/
istioctl analyze