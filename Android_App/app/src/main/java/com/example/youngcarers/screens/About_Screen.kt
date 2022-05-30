package com.example.youngcarers

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun About_Screen() {
    Column(
        modifier = Modifier
            //.size(100.dp)
            .fillMaxSize()
            .background(Color.LightGray)
            .verticalScroll(rememberScrollState())
            .padding(bottom = 80.dp)

    ) {

        Text(
            "Über die App und Rechtliches",
            color = colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 20.dp, top = 60.dp)
        )
        Text(
            "Hallo. Ich bin ein kleiner Blindtext. Und zwar schon so lange ich denken kann. Es war nicht leicht zu verstehen, was es bedeutet, ein blinder Text zu sein: Man ergibt keinen Sinn. Wirklich keinen Sinn. Man wird zusammenhangslos eingeschoben und rumgedreht – und oftmals gar nicht erst gelesen. ",
            modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 20.dp)
        )
        Text(
            "Impressum",
            color = colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            "BUNDESMINISTERIUM FÜR SOZIALES, GESUNDHEIT, PFLEGE UND KONSUMENTENSCHUTZ",
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            "STUBENRING 1, 1010 WIEN", modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Text(
            "TELEFON: +43 1 711 00- 0", modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Text(
            "E-MAIL: POST@SOZIALMINISTERIUM.AT",
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Text(
            "Copyright",
            color = colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            "dieser text hat eigentlich gar keinen wirklichen inhalt. aber er hat auch keine relevanz, und deswegen ist das egal. er dient lediglich als platzhalter. um mal zu zeigen, wie diese stelle der seite aussieht, wenn ein paar zeilen vorhanden sind. ob sich der text dabei gut fühlt, weiß ich nicht. ich schätze, eher nicht, denn wer fühlt sich schon gut als platzhalter. aber irgendwer muss diesen job ja machen und deshalb kann ich es nicht ändern . ich könnte dem text höchstens ein bisschen gut zureden, dass er auch als platzhalter eine wichtige rolle spielt und durchaus gebraucht wird. könnte mir vorstellen, dass ihm das gut tut. denn das gefühl gebraucht zu werden tut doch jedem gut, oder? klar, er ist austauschbar. das darf ich ihm natürlich nicht verraten. denn austauschbar zu sein, dass ist schrecklich. austauschbar zu sein bedeutet ja eigentlich, dass nicht man selbst, sondern einfach irgendjemand oder irgendwas an der stelle gebraucht wird. somit würde mein erstes argument, man braucht dich, nicht mehr ziehen, und das zuvor erzeugte gute gefühl des textes wäre zunichte gemacht. das will ich nicht. also bitte nix verraten, ja? aber vielleicht merkt er es ja nicht.",
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            "Barrierefreiheit",
            color = colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            "Blindtexte müssen nicht langweilig sein. Du setzt einen wissenschaftlichen Text? Oder einen historischen Roman? Dann probier doch einmal den Blindtextgenerator von brainson Stuttgart. Einfach die gewünschte Zeichenzahl und Sprache (Latein oder Deutsch) auswählen – und schon bekommst du einen schöneren Blindtext als Lorem Ipsum.\n" +
                    "\n" +
                    "Beispiel: Namens paarmal nie Tundra Doge Afrika, erhielt Diele Bar siech patrouillierendem Adorno, bindend nur falls, gen Zitze B auflegendem äst adlige Habsburg was zus Most C da Pfand sein geschimmert biegt. Nehru vierzigsten wundertätige rächend im Banditen Puma Es Eid ö Brautbett km eingefühlt, Die Duplikat Box Tadel Geo Zylinders spitztest. Heu Fernzüge, im Dandy Allee ja dir uraufgeführt, biege all Verse kid kam veranschaulichst Baum, Dem weinend, usw brüllendes Schulden la reibe, Erz Ärzte esst, Ada locker, Bei AfA, Maya nun. Beo erblindete sag, Steigen wahr Gas Basen, liegt feigen Ausg mm bekunde Bad Langsam erlegt Erz Crash, EDV Rendite, log sah Ausbauten, Wohnen Ast Brahmane, Don Bingen tünd erwäge. Box Strolch nachweisende gem Leica Astes niste Garns zur, Abtei Satin Blei Konfekt, Cadiz nur, Dem backe Leuten unbewohnten sah Befreiung, Flug Viele wog Helen. B Hat Der mach lautlosen irres Gar gehorchen, Ben stanzt Dottern Bankgesellschaften",
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            "Datenschutz",
            color = colorResource(id = com.example.youngcarers.R.color.yc_red_dark),
            fontSize = 26.sp,
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )
        Text(
            "Der Blindtextgenerator ist ein wahrer Blindtextkünstler. Hier findet ihr Texte neben einem sinnfreien Pangram auch Texte von Goethe oder Kafka – oder einen speziellen Typoblindtext mit allen Buchstaben, die man braucht. Natürlich kann man auch hier Zeichenzahl oder Wortanzahl vorgeben. Schön ist, dass man zudem die Menge an Absätzen definieren kann.\n" +
                    "\n" +
                    "Beispiel: Weit hinten, hinter den Wortbergen, fern der Länder Vokalien und Konsonantien leben die Blindtexte. Abgeschieden wohnen Sie in Buchstabhausen an der Küste des Semantik, eines großen Sprachozeans. Ein kleines Bächlein namens Duden fließt durch ihren Ort und versorgt sie mit den nötigen Regelialien. Es ist ein paradiesmatisches Land, in dem einem gebratene Satzteile in den Mund fliegen. Nicht einmal von der allmächtigen Interpunktion werden die Blindtexte beherrscht – ein geradezu unorthographisches Leben. Eines Tages aber beschloß eine kleine Zeile Blindtext, ihr Name war Lorem Ipsum, hinaus zu gehen in die weite Grammatik. Der große Oxmox riet ihr davon ab, da es dort wimmele von bösen Kommata, wilden Fragezeichen und hinterhältigen Semikoli, doch das Blindtextchen ließ sich nicht beirren. Es packte seine sieben Versalien, schob sich sein Initial in den Gürtel und machte sich auf den Weg. Als es die ersten Hügel des Kursivgebirges erklommen hatte, warf es einen letzten Blick zurück auf die Skyline seiner Heimatstadt Buchstabhausen, die Headline von Alphabetdorf und die Subline seiner eigenen Straße, der Zeilengasse. Wehmütig lief ihm eine rethorische Frage über die Wange, dann setzte es seinen Weg fort. Unterwegs traf es eine Copy. Die Copy warnte das Blindtextchen, da, wo sie herkäme wäre sie …",
            modifier = Modifier.padding(start = 20.dp, top = 10.dp, end = 20.dp)
        )

    }
}

@Preview(showBackground = true)
@Composable
fun AboutScreenPreview() {
    About_Screen()
}
