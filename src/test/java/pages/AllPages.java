package pages;

public class AllPages {

    public AllPages() {
    }
    private HomePage homePage;
    private IndexPage indexPage;

    public HomePage homePage() {
        if (homePage == null) {
            homePage = new HomePage();
        }
        return homePage;
    }
    public IndexPage indexPage() {
        if (indexPage == null) {
            indexPage = new IndexPage();
        }
        return indexPage;
    }




}
