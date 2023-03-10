import java.sql.PreparedStatement;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.sql.SQLException;
import org.json.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class MainScreen extends javax.swing.JFrame {
        static String username;
        static String watchlistnew;
        static ArrayList<String> watchlist = new ArrayList<String>();
        
        static int[] cordy = new int[100];
        static int[] close = new int[100];
        static int[] open = new int[100];
        static int[] low = new int[100];
        static int[] high = new int[100];
        static ArrayList<String> symbols = new ArrayList<String>();
    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title_panel = new javax.swing.JPanel();
        title_mainscreen = new javax.swing.JLabel();
        Home_Button = new javax.swing.JButton();
        Watchlist_Button = new javax.swing.JButton();
        Logout_Button = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        home_panel = new javax.swing.JPanel();
        Search_textfield = new javax.swing.JTextField();
        Serach_Button = new javax.swing.JButton();
        Search_result_panel = new javax.swing.JPanel();
        Watchlist_panel = new javax.swing.JPanel();
        watchlist_panel = new javax.swing.JPanel();
        plots_panel = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        graph1 = new Graph();
        jPanel6 = new javax.swing.JPanel();
        candlestick2 = new Candlestick();
        add_to_watchlist_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title_panel.setBackground(new java.awt.Color(255, 102, 102));

        title_mainscreen.setFont(new java.awt.Font("Lucida Bright", 1, 20)); // NOI18N
        title_mainscreen.setForeground(new java.awt.Color(255, 255, 255));
        title_mainscreen.setText("Trade Deck");

        Home_Button.setBackground(new java.awt.Color(255, 102, 102));
        Home_Button.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        Home_Button.setText("Home");
        Home_Button.setContentAreaFilled(false);
        Home_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Home_ButtonActionPerformed(evt);
            }
        });

        Watchlist_Button.setBackground(new java.awt.Color(255, 102, 102));
        Watchlist_Button.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        Watchlist_Button.setText("Watchlist");
        Watchlist_Button.setContentAreaFilled(false);
        Watchlist_Button.setMargin(new java.awt.Insets(0, 14, 0, 14));
        Watchlist_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Watchlist_ButtonActionPerformed(evt);
            }
        });

        Logout_Button.setBackground(new java.awt.Color(255, 102, 102));
        Logout_Button.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        Logout_Button.setText("Logout");
        Logout_Button.setContentAreaFilled(false);
        Logout_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Title_panelLayout = new javax.swing.GroupLayout(Title_panel);
        Title_panel.setLayout(Title_panelLayout);
        Title_panelLayout.setHorizontalGroup(
            Title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Title_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Watchlist_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 490, Short.MAX_VALUE)
                .addComponent(title_mainscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        Title_panelLayout.setVerticalGroup(
            Title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Title_panelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(Title_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(title_mainscreen, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Home_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Watchlist_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Logout_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(Title_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 80));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        home_panel.setBackground(new java.awt.Color(0, 0, 0));

        Search_textfield.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Serach_Button.setText("Search");
        Serach_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Serach_ButtonActionPerformed(evt);
            }
        });

        Search_result_panel.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Search_result_panelLayout = new javax.swing.GroupLayout(Search_result_panel);
        Search_result_panel.setLayout(Search_result_panelLayout);
        Search_result_panelLayout.setHorizontalGroup(
            Search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        Search_result_panelLayout.setVerticalGroup(
            Search_result_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout home_panelLayout = new javax.swing.GroupLayout(home_panel);
        home_panel.setLayout(home_panelLayout);
        home_panelLayout.setHorizontalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_result_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(home_panelLayout.createSequentialGroup()
                        .addComponent(Search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Serach_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        home_panelLayout.setVerticalGroup(
            home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(home_panelLayout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(home_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Serach_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Search_result_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", home_panel);

        Watchlist_panel.setBackground(new java.awt.Color(0, 0, 0));

        watchlist_panel.setBackground(new java.awt.Color(0, 0, 0));
        watchlist_panel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout watchlist_panelLayout = new javax.swing.GroupLayout(watchlist_panel);
        watchlist_panel.setLayout(watchlist_panelLayout);
        watchlist_panelLayout.setHorizontalGroup(
            watchlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 985, Short.MAX_VALUE)
        );
        watchlist_panelLayout.setVerticalGroup(
            watchlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Watchlist_panelLayout = new javax.swing.GroupLayout(Watchlist_panel);
        Watchlist_panel.setLayout(Watchlist_panelLayout);
        Watchlist_panelLayout.setHorizontalGroup(
            Watchlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Watchlist_panelLayout.createSequentialGroup()
                .addComponent(watchlist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        Watchlist_panelLayout.setVerticalGroup(
            Watchlist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Watchlist_panelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(watchlist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab2", Watchlist_panel);

        plots_panel.setBackground(new java.awt.Color(0, 0, 0));
        plots_panel.setForeground(new java.awt.Color(255, 102, 102));
        plots_panel.setPreferredSize(new java.awt.Dimension(994, 542));

        jTabbedPane2.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        graph1.setBackground(new java.awt.Color(0, 0, 0));
        graph1.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout graph1Layout = new javax.swing.GroupLayout(graph1);
        graph1.setLayout(graph1Layout);
        graph1Layout.setHorizontalGroup(
            graph1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        graph1Layout.setVerticalGroup(
            graph1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graph1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(graph1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("RAW", jPanel5);

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        candlestick2.setBackground(new java.awt.Color(0, 0, 0));
        candlestick2.setForeground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout candlestick2Layout = new javax.swing.GroupLayout(candlestick2);
        candlestick2.setLayout(candlestick2Layout);
        candlestick2Layout.setHorizontalGroup(
            candlestick2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
        );
        candlestick2Layout.setVerticalGroup(
            candlestick2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(candlestick2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(candlestick2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Candle Stick", jPanel6);

        add_to_watchlist_button.setBackground(new java.awt.Color(0, 0, 0));
        add_to_watchlist_button.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add_to_watchlist_button.setForeground(new java.awt.Color(255, 255, 255));
        add_to_watchlist_button.setText("Add to Watchlist");
        add_to_watchlist_button.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        add_to_watchlist_button.setContentAreaFilled(false);
        add_to_watchlist_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_to_watchlist_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout plots_panelLayout = new javax.swing.GroupLayout(plots_panel);
        plots_panel.setLayout(plots_panelLayout);
        plots_panelLayout.setHorizontalGroup(
            plots_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plots_panelLayout.createSequentialGroup()
                .addContainerGap(151, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(add_to_watchlist_button, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        plots_panelLayout.setVerticalGroup(
            plots_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plots_panelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(add_to_watchlist_button, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plots_panelLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("tab3", plots_panel);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 1000, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Home_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Home_ButtonActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_Home_ButtonActionPerformed

    private void Watchlist_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Watchlist_ButtonActionPerformed
            try {
                // TODO add your handling code here:
                getwatchlist();
                ArrayList <javax.swing.JButton> wlbuttons = new ArrayList <javax.swing.JButton>();
                for(int i=0;i<watchlist.size();i++)
                {
                    javax.swing.JButton wlbutton = new javax.swing.JButton(watchlist.get(i));
                    wlbutton.setBounds(20,40+i*30,600,30);
                    String symbol = watchlist.get(i);
                    
                    wlbutton.addMouseListener(new MouseAdapter()
                        {
                            public void mousePressed(MouseEvent me)
                            {
                                try {
                                    fetch(symbol);
                                    graph1.cordy = close;
                                    candlestick2.close = close;
                                    candlestick2.low = low;
                                    candlestick2.high = high;
                                    candlestick2.open=open;
                                    watchlistnew = symbol;
                                    jTabbedPane1.setSelectedIndex(2);
                                } catch (IOException ex) {
                                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    );
                    wlbuttons.add(wlbutton);
                }
                watchlist_panel.removeAll();
                for(int i=0;i<wlbuttons.size();i++)
                {
                    watchlist_panel.add(wlbuttons.get(i));
                    watchlist_panel.repaint();
                    watchlist_panel.validate();
                }
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTabbedPane1.setSelectedIndex(1);
        
    }//GEN-LAST:event_Watchlist_ButtonActionPerformed

    private void Serach_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Serach_ButtonActionPerformed
        // TODO add your handling code here:
        String keyword=Search_textfield.getText();
            try 
            {
                search (keyword);
                ArrayList <javax.swing.JButton> stockbuttons = new ArrayList <javax.swing.JButton>();
                
                for(int i=0;i<symbols.size();i++)
                {
                    javax.swing.JButton stock = new javax.swing.JButton(symbols.get(i));
                    stock.setBounds(20,40+i*30,600,30);
                    String symbol = symbols.get(i);
                    stock.addMouseListener(new MouseAdapter()
                        {
                            public void mousePressed(MouseEvent me)
                            {
                                try {
                                    fetch(symbol);
                                    graph1.cordy = close;
                                    candlestick2.close = close;
                                    candlestick2.low = low;
                                    candlestick2.high = high;
                                    candlestick2.open=open;
                                    watchlistnew = symbol;
                                    jTabbedPane1.setSelectedIndex(2);
                                } catch (IOException ex) {
                                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                                } catch (InterruptedException ex) {
                                    Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    );
                    stockbuttons.add(stock);
                }
                
                Search_result_panel.removeAll();
                for(int i=0;i<stockbuttons.size();i++)
                {
                    Search_result_panel.add(stockbuttons.get(i));
                    Search_result_panel.repaint();
                    Search_result_panel.validate();
                }
                
            } 
            catch (IOException ex) 
            {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Serach_ButtonActionPerformed

    private void Logout_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout_ButtonActionPerformed
        // TODO add your handling code here:
        LoginPage lp = new LoginPage(); //object of class register page
        lp.setVisible(true);
        lp.pack();
        lp.setLocationRelativeTo(null);
        lp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_Logout_ButtonActionPerformed

    private void add_to_watchlist_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_to_watchlist_buttonActionPerformed
            try {
                // TODO add your handling code here:
                if(watchlist.contains(watchlistnew))
                {
                    JOptionPane.showMessageDialog(null,"Already in Watchlist");
                }
                else
                {
                    addtowatchlist(watchlistnew);
                    remove(add_to_watchlist_button);
                }
                
            } catch (ClassNotFoundException | SQLException ex) {
                Logger.getLogger(MainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_add_to_watchlist_buttonActionPerformed
    
    //search
    public static void search(String keyword) throws IOException, InterruptedException{
            
        symbols.clear();
        String  url="https://www.alphavantage.co/query?function=SYMBOL_SEARCH&keywords="+keyword+"&apikey=8MA3TWJLDMW2SA21";
        
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client  = HttpClient.newBuilder().build();
        HttpResponse <String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        String info = response.body();
//        System.out.println("response:"+info);
        
        JSONObject obj = new JSONObject(info);
        JSONArray bestmatches = obj.getJSONArray("bestMatches");
        
        for(int i=0;i<bestmatches.length();i++)
        {
            JSONObject result = bestmatches.getJSONObject(i);
            String symbol    = result.getString("1. symbol");
            symbols.add(symbol);
        } 
        System.out.println("Stocks: "+ symbols.toString());
    }
    
    //fetch data
    public static void fetch(String keyword) throws IOException, InterruptedException{
        String  url="https://www.alphavantage.co/query?function=TIME_SERIES_DAILY_ADJUSTED&symbol="+keyword+"&apikey=8MA3TWJLDMW2SA21";
        
        HttpRequest request = HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient client  = HttpClient.newBuilder().build();
        HttpResponse <String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        String info = response.body();
        
        JSONObject obj = new JSONObject(info);
//      System.out.println("obj: " + obj);
        JSONObject time = obj.getJSONObject("Time Series (Daily)");
//      System.out.println("Time: "+time);
        
        //storing  all the dates
        Set <String> keys= time.keySet();
        String[] dates = keys.toArray(new String[keys.size()]);
        Arrays.sort(dates);
//      System.out.println("dates:"+Arrays.toString(dates));

        //close
        for(int i=0;i<dates.length;i++)
        {
            open[i]=(int)Double.parseDouble(time.getJSONObject(dates[i]).getString("1. open"));
            high[i]=(int)Double.parseDouble(time.getJSONObject(dates[i]).getString("2. high"));
            low[i]=(int)Double.parseDouble(time.getJSONObject(dates[i]).getString("3. low"));
            close[i]=(int)Double.parseDouble(time.getJSONObject(dates[i]).getString("4. close"));
            cordy[i]=(int)Double.parseDouble(time.getJSONObject(dates[i]).getString("4. close"));
        }
    }
    
    //add stocks to watchlist
    public static void addtowatchlist(String stock) throws ClassNotFoundException, SQLException{
        PreparedStatement ps;
        String query = "INSERT INTO Watchlist VALUES('"+username+"','"+stock+"');";
        ps = SqlConnection.getConnection().prepareStatement(query);
        if(ps.executeUpdate()>0){
            JOptionPane.showMessageDialog(null,"Stock has been added to Watchlist");
        }
    }
    
    public static void getwatchlist() throws ClassNotFoundException, SQLException{
        watchlist.clear();
        PreparedStatement ps;
        ResultSet rs;
        String query ="SELECT * FROM WATCHLIST WHERE Username ='"+username+"';";
        ps = SqlConnection.getConnection().prepareStatement(query);
        rs = ps.executeQuery();
        while(rs.next())
        {
            watchlist.add(rs.getString("Stocks"));
        }
        System.out.println("Watchlist:"+watchlist.toString());
    }
    
    
    public static void main(String args[]) throws IOException, InterruptedException{
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */ 
        
//        fetch("MSFT");
//        search("amazon");
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home_Button;
    private javax.swing.JButton Logout_Button;
    private javax.swing.JPanel Search_result_panel;
    private javax.swing.JTextField Search_textfield;
    private javax.swing.JButton Serach_Button;
    private javax.swing.JPanel Title_panel;
    private javax.swing.JButton Watchlist_Button;
    private javax.swing.JPanel Watchlist_panel;
    private javax.swing.JButton add_to_watchlist_button;
    private Candlestick candlestick2;
    private Graph graph1;
    private javax.swing.JPanel home_panel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JPanel plots_panel;
    private javax.swing.JLabel title_mainscreen;
    private javax.swing.JPanel watchlist_panel;
    // End of variables declaration//GEN-END:variables
}
