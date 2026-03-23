package io.jenkins.plugins.theme.gruvbox;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class GruvboxDarkHardTheme extends GruvboxTheme {

    static final String CSS = "gruvbox-dark-hard.css";

    @DataBoundConstructor
    public GruvboxDarkHardTheme() {
        // Stapler
    }

    @Extension
    @Symbol("gruvboxDarkHard")
    public static class DescriptorImpl extends GruvboxThemeDescriptor {

        @Override
        public String getThemeKey() {
            return "gruvbox-dark-hard";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new GruvboxDarkHardTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "Gruvbox Dark Hard";
        }
    }
}
