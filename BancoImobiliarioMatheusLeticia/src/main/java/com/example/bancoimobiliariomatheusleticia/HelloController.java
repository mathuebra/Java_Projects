package com.example.bancoimobiliariomatheusleticia;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;

public class HelloController implements Initializable{
    @FXML
    private Button buttonComprar;
    @FXML
    private Button buttonFinalizarJogada;
    @FXML
    private Button buttonConstruirCasa;
    @FXML
    private Button buttonDado;
    @FXML
    private Button buttonAjuda;
    @FXML
    private Button buttonTerminarJogo;
    @FXML
    private Label labelDinheiroJogador1;
    @FXML
    private Label labelDinheiroJogador2;
    @FXML
    private Label labelPropriedade1;
    @FXML
    private Label labelPropriedade2;
    @FXML
    private Region regionCasa0;
    @FXML
    private Region regionCasa1;
    @FXML
    private Region regionCasa2;
    @FXML
    private Region regionCasa3;
    @FXML
    private Region regionCasa4;
    @FXML
    private Region regionCasa5;
    @FXML
    private Region regionCasa6;
    @FXML
    private Region regionCasa7;
    @FXML
    private Region regionCasa8;
    @FXML
    private Region regionCasa9;
    @FXML
    private Region regionCasa10;
    @FXML
    private Region regionCasa11;
    @FXML
    private Region regionCasa12;
    @FXML
    private Region regionCasa13;
    @FXML
    private Region regionCasa14;
    @FXML
    private Region regionCasa15;
    @FXML
    private Region regionCasa16;
    @FXML
    private Region regionCasa17;
    @FXML
    private Region regionCasa18;
    @FXML
    private Region regionCasa19;
    @FXML
    private Region regionCasa20;
    @FXML
    private Region regionCasa21;
    @FXML
    private Region regionCasa22;
    @FXML
    private Region regionCasa23;
    @FXML
    private Circle circleJogador1;
    @FXML
    private Circle circleJogador2;
    private ArrayList<Region> casasTabuleiro = new ArrayList<>();
    private int jogada = 1;
    private Jogo jogo = new Jogo();


    public void handleButtonAjuda(ActionEvent event){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Ajuda");
        alert.setHeaderText("Aqui vamos te ajudar a jogar o jogo Banco Imobiliário!");

        alert.setContentText("O objetivo do jogo é terminar com o máximo de dinheiro possível, e quando um dos dois ficar sem dinheiro ou não conseguir mais se recuperar no jogo, os jogadores podem optar por finalizar o jogo. Para começar, precisa girar o dado. Assim que o dado for rodado, o jogador será informado sobre em qual propriedade/companhia ou evento ele parou. As propriedades geram um aluguel se outro jogador cair em cima, as companhias geram um valor baseado no número do dado que o jogador adversário rodou para chegar até ali, e os eventos são aleatórios, podendo ser uma sorte ou um revés, que variam desde ganhar 300 até perder 150. Após cada rodar do dado, o jogador tem a opção de comprar a propriedade/companhia, e feito isso (ou caso não queira), é só clicar no botão Finalizar que a sua rodada será encerreda, e os novos valores de dinheiro e propriedades que os jogadores tiverem serão atualizados. No mais, desejamos aos jogadores toda a sorte do mundo e qualquer dúvida com o jogo pode ser relatada aos criadores: \n Matheus Huebra & Letícia Soares");
        alert.showAndWait();
    }

    public void terminaJogo(ActionEvent event){
        /* nesse metodo vai mostrar quem ganhou em um alert e depois recomecar o jogo*/
        int valorTotalJogador1;
        int valorTotalJogador2;

        valorTotalJogador1 = jogo.calculaTotalJogador(jogo.getJogador1());
        valorTotalJogador2 = jogo.calculaTotalJogador(jogo.getJogador2());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("Jogo finalizado!");

        if (valorTotalJogador1 > valorTotalJogador2) {
            alert.setHeaderText("O jogador Azul ganhou!");
        }
        else if (valorTotalJogador2 > valorTotalJogador1) {
            alert.setHeaderText("O jogador Vermelho ganhou!");
        }
        else if (valorTotalJogador2 == valorTotalJogador1) {
            alert.setHeaderText("O jogo empatou!");
        }

        alert.setContentText("O Jogador 1 faturou um total de: " + Integer.toString(valorTotalJogador1) + "!\n O Jogador 2 faturou um total de: " + Integer.toString(valorTotalJogador2) + "!\n" + "Para iniciar um novo jogo, aperte ok, e já estará tudo pronto para um próximo jogo!");
        alert.showAndWait();

        labelPropriedade2.setText("");
        labelPropriedade1.setText("");
        labelDinheiroJogador2.setText("Dinheiro do jogador 2:");
        labelDinheiroJogador1.setText("Dinheiro do jogador 1:");


        jogo.inicializaJogo();
        circleJogador1.setCenterX(casasTabuleiro.get(0).getLayoutX() - ( (casasTabuleiro.get(0).getWidth())/2) - casasTabuleiro.get(0).getLayoutX()); //Tentativa de fazer
        circleJogador1.setCenterY(casasTabuleiro.get(0).getLayoutY());                                                                                //O círculo do player voltar pro início

        circleJogador2.setCenterX(casasTabuleiro.get(0).getLayoutX() - ( (casasTabuleiro.get(0).getWidth())/2) - casasTabuleiro.get(0).getLayoutX());
        circleJogador2.setCenterY(casasTabuleiro.get(0).getLayoutY());
    }
    public void compraPosse(ActionEvent event){
        jogo.realizaCompra();
        buttonComprar.setDisable(true);
    }

    public void compraCasa(ActionEvent event){
        jogo.constroiCasa();
        buttonConstruirCasa.setDisable(true);
    }

    public void finalizaJogada(ActionEvent event){

        String propriedades1 = "";
        String propriedades2 = "";

        if(jogada == 1){
            labelDinheiroJogador1.setText("Dinheiro do jogador 1: " + Integer.toString(jogo.retornaDinheiroJogador1()));
            labelDinheiroJogador2.setText("Dinheiro do jogador 2: " + Integer.toString(jogo.retornaDinheiroJogador2()));
        }
        if(jogada == 2){
            labelDinheiroJogador2.setText("Dinheiro do jogador 1: " + Integer.toString(jogo.retornaDinheiroJogador2()));
            labelDinheiroJogador1.setText("Dinheiro do jogador 2: " + Integer.toString(jogo.retornaDinheiroJogador1()));
        }
        if(jogada == 1){
            jogada = 2;
        }
        else{
            jogada = 1;
        }

        for (int i = 0; i < jogo.getJogador1().getCartas().size(); i ++) {
            propriedades1 = propriedades1 + "\n" + jogo.getJogador1().getCartas().get(i).getNome();
        }
        for (int i = 0; i < jogo.getJogador2().getCartas().size(); i ++) {
            propriedades2 = propriedades2 + "\n" + jogo.getJogador2().getCartas().get(i).getNome();
        }

        labelPropriedade1.setText(propriedades1);
        labelPropriedade2.setText(propriedades2);
        buttonComprar.setDisable(true);
        buttonFinalizarJogada.setDisable(true);
        buttonDado.setDisable(false);
        jogo.finalizaJogada(jogada);
    }

    public void rodarDado(ActionEvent event) {
        buttonDado.setDisable(true);
        int temp = jogo.fazJogada();
        String temporaria = "";
        if (temp == 1) {
            buttonComprar.setDisable(false);
            buttonFinalizarJogada.setDisable(false);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle(jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()).getNome());
            alert.setHeaderText("Propriedade disponível para compra");
            temporaria = Integer.toString(((CartaPosse)jogo.getTabuleiro().get(jogo.getPosicaoTemporaria())).getPrecoCompra());
            alert.setContentText("O valor desta posse é: " + temporaria + ". Deseja comprar? Aperte o botão comprar para confirmar!");
            alert.showAndWait();
        }

        if (temp == -1){
            buttonFinalizarJogada.setDisable(false);

            //Verifica se a propriedade é do jogador, caso não seja ele deverá pagar
            if (!jogo.verificaPropriedadeJogador((CartaPosse) jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()))) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Pagar aluguel ou taxa!");
                alert.setHeaderText("A propriedade ja foi comprada!");
                if (((jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()))) instanceof CartaPropriedade) {
                    temporaria = Integer.toString(((CartaPropriedade) jogo.getTabuleiro().get(jogo.getPosicaoTemporaria())).calculaValorAPagar(jogo.getDado()));

                    alert.setContentText("Voce deve pagar" + temporaria + " ao outro jogador. O pagamento será feito automáticamente");

                    //Transferencia automatica em forma de evento, que subtrai do jogador tal quantia e da essa quantia pro outro
                    jogo.transfereEntreJogadores(((CartaPropriedade) jogo.getTabuleiro().get(jogo.getPosicaoTemporaria())).calculaValorAPagar(jogo.getDado()));
                    alert.showAndWait();
                }

                else if (((jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()))) instanceof CartaCompanhia) {

                    temporaria = Integer.toString(((CartaCompanhia) jogo.getTabuleiro().get(jogo.getPosicaoTemporaria())).calculaValorAPagar(jogo.getDado()));

                    alert.setContentText("Voce deve pagar " + temporaria + " ao outro jogador. O pagamento será feito automáticamente");

                    jogo.transfereEntreJogadores(((CartaCompanhia) jogo.getTabuleiro().get(jogo.getPosicaoTemporaria())).calculaValorAPagar(jogo.getDado()));
                    alert.showAndWait();
                }
            }

            else if (jogo.verificaPropriedadeJogador((CartaPosse) jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()))) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Propriedade já obtida!");

                if (jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()) instanceof CartaPropriedade) {
                    buttonConstruirCasa.setDisable(false);
                    buttonFinalizarJogada.setDisable(false);
                    alert.setHeaderText("Você deseja construir uma casa nesta propriedade?");
                    alert.setContentText("Lembrando que quanto mais casas, maior o valor do aluguel!");
                    alert.showAndWait();

                    //Apresentar opção de comprar casa
                }

            }
        }

        if (temp == 0) {
            buttonFinalizarJogada.setDisable(false);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Sorte ou Revés");
            alert.setHeaderText(jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()).getNome());
            alert.setContentText(jogo.getTabuleiro().get(jogo.getPosicaoTemporaria()).getDescricao());
            alert.showAndWait();
            jogo.realizaEvento();
        }

        if (jogada == 1){
            circleJogador1.setCenterX(casasTabuleiro.get(jogo.getPosicaoTemporaria()).getLayoutX() - ( (casasTabuleiro.get(jogo.getPosicaoTemporaria()).getWidth()) / 2 ));
            circleJogador1.setCenterY(casasTabuleiro.get(jogo.getPosicaoTemporaria()).getLayoutY());
        }
        else{
            circleJogador2.setCenterX(casasTabuleiro.get(jogo.getPosicaoTemporaria()).getLayoutX() - ( (casasTabuleiro.get(jogo.getPosicaoTemporaria()).getWidth()) / 2 ));
            circleJogador2.setCenterY(casasTabuleiro.get(jogo.getPosicaoTemporaria()).getLayoutY());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        jogo.inicializaJogo();

        casasTabuleiro.add(regionCasa0);
        casasTabuleiro.add(regionCasa1);
        casasTabuleiro.add(regionCasa2);
        casasTabuleiro.add(regionCasa3);
        casasTabuleiro.add(regionCasa4);
        casasTabuleiro.add(regionCasa5);

        casasTabuleiro.add(regionCasa6);
        casasTabuleiro.add(regionCasa7);
        casasTabuleiro.add(regionCasa8);
        casasTabuleiro.add(regionCasa9);
        casasTabuleiro.add(regionCasa10);
        casasTabuleiro.add(regionCasa11);

        casasTabuleiro.add(regionCasa12);
        casasTabuleiro.add(regionCasa13);
        casasTabuleiro.add(regionCasa14);
        casasTabuleiro.add(regionCasa15);
        casasTabuleiro.add(regionCasa16);
        casasTabuleiro.add(regionCasa17);

        casasTabuleiro.add(regionCasa18);
        casasTabuleiro.add(regionCasa19);
        casasTabuleiro.add(regionCasa20);
        casasTabuleiro.add(regionCasa21);
        casasTabuleiro.add(regionCasa22);
        casasTabuleiro.add(regionCasa23);
    }
}