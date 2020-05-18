package de.baumann.browser.unit;

import android.content.Context;
import android.view.View;

public class ViewUnit {

    private static int getWindowHeight(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int getWindowWidth(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}