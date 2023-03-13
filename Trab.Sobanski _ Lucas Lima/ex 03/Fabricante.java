import java.util.Scanner;

public class Fabricante {
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private int anoFundacao;
    
    public Fabricante(String nome, String endereco, String telefone, String email, int anoFundacao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.anoFundacao = anoFundacao;
    }
    
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    
    public int getAnoFundacao() { return anoFundacao; }
    public void setAnoFundacao(int anoFundacao) { this.anoFundacao = anoFundacao; }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o nome do fabricante: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite o endereço do fabricante: ");
        String endereco = sc.nextLine();
        
        System.out.print("Digite o telefone do fabricante: ");
        String telefone = sc.nextLine();
        
        System.out.print("Digite o e-mail do fabricante: ");
        String email = sc.nextLine();
        
        System.out.print("Digite o ano de fundação do fabricante: ");
        int anoFundacao = sc.nextInt();
        
        Fabricante fabricante = new Fabricante(nome, endereco, telefone, email, anoFundacao);
        System.out.println("Nome: " + fabricante.getNome());
        System.out.println("Endereço: " + fabricante.getEndereco());
        System.out.println("Telefone: " + fabricante.getTelefone());
        System.out.println("Email: " + fabricante.getEmail());
        System.out.println("Ano de fundação: " + fabricante.getAnoFundacao());
    }
}
