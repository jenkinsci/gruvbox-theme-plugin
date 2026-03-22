package io.jenkins.plugins.theme.gruvbox.playwright;

import static io.jenkins.plugins.theme.gruvbox.playwright.Theme.CssVariable.background;

import io.jenkins.plugins.theme.gruvbox.GruvboxDarkHardTheme;
import io.jenkins.plugins.theme.gruvbox.GruvboxDarkMediumTheme;
import io.jenkins.plugins.theme.gruvbox.GruvboxDarkSoftTheme;
import io.jenkins.plugins.theme.gruvbox.GruvboxLightHardTheme;
import io.jenkins.plugins.theme.gruvbox.GruvboxLightMediumTheme;
import io.jenkins.plugins.theme.gruvbox.GruvboxLightSoftTheme;
import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;

public record Theme(String name, String id, CssVariable variableToCheck) {

    public static final Theme DARKHARD = of(new GruvboxDarkHardTheme.DescriptorImpl(), background("#1d2021"));
    public static final Theme DARKMEDIUM = of(new GruvboxDarkMediumTheme.DescriptorImpl(), background("#282828"));
    public static final Theme DARKSOFT = of(new GruvboxDarkSoftTheme.DescriptorImpl(), background("#32302f"));
    public static final Theme LIGHTHARD = of(new GruvboxLightHardTheme.DescriptorImpl(), background("#f9f5d7"));
    public static final Theme LIGHTMEDIUM = of(new GruvboxLightMediumTheme.DescriptorImpl(), background("#fbf1c7"));
    public static final Theme LIGHTSOFT = of(new GruvboxLightSoftTheme.DescriptorImpl(), background("#f2e5bc"));

    public Theme {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Theme name cannot be null or empty");
        }
        if (id == null || id.isEmpty()) {
            throw new IllegalArgumentException("Theme id cannot be null or empty");
        }
        if (variableToCheck == null) {
            throw new IllegalArgumentException("Variable to check cannot be null");
        }
    }

    public static Theme of(ThemeManagerFactoryDescriptor theme, CssVariable variableToCheck) {
        return new Theme(theme.getDisplayName(), theme.getThemeKey(), variableToCheck);
    }

    public record CssVariable(String name, String expected) {
        public CssVariable {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("CSS variable name cannot be null or empty");
            }
            if (!name.startsWith("--")) {
                throw new IllegalArgumentException("CSS variable name must start with '--'");
            }
            if (expected == null || expected.isEmpty()) {
                throw new IllegalArgumentException("Expected value cannot be null or empty");
            }
        }

        public static CssVariable background(String expectedValue) {
            return new CssVariable("--background", expectedValue);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
