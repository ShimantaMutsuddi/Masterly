package com.mutsuddi.masterly.ui.feature.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.mutsuddi.masterly.data.model.Skill
import com.mutsuddi.masterly.ui.feature.components.SkillCardItem
import com.mutsuddi.masterly.ui.feature.components.TopBar
import com.mutsuddi.masterly.ui.theme.black

@Composable
fun HomeScreen(modifier: Modifier=Modifier,viewModel: HomeViewModel = viewModel()) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding(),
        containerColor = Color(0xFF121212),
        topBar = { TopBar() },
        floatingActionButton = {

        }
    ) { innerPadding ->
        val uiState by viewModel.uiState.collectAsState()
        when(uiState){
            is HomeScreenState.Loading -> {
                Box(
                    modifier = modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                    ){
                    CircularProgressIndicator()
                }
            }

            is HomeScreenState.Success ->{
                val skills = (uiState as HomeScreenState.Success).skills
                LazyColumn(modifier = Modifier
                    .padding(innerPadding)
                ) {
                    items(skills){ skill ->
                        SkillCardItem(skill= skill )
                    }
                }

            }
            is HomeScreenState.Error -> {
                val errMessage = (uiState as HomeScreenState.Error).message
                Box(
                    modifier = modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ){
                    Text(errMessage)
                }
            }
        }



    }
}

@Preview(showSystemUi = true)
@Composable
fun previewHomeScreen(){
    HomeScreen()
}
