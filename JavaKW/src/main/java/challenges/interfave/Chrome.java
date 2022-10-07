package challenges.interfave;

public class Chrome implements Browser{

    protected String url;

    @Override
    public void gotoPage(String url) {
        this.url = url;
        System.out.println("Chrome url: " + url);
    }

    @Override
    public void refreshPage() {

    }

    @Override
    public void bookmarkPage() {

    }
}
