package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebIntegrationTest(randomPort = true)
public class ApplicationTests {

    @Value("${local.server.port}")
    int port;

    @Test
    public void home() {
        RestTemplate restTemplate = new RestTemplate();
        String content = restTemplate.getForObject("http://localhost:" + port + "/", String.class);
        System.out.println(content);
        assertThat(content, is("Hello!!"));
    }

}
