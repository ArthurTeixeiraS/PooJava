import javax.swing.*;

public class CalculaMedia {
    double nota1, nota2, media;
    String nome, aux;
    public void Media() {
        nome = JOptionPane.showInputDialog(null, "Digite a nome do Aluno: ");
        System.out.println(nome);
        aux = JOptionPane.showInputDialog(null, "Digite nota 1: ");
        nota1 = Double.parseDouble(aux);
        aux = JOptionPane.showInputDialog(null, "Digite nota 2: ");
        nota2 = Double.parseDouble(aux);
    }
    public void Calculo(){
        media = (nota1 + nota2) / 2;
    }
    public void Situacao(){
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, nome + "\nAprovado \n" + media);
        } else {
            JOptionPane.showMessageDialog(null, nome + "\nReprovado \n" + media);
        }
    }
}
