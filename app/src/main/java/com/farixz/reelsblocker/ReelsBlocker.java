package com.farixz.reelsblocker;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class ReelsBlocker implements IXposedHookLoadPackage {
    public void handleLoadPackage(LoadPackageParam lpparam) throws Throwable {
        if (!lpparam.packageName.equals("com.instagram.android")) // Only run the module on SystemUI
            return;
        XposedBridge.log("(ReelsBlocker) Loaded app: " + lpparam.packageName);


//        findAndHookMethod("com.instagram.C3US", lpparam.classLoader, "A02", UserSession.class, User.class, new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        // This runs before the Reel is created
//                        XposedBridge.log("Before creating Reel");
//                    }
//                });

//
//                findAndHookMethod("com.instagram.feed.media", lpparam.classLoader, "reel", new XC_MethodHook() {
//                    @Override
//                    protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                        // This runs before the Reel is created
//                        XposedBridge.log("media --> " + param);
//                    }
//                });

//
//        findAndHookMethod("X.5Rf", lpparam.classLoader, "A01", new XC_MethodHook() {
//            @Override
//            protected void beforeHookedMethod(MethodHookParam param) throws Throwable {
//                // This runs before the Reel is created
//                XposedBridge.log("idk --> " + param);
//                XposedBridge.log("Method called: " + param.method.getName() + " in class " + param.method.getDeclaringClass().getName());
//            }
//
//        });




        XposedBridge.log("(StatusbarMod) Clock modified");
    }
}