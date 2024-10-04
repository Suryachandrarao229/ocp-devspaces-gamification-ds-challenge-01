package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/api")
public class DateResource {

//TO DO :: Fix Me
@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("currentdate")
public String getCurrentDate() {
return "TODO : Fix Me to Return Current Date. Use a Variable with telesense working";
}

@Path("hello")
@GET
@Produces(MediaType.TEXT_PLAIN)
public String greet() {
return "Hello Challenge Attendees";}
}
