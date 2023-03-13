public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;
    private double preco;
    private Fabricante fabricante;
    
    public Veiculo(String modelo, String cor, int ano, double preco, Fabricante fabricante) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.preco = preco;
        this.fabricante = fabricante;
    }
    
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    
    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }
    
    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }
    
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    
    public Fabricante getFabricante() { return fabricante; }
    public void setFabricante(Fabricante fabricante) { this.fabricante = fabricante; }
}
