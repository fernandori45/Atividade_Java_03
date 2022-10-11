public class UsaCurso {
    public static void main(String[] args) {
        Curso curs, curs1;

        curs = new Curso();
        curs.cadastraCurso();
        curs.calculaTotalMensalidade();
        curs.imprimeDados();

        curs1 = new Curso("Redes", 9, "2KE", 300);
        curs1.calculaTotalMensalidade();
        curs1.imprimeDados();
    }
}
