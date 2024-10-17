public class StringTest {
    @Test
    public void testIsStrongPassword() {
        StringProcessor sp = new StringProcessor();
        sp.isStrongPassword("A1b@cd");
        sp.calculateDigits("abc123def");
        sp.calculateWords("This is a test");
    }
}
