package com.example.reseptron.api.weather;

public class Headline
{
    private String Category;

    private String EndEpochDate;

    private String EffectiveEpochDate;

    private String Severity;

    private String Text;

    private String EndDate;

    private String Link;

    private String EffectiveDate;

    private String MobileLink;

    public String getCategory ()
    {
        return Category;
    }

    public void setCategory (String Category)
    {
        this.Category = Category;
    }

    public String getEndEpochDate ()
    {
        return EndEpochDate;
    }

    public void setEndEpochDate (String EndEpochDate)
    {
        this.EndEpochDate = EndEpochDate;
    }

    public String getEffectiveEpochDate ()
    {
        return EffectiveEpochDate;
    }

    public void setEffectiveEpochDate (String EffectiveEpochDate)
    {
        this.EffectiveEpochDate = EffectiveEpochDate;
    }

    public String getSeverity ()
    {
        return Severity;
    }

    public void setSeverity (String Severity)
    {
        this.Severity = Severity;
    }

    public String getText ()
    {
        return Text;
    }

    public void setText (String Text)
    {
        this.Text = Text;
    }

    public String getEndDate ()
    {
        return EndDate;
    }

    public void setEndDate (String EndDate)
    {
        this.EndDate = EndDate;
    }

    public String getLink ()
    {
        return Link;
    }

    public void setLink (String Link)
    {
        this.Link = Link;
    }

    public String getEffectiveDate ()
    {
        return EffectiveDate;
    }

    public void setEffectiveDate (String EffectiveDate)
    {
        this.EffectiveDate = EffectiveDate;
    }

    public String getMobileLink ()
    {
        return MobileLink;
    }

    public void setMobileLink (String MobileLink)
    {
        this.MobileLink = MobileLink;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [Category = "+Category+", EndEpochDate = "+EndEpochDate+", EffectiveEpochDate = "+EffectiveEpochDate+", Severity = "+Severity+", Text = "+Text+", EndDate = "+EndDate+", Link = "+Link+", EffectiveDate = "+EffectiveDate+", MobileLink = "+MobileLink+"]";
    }
}
