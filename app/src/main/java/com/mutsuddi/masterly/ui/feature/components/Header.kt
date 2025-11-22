package com.mutsuddi.masterly.ui.feature.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mutsuddi.masterly.R
import com.mutsuddi.masterly.ui.theme.colorPrimary
import com.mutsuddi.masterly.ui.theme.gray
import com.mutsuddi.masterly.ui.theme.textColor
import com.mutsuddi.masterly.ui.theme.white


@Composable
fun Header(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
        ,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text("Masterly", fontSize = 20.sp, fontWeight = FontWeight.Bold, color = white)
            Text("Track your journey to mastery", fontSize = 14.sp, color = textColor)
        }
        Row {
            Icon(
                painter = painterResource(R.drawable.ic_analytics),
                contentDescription = null,
                tint = white,
                modifier = Modifier
                    .size(40.dp)
                    .padding(8.dp)
            )
            Icon(
                painter = painterResource(R.drawable.ic_settings),
                contentDescription = null,
                tint = white,
                modifier = Modifier
                    .size(40.dp)
                    .padding(8.dp)
            )
            Icon(
                painter = painterResource(R.drawable.ic_crown),
                contentDescription = null,
                tint = colorPrimary,
                modifier = Modifier
                    .size(40.dp)
                    .padding(8.dp)
            )
        }

//        TextWithIcon(
//            text = "Analytics",
//            icon = painterResource(R.drawable.ic_analytics),
//            tint = textColor,
//            modifier = Modifier.weight(1f)
//        )
//        TextWithIcon(
//            text = "Settings",
//            icon = painterResource(R.drawable.ic_settings),
//            tint = textColor)
//        TextWithIcon(
//            text = "Pro",
//            icon = painterResource(R.drawable.ic_pro),
//            tint = colorPrimary)



    }
}


@Preview(showSystemUi = true)
@Composable
fun previewHeader(){
    Header()
}

