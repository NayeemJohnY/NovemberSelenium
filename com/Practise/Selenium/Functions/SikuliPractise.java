package com.Practise.Selenium.Functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.Practise.Selenium.Utility.BrowserSelection;

public class SikuliPractise {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = BrowserSelection.SelectBrowser("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&t=0s&index=23");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		Screen screen= new Screen();
		Pattern pauseVideo= new Pattern(".\\ImagesSikuli\\PauseVideo.PNG");
		screen.click(pauseVideo,5000);
		Pattern muteAudio= new Pattern(".\\ImagesSikuli\\MuteAudio.PNG");
		screen.wait(muteAudio,5000);
		screen.click();
		Pattern settingsIcon= new Pattern(".\\ImagesSikuli\\SettingsIcon.PNG");
		screen.wait(settingsIcon,5000);
		screen.click(settingsIcon);
		Pattern autoQ= new Pattern(".\\ImagesSikuli\\AutoQuality.PNG");
		screen.wait(autoQ,5000);
		screen.click();
		Pattern Q480p= new Pattern(".\\ImagesSikuli\\Quality_480P.PNG");
		screen.wait(Q480p,5000);
		screen.click();
		Pattern playVideo= new Pattern(".\\ImagesSikuli\\PlayVideo.PNG");
		screen.wait(playVideo,5000);
		screen.click();
	}

}
