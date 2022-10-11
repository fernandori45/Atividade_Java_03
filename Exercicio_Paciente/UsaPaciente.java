import javax.swing.JOptionPane;

public class UsaPaciente {
    public static void main(String[] args) {
        Paciente pac, pac1;

        pac = new Paciente();
        pac.cadastraDados();
        pac.calculaIdade(2022);
        pac.imprimeDados();

        pac1 = new Paciente("Fernando Ribeiro");
        pac1.rg = JOptionPane.showInputDialog("Entre com a RG: ");
        pac1.anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de nascimento: "));
        pac1.Profissao = JOptionPane.showInputDialog("Entre com a profissão: ");

        pac1.calculaIdade(2022);
        pac1.imprimeDados();
    }
}
