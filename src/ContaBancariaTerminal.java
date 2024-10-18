import java.util.Scanner;

public class ContaBancariaTerminal {
    //Declaracao de atributos:
    private int numeroDaConta = 0;
    private String numeroDaAgencia = "";
    //Declaracao de métodos:
    static Verificacao verificacao = new Verificacao();

    public static void main(String[] args) {
        var entrada = new Scanner(System.in);
        var mensagem = new Mensagens();
        var conta = new ContaBancariaTerminal();

        while (conta.getNumeroDaAgencia().isBlank()) {
            mensagem.exibir(mensagem.solicitarNumeroDeAgencia);
            conta.setNumeroDaAgencia(entrada.nextLine());
        }

        while (conta.getNumeroDaConta() == 0) {
            mensagem.exibir(mensagem.solicitarNumeroDaConta);
            conta.setNumeroDaConta(entrada.nextInt());
        }
        mensagem.debugCheck();
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(String numeroDaAgencia) {
        if (verificacao.QtDeCaracteres(numeroDaAgencia).equals("Pass")) {
            this.numeroDaAgencia = numeroDaAgencia;
        }
    }

    public void setNumeroDaConta(int numeroDaConta) {
        if (verificacao.QtDeCaracteres(numeroDaConta).equals("Pass")) {
            this.numeroDaConta = numeroDaConta;
        }
    }
}
