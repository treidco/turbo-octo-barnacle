package io.github.treidco.resources

import com.codahale.metrics.annotation.Timed
import com.google.common.base.Optional
import io.github.treidco.domain.Saying
import java.util.concurrent.atomic.AtomicLong
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource(val template:String, val defaultName: String) {

    var counter = AtomicLong();

    @Timed
    @GET
    fun sayHello(@QueryParam("name") name: Optional<String>): Saying {

        val value = java.lang.String.format(template, name.or(defaultName))
        return Saying(counter.incrementAndGet(), value)

    }

}