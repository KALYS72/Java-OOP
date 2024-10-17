//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StringProcessor sp = new StringProcessor();
        System.out.println(sp.isStrongPassword("A1b@cd"));
        System.out.println(sp.isStrongPassword("A1bcd"));
        System.out.println(sp.isStrongPassword("a1@bcd"));
        System.out.println(sp.isStrongPassword("Abc@def"));
        System.out.println(sp.isStrongPassword("A1@BCD"));
        System.out.println(sp.isStrongPassword("A1b@c!d"));
        System.out.println(sp.calculateDigits("abc123def"));
        System.out.println(sp.calculateDigits("no digits here"));
        System.out.println(sp.calculateDigits("0123456789"));
        System.out.println(sp.calculateDigits("abc1 def2 ghi3"));
        System.out.println(sp.calculateDigits("456789 hello 123"));
        System.out.println(sp.calculateWords("This is a test"));
        System.out.println(sp.calculateWords("SingleWord"));
        System.out.println(sp.calculateWords("Counting  multiple  spaces"));
        System.out.println(sp.calculateWords("hello world"));
        System.out.println(sp.calculateWords("   leading and trailing   "));
        System.out.println(sp.calculateExpression("3+5"));
        System.out.println(sp.calculateExpression("10+2*6"));
        System.out.println(sp.calculateExpression("100*2+12"));
        System.out.println(sp.calculateExpression("100*(2+12)"));
        System.out.println(sp.calculateExpression("100*(2+12)/14"));
    }
}
