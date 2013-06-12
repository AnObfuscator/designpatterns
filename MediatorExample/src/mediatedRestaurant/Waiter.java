package mediatedRestaurant;


public class Waiter {
    private Patron patron;
    private Cook cook;

    public void getSuggestion() {
        System.out.println("Waiter goes to cook for suggestions.");
        MealType suggestion = cook.getSuggestion();
        System.out.println("Waiter conveys suggestion of "+suggestion+".");
        patron.listenToSuggestion(suggestion);
    }

    public void register(Patron patron) {
        this.patron = patron;
    }

    public void register(Cook cook) {
        this.cook = cook;
    }

    public void order(MealType meal) {
        System.out.println("Waiter puts in order of "+meal+" to cook.");
        cook.prepare(meal);

    }

    public void serve(MealType meal) {
        System.out.println("Waiter brings meal of "+meal+".");
        patron.receive(meal);
    }

    public void complain(MealType suggestion) {
        System.out.println("Waiter conveys complaint to cook. Replace order for "+suggestion+".");
        cook.prepare(suggestion);
    }
}
