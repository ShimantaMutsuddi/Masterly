package com.mutsuddi.masterly.ui.feature.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.mutsuddi.masterly.ui.theme.colorPrimary
import com.mutsuddi.masterly.ui.theme.gray

@Composable
fun progressBar(progress: Int) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(10.dp)
            .background(color = gray, shape = RoundedCornerShape(50))
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(progress / 100f)
                .background(
                    color = colorPrimary,
                    shape = RoundedCornerShape(
                        topStart = 50.dp,
                        bottomStart = 50.dp,
                        topEnd = 0.dp,
                        bottomEnd = 0.dp
                    )
                )
        )
    }
}