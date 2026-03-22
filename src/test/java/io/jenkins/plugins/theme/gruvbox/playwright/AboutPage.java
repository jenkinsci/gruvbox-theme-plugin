package io.jenkins.plugins.theme.gruvbox.playwright;

import com.microsoft.playwright.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class AboutPage extends JenkinsPage<AboutPage> {

    private static final Logger log = LoggerFactory.getLogger(AboutPage.class);

    AboutPage(Page page, String rootUrl) {
        super(page, rootUrl + "manage/about/");
    }

    AboutPage waitForThemeApplied() {
        page.waitForLoadState();
        page.waitForTimeout(500);
        return this;
    }

    AboutPage takeScreenshot(Theme theme) {
        java.io.File screenshotDir = new java.io.File(System.getProperty("user.dir") + "/target/screenshots");
        screenshotDir.mkdirs();
        java.io.File screenshotFile = new java.io.File(screenshotDir, "about-" + theme.id() + ".png");
        log.info("Taking screenshot: {}", screenshotFile.getAbsolutePath());
        page.screenshot(new Page.ScreenshotOptions()
            .setPath(screenshotFile.toPath())
            .setFullPage(true)
        );
        log.info("Screenshot saved: {}", screenshotFile.getAbsolutePath());
        return this;
    }
}
