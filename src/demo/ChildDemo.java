
package demo;


public class ChildDemo extends Demo
{
    private int numCourses;
    
    public ChildDemo(String address, String ID, String name, int numCourses)
    {
        super(address, ID, name); 
        this.numCourses = numCourses;
    }
    
    public int getNumCourses()
    {
        return numCourses;
        
    }
    
    public void setNumCourses(int numCourses)
    {
        this.numCourses = numCourses;
    }
    
}
