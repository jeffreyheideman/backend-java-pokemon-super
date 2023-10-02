public class GrassPokemon extends Pokemon{


    private boolean isGreen;
    private boolean isPoisonous;

    public GrassPokemon(String name, int level, String sound, boolean isGreen, boolean isPoisonous) {
        super(name, level, sound);
        this.isGreen = isGreen;
        this.isPoisonous = isPoisonous;
    }

    @Override
    public void eats() {

    }

    public void attacksWithLeafStorm() {
        System.out.println(getName() + " has ability to attack with leafstorms.");
    }

    public void attacksWithleachseed() {
        System.out.println(getName() + " has ability to attack with leech seed.");
    }



    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    public boolean isGreen() {
        return isGreen;
    }

    public void setGreen(boolean green) {
        isGreen = green;
    }
}
