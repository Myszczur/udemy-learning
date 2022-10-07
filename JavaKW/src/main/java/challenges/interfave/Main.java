package challenges.interfave;

public class Main {
    public static void main(String[] args) {

  /*
	1. Stwórz interfejs Browser posiadający:
	 a) statyczną stałą typu String ENGINE z wartością "WebKit"
	 b) domyślną metodę zwracającą ENGINE o nazwie getEngine()
     c) metody nic nie zwracające gotoPage(String url), refreshPage(), bookmarkPage()
	2. Utwórz klasę Chrome implementującą interfejs Browser posiadającą:
	 a) zmienną protected String url
	 b) implementującą metody interfejsu,
	 c) goToPage(String url) zapisuje url w instancji klasy, wyświetla
	    w konsoli info "Chrome url: " + url
	3. Utwórz klase Firefox podobnie jak Chrome
	4. W Main dodaj dwie zmienne typu Browser i przypisz do nich nowe instancje
	   Chrome i Firefox, wywołaj na nich gotoPage() z dowolną stroną jako argument
*/

        Browser chrome = new Chrome();
        chrome.gotoPage("google.com");

        Browser firefox = new FireFox();
        firefox.gotoPage("google.pl");

    }
}