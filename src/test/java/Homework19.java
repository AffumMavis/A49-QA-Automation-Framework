import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Homework19 extends BaseTest{
}@Test
public void deletePlaylist(){
nevigateToPage();
provideEmail(demo@class.com);
providePassword(te$t$tudent);
clickSubmit();
openPlaylist();
clickDeletePlaylist();

public void playlist(){
webElement x Playlist = driver.findElement(ByCssSelector([class =="del btn-delete-playlist"]);
xPlaylist.click;
}
public String getdeletedPlaylistMessage(){
    webElement deletePlaylistMessage = driver.findElement(ByCssSelector([class ="ok"]));
return notification.getText();

Assert.assertTrue(message:DeletedPlaylist(#17));

@AfterMethod
//close all browsers
drive.quit();