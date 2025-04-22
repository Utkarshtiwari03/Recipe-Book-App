package com.example.recipebookapp

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recipebookapp.ui.screens.CategoryScreen
import com.example.recipebookapp.ui.screens.RecipeDetail
import com.example.recipebookapp.ui.screens.StartScreen
import com.example.recipebookapp.ui.viewModels.CategpryViewModel

enum class RecipeAppScreen(){
    Start,
    CategoryList,
    Cook,
    Saved
}

@Composable
fun NavScreen(modifier: Modifier = Modifier,
              CategoryViewModel: CategpryViewModel= viewModel(),
              navController: NavHostController= rememberNavController()
) {


    NavHost(navController = navController,startDestination = RecipeAppScreen.Start.name){
        composable(route= RecipeAppScreen.Start.name) {
            StartScreen(
                modifier = modifier, categoryClick = {
                    CategoryViewModel.updateSelectedCategory(it)
                    navController.navigate(RecipeAppScreen.CategoryList.name)
                },
            )
        }

        composable(route= RecipeAppScreen.CategoryList.name) {
            CategoryScreen(modifier=modifier,CategoryViewModel,
                RecipeClick={
                    CategoryViewModel.updateRecipe(it)
                    navController.navigate(RecipeAppScreen.Cook.name)
                })
        }

        composable(route= RecipeAppScreen.Cook.name) {
            RecipeDetail(modifier=modifier)
        }
    }

}