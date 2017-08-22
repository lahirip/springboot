The Edge service

**Responsibilities**:
1. Acts as an adapter to the actual service. It uses Zuul Micro Proxy.
2. WE want to make our client Web UI to talk to our service.  So we want to have an intermediary to talk to to find the service they want to use.
3. It used Feign cleint.
4. It uses Hystrix as circuit breaker.



