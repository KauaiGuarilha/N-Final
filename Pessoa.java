package ProjNotaFinalSemScan;

public abstract class Pessoa {
    
    private final static long serialVersionUID = 1;
    private int codigo;
    private String nome;
    private String cpf;
    
    public Pessoa(int codigo, String nome){
        super();
        this.codigo = codigo;
        this.nome = nome;
    }    
    public Pessoa(int codigo, String nome,String cpf){
        this(codigo, nome);
        this.cpf = cpf;
    }   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    void printPeople(){       
    }
    void printPeople2(){
    }
}
