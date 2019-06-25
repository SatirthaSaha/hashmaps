import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class InternBO {

	List<Intern> internList;
	public InternBO()
	{
		internList=new ArrayList<Intern>();
		
	}
	public void addIntern(String name,String batch, int age, String technology )
	{
		Intern intern=new Intern(name,batch,age,technology);
		internList.add(intern);
		
	}
	public void printInternDetails()
	{
		System.out.format("%-16s %-30s %-20s %-10s %-20s\n","ID","NAME","BATCH","AGE","TECHNOLOGY");
		for(Intern i:internList)
		{
			System.out.format("%-16s %-30s %-20s %-10s %-20s\n",i.getId(),i.getName(),i.getBatch(),i.getAge(),i.getTechnology());
		}
	}
	public void removeIntern( int id)
	{
		boolean found=false;
		Iterator<Intern> it=internList.iterator();
		while(it.hasNext())
		{
			Intern o=it.next();
			if(o.getId()==id)
			{
				found=true;
				it.remove();
				System.out.println("Intern with id as "+id+"removed permanently");
				break;
			}
			if(!found)
			{
				System.out.println("Invalid id..");
			}
		}
	}
	
	public void sortInternsByAge()
	{
		Collections.sort(internList,new AgeComparator());
	}
	
	public void sortInternsByName()
	{
		Collections.sort(internList);
	}
	
}
