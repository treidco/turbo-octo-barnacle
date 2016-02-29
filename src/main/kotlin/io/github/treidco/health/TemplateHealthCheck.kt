package io.github.treidco.health

import com.codahale.metrics.health.HealthCheck

class TemplateHealthCheck(val template: String) : HealthCheck() {
    override fun check(): Result {
        val saying = java.lang.String.format(template)
        if(!saying.contains("TEST")){
            return Result.unhealthy("Template doesn't contain a name")
        }
        return Result.healthy()
    }
}