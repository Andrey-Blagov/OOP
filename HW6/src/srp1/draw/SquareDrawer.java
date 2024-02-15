package srp1.draw;

public class SquareDrawer extends Drawer {
    public void draw(int... side) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < side[0]; i++) {
            builder.append("* ");
        }
        System.out.println(builder);
        for (int i = 0; i < side[0]; i++) {
            if (i < side[0] - 2) {
                System.out.print("*");
            } else {
                continue;
            }

            for (int j = 1; j < side[0] - 1; j++) {
                System.out.print(" *");
            }
            System.out.println(" *");
        }

        System.out.println(builder);
    }
}
