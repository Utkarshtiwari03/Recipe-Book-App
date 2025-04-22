package com.example.recipebookapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipebookapp.data.repo.Repository
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.remember
import androidx.compose.ui.res.stringResource
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment


@Composable
fun StartScreen(modifier: Modifier = Modifier,categoryClick: (String)-> Unit) {


    Column(modifier=modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier= Modifier.height(20.dp))
            Text(
                textAlign = TextAlign.Center,
                text="What would you like\n to cook today?",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,

            )
        LazyVerticalGrid(
            columns = GridCells.Adaptive(128.dp),
            horizontalArrangement = Arrangement.Center,
            verticalArrangement = Arrangement.Center,
            contentPadding = PaddingValues(10.dp)
        ) {
            items(Repository.loadCategories()){
                categoryCard(
                    it.stringResourceId,
                    it.imageResourceId,categoryClick
                )
            }
        }
    }
}

@Composable
fun categoryCard(stringResourceId:Int,
                 imageResourceId:Int,categoryClick: (String) -> Unit){

    val category_name=stringResource(stringResourceId)
    Card(
        modifier= Modifier.clickable{
            categoryClick(category_name)
        }.padding(8.dp,15.dp,8.dp,5.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)) {
        Box(modifier = Modifier.fillMaxSize()){
            Image(painter = painterResource(imageResourceId), contentDescription = "Image of resource")

            Box(modifier = Modifier.padding(8.dp).fillMaxSize().align(Alignment.BottomCenter),
                ) {
            Text(
                text = "$category_name",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            }
        }
    }
}