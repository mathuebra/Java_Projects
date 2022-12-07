package com.example.campominado;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController extends Application {

    @FXML
    private ToggleButton tb1;

    @FXML
    private ToggleButton tb10;

    @FXML
    private ToggleButton tb11;

    @FXML
    private ToggleButton tb12;

    @FXML
    private ToggleButton tb13;

    @FXML
    private ToggleButton tb14;

    @FXML
    private ToggleButton tb15;

    @FXML
    private ToggleButton tb16;

    @FXML
    private ToggleButton tb2;

    @FXML
    private ToggleButton tb3;

    @FXML
    private ToggleButton tb4;

    @FXML
    private ToggleButton tb5;

    @FXML
    private ToggleButton tb6;

    @FXML
    private ToggleButton tb7;

    @FXML
    private ToggleButton tb8;

    @FXML
    private ToggleButton tb9;

    @FXML
    private Button bNewGame;

    @FXML
    private Button bSair;

    Arena campoMinado = new Arena();

//Nos seguintes métodos, eu puxo a função da Arena que verifica se naquela posição específica da matriz, existe
//Uma arma, e logo após aumento a quantidadeArmas, para depois poder comparar se todas foram encontradas

    public void exibeStatus() {
        if (campoMinado.verificaVitoria() == 1) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Você Ganhou");
            alert.setHeaderText("Parabéns, você encontrou todas as armas!");

            alert.showAndWait();
        }

        if (campoMinado.verificaVitoria() == -1) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Você Perdeu :(");
            alert.setHeaderText("Infelizmente você perdeu, vamos tentar de novo?");

            alert.showAndWait();
        }
    }

    public void handleTB1Action(ActionEvent event) {
        if (tb1.isSelected()) {
            if (campoMinado.verificaArma(0,0) == 1) {
                campoMinado.adicionaArma();
                tb1.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB2Action(ActionEvent event) {
        if (tb2.isSelected()) {
            if (campoMinado.verificaArma(1,0) == 1) {
                campoMinado.adicionaArma();
                tb2.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB3Action(ActionEvent event) {
        if (tb3.isSelected()) {
            if (campoMinado.verificaArma(2,0) == 1) {
                campoMinado.adicionaArma();
                tb3.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB4Action(ActionEvent event) {
        if (tb4.isSelected()) {
            if (campoMinado.verificaArma(3,0) == 1) {
                campoMinado.adicionaArma();
                tb4.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB5Action(ActionEvent event) {
        if (tb5.isSelected()) {
            if (campoMinado.verificaArma(0,1) == 1) {
                campoMinado.adicionaArma();
                tb5.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB6Action(ActionEvent event) {
        if (tb6.isSelected()) {
            if (campoMinado.verificaArma(1,1) == 1) {
                campoMinado.adicionaArma();
                tb6.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB7Action(ActionEvent event) {
        if (tb7.isSelected()) {
            if (campoMinado.verificaArma(2,1) == 1) {
                campoMinado.adicionaArma();
                tb7.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB8Action(ActionEvent event) {
        if (tb8.isSelected()) {
            if (campoMinado.verificaArma(3,1) == 1) {
                campoMinado.adicionaArma();
                tb8.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB9Action(ActionEvent event) {
        if (tb9.isSelected()) {
            if (campoMinado.verificaArma(0,2) == 1) {
                campoMinado.adicionaArma();
                tb9.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB10Action(ActionEvent event) {
        if (tb10.isSelected()) {
            if (campoMinado.verificaArma(1,2) == 1) {
                campoMinado.adicionaArma();
                tb10.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB11Action(ActionEvent event) {
        if (tb11.isSelected()) {
            if (campoMinado.verificaArma(2,2) == 1) {
                campoMinado.adicionaArma();
                tb11.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB12Action(ActionEvent event) {
        if (tb12.isSelected()) {
            if (campoMinado.verificaArma(3, 2) == 1) {
                campoMinado.adicionaArma();
                tb12.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB13Action(ActionEvent event) {
        if (tb13.isSelected()) {
            if (campoMinado.verificaArma(0,3) == 1) {
                campoMinado.adicionaArma();
                tb13.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB14Action(ActionEvent event) {
        if (tb14.isSelected()) {
            if (campoMinado.verificaArma(1,3) == 1) {
                campoMinado.adicionaArma();
                tb14.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB15Action(ActionEvent event) {
        if (tb15.isSelected()) {
            if (campoMinado.verificaArma(2,3) == 1) {
                campoMinado.adicionaArma();
                tb15.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleTB16Action(ActionEvent event) {
        if (tb16.isSelected()) {
            if (campoMinado.verificaArma(3,3) == 1) {
                campoMinado.adicionaArma();
                tb16.setStyle("-fx-background-color:blue");
            }
        }
        campoMinado.tentativasJogo();
        exibeStatus();
    }

    public void handleBNewGame(ActionEvent event) {
        tb1.setSelected(false);
        tb2.setSelected(false);
        tb3.setSelected(false);
        tb4.setSelected(false);
        tb5.setSelected(false);
        tb6.setSelected(false);
        tb7.setSelected(false);
        tb8.setSelected(false);
        tb9.setSelected(false);
        tb10.setSelected(false);
        tb11.setSelected(false);
        tb12.setSelected(false);
        tb13.setSelected(false);
        tb14.setSelected(false);
        tb15.setSelected(false);
        tb16.setSelected(false);

        tb1.getStyleClass().removeAll();
        tb2.getStyleClass().removeAll();
        tb3.getStyleClass().removeAll();
        tb4.getStyleClass().removeAll();
        tb5.getStyleClass().removeAll();
        tb6.getStyleClass().removeAll();
        tb7.getStyleClass().removeAll();
        tb8.getStyleClass().removeAll();
        tb9.getStyleClass().removeAll();
        tb10.getStyleClass().removeAll();
        tb11.getStyleClass().removeAll();
        tb12.getStyleClass().removeAll();
        tb13.getStyleClass().removeAll();
        tb14.getStyleClass().removeAll();
        tb15.getStyleClass().removeAll();
        tb16.getStyleClass().removeAll();

        campoMinado.inicializaJogo();
    }

    public void handleBSair(ActionEvent event) {
        System.exit(0);
    }

    public void initialize(URL url, ResourceBundle rb) {

    }

    @Override
    public void start(Stage stage) throws Exception {

    }
}
