package io.jenkins.plugins.theme.gruvbox;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class GruvboxLightMediumTheme extends GruvboxTheme {

    static final String CSS = "gruvbox-light-medium.css";

    @DataBoundConstructor
    public GruvboxLightMediumTheme() {
        // Stapler
    }

    @Extension
    @Symbol("gruvboxLightMedium")
    public static class DescriptorImpl extends GruvboxThemeDescriptor {

        @Override
        public String getThemeKey() {
            return "gruvbox-light-medium";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new GruvboxLightMediumTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "Gruvbox Light Medium";
        }
    }
}
