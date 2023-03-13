import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pessoa> bebes = new ArrayList<>();
        ArrayList<Pessoa> criancas = new ArrayList<>();
        ArrayList<Pessoa> adolescentes = new ArrayList<>();
        ArrayList<Pessoa> adultos = new ArrayList<>();
        ArrayList<Pessoa> idosos = new ArrayList<>();

        
        System.out.println("Insira os dados das pessoas:");
        while (true) {
            System.out.print("Nome (ou 'sair' para finalizar): ");
            String nome = sc.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            System.out.print("Idade: ");
            int idade = Integer.parseInt(sc.nextLine());
            Pessoa pessoa = new Pessoa(nome, idade);
            inserirPessoaNaLista(pessoa, bebes, criancas, adolescentes, adultos, idosos);
        }

        
        System.out.println("Bebês: " + bebes.toString());
        System.out.println("Crianças: " + criancas.toString());
        System.out.println("Adolescentes: " + adolescentes.toString());
        System.out.println("Adultos: " + adultos.toString());
        System.out.println("Idosos: " + idosos.toString());

        sc.close();
    }

    public static void inserirPessoaNaLista(Pessoa pessoa, ArrayList<Pessoa> bebes, ArrayList<Pessoa> criancas, ArrayList<Pessoa> adolescentes, ArrayList<Pessoa> adultos, ArrayList<Pessoa> idosos) {
        int idade = pessoa.getIdade();
        if (idade >= 0 && idade <= 3) {
            bebes.add(pessoa);
        } else if (idade <= 10) {
            criancas.add(pessoa);
        } else if (idade <= 20) {
            adolescentes.add(pessoa);
        } else if (idade <= 65) {
            adultos.add(pessoa);
        } else {
            idosos.add(pessoa);
        }
    }
}



