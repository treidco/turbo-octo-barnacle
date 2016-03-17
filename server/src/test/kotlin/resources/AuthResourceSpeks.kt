package resources

import io.github.treidco.config.AppConfiguration
import io.github.treidco.resources.AuthResource
import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.shouldEqual

class AuthResourceSpeks() : Spek() {

    val testConfig = AppConfiguration()

    init {
        given("an info object") {
            val authResource = AuthResource("https://test.com/base", testConfig.basePubAPIUri)
            on("inspecting it's info") {
                val info = authResource.getInfo()
                val content = info.content
                it("should return the expected 'OK'") {
                    shouldEqual("OK", content)
                }
            }
        }
    }

}