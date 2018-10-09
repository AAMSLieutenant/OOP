package Components;

public class Teeth {

    private int teeth;


    public Teeth(int teeth){
        this.teeth=teeth;
    }

    public int getTeeth(){
        return teeth;
    }


    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        final Teeth other = (Teeth) obj;
        if (this.teeth != other.teeth)
        {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode()
    {
        int hash = 31;
        hash = 19 * hash + (this.teeth != 0 ? Integer.valueOf(teeth) : 0);
        return hash;
    }


    @Override
    public String toString()
    {
        return  "Teeth{"+"\nteeth="+this.getTeeth()+ '}';
    }
}
