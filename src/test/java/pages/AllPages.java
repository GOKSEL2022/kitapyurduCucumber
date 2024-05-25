package pages;

public class AllPages {

    public AllPages() {
    }
    private HomePage homePage;
    private IndexPage indexPage;
    private AyinYayinevleriPage ayinYayinevleriPage;
    private CocukKitaplariPage cocukKitaplariPage;
    private KitapPage kitapPage;
    private Yardim_VideoPage yardim_videoPage;
    private IletisimPage iletisimPage;

    public IletisimPage iletisimPage() {
        if (iletisimPage == null) {
            iletisimPage = new IletisimPage();
        }
        return iletisimPage;
    }


    public Yardim_VideoPage yardim_videoPage() {
        if (yardim_videoPage == null) {
            yardim_videoPage = new Yardim_VideoPage();
        }
        return yardim_videoPage;
    }

    public KitapPage kitapPage() {
        if (kitapPage == null) {
            kitapPage = new KitapPage();
        }
        return kitapPage;
    }
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
