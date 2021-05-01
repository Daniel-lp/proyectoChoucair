package co.com.choucair.certificacion.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target BUTTON_UNIVERSITY_CHOUCAIR= Target.the("button that shows us the courses").located(By.xpath("//*[@id=\"certificaciones\"]/a"));
    public static final Target INPUT_COURSE= Target.the("Search the course").located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO= Target.the("click to search the course").located(By.xpath("//*[@id=\"coursesearch\"]/fieldset/button"));
    public static final Target SELECT_COURSE= Target.the("click to select the course").located(By.xpath("/html/body/div[2]/div[2]/div/div/div/section/div/div/div[1]/h4/a"));
    public static final Target NAME_COURSE= Target.the("give the element name").located(By.xpath("/html/body/div[1]/div[2]/div/header/div/div/div[2]/div[1]/div[1]/a/div/div"));

}
