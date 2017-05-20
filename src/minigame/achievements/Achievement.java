package minigame.achievements;

public class Achievement {

    private String name = null;
    private String publicName = null;
    private String description = null;
    private int stages = 0;
    private boolean secret = false;
    private boolean disabled= false;

    public Achievement(String name, String publicName, String description, int stages, boolean secret, boolean disabled) {

        this.name = name;
        this.publicName = publicName;
        this.description = description;
        this.stages = stages;
        this.secret = secret;
        this.disabled = disabled;

    }

    public String getName() {
        return this.name;
    }

    public String getPublicName() {
        return this.publicName;
    }

    public String getDescription() {
        return this.description;
    }

    public int getStages() {
        return this.stages;
    }

    public boolean isSecret() {
        return this.secret;
    }

    public boolean isDisabled() {
        return this.disabled;
    }
}
