package com.example.youngcarers.cards

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youngcarers.R
import com.example.youngcarers.ui.theme.colorDarkRed

/**
 * @param title title of the card
 * Here the call number cards for the emergency screen are created
 */

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun EmergencyNumberCard(title: String) {

    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight()
            .clip(RoundedCornerShape(15.dp)),
        onClick = {
            //ToDo: onClick
        },
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface
    ) {
        Row(
            modifier = Modifier
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,

            ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_phone_red),
                contentDescription = null,
                tint = colorDarkRed,
                modifier = Modifier
                    .size(width = 40.dp, height = 40.dp)
                    .padding(8.dp)
                    .clip(RoundedCornerShape(15.dp)),
            )
            Text(
                text = title,
                color = colorDarkRed,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth(),
            )
        }
    }
}

@Preview()
@Composable
fun EmergencyNumberCardPreview() {
    EmergencyNumberCard(title = "144 - Rettung")
}

@Preview()
@Composable
fun EmergencyNumberCardPreview2() {
    EmergencyNumberCard(title = "133 - Polizei")
}