import java.util.Scanner;

public class ContaBancariaTerminal {
    //declaração e inicialização de variáveis

    private int numeroDaConta = 0;
    private String numeroDaAgencia = "";

    //declaração de métodos

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(String numeroDaAgencia) {
        var mensagem = new Mensagens();
        if (numeroDaAgencia.length() != 5) {
            mensagem.exibir(mensagem.erroDeQuantidadeDeCaracter);
            return;
        }
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public void setNumeroDaConta(int numeroDaConta) {

        this.numeroDaConta = numeroDaConta;
    }

    public static void main(String[] args) {

        var mensagem = new Mensagens();

        var contaBancariaTerminal = new ContaBancariaTerminal();

        while (contaBancariaTerminal.getNumeroDaAgencia().isBlank()) {
            var scanner = new Scanner(System.in);
            mensagem.exibir(mensagem.solicitarNumeroDeAgencia);
            contaBancariaTerminal.setNumeroDaAgencia(scanner.nextLine());

        }

        mensagem.debugCheck();



    }
}
