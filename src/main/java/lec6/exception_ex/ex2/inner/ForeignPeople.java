package lec6.exception_ex.ex2.inner;

public class ForeignPeople extends People{

    public static String MOTHER_TONGUE = "English";

    public ForeignPeople() {
        super(new LanguageType(MOTHER_TONGUE));
    }

    public ForeignPeople(boolean hasTranslator) {
        super(new LanguageType(MOTHER_TONGUE), hasTranslator);
    }
}
