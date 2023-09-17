package uniderp.poo.escola.dominio;

public class Motocicleta extends Veiculo{

    public String codigoRenavam;

    public String getCodigoRenavam() {
        return codigoRenavam;
    }

    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }

    public Motocicleta() {
    }

    public Motocicleta(int codigo, String nome, String modelo, String cor, String chassi, String placa, int anoModelo,
            int anoFabricacao, int eixos, double pesoLiquido, double pesoTotal, int assentos, int rodas,
            String fabricante, double potencia, String tipoCombustivel, String nomeProprietario, String estadoUF,
            String cidadeUF, String tipoVeiculo, int qtdeMorotes, int qtdeOcupantes, String codigoRenavam) {
        super(codigo, nome, modelo, cor, chassi, placa, anoModelo, anoFabricacao, eixos, pesoLiquido, pesoTotal,
                assentos, rodas, fabricante, potencia, tipoCombustivel, nomeProprietario, estadoUF, cidadeUF,
                tipoVeiculo, qtdeMorotes, qtdeOcupantes);
        this.codigoRenavam = codigoRenavam;
    }
}