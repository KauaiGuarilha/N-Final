package ProjNotaFinalSemScan;

public class Main {
    
    public static void main(String[] args) {
        
        Professor pro = new Professor("5555","JAVA",3000);
        pro.StructProf1();
        System.out.println(" Código do Professor: "+pro.getCodigo()+"\n Nome do Professor: "+pro.getNome()+"\n Matricula: "+pro.getMatricula()+"\n CPF: "+pro.getCpf()+
                                "\n Curso: "+pro.getCurso());
        pro.StructProf2();
        
        Aluno alu = new Aluno("666",3000,"JAVA","Programação",10.0,10.0,10.0);
        alu.StructAlu();
        System.out.println(" Código do Aluno: "+alu.getCodigo()+"\n Nome do Aluno: "+alu.getNome()+"\n Matricula: "+alu.getMatricula()+"\n CPF: "+alu.getCpf()+"\n Curso: "+alu.getCurso()+
                           "\n Disciplina: "+alu.getDiscip()+"\n Nota da Prova 1: "+alu.getNota1()+"\n Nota da Prova 2: "+alu.getNota2()+
                           "\n Nota do Trabalho: "+alu.getNota3());
        alu.calculaMedia();
        pro.StructProf4();
    }
}
