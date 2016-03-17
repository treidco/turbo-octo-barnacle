package io.github.treidco.domain

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length

data class Info(@JsonProperty @Length(max = 20) val content: String)