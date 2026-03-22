package io.jenkins.plugins.theme.gruvbox.jcasc.lighthard;

import io.jenkins.plugins.casc.misc.junit.jupiter.WithJenkinsConfiguredWithCode;
import io.jenkins.plugins.theme.gruvbox.GruvboxLightHardTheme;
import io.jenkins.plugins.theme.gruvbox.jcasc.AbstractThemeJCasCTest;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;

@WithJenkinsConfiguredWithCode
class GruvboxLightHardThemeJCasCTest extends AbstractThemeJCasCTest {

    @Override
    protected Class<? extends ThemeManagerFactory> getThemeManagerFactory() {
        return GruvboxLightHardTheme.class;
    }
}
