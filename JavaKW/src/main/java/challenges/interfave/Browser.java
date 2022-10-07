package challenges.interfave;

public interface Browser {

    String ENGINE = "WebKit";

    default String getEngine() {
        return Browser.ENGINE;
    }

    void gotoPage(String url);

    void refreshPage();

    void bookmarkPage();

}
