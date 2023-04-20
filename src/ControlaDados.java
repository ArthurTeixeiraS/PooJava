import java.util.Scanner;

public class ControlaDados {
    public double largura, comprimento, valorM2, total;
    public void PegaDados() {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite largura do terreno: ");
        largura = input.nextDouble();
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = input.nextDouble();
        System.out.print("Digite o valor do metro² do terreno: ");
        valorM2 = input.nextDouble();
        total = (largura*comprimento)*valorM2;
    }
    public void MostraDados() {
        System.out.printf("\n******************** Valor do Lote ********************\n");
        System.out.println("O valor do lote ficou: R$"+total);
    }
}
