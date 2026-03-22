package io.jenkins.plugins.theme.gruvbox;

import edu.umd.cs.findbugs.annotations.NonNull;
import hudson.Extension;
import io.jenkins.plugins.thememanager.Theme;
import io.jenkins.plugins.thememanager.ThemeManagerFactory;
import java.util.List;
import org.jenkinsci.Symbol;
import org.kohsuke.stapler.DataBoundConstructor;

public class GruvboxLightHardTheme extends ThemeManagerFactory {

    static final String CSS = "gruvbox-light-hard.css";

    @DataBoundConstructor
    public GruvboxLightHardTheme() {
        // Stapler
    }

    @Override
    public Theme getTheme() {
        return Theme.builder().withCssUrls(List.of(getCssUrl())).build();
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
