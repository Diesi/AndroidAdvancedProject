package com.example.youngcarers.core

// TODO: Remove this file, when the api is finish

/* ======================================
               HELP SCREEN
========================================= */

data class Help(
    val id: Int,
    val header: String,
    val description: String,
    val imageRes : Int
)

data class Detail(
    val id: Int,
    val header: String,
    val description: String,
    val imageRes : Int
)

const val help_title = "Hallo!"
const val help_body = "Hier bist du auf der Young Carers App gelandet. Vielleicht hast du ja eine der folgenden Fragen oder du erlebst auch gerade eine dieser Situationen?"
const val help_card1_title = "Für alle Fälle - Hilfe und Notrufe"
const val help_card1_body = "Hier sind alle wichtigen Telefonnummern zu Notruf Hotlines, Vergiftungsinformationszentrale, ..."
const val help_card2_title = "Dir ist alles zu viel?"
const val help_card2_body = "Manchmal kann es einem so vorkommen, als wäre einfach alles viel zu viel, hier siehst du, dass du nicht alleine bist und was du tun kannst, bzw. wer für dich da ist."
const val help_card3_title = "Hände waschen - ein Kinderspiel"
const val help_card3_body = "Mit diesen Tipps und Tricks erfährst du, wie deine Hände richtig sauber werden"
const val help_body_hint = "Du hast nicht gefunden wonach du gesucht hast, vielleicht wirst du im Young Carers ABC fündig?"

val helps = listOf(
    Help(1,help_card1_title, help_card1_body, 1),
    Help(2,help_card2_title, help_card2_body,2),
    Help(3,help_card3_title, help_card3_body,3)
)
val detail = Detail(1,help_card1_title, help_card1_body, 1)


/* ======================================
               ABC SCREEN
========================================= */

const val abc_title = "Young Carers ABC"
const val abc_body = "Hier haben wir alle Informationen für dich gesammelt und alphabetisch sortiert " +
        "Schau einfach ein bisschen durch, frag den Chatbot oder probiere die Suche " +
        "wenn du Infos zu einem speziellen Thema haben möchtest "


/* ======================================
              ABOUT SCREEN
========================================= */

const val about_title = "Über die App und Rechtliches"
const val about_body = "Hallo. Ich bin ein kleiner Blindtext. Und zwar schon so lange ich denken kann. Es war nicht leicht zu verstehen, was es bedeutet, ein blinder Text zu sein: Man ergibt keinen Sinn. Wirklich keinen Sinn. Man wird zusammenhangslos eingeschoben und rumgedreht – und oftmals gar nicht erst gelesen. "


/* ======================================
            EMERGENCY SCREEN
========================================= */

const val emergency_title = "Im Notfall"
const val emergency_quick_help = "Hier findest du die wichtigstn Dinge bei einem Notfall. Schnelle Hilfe und wichtige Kontakte."
const val emergency_intro_calls = "Wenns mal wirklich schnell gehen muss. Die wichtigsten Rufnummern:"
const val emergency_title_preparation = "Zur Vorbereitung"
const val emergency_url = "https://www.linz.at/notfall.php"

data class Emergency(
    val id: Int,
    val header: String,
    val description: String,
    val imageRes : Int
)
data class Tel(
    val header: String
)
fun getEmergencyList() = listOf(
    Emergency(1,emergency_card1_title, emergency_card1_body, 1),
    Emergency(2,emergency_card2_title, emergency_card2_body,2),
    Emergency(3,emergency_card3_title, emergency_card3_body,3)
)
const val emergency_card1_title = "Für alle Fälle - Hilfe und Notrufe"
const val emergency_card1_body = "Hier sind alle wichtigen Telefonnummern zu Notruf Hotlines, Vergiftungsinformationszentrale, ..."
const val emergency_card2_title = "Wie funktioniert ein Notruf?"
const val emergency_card2_body = "Hier wird es dir erklärt"
const val emergency_card3_title = "1x1 der Ersten Hilfe"
const val emergency_card3_body = "Informationen über richtiges Handel, bei einem Notfall"

const val emergency_ambulance = "144 - Rettung"
const val emergency_police = "133 - Polizei"
const val emergency_fire = "122 - Feuerwehr"
const val emergency_euro = "112 - Euronotruf"
const val emergency_mountain = "140 - Bergrettung"
const val emergency_deaf = "0800 133 133 - Notruf für Gehörlose"
const val emegrency_ratAufDraht = "147 - Rat auf Draht"
const val emergency_seelsorge = "142 - Telefonseelsorge"
const val  emergency_medicalEmergency = "141 - Ärztenotdienst"

fun getPhoneList() = listOf(
    Tel(emergency_ambulance),
    Tel(emergency_police),
    Tel(emergency_fire),
    Tel(emergency_euro),
    Tel(emegrency_ratAufDraht),
    Tel(emergency_seelsorge),
    Tel(emergency_medicalEmergency),
    Tel(emergency_mountain)
)


