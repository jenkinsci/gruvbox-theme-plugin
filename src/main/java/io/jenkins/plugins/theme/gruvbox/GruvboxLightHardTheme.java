package io.jenkins.plugins.theme.gruvbox;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class GruvboxLightHardTheme extends GruvboxTheme {

    static final String CSS = "gruvbox-light-hard.css";

    @DataBoundConstructor
    public GruvboxLightHardTheme() {
        // Stapler
    }

    @Extension
    @Symbol("gruvboxLightHard")
    public static class DescriptorImpl extends GruvboxThemeDescriptor {

        @Override
        public String getThemeKey() {
            return "gruvbox-light-hard";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new GruvboxLightHardTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "Gruvbox Light Hard";
        }
    }
}
