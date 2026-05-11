package my.work.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {

    private final String name;

    private final List<Component> components = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        var componentDescriptions = components.stream()
                .map(Component::getDescription)
                .reduce("", Composite::computeAndGetDescription);

        return String.format("Composite %s - composite component, with components %s", name, componentDescriptions);
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public void removeComponent(Component component) {
        components.remove(component);
    }

    private static String computeAndGetDescription(String description1, String description2) {
        return description1.isBlank() ? description2 : (description1 + ", " + description2);
    }

}
