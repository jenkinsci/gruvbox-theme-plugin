package io.jenkins.plugins.theme.gruvbox;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class GruvboxDarkSoftTheme extends GruvboxTheme {

    static final String CSS = "gruvbox-dark-soft.css";

    @DataBoundConstructor
    public GruvboxDarkSoftTheme() {
        // Stapler
    }

    @Extension
    @Symbol("gruvboxDarkSoft")
    public static class DescriptorImpl extends GruvboxThemeDescriptor {

        @Override
        public String getThemeKey() {
            return "gruvbox-dark-soft";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new GruvboxDarkSoftTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "Gruvbox Dark Soft";
        }
    }
}
