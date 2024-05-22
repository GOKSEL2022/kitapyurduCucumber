package pages;

public class AllPages {

    public AllPages() {
    }
    private HomePage homePage;
    private IndexPage indexPage;
    private AyinYayinevleriPage ayinYayinevleriPage;
    private CocukKitaplariPage cocukKitaplariPage;

    public CocukKitaplariPage cocukKitaplariPage() {
        if (cocukKitaplariPage == null) {
            cocukKitaplariPage = new CocukKitaplariPage();
        }
        return cocukKitaplariPage;
    }

    public AyinYayinevleriPage ayinYayinevleriPage() {
        if (ayinYayinevleriPage == null) {
            ayinYayinevleriPage = new AyinYayinevleriPage();
        }
        return ayinYayinevleriPage;
    }

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
