package org.sprite2d.apps.pp.config;

import org.sprite2d.apps.pp.presets.BrushPreset;

import android.content.pm.ActivityInfo;

/**
 * Application settings class
 *
 * @author Arthur Bikmullin (devolonter)
 * @version 1.17
 *
 */

public final class Settings {
	public BrushPreset preset = null;
	public String lastPicture = null;
	public boolean forceOpenFile = false;
	public int orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
}