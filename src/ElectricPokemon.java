public class ElectricPokemon extends Pokemon{

    private boolean hasExternalElectricity;

    private boolean isWild;


    public ElectricPokemon(String name, int level, String sound, boolean hasExternalElectricity, boolean isWild) {
        super(name, level, sound);
        this.hasExternalElectricity = hasExternalElectricity;
        this.isWild = isWild;
    }

    @Override
    public void eats() {
        System.out.println(getName() + " eats electric berries.");
    }

    public void attacksWithThunder() {
        System.out.println(getName() + " has ability to attack with thunder.");
    }

    public void voltTackle() {
        System.out.println(getName() + "has ability to attack with volt tackle.");
    }

    public boolean isHasExternalElectricity() {
        return hasExternalElectricity;
    }

    public void setHasExternalElectricity(boolean hasExternalElectricity) {
        this.hasExternalElectricity = hasExternalElectricity;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean wild) {
        isWild = wild;
    }
}
