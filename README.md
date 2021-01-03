


## Currency Exchange Service 

<pre><code>
localhost:8000/currency-exchange/from/{from}/to/{to}
e.g. http://localhost:8000/currency-exchange/from/USD/to/INR
{
	"id": 10001,
	"from": "USD",
	"to": "INR",
	"conversionMultiple": 70,
	"port": 8000
}
</code></pre>

## Currency Calculation Service 

<pre><code>
localhost:8000/currency-converter/from/{from}/to/{to}/quantity/{quantity}
e.g. http://localhost:8100/currency-converter/from/USD/to/INR/quantity/5000
{
"id": 10001,
"from": "USD",
"to": "INR",
"conversionMultiple": 70,
"quantity": 5000,
"totalCalculatedAmount": 350000,
"port": 8000
}
</code></pre>


## Feign

<pre><code>
localhost:8100/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}
e.g. http://localhost:8100/currency-converter-feign/from/USD/to/INR/quantity/8000
{
"id": 10001,
"from": "USD",
"to": "INR",
"conversionMultiple": 70,
"quantity": 8000,
"totalCalculatedAmount": 560000,
"port": 8000
}
</code></pre>


## Ribbon

	<dependency>
	<groupId>org.springframework.cloud</groupId>
	<artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
	</dependency>
	
<pre><code>
SpringBootApplication - @EnableFeignClients
CurrencyExchangeProxy - @FeignClient(name = "currency-exchange-service")
CurrencyExchangeProxy - @RibbonClient(name = "currency-exchange-service")

application.properties - currency-exchange-service.ribbon.listOfServers
</code></pre>

## Eureka Naming Server

1. Create components for eureka naming server

	dependencies: eureka server, config client, devtools actuator
	annotations: @EnableEurekaServer
	
	application.properties:
	spring.application.name=netflix-eureka-naming-server
	server.port=8761

	eureka.client.register-with-eureka=false
	eureka.client.fetch-registry=false
	
2. Register all microservices with Eureka naming server

	a. Dependency to be added into client in all microservices
	
			<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
			</dependency>
			
	b. Annotation:
	
		@EnableDiscoveryClient
		
	c. application.properties:
			
			eureka.client.service-url.default-zone=http://localhost:8761/eureka

3. Configure Ribbon load balancer to connect to naming server



## Other References
https://github.com/piomin/sample-spring-cloud-microservices-future