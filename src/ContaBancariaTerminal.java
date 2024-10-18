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

    public String verificacaoDeCaracteres(int atributoAserVerificado) {

        var mensagem = new Mensagens();
        String resultado = "Fail";
        if (String.valueOf(atributoAserVerificado).length() != 5) {
            mensagem.exibir(mensagem.erroDeQuantidadeDeCaracter);
        } else {
            resultado = "Pass";
        }
        return resultado;
    }

    public String verificacaoDeCaracteres(String atributoAserVerificado) {

        var mensagem = new Mensagens();
        String resultado = "Fail";
        if (atributoAserVerificado.length() != 5) {
            mensagem.exibir(mensagem.erroDeQuantidadeDeCaracter);
        } else {
            resultado = "Pass";
        }
         return resultado;
    }

    public void setNumeroDaAgencia(String numeroDaAgencia) {

        if (verificacaoDeCaracteres(numeroDaAgencia).equals("Pass") ) {this.numeroDaAgencia = numeroDaAgencia;}
    }

    public void setNumeroDaConta(int numeroDaConta) {

        if (verificacaoDeCaracteres(numeroDaConta).equals("Pass") ) {this.numeroDaConta = numeroDaConta;}
    }

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
}
