package com.example.textfields;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private TextField txtFld;

    @FXML
    private Text txtOut;

  @FXML
    void changeName(MouseEvent event) {
        txtOut.setText(txtFld.getText());

    }

}
