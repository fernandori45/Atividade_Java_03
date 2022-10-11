import javax.swing.JOptionPane;

public class Paciente {
    String nome;
    String rg;
    int anoNascimento;
    String Profissao;
    int calculo;

    public Paciente(){

    }

    public Paciente(String n){
        nome = n;
    }

    public void cadastraDados(){
        nome = JOptionPane.showInputDialog("Entre com o nome do paciente: ");
        rg = JOptionPane.showInputDialog("Entre com o RG: ");
        anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Entre com o ano de nascimento: "));
        Profissao = JOptionPane.showInputDialog("Entre com a profissão: ");
    }

    public int calculaIdade(int anoAtual){
        if (anoNascimento <= anoAtual) {
            calculo = anoAtual - anoNascimento;
        }
        else{
            calculo = -1;
        }
        return calculo;
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Nome do paciente:" + nome + "\nRG: " + rg + "\nAno do nascimento: " + anoNascimento + "\nProfissão: " + Profissao + "\nIdade: " + calculo);
    }
}