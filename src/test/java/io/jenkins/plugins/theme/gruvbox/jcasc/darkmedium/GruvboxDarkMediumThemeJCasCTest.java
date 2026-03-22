package io.jenkins.plugins.theme.gruvbox.jcasc.darkmedium;

import io.jenkins.plugins.casc.misc.junit.jupiter.WithJenkinsConfiguredWithCode;
import io.jenkins.plugins.theme.gruvbox.GruvboxDarkMediumTheme;
import io.jenkins.plugins.theme.gruvbox.jcasc.AbstractThemeJCasCTest;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;

@WithJenkinsConfiguredWithCode
class GruvboxDarkMediumThemeJCasCTest extends AbstractThemeJCasCTest {

    @Override
    protected Class<? extends ThemeManagerFactory> getThemeManagerFactory() {
        return GruvboxDarkMediumTheme.class;
    }
}
