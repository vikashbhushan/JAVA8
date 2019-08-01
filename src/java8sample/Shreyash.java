package java8sample;

public class Shreyash{
 
    /*    [0 to 999] === 1000 instance, so it never uses same method - so it isn't recursive    */    
    private static final int MAX_NUMBER_OF_SHREYASH = 999;
    private final int instanceId;
    private final Shreyash parent;
 
    private Shreyash(int instanceId, Shreyash parent)
    {
        this.parent = parent;
        this.instanceId = instanceId;
 
        System.out.println("Shreyash - " + instanceId + " parent: " + ((parent == null) ? "none" : parent.instanceId));
        if (instanceId < MAX_NUMBER_OF_SHREYASH)
        {
            new Shreyash(instanceId + 1, this);
        }
    }
 
    public static void main(String[] args)
    {
        new Shreyash(0, null);
    }}