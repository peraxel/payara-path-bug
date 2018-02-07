package se.felth.payarapathbug;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("test3")
public class Test3Resource {
    @GET
    @Path("{id}")
    public String get2(@PathParam("id") String id) {
        return "hello world " + id;
    }
    
    @OPTIONS
    @Path("{id}")
    public String options(@PathParam("id") String id) {
        return "options " + id;
    }
}
