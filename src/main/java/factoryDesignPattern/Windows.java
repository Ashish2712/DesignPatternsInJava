package factoryDesignPattern;

public class Windows  implements  OS{
    @Override
    public void spec() {
        System.out.println("please save me I am dying OS!");
    }
}
