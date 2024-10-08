package designPattern;

class Pizza1
{
	// Required parameters
    private final String size;
    private final String crustType;

    // Optional parameters
    private final boolean cheese;
    private final boolean pepperoni;
    private final boolean bacon;
    private final boolean mushrooms;
    private final boolean olives;

    // Private constructor to be called by the Builder
    private Pizza1(PizzaBuilder builder) {
        this.size = builder.size;
        this.crustType = builder.crustType;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
        this.mushrooms = builder.mushrooms;
        this.olives = builder.olives;
    }
    
    // Getters and other methods
    @Override
    public String toString() {
        return "Pizza [size=" + size + ", crustType=" + crustType +
               ", cheese=" + cheese + ", pepperoni=" + pepperoni +
               ", bacon=" + bacon + ", mushrooms=" + mushrooms +
               ", olives=" + olives + "]";
    }

    // Static nested Builder class
    public static class PizzaBuilder {
        // Required parameters
        private final String size;
        private final String crustType;

        // Optional parameters - initialized to default values
        private boolean cheese = false;
        private boolean pepperoni = false;
        private boolean bacon = false;
        private boolean mushrooms = false;
        private boolean olives = false;

        // Constructor for required parameters
        public PizzaBuilder(String size, String crustType) {
            this.size = size;
            this.crustType = crustType;
        }

        // Setter methods for optional parameters
        public PizzaBuilder addCheese(boolean value) {
            this.cheese = value;
            return this;
        }

        public PizzaBuilder addPepperoni(boolean value) {
            this.pepperoni = value;
            return this;
        }

        public PizzaBuilder addBacon(boolean value) {
            this.bacon = value;
            return this;
        }

        public PizzaBuilder addMushrooms(boolean value) {
            this.mushrooms = value;
            return this;
        }

        public PizzaBuilder addOlives(boolean value) {
            this.olives = value;
            return this;
        }

        // Build method to create the final Pizza object
        public Pizza1 build() {
            return new Pizza1(this);
        }
    }
	


}


public class BuilderDesignPattern {


	public static void main(String[] args) {
		
		   // Create a Pizza with some toppings
        Pizza1 meatLoversPizza = new Pizza1.PizzaBuilder("Large", "Thin Crust")
                .addCheese(true)
                .addPepperoni(true)
                .addBacon(true)
                .build();

        // Create a Vegetarian Pizza
        Pizza1 veggiePizza = new Pizza1.PizzaBuilder("Medium", "Stuffed Crust")
                .addCheese(true)
                .addMushrooms(true)
                .addOlives(true)
                .build();

        // Print the details of the pizzas
        System.out.println(meatLoversPizza);
        System.out.println(veggiePizza);
		
	}
}
