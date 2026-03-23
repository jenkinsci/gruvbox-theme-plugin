package io.jenkins.plugins.theme.gruvbox;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class GruvboxDarkMediumTheme extends GruvboxTheme {

    static final String CSS = "gruvbox-dark-medium.css";

    @DataBoundConstructor
    public GruvboxDarkMediumTheme() {
        // Stapler
    }

    @Extension
    @Symbol("gruvboxDarkMedium")
    public static class DescriptorImpl extends GruvboxThemeDescriptor {

        @Override
        public String getThemeKey() {
            return "gruvbox-dark-medium";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new GruvboxDarkMediumTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "Gruvbox Dark Medium";
        }
    }
}
