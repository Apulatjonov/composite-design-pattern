public class Apple implements Plant{
    private String name;

    @Override
    public String getName() {
        return getClass().getName();
    }
}