package com.mutsuddi.masterly.ui.feature.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mutsuddi.masterly.R
import com.mutsuddi.masterly.ui.theme.black
import com.mutsuddi.masterly.ui.theme.textColor
import com.mutsuddi.masterly.ui.theme.white


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){
    TopAppBar(
        colors =  TopAppBarDefaults.topAppBarColors(black),
        title = {
            Column {
                    Text(
                        text = "Masterly",
                        fontWeight= FontWeight.Bold,
                        color = white
                    )
                    Text(
                        text = "Track your journey to mastery",
                        style = MaterialTheme.typography.bodySmall,
                        color = textColor,
                    )

            }

        },
        actions = {
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(
                    onClick = {},
                    modifier = Modifier.size(40.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_analytics),
                        contentDescription = "Analytics",
                        modifier = Modifier
                            .size(20.dp)
                    )
                }

                IconButton(
                    onClick = {},
                    modifier = Modifier.size(40.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_settings),
                        contentDescription = "Settings",
                        modifier = Modifier.size(20.dp)
                    )
                }

                IconButton(
                    onClick = {},
                    modifier = Modifier.size(40.dp)
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_crown),
                        contentDescription = "Pro",
                        modifier = Modifier.size(20.dp)
                    )
                }
            }
        }

    )
}


@Preview()
@Composable
fun HomeTopAppBarPreview() {
    TopBar()
}