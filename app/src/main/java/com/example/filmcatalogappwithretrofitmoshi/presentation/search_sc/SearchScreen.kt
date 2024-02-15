package com.example.filmcatalogappwithretrofitmoshi.presentation.search_sc

import android.widget.AdapterView.OnItemClickListener
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Movie
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.font.FontFamily
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.filmcatalogappwithretrofitmoshi.presentation.MainViewModel

@OptIn(ExperimentalComposeUiApi::class, ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(
    onItemClick: (String) -> Unit,
    viewModel: MainViewModel = hiltViewModel()
) {
    var title by rememberSaveable { mutableStateOf("") }
    val keyboardController = LocalSoftwareKeyboardController.current
    val searchResponse = viewModel.searchResponse.collectAsState().value

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    text = "Open Movie Database",
                    fontFamily = FontFamily.Serif
                )
            },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Rounded.Movie,
                            contentDescription = null
                        )
                    }
                })
        }
    ) { paddingValues ->
        Column(

        ) {

        }
    }
}