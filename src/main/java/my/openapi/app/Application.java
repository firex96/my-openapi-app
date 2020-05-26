package my.openapi.app;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;

@OpenAPIDefinition(
        info = @Info(
                title = "Hello World",
                version = "0.1", //not work : "${openapi.version}",
                description = "${openapi.description}",
                license = @License(name = "Apache 2.0", url = "http://carrotins.com"),
                contact = @Contact(url = "http://carrotins.com", name = "Rex", email = "rex@carrotins.com")
        )
)
public class Application {
    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}