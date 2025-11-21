package com.mutsuddi.masterly.ui.feature.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mutsuddi.masterly.ui.theme.colorPrimary
import com.mutsuddi.masterly.ui.theme.gray

@Composable
fun SkillCardItem(modifier: Modifier=Modifier,progress :Int,hours:Int,skillName:String) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp, vertical = 5.dp),
        shape = RoundedCornerShape(12.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .padding(20.dp)
        ) {
            Column {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween

                ) {
                    Text(
                        text = skillName,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null,
                        tint = colorPrimary
                    )
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Icon(
                        imageVector = Icons.Default.DateRange,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                    Spacer(Modifier.width(5.dp))
                    Text(
                        text = "$hours/1000 hours",
                        color = Color.White
                    )

                }

            }
            Spacer(modifier = Modifier.height(35.dp))
            Column{
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Progress", color = Color.Gray)
                    Text(text = "$progress%", color = Color.White)
                }
                Spacer(Modifier.height(10.dp))
                progressBar(progress)

            }
        }
    }
}



@Preview(showBackground = true)
@Composable()
fun previewSkillCardItem(){
    SkillCardItem(progress = 35, hours = 1022, skillName = "Guiter")
}

@Preview(showBackground = true)
@Composable()
fun previewSkillCardItem2(){
    SkillCardItem(progress = 70, hours = 8822, skillName = "MAke Money")
}


