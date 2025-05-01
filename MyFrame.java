
    /*2. Create a form with components labels, TextFields, TextArea, Checkboxes, Button, List, Choice.
    Add the components to Panels with different colours and add the Panels to the North, Centre and South region of Frame
    and display the form.*/
    
    import java.awt.*;
    class MyFrame extends Frame
    {
        Label l1,l2;
        TextField t1,t2;
        TextArea ta;
        Button b1;
        List l;
        Choice ch;
        Checkbox c1,c2,c3,c4,c5;
        CheckboxGroup cbg;
        Panel p1,p2,p3;
        MyFrame(String st)
        {
            super(st);
            l1=new Label("Enter Username");
            l2=new Label("Enter Password");
            t1=new TextField(10);
            t2=new TextField(10);
            t2.setEchoChar('*');
            ta=new TextArea(20,20);
            b1=new Button("Submit");
            l=new List(3,true);
            l.add("Kolkata");
            l.add("Bangalore");
            l.add("New Delhi");
            l.add("Mumbai");
            l.add("Chennai");
            l.add("Hyderabad");
            ch=new Choice();
            ch.add("BCA");
            ch.add("BBA");
            ch.add("MCA");
            ch.add("MBA");
            ch.add("B.Tech");
            ch.add("M.Tech");
            c1=new Checkbox("Music");
            c2=new Checkbox("Movie");
            c3=new Checkbox("Sports");
            cbg=new CheckboxGroup();
            c4=new Checkbox("Male",cbg,true);
            c5=new Checkbox("Female",cbg,false);
            p1=new Panel();
            p2=new Panel();
            p3=new Panel();
            p1.setBackground(Color.RED);
            p2.setBackground(Color.GREEN);
            p3.setBackground(Color.BLUE);
            p1.add(l1);p1.add(t1);p1.add(l2);p1.add(t2);p1.add(ta);
            p2.add(c1);p2.add(c2);p2.add(c3);p2.add(c4);p2.add(c5);
            p3.add(l);p3.add(ch);p3.add(b1);
            add(p1,BorderLayout.NORTH);
            add(p2,BorderLayout.CENTER);
            add(p3,BorderLayout.SOUTH);
            setSize(500,500);
            setVisible(true);
        }
        public static void main(String args[])
        {
            MyFrame mf=new MyFrame("My Frame");
        }
    }

// import java.lang.classfile.Label;
// import java.util.List;