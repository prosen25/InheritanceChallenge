//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Employee tim = new Employee("Tim", "01/01/1987", "01/11/2024");
        System.out.println(tim);
        System.out.println("Age = " + tim.getAge());
        System.out.println("Pay = £" + tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "01/01/1991", "15/11/2024", 57000);
        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = £" + joe.collectPay());

        joe.retire();

        System.out.println(joe);
        System.out.println("Age = " + joe.getAge());
        System.out.println("Pay = £" + joe.collectPay());

        HourlyEmployee maria = new HourlyEmployee("Joe", "01/01/1991", "15/11/2024", 11.50);
        System.out.println(maria);
        System.out.println("Age = " + maria.getAge());
        System.out.println("Pay = £" + maria.collectPay());
        System.out.println("Double Pay = £" + maria.getDoublePay());
    }
}