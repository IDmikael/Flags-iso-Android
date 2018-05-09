package com.idmikael.flags_iso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class FlagsIso {

    public static Drawable getFlagDrawable(Context context, String flagName) {
        Resources res =  context.getResources();
        int resourceId = res.getIdentifier(flagName, "drawable", context.getPackageName());
        return res.getDrawable(resourceId);
    }
}
