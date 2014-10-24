package Classes;

/**
 *
 * @author Maikon Evangelista
 */
public class Cliente {
    
    private String nome;
    private int cpf;
    
    public Cliente(String nome,int cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }
    
    public int getCPF(){
        return cpf;
    }
    public void setCPF(int c){
        cpf = c;
    }
}
