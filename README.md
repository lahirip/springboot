# springboot
Shows how we can create a service using Spring Boot and then make it register w/ service registry.

Then consume the service via Edge service with fail over mechanism in place.


**Service Discovery**

self‑registration pattern - as discussed in the original post we need a standard mechanism for Service to Service calls.  A service needs to discover another service that it wants to use, also wants to make itself discoverable. We can think of several possible solutions here:
1. IP address based  - traditional applications running on physical hardware, network locations can be static. Code can read the network locations from a configuration file. What happens that service goes down that IP becomes null and void. In cloud instantness or nodes are ephemeral so this does not work well.
2. Can we use DNS:  For open web DNS is good but not for Service to Service calls.  It can’t tell you that if the service is alive. Avoid DNS for service to service calls.  
3. Service Registry: That  provides more advanced control that will know the state of the service as well.    
There are several Registry implementations available (Consul, Zookeeper, Eureka) In this example we built a Service Registry using Netflix's Eureka Service. 

    - This can be broken down in two categories 
        - Client Side Discovery:  In this case client has to be aware of the Service Registry.  This example uses this pattern. 
        - Server Side Discovery:  In this case client does not have to know about the Service Registry. All requests comes via LB and LB talks to the Service Registry.



