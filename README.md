**HOW TO USE**

1. Ensure that you have Maven 3.X installed
2. Ensure that you have Java 8 installed
3. Ensure that you have CURL rest client installed (for test)
4. Run the following commands: 
- `cd ${workspace} `
- `mvn clean package`
- `java -jar target/hello-world.jar`

6. Health check

- `curl -v -X GET http://localhost:9000/health`

7. To test your app, type these CURL commands:

- `curl -v -H "Content-Type: application/json" -X POST -d {\"id\":\"123\",\"label\":\"123\"} http://localhos
        t:9000/api/v1/hello/arg
`

8. Swagger UI: pase this link into your browser

- `http://localhost:9000/swagger-ui.html`




