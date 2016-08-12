package hatanas.browser

import scalafx.Includes._
import scalafx.scene.web.{WebEngine, WebView}
import scalafxml.core.macros.sfxml


trait BrowserControllerInitializable {
    def initialize(url: String): Unit
}


@sfxml
class BrowserController (
    private val web: WebView
) extends BrowserControllerInitializable {
    private val engine: WebEngine = web.engine

    override def initialize(url: String): Unit = engine.load("file:" + System.getProperty("user.dir") + "/" + url)
}
