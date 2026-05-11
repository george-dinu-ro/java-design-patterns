package my.work.structural.composite;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class CompositeTest {

    @Test
    void givenLeaf_thenHasOnlyInheritedMethods() {
        var name = "simple task";
        var leaf = new Leaf(name);

        assertThat(leaf.getName())
                .isEqualTo(name);

        assertThat(leaf.getDescription())
                .isEqualTo(String.format("Leaf %s - simple component", name));
    }

    @Test
    void givenComposite_thenHasAdditionalMethods() {
        var leaf1Name = "simple task 1";
        var leaf2Name = "simple task 2";
        var leaf3Name = "simple task 3";
        var compositeName = "complex task";
        var components = String.format("Leaf %s - simple component, Leaf %s - simple component", leaf1Name, leaf3Name);

        var leaf1 = new Leaf(leaf1Name);
        var leaf2 = new Leaf(leaf2Name);
        var leaf3 = new Leaf(leaf3Name);

        var composite = new Composite(compositeName);
        composite.addComponent(leaf1);
        composite.addComponent(leaf2);
        composite.addComponent(leaf3);
        composite.removeComponent(leaf2);

        assertThat(composite.getName())
                .isEqualTo(compositeName);

        assertThat(composite.getDescription())
                .isEqualTo(String.format("Composite %s - composite component, with components %s", compositeName, components));
    }

}
