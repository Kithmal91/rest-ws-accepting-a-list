package com.cookiecodelabs.kithmal.demo;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Main Application
 * Created by Kithmal on 9/7/2016.
 */
public class RequestInvoker {

    public static void main(String[] args) {

        Client client = Client.create();
        WebResource webResource = client.resource("http://localhost:8080/rest-ws-test-invoker/miscellaneous-resource/list")
                .queryParam("values", "String One")
                .queryParam("values", "String Two")
                .queryParam("values", "String Three")
                .queryParam("values", "String Four")
                .queryParam("values", "String Five");
        ClientResponse response = webResource.type("application/json").get(ClientResponse.class);

        System.out.println(response.getEntity(String.class));
    }
}
