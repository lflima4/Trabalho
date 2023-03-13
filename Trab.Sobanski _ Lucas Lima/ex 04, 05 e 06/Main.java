import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Garagem garagem = new Garagem(10);
        Fabricante fabricante = null;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar veículo à garagem");
            System.out.println("2. Ver veículo na vaga");
            System.out.println("3. Adicionar fabricante");
            System.out.println("4. Sair");
            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o modelo do veículo: ");
                    String modelo = sc.next();
                    System.out.print("Digite a cor do veículo: ");
                    String cor = sc.next();
                    System.out.print("Digite o ano do veículo: ");
                    int ano = sc.nextInt();
                    System.out.print("Digite o preço do veículo: ");
                    double preco = sc.nextDouble();
                    if (fabricante == null) {
                        System.out.println("Não há fabricante cadastrado.");
                        break;
                    }
                    Veiculo veiculo = new Veiculo(modelo, cor, ano, preco, fabricante);
                    System.out.print("Digite o número da vaga: ");
                    int numVaga = sc.nextInt();
                    garagem.estacionarVeiculo(veiculo, numVaga);
                    break;
                case 2:
                    System.out.print("Digite o número da vaga: ");
                    numVaga = sc.nextInt();
                    Veiculo veiculoNaVaga = garagem.getVeiculoNaVaga(numVaga);
                    if (veiculoNaVaga != null) {
                        System.out.println("Modelo: " + veiculoNaVaga.getModelo());
                        System.out.println("Cor: " + veiculoNaVaga.getCor());
                        System.out.println("Ano: " + veiculoNaVaga.getAno());
                        System.out.println("Preço: " + veiculoNaVaga.getPreco());
                        System.out.println("Fabricante: " + veiculoNaVaga.getFabricante().getNome());
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do fabricante: ");
                    String nome = sc.next();
                    System.out.print("Digite o endereço do fabricante: ");
                    String endereco = sc.next();
                    System.out.print("Digite o telefone do fabricante: ");
                    String telefone = sc.next();
                    System.out.print("Digite o e-mail do fabricante: ");
                    String email = sc.next();
                    System.out.print("Digite o ano de fundação do fabricante: ");
                    int anoFundacao = sc.nextInt();
                    fabricante = new Fabricante(nome, endereco, telefone, email, anoFundacao);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
