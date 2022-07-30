package com.example.youngcarers

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class IntegrationTests {

    @get:Rule
    val composeTestRule = createAndroidComposeRule(MainActivity::class.java)


    @Test
    fun testBottomBarNavigation() {

        composeTestRule.onNodeWithText(R.string.help_title.toString()).assertIsSelected()
        composeTestRule.onNodeWithTag(R.string.help_screen.toString()).assertIsDisplayed()
        composeTestRule.onNodeWithText(R.string.help_title.toString()).assertIsDisplayed()
        composeTestRule.onNodeWithText(R.string.nav_abc.toString()).performClick()
        composeTestRule.onNodeWithText(R.string.help_title.toString()).assertIsNotSelected()
        composeTestRule.onNodeWithText(R.string.nav_abc.toString()).assertIsSelected()
        composeTestRule.onNodeWithTag(R.string.abc_screen.toString()).assertIsDisplayed()
        composeTestRule.onNodeWithText(R.string.yc_abc.toString()).assertIsDisplayed()
    }

    @Test
    fun testNavigationToInsightsDetailScreen() {

        composeTestRule.onNodeWithTag(R.string.help_screen.toString()).assertIsDisplayed()
        composeTestRule.onAllNodesWithTag(R.string.insights_card.toString()).onFirst().performClick()
        composeTestRule.onNodeWithTag(R.string.insights_detail_screen.toString()).assertIsDisplayed()
        composeTestRule.onNodeWithTag(R.string.help_screen.toString()).assertDoesNotExist()
    }
}