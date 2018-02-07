package se.felth.payarapathbug;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("test2")
public class Test2Resource {
    @GET
    @Path("{id: \\w+}")
    public String get2(@PathParam("id") String id) {
        return "hello world " + id;
    }
    
    @OPTIONS
    @Path("{id: \\w+}")
    public String options(@PathParam("id") String id) {
        return "options " + id;
    }
}
