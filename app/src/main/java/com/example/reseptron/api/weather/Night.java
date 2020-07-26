package com.example.reseptron.api.weather;
public class Night
{
    private String HasPrecipitation;

    private String IconPhrase;

    private String Icon;

    public String getHasPrecipitation ()
    {
        return HasPrecipitation;
    }

    public void setHasPrecipitation (String HasPrecipitation)
    {
        this.HasPrecipitation = HasPrecipitation;
    }

    public String getIconPhrase ()
    {
        return IconPhrase;
    }

    public void setIconPhrase (String IconPhrase)
    {
        this.IconPhrase = IconPhrase;
    }

    public String getIcon ()
    {
        return Icon;
    }

    public void setIcon (String Icon)
    {
        this.Icon = Icon;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [HasPrecipitation = "+HasPrecipitation+", IconPhrase = "+IconPhrase+", Icon = "+Icon+"]";
    }
}

