package Components;

public class Claws {

    private int claws;

    public Claws(int claws){
        this.claws=claws;
    }

    public int getClaws(){
        return claws;
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
        final Claws other = (Claws) obj;
        if (this.claws != other.claws)
        {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode()
    {
        int hash = 31;
        hash = 19 * hash + (this.claws != 0 ? Integer.valueOf(claws) : 0);
        return hash;
    }


    @Override
    public String toString()
    {
        return  "Claws{"+"\nclaws="+this.getClaws()+ '}';
    }
}
