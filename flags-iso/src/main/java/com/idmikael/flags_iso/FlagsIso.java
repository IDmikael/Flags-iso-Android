package com.idmikael.flags_iso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class FlagsIso {

    public static Drawable getFlagDrawable(Context context, String flagName) {
        Resources res =  context.getResources();
        int resourceId = res.getIdentifier(checkFlagName(flagName.toLowerCase()), "drawable", context.getPackageName());
        return res.getDrawable(resourceId);
    }

    private static String checkFlagName(String flagName){
        if (flagName.equals("do"))
            return "dom";
        else if (flagName.contains("-"))
            return flagName.replaceAll("-", "_");
        else
            return flagName;
    }
}
