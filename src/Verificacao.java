public class Verificacao {

    public String QtDeCaracteres(int atributoAserVerificado) {

        var mensagem = new Mensagens();
        String resultado = "Fail";
        if (String.valueOf(atributoAserVerificado).length() != 5) {
            mensagem.exibir(mensagem.erroDeQuantidadeDeCaracter);
        } else {
            resultado = "Pass";
        }
        return resultado;
    }

    public String QtDeCaracteres(String atributoAserVerificado) {

        var mensagem = new Mensagens();
        String resultado = "Fail";
        if (atributoAserVerificado.length() != 5) {
            mensagem.exibir(mensagem.erroDeQuantidadeDeCaracter);
        } else {
            resultado = "Pass";
        }
        return resultado;
    }

}
