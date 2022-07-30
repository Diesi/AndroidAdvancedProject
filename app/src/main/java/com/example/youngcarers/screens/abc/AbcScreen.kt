package com.example.youngcarers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youngcarers.cards.AbcDetailCard
import com.example.youngcarers.core.abc_body
import com.example.youngcarers.core.abc_title
import com.example.youngcarers.data.api.models.Abc
import com.example.youngcarers.screens.abc.AbcViewModel
import com.example.youngcarers.ui.theme.colorBackground
import com.example.youngcarers.ui.theme.colorDarkRed
import org.koin.androidx.compose.getViewModel

/**
 * @param navigateToDetail navController with given string index
 * Generate the abc page with title, body and abc cards in list form
 */

@Composable
fun AbcScreen(
    navigateToDetail: (questionIndex: String) -> Unit
) {

    val viewModel = getViewModel<AbcViewModel>()

    var selectedIndex by remember { mutableStateOf(-1) }

    val articles: List<Abc> by viewModel.articles.collectAsState(initial = emptyList())


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorBackground)
            .verticalScroll(rememberScrollState())
            .padding(bottom = 80.dp)
            .testTag("abcScreen")
    ) {
        Text(
            R.string.abc_title.toString(),
            color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
        )//TODO: backend api

        Text(
            R.string.abc_body.toString(),
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 40.dp, bottom = 20.dp)
        )//TODO: backend api

        articles.forEach { article ->
            AbcDetailCard(data = article, onClick = navigateToDetail)
        }
    }

}


