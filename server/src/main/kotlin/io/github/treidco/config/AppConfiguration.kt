package io.github.treidco.config

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration

class AppConfiguration() : Configuration() {

    @JsonProperty("template")
    var template: String = ""

    @JsonProperty("defaultName")
    var defaultName: String = "Stranger"

    @JsonProperty("baseAPIUri")
    var baseAPIUri: String = "https://test.com/base"

    @JsonProperty("basePubAPIUri")
    var basePubAPIUri: String = "https://test.com/pubbase"

}