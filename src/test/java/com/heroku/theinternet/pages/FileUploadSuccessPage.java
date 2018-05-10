package com.heroku.theinternet.pages;

import com.frameworkium.ui.annotations.Visible;
import com.frameworkium.ui.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import io.qameta.allure.Step;
import ru.yandex.qatools.htmlelements.annotations.Name;

public class FileUploadSuccessPage extends BasePage<FileUploadSuccessPage> {

    @Visible
    @Name("Uploaded Files")
    @FindBy(css = "div#uploaded-files")
    private WebElement uploadedFiles;

    @Step("Get uploaded files list")
    public String getUploadedFiles() {
        return uploadedFiles.getText();
    }

}