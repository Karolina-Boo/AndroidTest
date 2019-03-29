package com.example.test1;

import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;
import android.widget.Toast;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;

public class MainActivityTest {

    private static final String STRING_TO_BE_TYPED = "Second activity";


    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;

    @Before
    public void SetUp() throws Exception{
        mainActivity = activityActivityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception{

    }

    @Test
    public void onCreate() {
        Log.d("TAG","onCreate()");
    }

    @Test
    public void btn_click() {
        Log.d("TAG","button is clicked");
    }

    @Test
    public void testClickButton(){
        onView(withId(R.id.btn)).perform(click());
    }

    @Test
    public void gettext() { Log.d("TAG","get text"); }

    @Test
    public void testGetText() throws InterruptedException {
        onView(withId(R.id.et)).perform(typeText(STRING_TO_BE_TYPED));
        Thread.sleep(1000);
        onData(withText(typeText(STRING_TO_BE_TYPED).toString()))
                .inRoot(withDecorView(not(activityActivityTestRule.getActivity().getWindow().getDecorView())));
        }
}