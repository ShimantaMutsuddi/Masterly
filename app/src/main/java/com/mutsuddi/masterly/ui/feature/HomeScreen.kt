package com.mutsuddi.masterly.ui.feature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mutsuddi.masterly.ui.feature.components.Header
import com.mutsuddi.masterly.ui.feature.components.SkillCardItem
import com.mutsuddi.masterly.ui.theme.black

@Composable
fun HomeScreen(modifier: Modifier=Modifier){

    Column(
        modifier=modifier
            .fillMaxSize()
            .background(black)

    ) {
        Header()
        SkillCardItem(progress = 35, hours = 1022, skillName = "Guiter")
        SkillCardItem(progress = 75, hours = 1022, skillName = "JavaScript")
        SkillCardItem(progress = 35, hours = 1022, skillName = "Digital Painting")
        SkillCardItem(progress = 15, hours = 1022, skillName = "Spanish")

    }

}

@Preview(showSystemUi = true)
@Composable
fun previewHomeScreen(){
    HomeScreen()
}
