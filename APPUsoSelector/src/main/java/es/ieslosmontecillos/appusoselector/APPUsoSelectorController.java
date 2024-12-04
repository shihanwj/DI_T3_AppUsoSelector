/**
 * 2º DAM DI
 * Tema 3: Creación de componentes visuales
 * @author Shihan
 * 4.6.1. Usando componentes personalizados 1
 * Proyecto AppUsoSelector
 */

package es.ieslosmontecillos.appusoselector;

import es.ieslosmontecillos.componentes_weishihan.SelectorDeslizamiento;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class APPUsoSelectorController {

    @FXML
    private Label lbTitulo;
    @FXML
    private SelectorDeslizamiento selector1;
    @FXML
    private SelectorDeslizamiento selector2;
    @FXML
    private Label lbSelector;

    /* Items para los selectores */
    ArrayList<String> item = new ArrayList<>();

    /* Asignamos el arraylist a los dos selectores */
    public void setItem(ArrayList<String> item) {
        this.item = item;
        selector1.setItems(item);
        selector2.setItems(item);
    }

    /* Manejador del onAction para los selectores: cuando se pulsa uno de los dos botones */
    @FXML
    public void selectorPulsado(ActionEvent actionEvent) {

        if(actionEvent.getSource() == selector1) {
            lbSelector.setText("Pulsado el selector de arriba");
            selector1.setRepetitive(true);
        }
        else if(actionEvent.getSource() == selector2) {
            selector2.setRepetitive(false);
            lbSelector.setText("Pulsado el selector de abajo");
        }
    }
}