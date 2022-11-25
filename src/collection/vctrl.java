package collection;

import java.util.Enumeration;
import java.util.Vector;

public class vctrl {
	public static void main(String[] args) {
		
	
Vector<String>vr = new Vector();

vr.add("vilol");
vr.add("rajesh");
vr.add("hr");
vr.add("sunil");
vr.add("rajesh");
vr.add("null");
System.out.println("----enumeration----");
Enumeration en= vr.elements();
while(en.hasMoreElements())
{
	System.out.println(en.nextElement());
}
System.out.println("----for ech----");
for(Object o:vr)
{
	System.out.println(o);
}
System.out.println("----forloop----");
for(int i=0;i<=vr.size()-1;i++)
{
	System.out.println(vr.get(i));
}

}
}