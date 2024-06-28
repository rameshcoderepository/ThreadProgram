    package SortingInterface;

    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.List;

    public class NewClass {

        public static void main(String[] args) {

            List<Desktop> deskptopList = new ArrayList<Desktop>();

            deskptopList.add(new Desktop("DELL", 250, 30000));
            deskptopList.add(new Desktop("Lenovo", 500, 7000));
            deskptopList.add(new Desktop("KCER", 125, 45000));
            deskptopList.add(new Desktop("MAC", 750, 50000));

            Comparator<Desktop> comparator = new Comparator<Desktop>() 
            {
                @Override
                public int compare(Desktop o1, Desktop o2) {

                    if (o1.getPrice() > o2.getPrice()) {
                        return 1;
                    } else if (o1.getPrice() < o2.getPrice()) {
                        return -1;
                    } else {
                        return 0;
                    }

                }

        };

        Collections.sort(deskptopList, comparator);
        for (Desktop desktop : deskptopList) {
            System.out.println(desktop);
        }

    }

}
