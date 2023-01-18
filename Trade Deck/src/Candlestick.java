import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Candlestick extends JPanel{
    int[] cordx={20,40,60,80,100,120,140,160,180,200,220,240,260,280,300,320};
    int[] low=new int[100];
    int[] high=new int[100];
    int[] open=new int[100];
    int[] close=new int[100];
    int marg=60;
    
     protected void paintComponent(Graphics grf)
    {
        super.paintComponent(grf);
        Graphics2D graph=(Graphics2D)grf;
        
        //get the height and width
        int height = getHeight();
        int width = getWidth();
        
        //x-axis
        graph.draw(new Line2D.Double(marg,height-marg,width-marg,height-marg));
        
        //y-axis
        graph.draw(new Line2D.Double(marg,marg,marg,height-marg));
        
        //changing color
        
        
        for(int i=0;i<cordx.length;i++)
        {
            if(open[i]<=close[i])
            {
                graph.setPaint(Color.green);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-low[i],marg+cordx[i],height-marg-open[i]));
                graph.fillRect(marg+cordx[i]-10,height-marg-close[i],20, close[i]-open[i]);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-close[i],marg+cordx[i],height-marg-high[i]));
            }
            else 
            {
                graph.setPaint(Color.red);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-low[i],marg+cordx[i],height-marg-close[i]));
                graph.fillRect(marg+cordx[i]-10,height-marg-open[i],20, open[i]-close[i]);
                graph.draw(new Line2D.Double(marg+cordx[i],height-marg-open[i],marg+cordx[i],height-marg-high[i]));
            }
        }
    }
}
