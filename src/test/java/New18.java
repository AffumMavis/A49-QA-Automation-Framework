import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class New18 extends BaseTest{
@Test
public void playSong(){
provideEmail();
providePassword();
clickSubmit();
clickPlay();
Assert.assertEquals(isSongPlaying());
}

public void clickPlayBtn() {
WebElement playBtn = driver.findElement(By.XPath(xpathExpression:"//i[@data-testid ='play-next-btn']"));
playBtn,click();
    }
public boolean isSongPlaying(){
WebElement soundBar = driver.findElement(By.XPath(xpathExpression:"//div[@data-testid = 'sound-bar-play']"));
return soundBar.isDisplayed();
}
}
