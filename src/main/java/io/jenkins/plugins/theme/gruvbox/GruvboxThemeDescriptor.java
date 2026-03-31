package io.jenkins.plugins.theme.gruvbox;

import io.jenkins.plugins.thememanager.ThemeManagerFactoryDescriptor;

public abstract class GruvboxThemeDescriptor extends ThemeManagerFactoryDescriptor {
    static final String ID = "gruvbox";

    @Override
    public String getThemeId() {
        return ID;
    }

    @Override
    public boolean isNamespaced() {
        return true;
    }

    @Override
    public String getIconClassName() {
        return "symbol-gruvbox plugin-gruvbox-theme";
    }
}
