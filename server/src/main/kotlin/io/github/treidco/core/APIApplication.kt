package io.github.treidco.core

import io.github.treidco.config.AppConfiguration
import io.github.treidco.health.TemplateHealthCheck
import io.dropwizard.Application
import io.dropwizard.setup.Environment
import io.github.treidco.resources.AuthResource
import io.github.treidco.resources.HelloWorldResource

class APIApplication() : Application<AppConfiguration>() {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) = APIApplication().run(*args)
    }



    override fun run(config: AppConfiguration, env: Environment) {

        val hwHealthCheck = TemplateHealthCheck(config.template)
        val hwResource = HelloWorldResource(config.template, config.defaultName)

        val auth = AuthResource(config.baseAPIUri, config.basePubAPIUri)

        env.healthChecks().register("template", hwHealthCheck)
        env.jersey().register(hwResource)

        env.jersey().register(auth)
    }
}