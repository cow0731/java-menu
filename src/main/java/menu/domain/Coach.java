package menu.domain;

import java.util.List;

public class Coach {
    private String name;
    private List<String> forbiddenMenus;

    public Coach(String name, List<String> forbiddenMenus) {
        this.name = name;
        this.forbiddenMenus = forbiddenMenus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getForbiddenMenus() {
        return forbiddenMenus;
    }

    public void setForbiddenMenus(List<String> forbiddenMenus) {
        this.forbiddenMenus = forbiddenMenus;
    }
}
