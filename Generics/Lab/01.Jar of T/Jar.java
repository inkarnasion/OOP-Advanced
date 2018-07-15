package generics_Lab.jar_of_T_01;

import java.util.ArrayDeque;


public class Jar <T>{
private ArrayDeque<T> contest;

    public Jar() {
        this.contest = new ArrayDeque<T>();
    }
    public void add(T element){
        this.contest.push(element);
    }
    public T remove(){
        if(this.contest.size()>0){
            return this.contest.pop();
        }
return null;
    }
}
