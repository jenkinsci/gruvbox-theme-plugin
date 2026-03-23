package io.jenkins.plugins.theme.gruvbox;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class GruvboxLightSoftTheme extends GruvboxTheme {

    static final String CSS = "gruvbox-light-soft.css";

    @DataBoundConstructor
    public GruvboxLightSoftTheme() {
        // Stapler
    }

    @Extension
    @Symbol("gruvboxLightSoft")
    public static class DescriptorImpl extends GruvboxThemeDescriptor {

        @Override
        public String getThemeKey() {
            return "gruvbox-light-soft";
        }

        @Override
        public ThemeManagerFactory getInstance() {
            return new GruvboxLightSoftTheme();
        }

        @Override
        public String getThemeCssSuffix() {
            return CSS;
        }

        @NonNull
        @Override
        public String getDisplayName() {
            return "Gruvbox Light Soft";
        }
    }
}
