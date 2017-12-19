package fi.company;

import org.springframework.stereotype.Service;

@Service
public class HtmlHelperImp implements HtmlHelper {
    public String createH1(String title) {
        String t = title;
        String t2 = "<h1>" + title + "</h1>";
        return t2;
    }
}
