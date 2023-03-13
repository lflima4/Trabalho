public class Garagem {
    private int numVagasOcupadas;
    private int numVagasDisponiveis;
    private Veiculo[] vagas;

    public Garagem(int numVagas) {
        this.numVagasOcupadas = 0;
        this.numVagasDisponiveis = numVagas;
        this.vagas = new Veiculo[numVagas];
    }

    public int getNumVagasOcupadas() {
        return numVagasOcupadas;
    }

    public int getNumVagasDisponiveis() {
        return numVagasDisponiveis;
    }

    public Veiculo getVeiculoNaVaga(int numVaga) {
        if (vagas[numVaga - 1] != null) {
            return vagas[numVaga - 1];
        } else {
            System.out.println("Vaga " + numVaga + " disponível.");
            return null;
        }
    }

    public void estacionarVeiculo(Veiculo veiculo, int numVaga) {
        if (vagas[numVaga - 1] != null) {
            System.out.println("Vaga " + numVaga + " ocupada.");
        } else {
            vagas[numVaga - 1] = veiculo;
            numVagasOcupadas++;
            numVagasDisponiveis--;
            System.out.println("Veículo estacionado na vaga " + numVaga + ".");
        }
    }
}
