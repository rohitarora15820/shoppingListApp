package com.example.shoppinglistapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Scaffold

import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.example.shoppinglistapp.ui.theme.ShoppingListAppTheme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoppingListAppTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    ShoppingList(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ShoppingListPreview() {
    ShoppingListAppTheme {
        ShoppingList(Modifier)
    }
}


