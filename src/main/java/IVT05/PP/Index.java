package IVT05.PP;

import java.io.*;

public class Index {
    File url;

    public Index(String url) {
        this.url = new File(url);
    }

    public String getHtml() {
        String res = "Error 404";
        try (FileInputStream fin = new FileInputStream(url.getPath())){
            res = "";
            int i=-1;
            while((i=fin.read())!=-1){
                res += (char)i;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}
