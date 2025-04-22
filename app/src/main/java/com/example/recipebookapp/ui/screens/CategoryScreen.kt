package com.example.recipebookapp.ui.screens

import com.example.recipebookapp.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.runtime.getValue
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipebookapp.data.repo.Repository
import com.example.recipebookapp.ui.viewModels.CategpryViewModel

@Composable
fun CategoryScreen(
    modifier: Modifier = Modifier,
    CategoryViewModel: CategpryViewModel
    ,RecipeClick: (String) -> Unit) {

    val uistate by CategoryViewModel.uiState.collectAsState()

    Column(
        modifier = modifier.fillMaxSize(),
    ) {
        Spacer(modifier = Modifier.height(30.dp))
        Box(
            modifier = Modifier.fillMaxWidth().align(Alignment.CenterHorizontally),

            ) {
            Text(
                text = uistate.selectedCategory,
                fontSize = 30.sp,
                color = Color.Black,
                modifier = Modifier.align(Alignment.TopCenter)
            )
        }
//        if(Repository.loadRecipe())

        LazyRow(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items(Repository.loadRecipe()) {
                RecipeCard(RecipeClick, it.title,it.ingredients,it.imageUrl,it.categoryName)
            }

        }
    }
}
    @Composable
    fun RecipeCard(RecipeClick: (String) -> Unit, title:String,ingrediant:List<String>,imageurl:Int,it:Int) {
        Card(modifier = Modifier.padding(40.dp,10.dp,10.dp,10.dp).clickable{
            RecipeClick("Money")

        }, colors = CardDefaults.cardColors(
            containerColor = Color.Transparent
        ), elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        )) {
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .padding(10.dp),
                horizontalAlignment = Alignment.CenterHorizontally // <-- Center content horizontally
            ) {
                Image(
                    painter = painterResource(R.drawable.brakfast),
                    contentDescription = "Photo hai andhe",
                    modifier = Modifier.height(350.dp).width(250.dp).padding(10.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(20.dp))
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Chocolate Lava Cake",
                    textAlign = TextAlign.Center
                )
            }
        }
    }
