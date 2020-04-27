package Locators;

public class XpathSyntax {


/**  Locatorslar By classinin metodlari. O nedenle By'dan sonra nokta konularak bu sinifin metodu kullaniliyor.
 *
 * By.id :       WebElement elementUsername = driver.findElement(By.id("username"));
 * By.Name:      WebElement elementUsername = driver.findElement(By.name("login"));
 * By.LinkText   WebElement element         = driver.findElement(By.linkText("Name of the Link"));
 * By.PartialLinkText                       = driver.findElement(By.partialLinkText("here"));
 * By.className                             = driver.findElement(By.className(" "));
 *
 *
 * XPATH
 * DOM Syntax
 * <tag attr1="val1" attr2="val2">text</tag>
 *
 * Using attributes:
 * //tag[@attr='val']
 * //input[@name='firstname']
 * //tag[text()='textValue']
 *
 * //tag[contains(@attr,'val')]
 * //input[contains(@aria-label,'ast n')]
 * //tag[contains(text(),'extValu')]
 *
 * //Using starts-with:
 * //tag[starts-with(@attr,'val')]
 * //tag[starts-with(text(),'textVal')]
 *
 * -- and/or --
 * //tag[@attr='value' and contains(text(), 'textVa')]
 *
 *
 * TAG NAME ILE PARENT'TAN INDEKS DE KULLANARAK CHILD'A GITMEK
 *      (By.xpath("//table[@id='product']//tr[3]//td"));
 *
 *
 */
}
