public class Computer {
    int type = 0;
    String desciption = "";

    public Computer(int type)
    {
        this.type = type;
    }

    public int getType()
    {
        return this.type;
    }

    public void setType(int type)
    {
        this.type = type;
    }

    public String getDescription()
    {
        return this.desciption;
    }

    public void updateDesription(String text)
    {
        this.desciption = text;
    }
}
