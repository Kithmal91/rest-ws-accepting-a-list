package com.cookiecodelabs.kithmal.demo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by Kithmal on 9/7/2016.
 */
@Path("/miscellaneous-resource")
public class MiscellaneousResource {

    @GET
    @Path("/list")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStringList(@QueryParam("values") final List<String> stringList) {

        int i = 1;
        for (String str : stringList) {
            System.out.println("count : " + i);
            System.out.println("string : " + str);
            i++;
        }
        return Response.ok(200).build();
    }
}
