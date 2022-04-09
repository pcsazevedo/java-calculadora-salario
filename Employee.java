package digitalone.aula3.java.programar;

public class Employee {
    private String nome;
    private String sobrenome;
    private double salario;

    public Employee (String nome, String sobrenome, double salario)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;

    }


    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome (){
        return nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void  setSalario(double salario){
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public double getValorAnual(){

        double valortotal = salario * 12;
        return valortotal;

    }
    public double getAcrescimo(){
        double acrescimo = getValorAnual() * 10 / 100
                + getValorAnual();
        return acrescimo;
    }
}
