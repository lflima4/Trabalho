public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 30, "Rua A");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        pessoa1.setIdade(-10);
        System.out.println(pessoa1.getIdade());
    }
}
