public class Polygon 
{
    int numSides = 0;
    double sideLength = 0;
    String shape = "N/A";
    boolean invalid = false;
    
    public Polygon()
    {
        numSides = 3;
        sideLength = 1.0;
        shape = "Square";
    }
    public Polygon(int numSides, double sideLength, String shape)
    {
        if(numSides <= 2) { invalid = true; } 
        if(sideLength <= 0) { invalid = true; }

        this.numSides = numSides;
        this.sideLength = sideLength;
        this.shape = shape;
    }

    public int getNumSides() { return numSides; }
    public double getSideLength() { return sideLength; }
    public String getShape() { return shape; }

    public String toString()
    {
        if(invalid) { return "invalid shape"; }
        return "Your shape is a " + shape + " and it has " + numSides + " sides\n" 
        + "It has a side legnth of " + sideLength + ".\n"
        + "It has a perimeter of " + (sideLength * numSides) + " units.\n";
    }
}
