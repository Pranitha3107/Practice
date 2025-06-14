package TernaryOperator;
public class Ex006_nested_ternary {
    public static void main(String[] args) {
        /*age=20
        age<18-->minor
        age between 18 and 65-->adult
        age>65-->Senior Citizen
        */
        int age=20;
        String result=(age<18)?"Minor":(age>65)?"Senior Cizen":"Adult";
        System.out.println(result);
    }
}
