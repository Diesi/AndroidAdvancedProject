package com.example.youngcarers.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.youngcarers.R
import com.example.youngcarers.cards.CategoryDetailCard
import com.example.youngcarers.cards.InsightsDetailCard
import com.example.youngcarers.data.api.models.Insight
import com.example.youngcarers.screens.help.HelpScreenViewModel
import com.example.youngcarers.ui.theme.colorBackground
import com.example.youngcarers.ui.theme.colorDarkRed
import org.koin.androidx.compose.getViewModel

//ToDo: Insights get data dynamic in random order, text, reference,

/**
 * @param navController navController with given string index
 * @param onClick onClick listener
 * @param questionIndex index of the question
 * Generate the insights detail page with title (question), body and insights parts dynamic by there types
 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun InsightsDetailScreen(
    navController: NavHostController,
    onClick: (Int) -> Unit,
    questionIndex: Int
) {

    val viewModel = getViewModel<HelpScreenViewModel>()
    val insights: List<Insight> by viewModel.insights.collectAsState(initial = emptyList())
    val insight: Insight? = if (insights.isEmpty()) null else insights[questionIndex]

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    //*Error without txt ?*//
                    insight?.question
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.navigateUp()
                        }
                    ) {
                        Icon(Icons.Filled.ArrowBack, "backIcon")
                    }
                },
                backgroundColor = colorResource(id = R.color.yc_red_dark),
                contentColor = Color.White,
                elevation = 10.dp
            )
        },
        backgroundColor = colorResource(id = R.color.yc_background),
        modifier = Modifier.padding(bottom = 55.dp)
            .testTag("insightsDetailScreen")
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
        ) {

            if (insight != null) {
                Text(
                    text = insight.question,
                    color = colorResource(id = R.color.yc_red_dark),
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                )
            }

            // render parts based on their type
            if (insight != null) {
                insight.content.forEach { part ->
                    when (part.type) {
                        "text" -> Text(
                            text = part.text,
                            modifier = Modifier.padding(
                                start = 20.dp,
                                top = 10.dp,
                                end = 20.dp,
                                bottom = 10.dp
                            )
                        )
                        "reference" -> InsightsDetailCard(
                            header = part.reference.title,
                            description = part.reference.description,
                            image = part.reference.previewImageUrl,
                            navController,
                            url = part.reference.url,
                            index = 0
                        ) // Todo: Replace with real image URL once provided by the backend
                        "category" -> CategoryDetailCard(part.category, navController)
                        else -> throw IllegalArgumentException("part.type ${part.type} not allowed, please provide either text, reference or category")
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InsightsDetailScreenPreview() {
    val insight: Insight = Insight(listOf(), "Ist das eine Frage?");
    val questionIndex = 0

    InsightsDetailScreen(
        navController = NavHostController(context = LocalContext.current),
        onClick = {},
        questionIndex
    )

}
