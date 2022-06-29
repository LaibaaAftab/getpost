package com.example.integapachi;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/HelloResource")
public class HelloResource {
    @GET
    @Path("/getMarks")
    public Response getMarks()
    {
        Student student = new Student();
        student.setid("bsef524");
        student.setfname("Laiba");
        student.setsname("Aftab");
        student.seteng(37);
        student.setmaths(100);
        student = student.addMarks(student);
        return Response.ok(student).build();
    }

    @POST
    @Path("/setMarks")
    public Response setMarks(@QueryParam("eng") String English,
                             @QueryParam("maths") String Maths)
    {
        Student st = new Student();
        st.setsname("Laiba");
        st.setsname("Aftab");
        st.setid("1234");
        st.addMarkss(Integer.parseInt(English),Integer.parseInt(Maths));
        return Response.ok(st).build();
    }
    @Produces("text/plain")
    public String hello(){
        return "Hello, World!";
    }

    @POST
    @Path("/{name}")
    @Produces("text/plain")
    public String customWelcome(@PathParam("name") String name) {
        return "Welcome " + name + "!";
    }
}