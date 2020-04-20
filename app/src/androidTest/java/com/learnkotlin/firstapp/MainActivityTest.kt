package com.learnkotlin.firstapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.ext.junit.rules.activityScenarioRule

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule var activityScenarioRule = activityScenarioRule<MainActivity>()

    @Test
    fun hasTextOnScreen() {
        onView(withId(R.id.hello_text))
            .check(matches(withText(R.string.hello_world)))

        onView(withId(R.id.name_text))
            .check(matches(withText(R.string.name_date)))

        onView(withId(R.id.desc_text))
            .check(matches(withText(R.string.parking_desc)))
    }

    @Test
    fun canEnterText() {
        onView(withId(R.id.change_license))
            .perform(typeText("LPN"), closeSoftKeyboard())
        onView(withId(R.id.change_license))
            .check(matches(withText("LPN")))

        onView(withId(R.id.change_car_color))
            .perform(typeText("Blue"), closeSoftKeyboard())
        onView(withId(R.id.change_car_color))
            .check(matches(withText("Blue")))
    }
}