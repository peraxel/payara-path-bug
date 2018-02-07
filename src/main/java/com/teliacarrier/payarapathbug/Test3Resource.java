/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teliacarrier.payarapathbug;

import javax.ws.rs.GET;
import javax.ws.rs.OPTIONS;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author jnj112
 */
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
