package digitalone.aula3.java.programar;

import java.util.Scanner;

public class EmployeeTest {
    public static void main (String [] args){

        Employee employee1 = new Employee("Paulo César","Azevedo",0);
        Employee employee2 = new Employee("Luiza","Azevedo",0);

        Scanner input = new Scanner(System.in);

        System.out.printf("%s %s seu salario é $%.2f%n%n",
                employee1.getNome(), employee1.getSobrenome(), employee1.getSalario());
        System.out.printf("%s %s seu salario é $%.2f%n%n",
                employee2.getNome(), employee2.getSobrenome(), employee2.getSalario());

        System.out.printf("Entre com o salario mensal de %s: ",
                employee1.getNome());
        double salario = input.nextDouble();
        System.out.printf("%nadding %.2f to %s mensal%n%n",
                salario, employee1.getNome());
        employee1.setSalario(salario);

        System.out.printf("Entre com o  Salario mensal de %s: ", employee2.getNome());
        salario = input.nextDouble();
        System.out.printf("%nfoi adicionado $%.2f para %s salario mensal%n%n", salario, employee2.getNome());
        employee2.setSalario(salario);


        System.out.printf("%s %s seu salario Mensal é: $%.2f%n%n",
                employee1.getNome(), employee1.getSobrenome(), employee1.getSalario());
        System.out.printf("%s %s seu salario Anual é: $%.2f%n%n",
                employee1.getNome(), employee1.getSobrenome(), employee1.getValorAnual());
        System.out.printf("%s %s seu salario anual com acrescimo de : $%.2f%n%n",
                employee1.getNome(), employee1.getSobrenome(), employee1.getAcrescimo());





        System.out.printf("%s %s seu salario Mensal é: $%.2f%n%n",
                employee2.getNome(), employee2.getSobrenome(), employee2.getSalario());
        System.out.printf("%s %s seu salario anual é $%.2f%n%n",
                employee2.getNome(), employee2.getSobrenome(),employee2.getValorAnual());
        System.out.printf("%s %s seu salario anual com acrescimo : $%.2f%n%n",
                employee2.getNome(), employee2.getSobrenome(), employee2.getAcrescimo());
    }

}
