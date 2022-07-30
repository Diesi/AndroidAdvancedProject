package com.example.youngcarers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.youngcarers.cards.InsightsDetailCard
import com.example.youngcarers.core.help_body
import com.example.youngcarers.core.help_body_hint
import com.example.youngcarers.core.help_title
import com.example.youngcarers.core.helps
import com.example.youngcarers.data.api.models.Insight
import com.example.youngcarers.screens.help.HelpScreenViewModel
import com.example.youngcarers.ui.theme.colorBackground
import com.example.youngcarers.ui.theme.colorDarkRed
import org.koin.androidx.compose.getViewModel

/**
 * @param navigateToDetail navController with given int index
 * Generate the help screen page with title, body and insights detail cards in list form
 */

@Composable
fun HelpScreen(
    navigateToDetail: (questionIndex: Int) -> Unit,
    navController: NavHostController
) {

    val viewModel = getViewModel<HelpScreenViewModel>()
    val insights: List<Insight> by viewModel.insights.collectAsState(initial = emptyList())


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.yc_background))
            .verticalScroll(rememberScrollState())
            .padding(bottom = 80.dp)

    ) {
        Text(
            R.string.help_title.toString(),
            color = colorResource(id = R.color.yc_red_dark),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
        )//TODO: txt from api
        Text(
            R.string.help_body.toString(),
            modifier = Modifier.padding(
                start = 20.dp,
                top = 10.dp,
                end = 20.dp,
                bottom = 10.dp
            )
        )//TODO: txt from api
        insights.forEachIndexed { index, item ->
            InsightsDetailCard(
                header = item.question,//part.question,
                description = "",//item.text,//con.reference.title,
                image = "n",//part.reference.previewImageUrl,//content.reference.previewImageUrl,
                navController = navController,
                url = "null",
                index = index
            )

        }
        Text(
            R.string.help_body_hint.toString(),
            modifier = Modifier
                .padding(
                    top = 40.dp,
                    start = 40.dp,
                    end = 40.dp
                )
        )

        Icon(
            imageVector = Icons.Filled.ArrowBack,
            tint = colorResource(id = R.color.yc_red_dark),
            contentDescription = "ArrowToSymbol",
            modifier = Modifier
                .padding(start = 135.dp, top = 8.dp)
                .rotate(-65.0F)
                .size(50.dp)
        )
    }

}
/*
@Preview(showBackground = true)
@Composable
fun HelpScreenPreview() {
    HelpScreen(
        getHelpList()
    )
}
 */