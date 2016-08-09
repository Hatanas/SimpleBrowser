package hatanas.browser

import javafx.scene.Parent

import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafxml.core.{FXMLLoader, FXMLView, NoDependencyResolver}


object Main extends JFXApp {

    val resource = getClass.getResource("SimpleBrowser.fxml")
    val loader = new FXMLLoader(resource, NoDependencyResolver)
    loader.load()
    val root = loader.getRoot[Parent]
    val controller = loader.getController[BrowserControllerInitializable]
    controller.initialize(parameters.raw(0))

    stage = new PrimaryStage() {
        title = "Simple Browser"
        scene = new Scene(root)
    }
}
