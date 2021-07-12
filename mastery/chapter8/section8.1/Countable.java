public class Countable {
    // This demonstrates a static field

    private static int instanceCount = 0;

    /**
     * The constructor increments the static field instanceCount. This keeps track
     * of the number of instances of this class that are created.
     */

    public Countable() {
        instanceCount++;
    }

    /**
     * The getInstance method returns the number of instances of this class that
     * have been created.
     * 
     * @return The value in the instanceCount field
     */

    public int getInstanceCount() {
        return instanceCount;
    }

}