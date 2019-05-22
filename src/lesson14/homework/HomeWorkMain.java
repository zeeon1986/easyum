package lesson14.homework;

import java.util.Arrays;

public class HomeWorkMain {

    public static void main(String[] args) {
        StringUtilsImpl impl = new StringUtilsImpl();
//        impl.div("dsfs", "sadasd");
        System.out.println(impl.div("10", "5"));
        impl.findWord("ccc ccc c cc ccc", "ccc");

        System.out.println(Arrays.toString(impl.findNumbers("2.5")));

    }

}
