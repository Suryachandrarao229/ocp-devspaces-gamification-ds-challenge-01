package org.acme;

import java.time.LocalDate;

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
//TODO: Return the String "Current Date=[2024-10-22]" by using proper date method
//Intellisence has to work
return "FIX ME With the TODO Instruction in code";

}

@Path("hello")
@GET
@Produces(MediaType.TEXT_PLAIN)
public String greet() {
return "Hello Challenge Attendees";}
}
