package com.example.youngcarers

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.youngcarers.core.ABC
import com.example.youngcarers.core.colors
import com.example.youngcarers.core.getABCList


@Composable
fun ABC_Screen(abcList: List<ABC>) {
    // We create a ScrollState that's "remember"ed  to add proper support for a scrollable component.
    // This allows us to also control the scroll position and other scroll related properties.

    // remember calculates the value passed to it only during the first composition. It then
    // returns the same value for every subsequent composition. More details are available in the
    // comments below.
    val scrollState = rememberScrollState()
    // Column is a composable that places its children in a vertical sequence.
    Column(
        modifier = Modifier.scrollable(
            state = scrollState,
            orientation = Orientation.Vertical
        )
    ) {
        for ((index, abc) in abcList.withIndex()) {
            // Row is a composable that places its children in a horizontal sequence. You
            // can think of it similar to a LinearLayout with the horizontal orientation.
            // In addition, we pass a modifier to the Row composable. You can think of
            // Modifiers as implementations of the decorators pattern that  are used to
            // modify the composable that its applied to. In this example, we configure the
            // Row to occupify the entire available width using Modifier.fillMaxWidth() and also
            // give it a padding of 16dp.
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    //.padding(16.dp)
            ) {
                // Card composable is a predefined composable that is meant to represent the card surface as
                // specified by the Material Design specification. We also configure it to have rounded
                // corners and apply a modifier.
                Text(
                    "Young Carers ABC",
                    color = colorResource(id = R.color.yc_red_dark),
                    fontSize = 35.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(start = 20.dp, top = 60.dp)
                )
                Text(
                    "Hier haben wir alle Informationen für dich gesammelt und alphabetisch sortiert + " +
                            "Schau einfach ein bisschen durch, frag den Chatbot oder probiere die Suche +" +
                            "wenn du Infos zu einem speziellen Thema haben möchtest",
                    modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
                )

                Card(
                    shape = RoundedCornerShape(4.dp),
                    backgroundColor = colors[index % colors.size],
                    modifier = Modifier.fillMaxWidth()
                ) {
                    // Text is a predefined composable that does exactly what you'd expect it to
                    // display text on the screen. It allows you to customize its appearance
                    // using the style property.
                    Text(
                        abc.path, style = TextStyle(
                            color = Color.Black,
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center
                        ), modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun ABCScreenPreview() {
    ABC_Screen(
        getABCList()
    )
}
