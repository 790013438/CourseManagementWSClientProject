Inspecting SOAP messages
===============
  Although you don't necessarily need to understand the SOAP messages passed between the web service and the client, sometimes, looking at the SOAP messages exchanged between the two could help debug some of the issues.  You can print the request and response SOAP messages when running the client quite easily by setting the following system property:

```java
com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump=true
```

```java
-Dcom.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump=true
```