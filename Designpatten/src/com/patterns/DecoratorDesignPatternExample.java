package com.patterns;

// Step 1: Pizza Interface
interface Pizza {
    String bake();
}

// Step 2: Concrete Component - BasePizza
class BasePizza implements Pizza {
    @Override
    public String bake() {
        return "Base Pizza";
    }
}

// Step 3: Abstract Decorator
abstract class PizzaDecorator implements Pizza {
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String bake() {
        return pizza.bake(); // delegate to wrapped object
    }
}

// Step 4: Concrete Decorator - ChizzaPizza
class ChizzaPizza extends PizzaDecorator {
    public ChizzaPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + " + Chizza Topping";
    }
}

// Step 5: Concrete Decorator - NonVegPizza
class NonVegPizza extends PizzaDecorator {
    public NonVegPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + " + Non-Veg Topping";
    }
}

// Step 6: Concrete Decorator - ButterNonPizza
class ButterNonPizza extends PizzaDecorator {
    public ButterNonPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String bake() {
        return super.bake() + " + Butter Non";
    }
}

// Step 7: Client Code
public class DecoratorDesignPatternExample {
    public static void main(String[] args) {
        Pizza base = new BasePizza();

        Pizza chizza = new ChizzaPizza(base);
        System.out.println("Chizza: " + chizza.bake());

        Pizza nonVegChizza = new NonVegPizza(base);
        System.out.println("Non-Veg Chizza: " + nonVegChizza.bake());

        Pizza nonVegChizza1 = new NonVegPizza(chizza);
        System.out.println("Chizza + Non-Veg: " + nonVegChizza1.bake());

        Pizza butterNon = new ButterNonPizza(base);
        System.out.println("Butter Non: " + butterNon.bake());

        Pizza fullLoaded = new ButterNonPizza(new NonVegPizza(new ChizzaPizza(base)));
        System.out.println("Fully Loaded (Chizza + Non-Veg + Butter): " + fullLoaded.bake());
    }
}
