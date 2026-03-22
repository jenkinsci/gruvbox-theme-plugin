package io.jenkins.plugins.theme.gruvbox.jcasc.lightmedium;

import io.jenkins.plugins.casc.misc.junit.jupiter.WithJenkinsConfiguredWithCode;
import io.jenkins.plugins.theme.gruvbox.GruvboxLightMediumTheme;
import io.jenkins.plugins.theme.gruvbox.jcasc.AbstractThemeJCasCTest;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;

@WithJenkinsConfiguredWithCode
class GruvboxLightMediumThemeJCasCTest extends AbstractThemeJCasCTest {

    @Override
    protected Class<? extends ThemeManagerFactory> getThemeManagerFactory() {
        return GruvboxLightMediumTheme.class;
    }
}
