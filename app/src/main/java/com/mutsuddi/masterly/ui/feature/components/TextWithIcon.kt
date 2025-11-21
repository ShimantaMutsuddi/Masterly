package com.mutsuddi.masterly.ui.feature.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mutsuddi.masterly.R
import com.mutsuddi.masterly.ui.theme.colorPrimary

@Composable
fun TextWithIcon(text: String,icon: Painter,tint: Color,modifier: Modifier=Modifier) {
    Row(
        modifier = modifier.padding(3.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = icon,
            contentDescription = null,
            tint = tint
        )
        Spacer(Modifier.width(5.dp))
        Text(
            text = text,
            color = tint
        )

    }
}

@Preview(showBackground = true)
@Composable
fun previewTextWithIcon(){
    TextWithIcon(text = "Analytics", icon = painterResource(R.drawable.ic_analytics), tint = colorPrimary)
}
