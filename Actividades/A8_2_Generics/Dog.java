public class Dog implements Comparable<Dog>
{
    protected int age; 

    public Dog(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public int compare2(Dog object1) {
        if(object1.getAge()>getAge())
            return 1;
        else if(object1.getAge()<getAge())
            return -1;
        else
            return 0; 
    }
}