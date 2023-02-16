package edu.eci.cvds.tdd.registry;
import java.util.ArrayList;

public class Registry{

    private ArrayList<Integer> ids = new ArrayList<Integer>();

    public RegisterResult registerVoter(Person p) {

        if (!p.isAlive()){
            return RegisterResult.DEAD;}

        if (p.getAge() < 18){
            return RegisterResult.UNDERAGE;}

        if (p.getAge() <= 0 || p.getAge() > 130){
            return RegisterResult.INVALID_AGE;}
        
        if (ids.contains(p.getId())){
            return RegisterResult.DUPLICATED;
        }else{
            ids.add(p.getId());}
    return RegisterResult.VALID;
    }
}
