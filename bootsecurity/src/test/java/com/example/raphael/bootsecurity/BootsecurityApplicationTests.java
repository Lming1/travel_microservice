package com.example.raphael.bootsecurity;

import org.codehaus.jackson.JsonProcessingException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.DefaultOAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class BootsecurityApplicationTests {


    // 권한 미부여 Test
    @Test
    public void testApp() throws JsonProcessingException, IOException {
        RestTemplate restTemplate = new RestTemplate();
        Greet body = restTemplate.getForObject("http://localhost:8080", Greet.class);
        assertThat("Hello World!".equals(body.getMessage()));
    }


    @Test
    public void testOauthService() {
        ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails();
        resource.setUsername("guest");
        resource.setPassword("guest123");
        resource.setAccessTokenUri("http://localhost:8080/oauth/token");
        resource.setClientId("foo");
        resource.setClientSecret("bar");
        resource.setGrantType("password");
        resource.setScope(Arrays.asList(new String[]{"read", "write", "trust"}));

        DefaultOAuth2ClientContext clientContext = new DefaultOAuth2ClientContext();
        OAuth2RestTemplate restTemplate = new OAuth2RestTemplate(resource, clientContext);
        Greet greet = restTemplate.getForObject("http://localhost:8080", Greet.class);
        Assert.assertEquals("Hello World!", greet.getMessage());

    }


}

