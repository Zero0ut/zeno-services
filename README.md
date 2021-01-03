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

<pre><code>
http://localhost:8100/currency-converter/from/USD/to/INR/quantity/5000
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
