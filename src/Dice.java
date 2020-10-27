public class Dice {

    private int faceValue;
    private int diceSides;
    public Dice(int diceSides) throws Exception {
        if (diceSides >=1 && diceSides <=12) {
            this.diceSides = diceSides;

        } else {
            throw new Exception("Has to be between 1 and 12");
        }
    }

    public void roll()
    {
        faceValue = (int)(Math.random()* this.diceSides +1); // Ruller et tilfældigt tal mellem 1 og 6
    }

    public int getFaceValue()
    {
        return faceValue;
    }

}
