package io.github.treidco.domain

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length

data class Saying(@JsonProperty val id: Long, @JsonProperty @Length(max = 3) val content: String)