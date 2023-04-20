import javax.swing.*;

public class Principal {
    public static void main(String[] args) {
        CalculaMedia Media = new CalculaMedia();
        ControlaDados Lote = new ControlaDados();
        Media.Media();
        Media.Calculo();
        Media.Situacao();
        Lote.PegaDados();
        Lote.MostraDados();

    }
}

