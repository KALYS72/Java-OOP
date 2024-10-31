package org.example.devices;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Button add;

    @FXML
    private TextField batteryLife;

    @FXML
    private TextField cameraRes;

    @FXML
    private CheckBox hasStylus;

    @FXML
    private Tab laptopTab;

    @FXML
    private ListView<Device> listView;

    @FXML
    ObservableList<Device> devices = FXCollections.observableArrayList();

    @FXML
    private TextField name;

    @FXML
    private TextField price;

    @FXML
    private TextField processor;

    @FXML
    private TextField ram;

    @FXML
    private TextField screenSize;

    @FXML
    private Tab smartphoneTab;

    @FXML
    private Tab tabletTab;

    @FXML
    private TextField weight;

    @FXML
    private Label label;

    @FXML
    protected void onListClicked(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText(devices.get(id).toString());
    }

    @FXML
    private void onRemoveClick(){
        int id = listView.getSelectionModel().getSelectedIndex();
        label.setText( devices.get(id).getName() + " is removed." );
        devices.remove(id);
    }

    @FXML
    private TabPane tabPane;

    @FXML
    void onAddClick(ActionEvent event) {
        Tab selectedTab = tabPane.getSelectionModel().getSelectedItem();

        if (selectedTab.getText().equals("Smartphone")) {
            Smartphone sm = new Smartphone();
            name.getText();
            Double.parseDouble(price.getText());
            Double.parseDouble(weight.getText());
            Integer.parseInt(screenSize.getText());
            Integer.parseInt(cameraRes.getText());
            devices.add(sm);
        }

        if (selectedTab.getText().equals("Laptop")) {
            Laptop lp = new Laptop(
                    Type.LAPTOP,
                    name.getText(),
                    Double.parseDouble(price.getText()),
                    Double.parseDouble(weight.getText()),
                    Integer.parseInt(ram.getText()),
                    processor.getText()
            );
            devices.add(lp);
        }


        if (selectedTab.getText().equals("Tablet")) {
            Tablet tb = new Tablet(
                    Type.TABLET,
                    name.getText(),
                    Double.parseDouble(price.getText()),
                    Double.parseDouble(weight.getText()),
                    Double.parseDouble(batteryLife.getText()),
                    hasStylus.isSelected()
            );
            devices.add(tb);
        }
    };

    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.setItems(devices);

        ImageView laptopIcon = addGraphic("laptop.png");
        laptopTab.setGraphic(laptopIcon);

        ImageView smartphoneIcon = addGraphic("smartphone.png");
        smartphoneTab.setGraphic(smartphoneIcon);

        ImageView tabletIcon = addGraphic("tablet.png");
        tabletTab.setGraphic(tabletIcon);
    }

    private ImageView addGraphic(String imageFile) {
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imageFile)));
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(15);
        imageView.setFitHeight(15);
        return imageView;
    }

    @FXML
    public void init() {
        listView.setItems(devices);
    }
}

