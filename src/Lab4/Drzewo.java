package Lab4;

public class Drzewo {
    private static String c192 = "└";
    private static String c179 = "|";
    private static String c195 = "├";
    private static String c196 = "─";
    private static String c218 = "┌";
    private String CR = c218 + c196; //┌-
    private String CL = c192 + c196; //└-
    private String CP = c179 + " ";        //|

    public Wezel Root = null;

    public void PrintTree()
    {
        PrintTree("", "", Root);
    }

    private void PrintTree(String sp, String sn, Wezel v)
    {
    	String s;

        if (v != null)
        {
            s = sp;
            if (sn.equals(CR))
            {
                StringBuilder sb = new StringBuilder(s);
                sb.replace(s.length()-2, s.length()-1, " ");
                s=sb.toString();
            }
            PrintTree(s + CP, CR, v.Prawy);

            if (sp.length() > 1)
                s = sp.substring(0, sp.length() - 2);
            System.out.println(s+sn+v.Wartosc);
            //cout << s << sn << v->data << endl;

            s = sp;
            if (sn.equals(CL))
            {
                StringBuilder sb = new StringBuilder(s);
                sb.replace(s.length()-2, s.length()-1, " ");
                s = sb.toString();
            }
            PrintTree(s + CP, CL, v.Lewy);
        }
    }
}
