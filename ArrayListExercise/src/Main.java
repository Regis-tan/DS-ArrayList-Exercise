import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public int searchcolor(String colorname, ArrayList<String> colors) {
        return colors.indexOf(colorname);
    }
    public void removeDuplicates(ArrayList<String> list) {
        HashSet<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
    }

    public static void main(String[] args) {
        Main main = new Main();

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add("green");
        colors.add("white");


        System.out.println("Initial colors: " + colors);
        colors.add(3, "purble");
        colors.remove(5);
        System.out.println("Modified colors: " + colors);

        System.out.println("Updated colors: " + colors);

        String colorToSearch = "yellow";
        int index = main.searchcolor(colorToSearch, colors);
        if (index != -1) {
            System.out.println(colorToSearch + " found at index: " + index);
        } else {
            System.out.println(colorToSearch + " not found in the list.");
        }
        colors.add("blue");
        System.out.println("Colors before removeDuplicates function: " + colors);
        main.removeDuplicates(colors);
        System.out.println("Colors After: " + colors);
    }
}
