import javax.swing.JOptionPane;

public class Curso {
    String nome;
    int qtdeAlunos;
    String turma;
    float mensalidade;

    public Curso (){

    }

    public Curso (String n, int q, String t, float m){
        nome = n;
        qtdeAlunos = q;
        turma = t;
        mensalidade = m;
    }

    public void cadastraCurso(){
        nome = JOptionPane.showInputDialog("Entre com o nome do curso: ");
        qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade de alunos: "));
        turma = JOptionPane.showInputDialog("Entre com a turma: ");
        mensalidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com o valor da mensalidade: "));
    }

    public void imprimeDados(){
        JOptionPane.showMessageDialog(null, "Curso: " + nome + "\nQuantidade de alunos: " + qtdeAlunos + "\nTurma: " + turma + "\nMensalidade: " + mensalidade + "\nTotal: " + calculaTotalMensalidade());
    }

    public float calculaTotalMensalidade(){
        float total;
        if(qtdeAlunos >= 1){
            total = mensalidade * qtdeAlunos;
        }
        else{
            total = 0;
        }
        return total;
    }
}

