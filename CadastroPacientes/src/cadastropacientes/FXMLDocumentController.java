/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package cadastropacientes;

import java.net.URL;
import java.util.ArrayList;
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
 * @author mathuebra
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private Button bSair;
    @FXML
    private Button bInserir;
    @FXML
    private Button bRelatorio;
    @FXML
    private Button bLimpar;
    
    @FXML
    private TextField tfCodigo;
    @FXML
    private TextField tfNome;
    @FXML
    private TextField tfPeso;
    @FXML
    private TextField tfIdade;
    @FXML
    private TextField tfAltura;
    
    @FXML
    private RadioButton rbMasculino;
    @FXML
    private RadioButton rbFeminino;
    
    Scanner entrada = new Scanner (System.in);
    Relatorio relatorio = new Relatorio();
    
    public void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    public void setMasculinoOn (ActionEvent event) {
        if (rbMasculino.isSelected()) {
            rbFeminino.setSelected(false);
            rbMasculino.setSelected(true);
        }
    }
    
    public void setFemininoOn (ActionEvent event) {
        if (rbFeminino.isSelected()) {
            rbMasculino.setSelected(false);
            rbFeminino.setSelected(true);
        }
    }
  
    public void buttonIncuir (ActionEvent event) {
        int idade = Integer.parseInt(tfIdade.getText());
        int codigo = Integer.parseInt(tfCodigo.getText());
        String nome = tfNome.getText();
        String genero = "";
        double peso = Double.parseDouble(tfPeso.getText());
        double altura = Double.parseDouble(tfAltura.getText());
        
        if (rbMasculino.isSelected()) {
            genero = "m";
        }
        
        if (rbFeminino.isSelected()) {
            genero = "f";
        }
        
        Paciente paciente = new Paciente (codigo, idade, nome, genero, peso, altura);
        
        relatorio.adicionarPaciente(paciente);
        
        tfCodigo.clear();
        tfNome.clear();
        tfPeso.clear();
        tfAltura.clear();
        tfIdade.clear();
        rbMasculino.setSelected(false);
        rbFeminino.setSelected(false);
        
        /*
        for (int i = 0; i < relatorio.pacientes.size(); i ++) {
            System.out.println(relatorio.pacientes.get(i).getCodigo());
            System.out.println(relatorio.pacientes.get(i).getNome());
            System.out.println(relatorio.pacientes.get(i).getPeso());
            System.out.println(relatorio.pacientes.get(i).getAltura());
            System.out.println(relatorio.pacientes.get(i).getIdade());
            System.out.println(relatorio.pacientes.get(i).getGenero());
        }
        */
    }

    public void buttonClear (ActionEvent event) {
        tfCodigo.clear();
        tfNome.clear();
        tfPeso.clear();
        tfAltura.clear();
        tfIdade.clear();
        rbMasculino.setSelected(false);
        rbFeminino.setSelected(false);
        
    }
     
    public void buttonSair (ActionEvent event) {
        System.exit(0);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
