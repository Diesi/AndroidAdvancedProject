package com.example.youngcarers

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavHostController
import com.example.youngcarers.core.*
import com.example.youngcarers.screens.Detail_Screen
import com.example.youngcarers.ui.theme.*
import java.util.*


@Composable
fun Help_Screen(helpList: List<Help>,navController: NavHostController) {

    Scaffold(
        backgroundColor = colorBackground,
        modifier = Modifier.padding(bottom = 55.dp)
    ) {
        LazyColumn(
            Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            //horizontalAlignment = Alignment.CenterHorizontally

        ) {
            item {

                Text(
                    helpHeaderTxt,
                    color = colorDarkRed,//colorResource(id = R.color.yc_red_dark),
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                )
                Text(
                    helpBodyTxt,
                    modifier = Modifier.padding(
                        start = 20.dp,
                        top = 10.dp,
                        end = 20.dp,
                        bottom = 10.dp
                    )
                )

            }
            items(helpList) { help ->
                HelpCard(help.header, help.description, help.imageRes, navController)
            }

            item {
                Text(
                    helpBodyBottom,
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
/*
@Preview(showBackground = true)
@Composable
fun HelpScreenPreview() {
    Help_Screen(
        getHelpList()
    )
}
*/
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HelpCard(header: String, description: String, image: Int, navController: NavHostController) {
    val text = remember { mutableStateOf("") }
    val mContext = LocalContext.current
    Card(
        modifier = Modifier
            // The space between each card and the other
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(15.dp)),
        onClick = {
           navController.navigate(NavRoutes.Detail.route)
        },
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface

    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
            //verticalAlignment = Alignment.CenterVertically,
        ) {

            Row(
                Modifier.padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.picture),
                    contentDescription = null,
                    modifier = Modifier
                        .size(width = 120.dp, height = 80.dp)
                        .padding(8.dp)
                        .clip(RoundedCornerShape(15.dp)),
                    contentScale = ContentScale.Fit,

                    )
                Text(

                    text = header,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),

                    )

            }
            Text(
                text = description,
                style = MaterialTheme.typography.body2,
                modifier = Modifier.padding(start = 30.dp, bottom = 15.dp, end = 30.dp)
            )
        }

    }

}
/*
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true, name = "Light mode")
//@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true, name = "Dark mode")
@Preview(showBackground = true)
@Composable
fun HelpCardPreview() {
    YoungCarersTheme {
        HelpCard(helps[0].header, helps[0].description, helps[0].imageRes)
    }
}

@Preview(showBackground = true)
@Composable
fun HelpCard1Preview() {
    YoungCarersTheme {
        HelpCard(helps[1].header, helps[1].description, helps[1].imageRes)
    }
}

@Preview(showBackground = true)
@Composable
fun HelpCard2Preview() {
    YoungCarersTheme {
        HelpCard(helps[2].header, helps[2].description, helps[2].imageRes)
    }
}

 */