public class Rose implements Plant {
    private String name;

    @Override
    public String getName() {
        return getClass().getName();
    }
}
