import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aluguel {
    private int idAluguel;
    private LocalDateTime HoraAluguel;
    private LocalDateTime HoraDevolucao;
    private Veiculo veiculo;
    private LocalDate dataAluguel;

    public int getIdAluguel() {
        return idAluguel;
    }

    public void setIdAluguel(int idAluguel) {
        this.idAluguel = idAluguel;
    }

    public LocalDateTime getHoraAluguel() {
        return HoraAluguel;
    }

    public void setHoraAluguel(LocalDateTime horaAluguel) {
        HoraAluguel = horaAluguel;
    }

    public LocalDateTime getHoraDevolucao() {
        return HoraDevolucao;
    }

    public void setHoraDevolucao(LocalDateTime horaDevolucao) {
        HoraDevolucao = horaDevolucao;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public LocalDate getDataAluguel() {
        return dataAluguel;
    }

    public void setDataAluguel(LocalDate dataAluguel) {
        this.dataAluguel = dataAluguel;
    }

    public void apresentarRegistroAluguel() {
        String tipoVeiculo = "Desconhecido";
        if (veiculo instanceof Carro) {
            tipoVeiculo = "Carro";
        } else if (veiculo instanceof Moto) {
            tipoVeiculo = "Moto";
        } else if (veiculo instanceof Caminhao) {
            tipoVeiculo = "Caminhão";
        }

        System.out.println("Registro de Aluguel: ");
        System.out.println("Tipo de veículo = " + tipoVeiculo);
            System.out.println("Hora do Aluguel = " + HoraAluguel);
            System.out.println("data do Aluguel = " + dataAluguel);
    }

    public void apresentarRegistroDevolucao(Veiculo veiculo) {
        String tipoVeiculo = "Desconhecido";
        if (veiculo instanceof Carro) {
            tipoVeiculo = "Carro";
        } else if (veiculo instanceof Moto) {
            tipoVeiculo = "Moto";
        } else if (veiculo instanceof Caminhao) {
            tipoVeiculo = "Caminhão";
        }
        System.out.println("Registro Devolucao: ");
        System.out.println("Tipo de veículo = " + tipoVeiculo);
        System.out.println("Hora do Aluguel = " + HoraAluguel);
        System.out.println("Hora da Devolucao = " + HoraDevolucao);
        System.out.println("data do Aluguel = " + dataAluguel);;
    }
}
