package ProjNotaFinalSemScan;

public class Aluno extends Pessoa {
    
    private final static long serialVersionUID = 1;
    private String matricula;
    private int turma;
    private String curso;
    private String discip;
    private double nota1, nota2, nota3, media;

    public Aluno(String matricula, int turma, String curso, String discip){
        super(1,"aluno","222.222.222-22");
        this.matricula = matricula;
        this.turma = turma;
        this.curso = curso;
        this.discip = discip;      
    }
    public Aluno(String matricula, int turma, String curso, String discip,double nota1,double nota2,double nota3){
        this(matricula, turma, curso, discip);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
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

    public String getDiscip() {
        return discip;
    }

    public void setDiscip(String discip) {
        this.discip = discip;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
        
    void calculaMedia(){
        double total1 = ((getNota1() * 0.25) + (getNota2() * 0.25));
        double total2 = getNota3() * 0.5;
        this.media = total1 + total2;
        if(this.media < 5.0){
            System.out.println(" Sua média foi: "+this.media);
            System.out.println(" REPROVADO!");
        }else if(this.media >= 5.0 && this.media < 7.0){
            System.out.println(" Sua média foi: "+this.media);
            System.out.println(" RECUPERAÇÃO!");
        }else if(this.media >= 7.0){
            System.out.println(" Sua média foi: "+this.media);
            System.out.println(" APROVADO!");
        }
    }
    void StructAlu(){
                System.out.println("________________________");
                System.out.println("_____Média do Aluno_____");
                System.out.println("________________________");
    }   
}

