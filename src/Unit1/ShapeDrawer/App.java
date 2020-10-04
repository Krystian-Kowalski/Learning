package Unit1.ShapeDrawer;

class App {
    public static void main (String[] args) throws java.lang.Exception {
        ShapeDrawer drawer = new ShapeDrawer(new Circle());

        drawer.process();
    }
}