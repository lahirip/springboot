# springboot
Shows how we can create a service using Spring Boot and then make it register w/ service registry.

Then consume the service via Edge service with fail over mechanism in place.


**Service Discovery**

As discussed in the original post we need a standard mechanism for Service to Service calls.  A service needs to discover another service that it wants to use, also wants to make itself discoverable. We can think of several possible solutions here:
1. IP address based  - What happens that service goes down that IP becomes null and void. In cloud instantness or nodes are ephemeral so this does not work well.
2. LoadBalancer controlled Routing: 
    Data Sharding
    Data locality
    Multi tenancy 
    Controls the load balancing strategy
    RoundBobin
    Sticky Session
    LRU
3. Can we use DNS:  For open web DNS is good but not for Service to Service calls.  It can’t tell you that if the service is alive. Avoid DNS for service to service calls.  
4. Service Registry: That  provides more advanced control that will know the state of the service as well.    
There are several Registry implementations available (Consul, Zookeeper, Eureka) In this example we built a Service Registry using Netflix's Eureka Service. 



