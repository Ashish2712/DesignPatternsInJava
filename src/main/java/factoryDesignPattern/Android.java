package factoryDesignPattern;

public class Android implements  OS{

    @Override
    public void spec() {
        System.out.println("Most powerful OS!");
    }

    public static class FactoryMain {

        public static void main(String[] args) {

            OperatingSystemFactory osf = new OperatingSystemFactory();
            OS obj = osf.getInstance("");
             obj.spec();


        }
    }
}
