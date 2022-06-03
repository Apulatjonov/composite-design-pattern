import java.util.ArrayList;
import java.util.List;

public class Rosaceae implements Plant{
    private String name;
    private List<Plant> leafs;

    public Rosaceae() {
        this.leafs = new ArrayList<>();
    }

    @Override
    public String getName() {
        StringBuilder result = new StringBuilder();
        for (Plant plant: leafs) {
            result.append(plant.getName());
        }
        return result.toString();
    }

    public void addPlant(Plant plant){
        leafs.add(plant);
    }

    public void removePlant(Plant plant){
        leafs.remove(plant);
    }
}
