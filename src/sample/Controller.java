package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.time.ZoneId;
import java.util.TreeSet;

public class Controller {

    public ComboBox<String> deparuteTimeZone;
    public ComboBox<String > arrivalTimeZone;
    public TextField departureDate;
    public TextField result;
    public TextField departureTime;

    public void initialize() {
        var timezones = new TreeSet<>(ZoneId.getAvailableZoneIds());
        deparuteTimeZone.getItems().addAll(timezones);
        arrivalTimeZone.getItems().addAll(timezones);
    }
    public void calculate() {
        var strDepartureDate = departureDate.getText();
        var strDepartureTime = departureTime.getText();
        result.setText(strDepartureDate);
        System.out.println("Button clicked!" + strDepartureDate);
    }
}
