public class Main {
    public static void main(String[] args) {
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 10, "Pika Pika", true, false);

        pikachu.attacksWithThunder();
        pikachu.voltTackle();
        pikachu.eats();


        FirePokemon charmander = new FirePokemon("Charmander", 10, "Char Char", 100, true);

        charmander.flameThrower();
        charmander.fireBlast();
        charmander.eats();
        charmander.sleeps();

        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 10, "Bulba Bulba", true, true);

        bulbasaur.attacksWithLeafStorm();
        bulbasaur.attacksWithleachseed();
        bulbasaur.eats();

        WaterPokemon squirtle = new WaterPokemon("Squirtle", 10, "Squirt Squirt", "He performes the raindance regularly", true);

        squirtle.attacksWithWaterBlast();
        squirtle.attacksWithHydroPump();
        squirtle.eats();
        squirtle.sleeps();

    }
}
