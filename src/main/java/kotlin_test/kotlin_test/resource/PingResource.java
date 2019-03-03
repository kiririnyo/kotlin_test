package kotlin_test.kotlin_test.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import kotlin_test.kotlin_test.constant.ContentType;

@Path("/java/ping")
public class PingResource {

	@GET
	@Produces(ContentType.TEXT_PLAIN)
	public Response ping() {
		return Response.ok().entity("pong").build();
	}
}
