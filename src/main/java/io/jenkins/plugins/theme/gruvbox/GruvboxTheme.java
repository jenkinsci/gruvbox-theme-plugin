package io.jenkins.plugins.theme.gruvbox;

import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import java.util.List;

public abstract class GruvboxTheme extends ThemeManagerFactory {

    @Override
    public Theme getTheme() {
        return Theme.builder().withCssUrls(List.of(getCssUrl())).build();
    }
}
