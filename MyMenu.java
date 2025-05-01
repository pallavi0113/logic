
    /* 3. Create and display a Frame with FILE and EDIT as the menu. The MenuItems under FILE menu are NEW, OPEN and EXIT. 
The MenuItems under EDIT are COPY and PASTE.*/

import java.awt.*;
class MyMenu extends Frame
{
	Menu m1,m2;
	MenuItem m11,m12,m13,m21,m22;
	MenuBar mb;
	MyMenu(String st)
	{
		super(st);
		m1=new Menu("FILE");
		m2=new Menu("EDIT");
		m11=new MenuItem("NEW");
		m12=new MenuItem("OPEN");
		m13=new MenuItem("EXIT");
		m21=new MenuItem("COPY");
		m22=new MenuItem("PASTE");
		mb=new MenuBar();
		m1.add(m11);m1.add(m12);m1.addSeparator();m1.add(m13);
		m2.add(m21);m2.add(m22);
		mb.add(m1);mb.add(m2);
		setMenuBar(mb);
		setSize(300,300);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String args[])
	{
		MyMenu mm=new MyMenu("My Menu");
	}
}
