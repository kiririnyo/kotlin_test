package kotlin_test.kotlin_test.core;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/")
public class ApplicationCore extends ResourceConfig {

	private static final String BATH_PATH = "kotlin_test.kotlin_test";
	private static final String RESOURCE_PATH = BATH_PATH + ".resource";

	public ApplicationCore() {
		packages(RESOURCE_PATH);
	}

}
