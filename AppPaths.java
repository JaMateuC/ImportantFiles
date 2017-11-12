package Program;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/json")

public class JSONService {
    @GET
    @Path("/got/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public int getTrack(@PathParam("id") int id) {
        return 0;
    }

    @POST
    @Path("/new")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newTrack(int track) {
        return Response.status(201).entity("Track added in position").build();
    }

}