import java.util.*;  
class NameComparator implements Comparator{  
public int compare(Object o1,Object o2){  
Intern s1=(Intern)o1;  
Intern s2=(Intern)o2;  
  
return s1.name.compareTo(s2.name);  
}  
}  