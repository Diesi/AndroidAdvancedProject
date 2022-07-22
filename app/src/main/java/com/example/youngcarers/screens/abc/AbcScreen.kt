package com.example.youngcarers

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.youngcarers.core.*
import com.example.youngcarers.data.api.models.Abc
import com.example.youngcarers.cards.AbcDetailCard
import com.example.youngcarers.screens.abc.AbcViewModel
import com.example.youngcarers.screens.help.HelpScreenViewModel
import com.example.youngcarers.ui.theme.*
import org.koin.androidx.compose.getViewModel

@Composable
fun AbcScreen(
    navigateToDetail: (questionIndex: String) -> Unit,
    navController: NavHostController
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
    ) {
        Text(
            abc_title,
            color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
        )

        Text(
            abc_body,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 40.dp, bottom = 20.dp)
        )

        articles.forEach { article ->
            AbcDetailCard(data = article, navController) { i ->
                selectedIndex = i
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun ABCScreenPreview() {
    /*ABC_Screen(
        getABCList(),
        navController = NavHostController(context = LocalContext.current)
    )*/
}


