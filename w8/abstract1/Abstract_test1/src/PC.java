public class PC extends Computer{

    int subType = 100;
    public PC()
    {
        super(3);
    }


    public void updateDesription(String text, int type)
    {
        super.desciption = text;
    }

    //@Override
    public String getDescription()
    {
        return super.desciption + Integer.toString(subType);
    }

    public void setSubType(int type)
    {
        this.subType = type;
    }

}
