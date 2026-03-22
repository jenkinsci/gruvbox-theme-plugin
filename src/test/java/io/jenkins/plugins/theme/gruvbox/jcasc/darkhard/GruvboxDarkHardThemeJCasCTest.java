package io.jenkins.plugins.theme.gruvbox.jcasc.darkhard;

import io.jenkins.plugins.casc.misc.junit.jupiter.WithJenkinsConfiguredWithCode;
import io.jenkins.plugins.theme.gruvbox.GruvboxDarkHardTheme;
import io.jenkins.plugins.theme.gruvbox.jcasc.AbstractThemeJCasCTest;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;

@WithJenkinsConfiguredWithCode
class GruvboxDarkHardThemeJCasCTest extends AbstractThemeJCasCTest {

    @Override
    protected Class<? extends ThemeManagerFactory> getThemeManagerFactory() {
        return GruvboxDarkHardTheme.class;
    }
}
