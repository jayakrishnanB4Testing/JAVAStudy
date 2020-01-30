package arraysListsAutoboxingUnboxing.listsAndArrayLists;

import java.util.ArrayList;

public class arraysStudy {

    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();

        shoppingList.add("mango");
        shoppingList.add("mango");

        System.out.println(shoppingList.size());
        for (String a: shoppingList) {
            System.out.println(a);
        }

//        shoppingList.remove("mango");
//        System.out.println(shoppingList.size());

        System.out.println(shoppingList.indexOf("coco"));
        System.out.println(shoppingList.lastIndexOf("mango"));


    }

}
