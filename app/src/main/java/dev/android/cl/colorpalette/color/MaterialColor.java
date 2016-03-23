package dev.android.cl.colorpalette.color;

import android.content.Context;

import dev.android.cl.colorpalette.R;

/**
 * Created by fran on 15-02-16.
 */
public class MaterialColor {

    private int color;
    private String name;
    private String groupName;
    private String HEX;
    private String[] allColors;
    private String[] colorList;

    public MaterialColor() {
    }

    public MaterialColor(int color) {
        this.color = color;
    }

    public MaterialColor(String name, String HEX) {
        this.name = name;
        this.HEX = HEX;
    }

    public MaterialColor(int color, String name, String HEX) {
        this.color = color;
        this.name = name;
        this.HEX = HEX;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHEX() {
        return HEX;
    }

    public void setHEX(String HEX) {
        this.HEX = HEX;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String[] getAllColors() {
        return allColors;
    }

    public void setAllColors(String[] allColors) {
        this.allColors = allColors;
    }

    public String[] getAllColors(Context context) {
        allColors = context.getResources().getStringArray(R.array.colors);
        return allColors;
    }

    public String[] getAllColorNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.colors);
        return allColors;
    }

    public String[] getColorsValues(Context context, String colorName) {

        switch (colorName) {
            case "red":
                allColors = context.getResources().getStringArray(R.array.material_colors_red_values);
                break;
            case "pink":
                allColors = context.getResources().getStringArray(R.array.material_colors_pink_values);
                break;
            case "purple":
                allColors = context.getResources().getStringArray(R.array.material_colors_purple_values);
                break;
            case "deep_purple":
                allColors = context.getResources().getStringArray(R.array.material_colors_deep_purple_values);
                break;
            case "indigo":
                allColors = context.getResources().getStringArray(R.array.material_colors_indigo_values);
                break;
            case "blue":
                allColors = context.getResources().getStringArray(R.array.material_colors_blue_values);
                break;
            case "light_blue":
                allColors = context.getResources().getStringArray(R.array.material_colors_light_blue_values);
                break;
            case "cyan":
                allColors = context.getResources().getStringArray(R.array.material_colors_cyan_values);
                break;
            case "teal":
                allColors = context.getResources().getStringArray(R.array.material_colors_teal_values);
                break;
            case "green":
                allColors = context.getResources().getStringArray(R.array.material_colors_green_values);
                break;
            case "light_green":
                allColors = context.getResources().getStringArray(R.array.material_colors_light_green_values);
                break;
            case "lime":
                allColors = context.getResources().getStringArray(R.array.material_colors_lime_values);
                break;
            case "yellow":
                allColors = context.getResources().getStringArray(R.array.material_colors_yellow_values);
                break;
            case "amber":
                allColors = context.getResources().getStringArray(R.array.material_colors_amber_values);
                break;
            case "orange":
                allColors = context.getResources().getStringArray(R.array.material_colors_orange_values);
                break;
            case "deep_orange":
                allColors = context.getResources().getStringArray(R.array.material_colors_deep_orange_values);
                break;
            case "brown":
                allColors = context.getResources().getStringArray(R.array.material_colors_brown_values);
                break;
            case "grey":
                allColors = context.getResources().getStringArray(R.array.material_colors_grey_values);
                break;
            case "blue_grey":
                allColors = context.getResources().getStringArray(R.array.material_colors_blue_grey_values);
                break;
        }
        return allColors;
    }

    public String[] getColorsNames(Context context, String colorName) {

        switch (colorName) {
            case "red":
                allColors = context.getResources().getStringArray(R.array.material_colors_red_names);
            case "pink":
                allColors = context.getResources().getStringArray(R.array.material_colors_pink_names);
            case "purple":
                allColors = context.getResources().getStringArray(R.array.material_colors_purple_names);
            case "deep_purple":
                allColors = context.getResources().getStringArray(R.array.material_colors_deep_purple_names);
            case "indigo":
                allColors = context.getResources().getStringArray(R.array.material_colors_indigo_names);
            case "blue":
                allColors = context.getResources().getStringArray(R.array.material_colors_blue_names);
            case "light_blue":
                allColors = context.getResources().getStringArray(R.array.material_colors_light_blue_names);
            case "cyan":
                allColors = context.getResources().getStringArray(R.array.material_colors_cyan_names);
            case "teal":
                allColors = context.getResources().getStringArray(R.array.material_colors_teal_names);
            case "green":
                allColors = context.getResources().getStringArray(R.array.material_colors_green_names);
            case "light_green":
                allColors = context.getResources().getStringArray(R.array.material_colors_light_green_names);
            case "lime":
                allColors = context.getResources().getStringArray(R.array.material_colors_lime_names);
            case "yellow":
                allColors = context.getResources().getStringArray(R.array.material_colors_yellow_names);
            case "amber":
                allColors = context.getResources().getStringArray(R.array.material_colors_amber_names);
            case "orange":
                allColors = context.getResources().getStringArray(R.array.material_colors_orange_names);
            case "deep_orange":
                allColors = context.getResources().getStringArray(R.array.material_colors_deep_orange_names);
            case "brown":
                allColors = context.getResources().getStringArray(R.array.material_colors_brown_names);
            case "grey":
                allColors = context.getResources().getStringArray(R.array.material_colors_grey_names);
            case "blue_grey":
                allColors = context.getResources().getStringArray(R.array.material_colors_blue_grey_names);
        }
        return allColors;
    }

    public String[] getAllColorsRedNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_red_names);
        return allColors;
    }

    public String[] getAllColorsRedValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_red_values);
        return allColors;
    }

    public String[] getAllColorsPinkNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_pink_names);
        return allColors;
    }

    public String[] getAllColorsPinkValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_pink_values);
        return allColors;
    }

    public String[] getAllColorsPurpleNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_purple_names);
        return allColors;
    }

    public String[] getAllColorsPurpleValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_purple_values);
        return allColors;
    }

    public String[] getAllColorsDeepPurpleNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_deep_purple_names);
        return allColors;
    }

    public String[] getAllColorsDeepPuppleValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_deep_purple_values);
        return allColors;
    }

    public String[] getAllColorsIndigoNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_indigo_names);
        return allColors;
    }

    public String[] getAllColorsIndigoValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_indigo_values);
        return allColors;
    }

    public String[] getAllColorsBlueNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_blue_names);
        return allColors;
    }

    public String[] getAllColorsBlueValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_blue_values);
        return allColors;
    }

    public String[] getAllColorsLightBlueNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_light_blue_names);
        return allColors;
    }

    public String[] getAllColorsLightBlueValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_light_blue_values);
        return allColors;
    }

    public String[] getAllColorsCyanNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_cyan_names);
        return allColors;
    }

    public String[] getAllColorsCyanValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_cyan_values);
        return allColors;
    }

    public String[] getAllColorsTealNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_teal_names);
        return allColors;
    }

    public String[] getAllColorsTealValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_teal_values);
        return allColors;
    }

    public String[] getAllColorsGreenNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_green_names);
        return allColors;
    }

    public String[] getAllColorsGreenValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_green_values);
        return allColors;
    }

    public String[] getAllColorsLightGreenNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_light_green_names);
        return allColors;
    }

    public String[] getAllColorsLightGreenValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_light_green_values);
        return allColors;
    }

    public String[] getAllColorsLimeNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_lime_names);
        return allColors;
    }

    public String[] getAllColorsLimeValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_lime_values);
        return allColors;
    }

    public String[] getAllColorsYellowNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_yellow_names);
        return allColors;
    }

    public String[] getAllColorsYellowValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_yellow_values);
        return allColors;
    }

    public String[] getAllColorsAmberNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_amber_names);
        return allColors;
    }

    public String[] getAllColorsAmberValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_amber_values);
        return allColors;
    }

    public String[] getAllColorsOrangeNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_orange_names);
        return allColors;
    }

    public String[] getAllColorsOrangeValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_orange_values);
        return allColors;
    }

    public String[] getAllColorsDeepOrangeNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_deep_orange_names);
        return allColors;
    }

    public String[] getAllColorsDeepOrangeValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_deep_orange_values);
        return allColors;
    }

    public String[] getAllColorsGreyNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_grey_names);
        return allColors;
    }

    public String[] getAllColorsGreyValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_grey_values);
        return allColors;
    }

    public String[] getAllColorsBrownNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_brown_names);
        return allColors;
    }

    public String[] getAllColorsBrownValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_brown_values);
        return allColors;
    }

    public String[] getAllColorsBlueGreyNames(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_blue_grey_names);
        return allColors;
    }

    public String[] getAllColorsBlueGreyValues(Context context) {
        allColors = context.getResources().getStringArray(R.array.material_colors_blue_grey_values);
        return allColors;
    }

    public String[] getAllColorsByGroup(Context context, String colorGroup) {

        switch (colorGroup) {
            case "red":
                colorList = getAllColorsRedValues(context);
                break;
            case "pink":
                colorList = getAllColorsPinkValues(context);
                break;
            case "purple":
                colorList = getAllColorsPurpleValues(context);
                break;
            case "deep_purple":
                colorList = getAllColorsDeepPuppleValues(context);
                break;
            case "indigo":
                colorList = getAllColorsIndigoValues(context);
                break;
            case "blue":
                colorList = getAllColorsBlueValues(context);
                break;
            case "light_blue":
                colorList = getAllColorsLightBlueValues(context);
                break;
            case "cyan":
                colorList = getAllColorsCyanValues(context);
                break;
            case "teal":
                colorList = getAllColorsTealValues(context);
                break;
            case "green":
                colorList = getAllColorsGreenValues(context);
                break;
            case "light_green":
                colorList = getAllColorsLightGreenValues(context);
                break;
            case "lime":
                colorList = getAllColorsLimeValues(context);
                break;
            case "yellow":
                colorList = getAllColorsYellowValues(context);
                break;
            case "amber":
                colorList = getAllColorsAmberValues(context);
                break;
            case "orange":
                colorList = getAllColorsOrangeValues(context);
                break;
            case "deep_orange":
                colorList = getAllColorsDeepOrangeValues(context);
                break;
            case "brown":
                colorList = getAllColorsBrownValues(context);
                break;
            case "grey":
                colorList = getAllColorsGreyValues(context);
                break;
            case "blue_grey":
                colorList = getAllColorsBlueGreyValues(context);
                break;
        }
        return colorList;
    }
}
