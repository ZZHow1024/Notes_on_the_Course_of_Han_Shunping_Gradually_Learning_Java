public class Test {

}

class Tt{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("...");
    }
}