package com.example.recipebookapp.data.repo

import com.example.recipebookapp.R
import com.example.recipebookapp.data.models.Category
import com.example.recipebookapp.data.models.Recipe

object Repository {
    fun loadCategories(): List<Category>{
        return listOf<Category>(
            Category(1,R.string.breakfast, R.drawable.brakfast),
            Category(2,R.string.lunch, R.drawable.brakfast),
            Category(3,R.string.snacks, R.drawable.brakfast),
            Category(4,R.string.salad, R.drawable.brakfast),
            Category(5,R.string.soup, R.drawable.brakfast),
            Category(6,R.string.indian, R.drawable.brakfast),
            Category(7,R.string.beverages, R.drawable.brakfast),
            Category(8,R.string.dessart, R.drawable.brakfast)

        )
    }

    fun loadRecipe():List<Recipe>{
        return listOf<Recipe>(
            Recipe(id = 1, title = "Chocolate Cake", ingredients = listOf("Flour", "Cocoa Powder", "Sugar", "Eggs"),  imageUrl = R.drawable.brakfast, R.string.breakfast),
            Recipe(id = 2, title = "Grilled Chicken", ingredients = listOf("Chicken", "Olive Oil", "Spices"), imageUrl = R.drawable.ic_launcher_background,  R.string.lunch),
            Recipe(id = 3, title = "Spring Rolls", ingredients = listOf("Spring Roll Wrappers", "Vegetables", "Soy Sauce"), imageUrl = R.drawable.ic_launcher_foreground, R.string.snacks),
            Recipe(id = 1, title = "Chocolate Cake",
                ingredients = listOf("Flour", "Cocoa Powder", "Sugar", "Eggs"),
                imageUrl = R.drawable.brakfast, R.string.breakfast),

            // Recipe 2 - belongs to Main Course ( R.string.lunch)
            Recipe(id = 2, title = "Grilled Chicken",
                ingredients = listOf("Chicken", "Olive Oil", "Garlic", "Lemon"),
                imageUrl = R.drawable.ic_launcher_background, R.string.lunch),

            // Recipe 3 - belongs to Snacks (R.string.snacks)
            Recipe(id = 3, title = "Spring Rolls",
                ingredients = listOf("Spring Roll Wrappers", "Vegetables", "Soy Sauce"),
                 imageUrl = R.drawable.ic_launcher_foreground, R.string.snacks),

            // Recipe 4 - belongs to Salads (R.string.salad)
            Recipe(id = 4, title = "Greek Salad",
                ingredients = listOf("Cucumber", "Tomato", "Olives", "Feta Cheese"),
                imageUrl = R.drawable.ic_launcher_foreground, R.string.salad),

            // 1. Dessert Recipe
            Recipe(id = 1, title = "Chocolate Cake",
                ingredients = listOf("Flour", "Cocoa Powder", "Sugar", "Eggs", "Butter"),
                imageUrl = R.drawable.brakfast, R.string.breakfast),

            // 2. Dessert Recipe
            Recipe(id = 2, title = "Vanilla Ice Cream",
                ingredients = listOf("Milk", "Sugar", "Vanilla Extract", "Egg Yolks"),
                imageUrl = R.drawable.brakfast, R.string.breakfast),

            // 3. Main Course Recipe
            Recipe(id = 3, title = "Grilled Chicken",
                ingredients = listOf("Chicken", "Olive Oil", "Garlic", "Lemon", "Thyme"),
                imageUrl = R.drawable.ic_launcher_background, R.string.lunch),

            // 4. Main Course Recipe
            Recipe(id = 4, title = "Spaghetti Bolognese",
                ingredients = listOf("Spaghetti", "Ground Beef", "Tomato Sauce", "Garlic", "Onion"),
                imageUrl = R.drawable.ic_launcher_background, R.string.lunch),

            // 5. Snack Recipe
            Recipe(id = 5, title = "Spring Rolls",
                ingredients = listOf("Spring Roll Wrappers", "Carrot", "Cabbage", "Soy Sauce", "Ginger"),
                imageUrl = R.drawable.ic_launcher_foreground, R.string.snacks),

            // 6. Snack Recipe
            Recipe(id = 6, title = "Guacamole",
                ingredients = listOf("Avocados", "Lime", "Garlic", "Cilantro", "Salt"),
                imageUrl = R.drawable.ic_launcher_foreground, R.string.snacks),

            // 7. Salad Recipe
            Recipe(id = 7, title = "Caesar Salad",
                ingredients = listOf("Lettuce", "Croutons", "Caesar Dressing", "Parmesan Cheese"),
                imageUrl = R.drawable.ic_launcher_foreground, R.string.salad),

            // 8. Salad Recipe
            Recipe(id = 8, title = "Caprese Salad",
                ingredients = listOf("Tomatoes", "Mozzarella", "Basil", "Olive Oil", "Balsamic Vinegar"),
                imageUrl = R.drawable.ic_launcher_foreground, R.string.salad),

            // 9. Vegan Recipe
            Recipe(id = 9, title = "Vegan Tacos",
                ingredients = listOf("Taco Shells", "Black Beans", "Avocado", "Lettuce", "Tomato"),
                imageUrl = R.drawable.ic_launcher_foreground, R.string.soup),

            // 10. Vegan Recipe
            Recipe(id = 10, title = "Lentil Soup",
                ingredients = listOf("Lentils", "Carrot", "Celery", "Garlic", "Vegetable Broth"),
                imageUrl = R.drawable.ic_launcher_foreground, R.string.soup),
            // 2. Main Course
            Recipe(
                id = 6,
                title = "Butter Chicken",
                ingredients = listOf("Chicken", "Butter", "Tomato Puree", "Cream", "Spices"),
                imageUrl = R.drawable.ic_launcher_background,
                R.string.lunch
            ),
            Recipe(
                id = 7,
                title = "Paneer Tikka",
                ingredients = listOf("Paneer", "Yogurt", "Spices", "Capsicum", "Onion"),
                imageUrl = R.drawable.ic_launcher_background,
                 R.string.lunch
            ),
            Recipe(
                id = 8,
                title = "Spaghetti Bolognese",
                ingredients = listOf("Spaghetti", "Minced Beef", "Tomato", "Garlic"),
                imageUrl = R.drawable.ic_launcher_background,
                 R.string.lunch
            ),
            Recipe(
                id = 9,
                title = "Vegetable Pulao",
                ingredients = listOf("Rice", "Vegetables", "Spices", "Ghee"),
                imageUrl = R.drawable.ic_launcher_background,
                 R.string.lunch
            ),
            Recipe(
                id = 10,
                title = "Dal Tadka",
                ingredients = listOf("Toor Dal", "Garlic", "Ghee", "Spices"),
                imageUrl = R.drawable.ic_launcher_background,
                 R.string.lunch
            ),

// 3. Snacks
            Recipe(
                id = 11,
                title = "Spring Rolls",
                ingredients = listOf("Wrapper", "Cabbage", "Carrot", "Soy Sauce"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.snacks
            ),
            Recipe(
                id = 12,
                title = "Samosa",
                ingredients = listOf("Potato", "Peas", "Spices", "Flour"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.snacks
            ),
            Recipe(
                id = 13,
                title = "French Fries",
                ingredients = listOf("Potatoes", "Salt", "Oil"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.snacks
            ),
            Recipe(
                id = 14,
                title = "Masala Corn",
                ingredients = listOf("Boiled Corn", "Butter", "Masala", "Lemon"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.snacks
            ),
            Recipe(
                id = 15,
                title = "Cheese Balls",
                ingredients = listOf("Cheese", "Bread Crumbs", "Potato", "Spices"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.snacks
            ),

// 4. Beverages
            Recipe(
                id = 16,
                title = "Mango Shake",
                ingredients = listOf("Mango", "Milk", "Sugar", "Ice"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.salad
            ),
            Recipe(
                id = 17,
                title = "Cold Coffee",
                ingredients = listOf("Milk", "Coffee", "Sugar", "Ice Cream"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.salad
            ),
            Recipe(
                id = 18,
                title = "Lemonade",
                ingredients = listOf("Lemon", "Water", "Sugar", "Salt"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.salad
            ),
            Recipe(
                id = 19,
                title = "Strawberry Smoothie",
                ingredients = listOf("Strawberries", "Yogurt", "Honey"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.salad
            ),
            Recipe(
                id = 20,
                title = "Iced Tea",
                ingredients = listOf("Tea", "Lemon", "Ice", "Mint"),
                imageUrl = R.drawable.ic_launcher_foreground,
                R.string.salad
            )

        )
    }
}