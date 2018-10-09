package Predator;

import Components.Claws;
import Components.Teeth;

public class Predator {


    public  Types type;
    private Teeth teeth;
    private Claws claws;

    public Predator(Types type){

        this.type=type;

        if(this.type.equals(Types.FELIFORMIA)){
            System.out.println("cat");
            this.teeth=new Teeth(30);
            this.claws=new Claws(18);
        }
        if(this.type.equals(Types.CANIFORMIA)){
            System.out.println("dog");
            this.teeth=new Teeth(42);
            this.claws=new Claws(20);
        }
        System.out.println("Predator created");
    }

    public void roar(){
        System.out.println("Predator is roaring");
    }

    public void run(){
        System.out.println("Predator is running");
    }

    public void sleep(){
        System.out.println("Predator is sleeping");
    }

    public void hunt(){
        System.out.println("Predator is hunting");
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
        final Predator other = (Predator) obj;
        if (this.type == null){
            if (other.type != null){
                return false;
            }
        }
        else{
            if (!this.type.equals(other.type)) {
                return false;
            }
        }

        if (this.teeth == null) {
            if (other.teeth != null) {
                return false;
            }
        }
        else {
            if (!this.teeth.equals(other.teeth)) {
                return false;
            }
        }

        if (this.claws == null) {
            if (other.claws != null) {
                return false;
            }
        }
        else {
            if (!this.claws.equals(other.claws)) {
                return false;
            }
        }

        return true;
    }


    @Override
    public int hashCode()
    {
        int hash = 31;
        hash = 19 * hash + (this.teeth != null ? this.teeth.hashCode() : 0);
        hash = 19 * hash + (this.claws != null ? this.claws.hashCode() : 0);
        hash = 19 * hash + (this.type != null ? this.type.hashCode() : 0);
        return hash;
    }


    @Override
    public String toString()
    {
        return  "Predator{"+"\ntype="+this.type.toString()+"\nteeth="+this.teeth.toString()+"\nclaws="+this.claws.toString()+ '}';
        //return null;
    }
}
