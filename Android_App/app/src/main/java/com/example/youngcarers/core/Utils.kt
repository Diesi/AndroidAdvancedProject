package com.example.youngcarers.core

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager
import androidx.compose.ui.graphics.Color

// Models
data class ABC(
    val path: String,
)

data class Amenity(
    val name: String,
    val iconUrl: String
)

// Methods
fun getABCList() = listOf(
    ABC("24-Stunden Betreuung"),
    ABC("Aktuelles"),
    ABC("Allgemeines"),
    ABC("Angehörigengespräch"),
    ABC("Beratung und Pflegetipps"),
    ABC("COVID-19 / Coronavirus"),
    ABC("Chatten"),
    ABC("Demenz(strategie)"),
    ABC("Dienstleistungen / Soziale Dienste"),
    ABC("Entspannungstipps"),
    ABC("Erfahrungsberichte"),
    ABC("Erste Hilfe"),
    ABC("Familie"),
    ABC("Finanzielles")
)

fun getSuperheroList() = listOf(
    ABC("LOL")
)

fun getAmenityList() = listOf(
    Amenity("Elevator", ""),
    Amenity("Washer/Dryer", ""),
    Amenity("Wheelchair Access", ""),
    Amenity("Dogs Ok", ""),
    Amenity("Smoke Detector", ""),
    Amenity("Wifi", ""),
    Amenity("Television", ""),
    Amenity("Coffee Maker", ""),
    Amenity("Hair Dryer", ""),
    Amenity("Iron", "")
)

fun hideKeyboard(context: Context) {
    val imm = context.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
}


// Constants


// ABC View
const val abcHeaderTxt = "Young Carers ABC"
const val abcBodyTxt = "Hier haben wir alle Informationen für dich gesammelt und alphabetisch sortiert " +
        "Schau einfach ein bisschen durch, frag den Chatbot oder probiere die Suche " +
        "wenn du Infos zu einem speziellen Thema haben möchtest "


// About View
const val aboutHeaderTxt = "Über die App und Rechtliches"
const val aboutBodyTxt = "Hallo. Ich bin ein kleiner Blindtext. Und zwar schon so lange ich denken kann. Es war nicht leicht zu verstehen, was es bedeutet, ein blinder Text zu sein: Man ergibt keinen Sinn. Wirklich keinen Sinn. Man wird zusammenhangslos eingeschoben und rumgedreht – und oftmals gar nicht erst gelesen. "

const val aboutHeaderImpTxt = "Impressum"
const val aboutBodyImpTxt1 = "BUNDESMINISTERIUM FÜR SOZIALES, GESUNDHEIT, PFLEGE UND KONSUMENTENSCHUTZ"
const val aboutBodyImpTxt2 = "STUBENRING 1, 1010 WIEN"
const val aboutBodyImpTxt3 = "TELEFON: +43 1 711 00- 0"
const val aboutBodyImpTxt4 = "E-MAIL: POST@SOZIALMINISTERIUM.AT"

const val aboutHeaderCopyTxt = "Copyright"
const val aboutBodyCopyTxt = "dieser text hat eigentlich gar keinen wirklichen inhalt. aber er hat auch keine relevanz, und deswegen ist das egal. er dient lediglich als platzhalter. um mal zu zeigen, wie diese stelle der seite aussieht, wenn ein paar zeilen vorhanden sind. ob sich der text dabei gut fühlt, weiß ich nicht. ich schätze, eher nicht, denn wer fühlt sich schon gut als platzhalter. aber irgendwer muss diesen job ja machen und deshalb kann ich es nicht ändern . ich könnte dem text höchstens ein bisschen gut zureden, dass er auch als platzhalter eine wichtige rolle spielt und durchaus gebraucht wird. könnte mir vorstellen, dass ihm das gut tut. denn das gefühl gebraucht zu werden tut doch jedem gut, oder? klar, er ist austauschbar. das darf ich ihm natürlich nicht verraten. denn austauschbar zu sein, dass ist schrecklich. austauschbar zu sein bedeutet ja eigentlich, dass nicht man selbst, sondern einfach irgendjemand oder irgendwas an der stelle gebraucht wird. somit würde mein erstes argument, man braucht dich, nicht mehr ziehen, und das zuvor erzeugte gute gefühl des textes wäre zunichte gemacht. das will ich nicht. also bitte nix verraten, ja? aber vielleicht merkt er es ja nicht."

const val aboutHeaderBarrTxt = "Barrierefreiheit"
const val aboutBodyBarrTxt = "Blindtexte müssen nicht langweilig sein. Du setzt einen wissenschaftlichen Text? Oder einen historischen Roman? Dann probier doch einmal den Blindtextgenerator von brainson Stuttgart. Einfach die gewünschte Zeichenzahl und Sprache (Latein oder Deutsch) auswählen – und schon bekommst du einen schöneren Blindtext als Lorem Ipsum.\n" +
        "\n" +
        "Beispiel: Namens paarmal nie Tundra Doge Afrika, erhielt Diele Bar siech patrouillierendem Adorno, bindend nur falls, gen Zitze B auflegendem äst adlige Habsburg was zus Most C da Pfand sein geschimmert biegt. Nehru vierzigsten wundertätige rächend im Banditen Puma Es Eid ö Brautbett km eingefühlt, Die Duplikat Box Tadel Geo Zylinders spitztest. Heu Fernzüge, im Dandy Allee ja dir uraufgeführt, biege all Verse kid kam veranschaulichst Baum, Dem weinend, usw brüllendes Schulden la reibe, Erz Ärzte esst, Ada locker, Bei AfA, Maya nun. Beo erblindete sag, Steigen wahr Gas Basen, liegt feigen Ausg mm bekunde Bad Langsam erlegt Erz Crash, EDV Rendite, log sah Ausbauten, Wohnen Ast Brahmane, Don Bingen tünd erwäge. Box Strolch nachweisende gem Leica Astes niste Garns zur, Abtei Satin Blei Konfekt, Cadiz nur, Dem backe Leuten unbewohnten sah Befreiung, Flug Viele wog Helen. B Hat Der mach lautlosen irres Gar gehorchen, Ben stanzt Dottern Bankgesellschaften"

const val aboutHeaderDatenTxt = "Datenschutz"
const val aboutBodyDatenTxt = "Der Blindtextgenerator ist ein wahrer Blindtextkünstler. Hier findet ihr Texte neben einem sinnfreien Pangram auch Texte von Goethe oder Kafka – oder einen speziellen Typoblindtext mit allen Buchstaben, die man braucht. Natürlich kann man auch hier Zeichenzahl oder Wortanzahl vorgeben. Schön ist, dass man zudem die Menge an Absätzen definieren kann.\n" +
        "\n" +
        "Beispiel: Weit hinten, hinter den Wortbergen, fern der Länder Vokalien und Konsonantien leben die Blindtexte. Abgeschieden wohnen Sie in Buchstabhausen an der Küste des Semantik, eines großen Sprachozeans. Ein kleines Bächlein namens Duden fließt durch ihren Ort und versorgt sie mit den nötigen Regelialien. Es ist ein paradiesmatisches Land, in dem einem gebratene Satzteile in den Mund fliegen. Nicht einmal von der allmächtigen Interpunktion werden die Blindtexte beherrscht – ein geradezu unorthographisches Leben. Eines Tages aber beschloß eine kleine Zeile Blindtext, ihr Name war Lorem Ipsum, hinaus zu gehen in die weite Grammatik. Der große Oxmox riet ihr davon ab, da es dort wimmele von bösen Kommata, wilden Fragezeichen und hinterhältigen Semikoli, doch das Blindtextchen ließ sich nicht beirren. Es packte seine sieben Versalien, schob sich sein Initial in den Gürtel und machte sich auf den Weg. Als es die ersten Hügel des Kursivgebirges erklommen hatte, warf es einen letzten Blick zurück auf die Skyline seiner Heimatstadt Buchstabhausen, die Headline von Alphabetdorf und die Subline seiner eigenen Straße, der Zeilengasse. Wehmütig lief ihm eine rethorische Frage über die Wange, dann setzte es seinen Weg fort. Unterwegs traf es eine Copy. Die Copy warnte das Blindtextchen, da, wo sie herkäme wäre sie …"



