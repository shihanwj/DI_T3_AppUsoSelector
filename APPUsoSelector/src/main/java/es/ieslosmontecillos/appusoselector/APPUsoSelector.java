/**
 * 2º DAM DI
 * Tema 3: Creación de componentes visuales
 * @author Shihan
 * 4.6.1. Usando componentes personalizados 1
 * Proyecto AppUsoSelector
 */


package es.ieslosmontecillos.appusoselector;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class APPUsoSelector extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        String [] items = new String [] {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho"};
        ArrayList<String> i = new ArrayList<>();
        i.addAll(Arrays.asList(items));

        FXMLLoader loader = new FXMLLoader(getClass().getResource("app_uso_selector.fxml"));
        VBox root = loader.load();
        APPUsoSelectorController controller = loader.getController();
        controller.setItem(i);
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("APPUsoSelector");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}