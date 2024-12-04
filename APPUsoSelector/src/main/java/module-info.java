module es.ieslosmontecillos.appusoselector {
    requires es.ieslosmontecillos.componentes_weishihan;
    requires javafx.fxml;
    requires javafx.controls;


    opens es.ieslosmontecillos.appusoselector to javafx.fxml;
    exports es.ieslosmontecillos.appusoselector;
}