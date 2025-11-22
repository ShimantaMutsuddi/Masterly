package com.mutsuddi.masterly

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.mutsuddi.masterly.ui.navigation.AppNavigation

import com.mutsuddi.masterly.ui.theme.MasterlyTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MasterlyTheme {
                AppNavigation()

            }
        }
    }
}





