import java.io.File;

class Siblings {

    public static boolean areSiblings(File f1, File f2) {
        // implement me
        String parent1 = f1.getParent();
        String parent2 = f2.getParent();

        boolean reslt = true;

       return parent1.equals(parent2) ? reslt : !reslt;

    }
}