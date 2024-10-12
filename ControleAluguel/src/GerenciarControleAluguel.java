import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class GerenciarControleAluguel {
    public static void main(String[] args) throws InterruptedException {
        Carro carro = new Carro();
        carro.setModelo("Fusca");
        carro.setPlaca("ABC-1234");

        Moto moto = new Moto();
        moto.setModelo("CG 150");
        moto.setPlaca("XYZ-5678");

        Caminhao caminhao = new Caminhao();
        caminhao.setModelo("Volvo FH");
        caminhao.setPlaca("LMN-9101");

        Aluguel aluguelCarro = new Aluguel();
        aluguelCarro.setVeiculo(carro);
        aluguelCarro.setDataAluguel(LocalDate.now());
        aluguelCarro.setHoraAluguel(LocalDateTime.now());
        aluguelCarro.apresentarRegistroAluguel();
        Thread.sleep(1000);

        Aluguel aluguelMoto = new Aluguel();
        aluguelCarro.setVeiculo(moto);
        aluguelCarro.setDataAluguel(LocalDate.now());
        aluguelCarro.setHoraAluguel(LocalDateTime.now());
        aluguelCarro.apresentarRegistroAluguel();
        Thread.sleep(1000);

        Aluguel aluguelCaminhao = new Aluguel();
        aluguelCarro.setVeiculo(caminhao);
        aluguelCarro.setDataAluguel(LocalDate.now());
        aluguelCarro.setHoraAluguel(LocalDateTime.now());
        aluguelCarro.apresentarRegistroAluguel();
        Thread.sleep(1000);

        aluguelCarro.setHoraDevolucao(LocalDateTime.now().plusHours(2));
        aluguelCarro.apresentarRegistroDevolucao(carro);
        Thread.sleep(1000);

        aluguelMoto.setHoraDevolucao(LocalDateTime.now().plusHours(2));
        aluguelMoto.apresentarRegistroDevolucao(moto);
        Thread.sleep(1000);

        aluguelCaminhao.setHoraDevolucao(LocalDateTime.now().plusHours(2));
        aluguelCaminhao.apresentarRegistroDevolucao(caminhao);
        Thread.sleep(1000);
    }
}
