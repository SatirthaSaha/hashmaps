
import java.util.*;  
class AgeComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Intern s1=(Intern)o1;  
Intern s2=(Intern)o2;  
  
if(s1.age==s2.age)  
return 0;  
else if(s1.age>s2.age)  
return 1;  
else  
return -1;  
}  
}  