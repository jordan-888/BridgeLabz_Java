package JavaCollectionsStreams.generics;

import java.util.ArrayList;
import java.util.List;

// MealPlan interface
interface MealPlan {
    String getPlanType();

    void displayNutritionInfo();
}

// Concrete meal plan implementations
class VegetarianMeal implements MealPlan {
    @Override
    public String getPlanType() {
        return "Vegetarian";
    }

    @Override
    public void displayNutritionInfo() {
        System.out.println("Nutrition: Rich in fiber, vitamins, and plant-based proteins");
    }
}

class VeganMeal implements MealPlan {
    @Override
    public String getPlanType() {
        return "Vegan";
    }

    @Override
    public void displayNutritionInfo() {
        System.out.println("Nutrition: 100% plant-based, no animal products, high in antioxidants");
    }
}

class KetoMeal implements MealPlan {
    @Override
    public String getPlanType() {
        return "Keto";
    }

    @Override
    public void displayNutritionInfo() {
        System.out.println("Nutrition: Low-carb, high-fat, moderate protein for ketosis");
    }
}

class HighProteinMeal implements MealPlan {
    @Override
    public String getPlanType() {
        return "High-Protein";
    }

    @Override
    public void displayNutritionInfo() {
        System.out.println("Nutrition: High protein content for muscle building and recovery");
    }
}

// Generic Meal class with bounded type parameter
class Meal<T extends MealPlan> {
    private String mealName;
    private int calories;
    private T mealPlan;
    private List<String> ingredients;

    public Meal(String mealName, int calories, T mealPlan) {
        this.mealName = mealName;
        this.calories = calories;
        this.mealPlan = mealPlan;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public void displayMealInfo() {
        System.out.println("\n--- Meal Details ---");
        System.out.println("Meal Name: " + mealName);
        System.out.println("Plan Type: " + mealPlan.getPlanType());
        System.out.println("Calories: " + calories + " kcal");
        mealPlan.displayNutritionInfo();
        System.out.println("Ingredients: " + String.join(", ", ingredients));
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public int getCalories() {
        return calories;
    }
}

// Meal Plan Generator with generic methods
class MealPlanGenerator {

    // Generic method to validate meal plan
    public <T extends MealPlan> boolean validateMealPlan(Meal<T> meal, int minCalories, int maxCalories) {
        if (meal.getCalories() < minCalories || meal.getCalories() > maxCalories) {
            System.out.println("❌ Validation Failed: Calories out of range!");
            return false;
        }
        System.out.println("✓ Validation Passed: Meal plan is within calorie range");
        return true;
    }

    // Generic method to generate personalized meal plan
    public <T extends MealPlan> void generatePersonalizedPlan(Meal<T> meal) {
        System.out.println("\n========================================");
        System.out.println("   PERSONALIZED MEAL PLAN GENERATED    ");
        System.out.println("========================================");
        meal.displayMealInfo();
        System.out.println("\n✓ Your " + meal.getMealPlan().getPlanType() + " meal plan is ready!");
    }

    // Generic method to compare two meal plans
    public <T extends MealPlan, U extends MealPlan> void compareMealPlans(Meal<T> meal1, Meal<U> meal2) {
        System.out.println("\n--- Comparing Meal Plans ---");
        System.out.println("Meal 1: " + meal1.getMealPlan().getPlanType() + " - " + meal1.getCalories() + " kcal");
        System.out.println("Meal 2: " + meal2.getMealPlan().getPlanType() + " - " + meal2.getCalories() + " kcal");

        int calorieDiff = Math.abs(meal1.getCalories() - meal2.getCalories());
        System.out.println("Calorie Difference: " + calorieDiff + " kcal");
    }

    // Method using wildcard for flexible meal plan processing
    public void displayAllMealTypes(List<? extends MealPlan> mealPlans) {
        System.out.println("\n--- Available Meal Plan Types ---");
        for (MealPlan plan : mealPlans) {
            System.out.println("• " + plan.getPlanType());
        }
    }
}

public class PersonalizedMealPlanGenerator {
    public static void main(String[] args) {
        System.out.println("=== Personalized Meal Plan Generator ===\n");

        MealPlanGenerator generator = new MealPlanGenerator();

        // Creating different meal plans
        Meal<VegetarianMeal> vegMeal = new Meal<>("Mediterranean Bowl", 450, new VegetarianMeal());
        vegMeal.addIngredient("Quinoa");
        vegMeal.addIngredient("Chickpeas");
        vegMeal.addIngredient("Cucumber");
        vegMeal.addIngredient("Tomatoes");
        vegMeal.addIngredient("Olive Oil");

        Meal<VeganMeal> veganMeal = new Meal<>("Buddha Bowl", 380, new VeganMeal());
        veganMeal.addIngredient("Brown Rice");
        veganMeal.addIngredient("Tofu");
        veganMeal.addIngredient("Avocado");
        veganMeal.addIngredient("Kale");
        veganMeal.addIngredient("Tahini");

        Meal<KetoMeal> ketoMeal = new Meal<>("Keto Power Plate", 520, new KetoMeal());
        ketoMeal.addIngredient("Grilled Salmon");
        ketoMeal.addIngredient("Broccoli");
        ketoMeal.addIngredient("Butter");
        ketoMeal.addIngredient("Cheese");
        ketoMeal.addIngredient("Almonds");

        Meal<HighProteinMeal> proteinMeal = new Meal<>("Athlete's Choice", 600, new HighProteinMeal());
        proteinMeal.addIngredient("Chicken Breast");
        proteinMeal.addIngredient("Sweet Potato");
        proteinMeal.addIngredient("Eggs");
        proteinMeal.addIngredient("Spinach");
        proteinMeal.addIngredient("Greek Yogurt");

        // Validating meal plans
        System.out.println("--- Validating Meal Plans ---");
        generator.validateMealPlan(vegMeal, 300, 500);
        generator.validateMealPlan(ketoMeal, 300, 500);
        generator.validateMealPlan(proteinMeal, 300, 500);

        // Generating personalized plans
        generator.generatePersonalizedPlan(vegMeal);
        generator.generatePersonalizedPlan(veganMeal);

        // Comparing meal plans
        generator.compareMealPlans(vegMeal, ketoMeal);
        generator.compareMealPlans(veganMeal, proteinMeal);

        // Displaying all available meal types using wildcard
        List<MealPlan> allMealTypes = new ArrayList<>();
        allMealTypes.add(new VegetarianMeal());
        allMealTypes.add(new VeganMeal());
        allMealTypes.add(new KetoMeal());
        allMealTypes.add(new HighProteinMeal());

        generator.displayAllMealTypes(allMealTypes);

        System.out.println("\n--- Type Safety Benefits ---");
        System.out.println("✓ Only valid MealPlan types can be used");
        System.out.println("✓ Generic methods ensure type-safe meal validation");
        System.out.println("✓ Bounded type parameters prevent invalid meal assignments");
    }
}
