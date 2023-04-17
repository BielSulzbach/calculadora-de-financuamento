public class CalculadoraFinanciamente {
    public static void main(String[] args) {
        int ValorDoCarro = 10000;
        int duracaoDoEmprestimo = 5;
        int taxaDeJuros = 5;
        int valorEntrada = 2000;

        if (duracaoDoEmprestimo <= 0 || taxaDeJuros <= 0) {
            System.out.println("erro, você deve fazer um emprestimo valido");
        } else if (valorEntrada >= ValorDoCarro) {
            System.out.println("oba!! você pode compra ro carro a vista");
        } else {
            int saldoRestante = ValorDoCarro - valorEntrada;
            int duracaoMeses = duracaoDoEmprestimo * 12;
            int saldoMensal = saldoRestante / duracaoMeses;
            int juros = saldoMensal + taxaDeJuros / 100;
            int pagamentoMensal = saldoMensal + juros;
            System.out.println(pagamentoMensal);
        }
    }
}