package com.example.youngcarers

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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


@Composable
fun HelpScreen(
    navigateToDetail: (questionIndex: Int) -> Unit,
) {

    val viewModel = getViewModel<HelpScreenViewModel>()
    val insights: List<Insight> by viewModel.insights.collectAsState(initial = emptyList())


    Scaffold(
        backgroundColor = colorBackground,
        modifier = Modifier.padding(bottom = 55.dp)
            .testTag("helpScreen")
    ) {

        Column {
            /*Column {
                insights.forEachIndexed { index, insight ->
                    Button(onClick = {
                        navigateToDetail(index)
                    }) {
                        Text(text = insight.question)
                    }
                }
            }*/

            val helpList = helps

            LazyColumn(
                Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(16.dp)
            ) {
                item {

                    Text(
                        help_title,
                        color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
                        fontSize = 35.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                    )//TODO: txt from api
                    Text(
                        help_body,
                        modifier = Modifier.padding(
                            start = 20.dp,
                            top = 10.dp,
                            end = 20.dp,
                            bottom = 10.dp
                        )
                    )//TODO: txt from api

                }

                items(helpList) { help ->
                    InsightsDetailCard(
                        header = help.header,
                        description = help.description,
                        image = help.imageRes,
                        onClick = navigateToDetail,
                        url = "null"
                    )
                }
                /* insights.forEach { part ->
                     InsightsDetailCard(header = part.question, description = help.de, image = , navController = )
                 }*/ //TODO when api is ready

                item {
                    Text(
                        help_body_hint,
                        modifier = Modifier
                            .padding(
                                top = 40.dp,
                                start = 40.dp,
                                end = 40.dp
                            )
                    )

                    Icon(
                        imageVector = Icons.Filled.ArrowBack,
                        tint = colorDarkRed,
                        contentDescription = "ArrowToSymbol",
                        modifier = Modifier
                            .padding(start = 135.dp, top = 8.dp)
                            .rotate(-65.0F)
                            .size(50.dp)
                    )
                }


            }
        }
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