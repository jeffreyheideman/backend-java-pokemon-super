public abstract class Pokemon {

    private String name;
    private int level;
    private String sound;

    public Pokemon(String name, int level, String sound) {
        this.name = name;
        this.level = level;
        this.sound = sound;
    }

    public abstract void eats();

    public void sleeps() {
        System.out.println(name + " sleeps.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

}

