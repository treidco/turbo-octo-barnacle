package io.github.treidco.resources

import com.codahale.metrics.annotation.Timed
import io.github.treidco.domain.Info
import javax.ws.rs.*
import javax.ws.rs.core.MediaType

@Path("auth")
@Produces(MediaType.APPLICATION_JSON)
class AuthResource(val baseUri: String, basePubAPIUri: String) {

    @Timed
    @GET
    fun getInfo(): Info {
       return if(baseUri.isNotEmpty()) Info("OK") else Info("Yikes")
    }

}