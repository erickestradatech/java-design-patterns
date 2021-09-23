package org.erick.patters.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Directory extends Component {

    private List<Component> sons;

    public Directory(String name) {
        super(name);
        this.sons = new ArrayList<>();
    }

    public Directory addComponent(Component c) {
        this.sons.add(c);
        return this;
    }

    public void removeComponent(Component c) {
        this.sons.remove(c);
    }

    @Override
    public String toShow(int level) {

        StringBuilder sb = new StringBuilder("\t".repeat(level));
        sb.append(name)
                .append("/")
                .append("\n");

        for (Component son : this.sons) {
            sb.append(son.toShow(level + 1));
            if (son instanceof File) {
                sb.append("\n");
            }
        }

        return sb.toString();
    }

    @Override
    public boolean search(String name) {
        return sons.stream().anyMatch(component -> component.search(name));
    }
}
