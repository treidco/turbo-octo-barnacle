package config

import io.github.treidco.domain.Saying
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.shouldEqual

class SayingSpecs : Spek() {

    init{
        given("a saying") {
            val saying = Saying(123, "abcdefg")
            on("inspecting it's content") {
                val content = saying.content
                it("should return the expected 'abcdefg'"){
                    shouldEqual("abcdefg", content)
                }
            }
        }
    }



}