package study.test.collection.set;

import com.sun.source.tree.Tree;

import java.util.TreeSet;

public class TestTreeSet {
    public void testTreeSet(){
        /*
        *
        * */
        TreeSet<String> tset = new TreeSet<String>();

        tset.add("3. Mybatis");
        tset.add("1. Java");
        tset.add("5. HTML5");
        tset.add("4. Oracle");
        tset.add("2. JDBC");

        for(String txt: tset){
            System.out.println(txt);
        }
    }
}
