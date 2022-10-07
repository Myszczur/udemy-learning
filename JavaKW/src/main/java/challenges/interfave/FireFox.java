package challenges.interfave;

public class FireFox implements Browser{
    protected String url;

    @Override
    public void gotoPage(String url) {
        this.url = url;
        System.out.println("Firefox url: " + url);
    }

    @Override
    public void refreshPage() {

    }

    @Override
    public void bookmarkPage() {

    }
}
