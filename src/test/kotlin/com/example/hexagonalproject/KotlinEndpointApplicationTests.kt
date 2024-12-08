package com.example.hexagonalproject

import com.intuit.karate.Runner
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


//@SpringBootTest(classes = [KotlinEndpointApplication::class])
class KotlinEndpointApplicationTests {

	@Test
	fun contextLoads() {

//        ServerConfig config = App.serverConfig("src/main/java/app");
//        HttpServer server = HttpServer.config(config).build();
		val baseUrl = "http://localhost:8080"
		val results =
			Runner.path("classpath:com/example/hexagonalproject/enol.feature") //                .systemProperty("url.base", "http://localhost:" + server.getPort())
				.systemProperty("url.base", baseUrl)
				.parallel(1)
		Assertions.assertEquals(0, results.failCount, results.errorMessages)

	}

}
