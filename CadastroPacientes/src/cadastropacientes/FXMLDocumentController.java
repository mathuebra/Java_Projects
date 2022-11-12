/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package cadastropacientes;

import static java.lang.System.exit;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author matheus
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private RadioButton genderM;
    @FXML
    private RadioButton genderF;
    
    @FXML
    private TextField tfCodigo;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfIdade;
    @FXML
    private TextField tfPeso;
    @FXML
    private TextField tfAltura;
    
    @FXML
    private Button bCadastrar;
    @FXML
    private Button bRelatorio;
    @FXML
    private Button bSair;
    
    Scanner entrada = new Scanner(System.in);
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @FXML
    private void actionSair (ActionEvent event) {
        if (bSair.isArmed())
            exit(0);
    }
    
    @FXML
    private void handleTFCodigo (ActionEvent event) {
        if (tfCodigo.isFocused()) {
            tfCodigo.setText(entrada.next());
        }
    }
    
    @FXML
    private void handleTFNome (ActionEvent event) {
        if (tfNome.isFocused()) {
            tfNome.setText(entrada.next());
        }
    }
    
    @FXML
    private void handleTFPeso (ActionEvent event) {
        if (tfPeso.isFocused()) {
            tfPeso.setText(entrada.next());
        }
    }
    
    @FXML
    private void handleTFIdade (ActionEvent event) {
        if (tfIdade.isFocused()) {
            tfIdade.setText(entrada.next());
        }
    }
    
    @FXML
    private void handleTFAltura (ActionEvent event) {
        if (tfAltura.isFocused()) {
            tfAltura.setText(entrada.next());
        }
    }
    
    @FXML
    private void setGenderM (ActionEvent event) {
        if (genderM.isArmed()) {
            genderF.setSelected(false);
            genderM.setSelected(true);
        }
    }
    
    @FXML
    private void setGenderF (ActionEvent event) {
        if (genderF.isArmed()) {
            genderM.setSelected(false);
            genderF.setSelected(true);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
