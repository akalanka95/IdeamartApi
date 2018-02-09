Ideamart SMS API - JAVA
=========================
  Dialog Ideamart is a platform presented by Dialog Axiata PLC to developers and content providers to use the Dialog network based features via shared APIs.
Using the  ideamart SMS Java API here you can recieve messages, send messages to a address, list of addresses or a broadcast message.
To get started you need to first visit Ideamart  where you can find all the resources in the Ideamart List which includes
  * Ideamart Developer Bundle
  * Ideamart Simulator
  * API Guide
  * In-APP Java SDK
  
Dependencies
=============
  The only dependencies that is required to add is
      1. sdp.app.api-<latest-version>.jar [Ex –sdp.app.api-1.0.144.jar]
      2. Gson-1.7.1.jar
  Or you can add  the google-gson ja and sdp.app.api-<latest-version>.jar file into your tomcat lib folder or your web container lib folder(it depends upon what you are using as a web container) . You will find those jar files when you download the ideamart developer bundle.

Installing Simulator
=====================
  Ideamart Simulator is a simulator used to simulate ideamart apps. Following are the software requirements need to install the ideamart simulator.
    Java version 1.6.0 or upper
  This will guide you to set up the simulator. Start up Simulator.
In simulation you can use any app id and password. In production app id and password will be provided when the app is be provisioned in Ideamart.
Production Server URLs
  * HTTP - http://api.dialog.lk:8080/sms/send
  * HTTPS - https://api.dialog.lk/sms/send
  * Simulator Server URL HTTP -http://localhost:7000/sms/send

See Ideamart SMS-API for more details .

