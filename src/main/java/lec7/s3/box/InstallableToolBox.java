package lec7.s3.box;

import lec7.s3.tools.Installable;
import lec7.s3.tools.Tool;

//나는 지금 object를 받고 싶은게 아니라 제한을 해서 받아오고 싶기 때문에(installable을 갖고있으면서 Tool도 갖고 있어야)
public class InstallableToolBox<T extends Tool & Installable> extends Box<T> {

    public InstallableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("content = " + content.getName());
        content.installable();
    }


}
