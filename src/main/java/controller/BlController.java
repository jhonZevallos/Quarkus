package controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import service.BlService;

@Path("/bl")
public class BlController {

    @Inject
    private BlService blService;

    @GET
    @Path("/getBl/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBl(@PathParam("id") Long id) {
        return Response.ok(blService.findById(id)).build();
    }

    @GET
    @Path("/listBl")
    @Produces(MediaType.APPLICATION_JSON)
    public Response listBl() {
        return Response.ok(blService.listAll()).build();
    }
}
