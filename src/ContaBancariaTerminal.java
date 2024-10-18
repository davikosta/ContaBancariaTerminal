import java.util.Scanner;

public class ContaBancariaTerminal {
    //declaração e inicialização de variáveis

    private int numeroDaConta;
    private String numeroDaAgencia;

    //declaração de métodos

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNumeroDaAgencia() {
        return numeroDaAgencia;
    }

    public void setNumeroDaAgencia(String numeroDaAgencia) {
        if (numeroDaAgencia.length() > 5) {
            System.out.println("O número de caracteres não pode ultrapassar 5!");
            return;
        }
        this.numeroDaAgencia = numeroDaAgencia;
    }

    public void setNumeroDaConta(int numeroDaConta) {

        this.numeroDaConta = numeroDaConta;
    }

    public static void main(String[] args) {

        var contaBancariaTerminal = new ContaBancariaTerminal();

        var scanner = new Scanner(System.in);

        System.out.println("Insira o número da agência, com dígito e hífen:");

        contaBancariaTerminal.setNumeroDaAgencia(scanner.nextLine());

        System.out.println(contaBancariaTerminal.getNumeroDaAgencia());



    }
}
