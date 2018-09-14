package ProjNotaFinalSemScan;

public class Professor extends Pessoa {
    
    private final static long serialVersionUID = 1;
    private String matricula;
    private int turma;
    private String curso;
   
    public Professor(String matricula, String curso){
        super(1,"rodrigo","111.111.111-11");
        this.matricula = matricula;
        this.curso = curso;
    }
    public Professor(String matricula,String curso, int turma){
        this(matricula, curso);        
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
        void StructProf1(){
                System.out.println("________________________");
                System.out.println("___Cadastro Professor___");
                System.out.println("________________________");
        }
        void StructProf2(){
                System.out.println("________________________");
                System.out.println("___Cadastro Concluído___");
                System.out.println("________________________");
        }   
        void StructProf4(){
            System.out.println("______________________________");    
            System.out.println("Cadastro Efetuado com Sucesso!");
            System.out.println("______________________________"); 
        } 
}
