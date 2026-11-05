-keep public class com.google.android.gms.* { public *; }
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
    @com.google.android.gms.common.annotation.KeepName *;
}

-keep @interface androidx.annotation.Keep
-keep @androidx.annotation.Keep class * { *; }
-keepclasseswithmembers class * { @androidx.annotation.Keep *; }

-keep class org.webrtc.* { *; }
-keep class org.webrtc.audio.* { *; }
-keep class org.webrtc.voiceengine.* { *; }
-keep class org.wooble.messenger.* { *; }
-keep class org.wooble.messenger.camera.* { *; }
-keep class org.wooble.messenger.secretmedia.* { *; }
-keep class org.wooble.messenger.support.* { *; }
-keep class org.wooble.messenger.support.* { *; }
-keep class org.wooble.messenger.time.* { *; }
-keep class org.wooble.messenger.video.* { *; }
-keep class org.wooble.messenger.voip.* { *; }
-keep class org.wooble.SQLite.** { *; }
-keep class org.wooble.tgnet.ConnectionsManager { *; }
-keep class org.wooble.tgnet.NativeByteBuffer { *; }
-keep class org.wooble.tgnet.RequestTimeDelegate { *; }
-keep class org.wooble.tgnet.RequestDelegate { *; }
-keep class org.wooble.ui.Stories.recorder.FfmpegAudioWaveformLoader { *; }
-keep class androidx.mediarouter.app.MediaRouteButton { *; }
-keepclassmembers class ** {
    @android.webkit.JavascriptInterface <methods>;
}

-keep class org.wooble.utils.code.highlight.PrismaHighlighter {
    private static native <methods>;
}

# https://developers.google.com/ml-kit/known-issues#android_issues
-keep class com.google.mlkit.nl.languageid.internal.LanguageIdentificationJni { *; }

# Huawei Services
-keep class com.huawei.hianalytics.**{ *; }
-keep class com.huawei.updatesdk.**{ *; }
-keep class com.huawei.hms.**{ *; }

# Don't warn about checkerframework and Kotlin annotations
-dontwarn org.checkerframework.**
-dontwarn javax.annotation.**

-keep class io.nano.tex.** {*;}

-keep class org.wooble.tgnet.** { *; }

# JLatexMath: macro/atom classes are loaded reflectively by Class.forName
-keep class org.scilab.forge.jlatexmath.** { *; }
-keep class ru.noties.jlatexmath.** { *; }
-dontwarn org.scilab.forge.jlatexmath.**

# Use -keep to explicitly keep any other classes shrinking would remove
#-dontoptimize
#-dontobfuscate