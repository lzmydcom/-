package com.yd.structural.compositePattern.main;

import com.yd.structural.compositePattern.Component;
import com.yd.structural.compositePattern.impl.Composite;
import com.yd.structural.compositePattern.impl.Leaf;

import java.util.LinkedList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        Leaf 我的奋斗 = new Leaf("我的奋斗");
        List<Component> autobiography = new LinkedList<>();
        autobiography.add(我的奋斗);

        Composite 自传 = new Composite("自传", autobiography);

        Leaf 斗罗大陆 = new Leaf("斗罗大陆");
        Leaf 斗破苍穹 = new Leaf("斗破苍穹");
        List<Component> novels = new LinkedList<>();
        novels.add(斗罗大陆);
        novels.add(斗破苍穹);

        Composite 小说 = new Composite("小说", novels);

        List<Component> books = new LinkedList<>();
        books.add(自传);
        books.add(小说);
        Composite 我爱看的书籍 = new Composite("我爱看的书籍", books);

        我爱看的书籍.execute();

        System.out.println("========================");
        我爱看的书籍.showComposite();

        System.out.println("========================");
        System.out.println("我不想再看到斗罗大陆了，全是狗血剧情！！！");
        Leaf remove = (Leaf) 小说.remove(斗罗大陆);
        System.out.println("已经将"+remove.getName()+"删除");
        我爱看的书籍.execute();
    }
}
