package com.mutsuddi.masterly.ui.feature.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mutsuddi.masterly.R
import com.mutsuddi.masterly.ui.theme.colorPrimary
import com.mutsuddi.masterly.ui.theme.gray
import com.mutsuddi.masterly.ui.theme.textColor
import com.mutsuddi.masterly.ui.theme.white


@Composable
fun Header(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text("Masterly", fontSize = 18.sp, fontWeight = FontWeight.Bold, color = white)
            Text("Track your journey to mastery", fontSize = 12.sp, color = textColor)
        }
        TextWithIcon(
            text = "Analytics",
            icon = painterResource(R.drawable.ic_analytics),
            tint = textColor,
            modifier = Modifier.weight(1f)
        )
        TextWithIcon(
            text = "Settings",
            icon = painterResource(R.drawable.ic_settings),
            tint = textColor)
        TextWithIcon(
            text = "Pro",
            icon = painterResource(R.drawable.ic_pro),
            tint = colorPrimary)



    }
}


@Preview(showSystemUi = true)
@Composable
fun previewHeader(){
    Header()
}

