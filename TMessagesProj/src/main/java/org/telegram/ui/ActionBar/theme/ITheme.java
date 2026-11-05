package org.wooble.ui.ActionBar.theme;

import org.wooble.tgnet.TLRPC;

public interface ITheme {
    long getThemeId();

    TLRPC.ThemeSettings getThemeSettings(int settingsIndex);
    TLRPC.WallPaper getThemeWallPaper(int settingsIndex);
}
