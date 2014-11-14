/*
    Validação de CPF
    disponível em: http://www.devmedia.com.br/validando-o-cpf-em-uma-aplicacao-java/22097
 */
package Uteis;

import java.util.InputMismatchException;

/**
 *
 * @author Ramon Honorio
 */
public class ValidaCPF {
    public static boolean isCPF(String cpf){
        if(cpf.equals("000.000.000-00") || cpf.equals("111.111.111-11") ||
                cpf.equals("222.222.222-22") || cpf.equals("333.333.333-33") ||
                cpf.equals("444.444.444-44") || cpf.equals("555.555.555-55") ||
                cpf.equals("666.666.666-66") || cpf.equals("777.777.777-77") ||
                cpf.equals("888.888.888-88") || cpf.equals("999.999.999-99") ||
                cpf.length()!=14)
            return false;
        
        char dig10, dig11;
        int soma, i, r, num, peso;
        
        
        try {
            // Calculando o primeiro digito verificador
            soma = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
                // converte o i-esimo caractere do CPF em um numero: 
                // por exemplo, transforma o caractere '0' no inteiro 0 
                // (48 eh a posicao de '0' na tabela ASCII) 
                num = (int)(cpf.charAt(i)-48);
                soma += num*peso;
                peso = peso - 1;
            }
            
            r = 11 - (soma%11);
            if(r==10 || r==11)
                dig10 = '0';
            else
                dig10 = (char)(r + 48); // converte para o respectivo caractere ASCII
            
            // Calculando o segundo digito verificador
            soma = 0;
            peso = 11;
            for (i = 0; i < 10; i++){
                num = (int)(cpf.charAt(i)-48);
                soma += num*peso;
                peso = peso-1;
            }
            
            r = 11 - (soma%11);
            if(r==10 || r==11)
                dig11 = '0';
            else
                dig11 = (char)(r+48);
            
            // verifica se os digitos calculados são os mesmos que os informados
            if(dig10 == cpf.charAt(12) && dig11 == cpf.charAt(13))
                return true;
            
        } catch (InputMismatchException e) {
            return false;
        }
        return false;
    }
}
