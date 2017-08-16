package com.example.android.teatime;


import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

// We want to run the test with AndroidJUnit4
@RunWith(AndroidJUnit4.class)
public class OrderActivityBasicTest {
    // The rule on what activity/class we are testing
    @Rule public ActivityTestRule<OrderActivity> mActivityTestRule
            = new ActivityTestRule<>(OrderActivity.class);

//    @Test
//    public void clickIncrementButton_ChangesQuantityAndCost() {
//        // 1. Find the view
//        // onView(withId(R.id.increment_button));
//
//        // 2. Perform the action on the view
//        onView(withId(R.id.increment_button)).perform(click());
//
//        // 3. Check if the view does what you expected
//        onView(withId(R.id.quantity_text_view)).check(matches(withText("1")));
//        onView(withId(R.id.cost_text_view)).check(matches(withText("$5.00")));
//    }

    @Test
    public void clickDecrementButton_ChangesQuantityAndCost() {
        // TODO (3) Finish writing this test which will:

        //          - Check that the initial quantity is zero
        onView(withId(R.id.quantity_text_view)).check(matches(withText("0")));

        //          - Click on the decrement button
        onView(withId(R.id.decrement_button)).perform(click());

        //          - Verify that the decrement button won't decrease the quantity 0 and cost below $0.00
        onView(withId(R.id.quantity_text_view)).check(matches(withText("0")));
        onView(withId(R.id.cost_text_view)).check(matches(withText("$0.00")));

    }
}
