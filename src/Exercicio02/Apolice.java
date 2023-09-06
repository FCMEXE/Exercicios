package Exercicio02;

public class Apolice {
    int numero;
    String nome;
    int idade;
    char sexo;

    double valorAutomovel;
    int ValorApolice;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getValorAutomovel() {
        return valorAutomovel;
    }

    public void setValorAutomovel(double valorAutomovel) {
        this.valorAutomovel = valorAutomovel;
    }

    String Imprimir() {
        return "Número:  " + numero +
                ",Nome: " + nome +
                ",Idade: " + idade +
                ",Sexo: " + sexo +
                ",Valor Automovel: " + valorAutomovel +
                ",Valor Apolice: " + valorAutomovel;
    }

    public double CalcularValor() {

        if (sexo == 'M'  && idade <= 25) {
            return valorAutomovel * 10 / 100;
        }
        if (sexo == 'M'  && idade > 25) {
            return valorAutomovel * 5 / 100;
        }
        if (sexo == 'F' )
            return valorAutomovel * 2 / 100;

        return valorAutomovel;
    }
}
