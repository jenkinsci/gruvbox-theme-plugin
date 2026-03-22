package io.jenkins.plugins.theme.gruvbox.jcasc.lightsoft;

import io.jenkins.plugins.casc.misc.junit.jupiter.WithJenkinsConfiguredWithCode;
import io.jenkins.plugins.theme.gruvbox.GruvboxLightSoftTheme;
import io.jenkins.plugins.theme.gruvbox.jcasc.AbstractThemeJCasCTest;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;

@WithJenkinsConfiguredWithCode
class GruvboxLightSoftThemeJCasCTest extends AbstractThemeJCasCTest {

    @Override
    protected Class<? extends ThemeManagerFactory> getThemeManagerFactory() {
        return GruvboxLightSoftTheme.class;
    }
}
