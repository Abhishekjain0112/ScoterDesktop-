
import java.awt.Window;
import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdatepicker.DateModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhishek
 */
public class User_Home extends javax.swing.JFrame implements Runnable{

    /**
     * Creates new form User_Home
     */
    public User_Home() {
        initComponents();

        Thread th=new Thread(this);
       
        th.start();
        
        
        
        jTextField4.setText(index1.id);
          jTextField9.setText(index1.id);
            jTextField10.setText(index1.id);
                 jTextField11.setText(index1.id);
          jTextField12.setText(index1.id);
                 
       try{
       
    //       Class.forName("com.mysql.jdbc.Driver");
  //     Connection con=DriverManager.getConnection("jdbc:mysql:\\localhost:3306\scoter","root","root");
      Class.forName("com.mysql.jdbc.Driver"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");     
       
           PreparedStatement ps=con.prepareStatement("select * from vehicle");
           PreparedStatement ps11=con.prepareStatement("select * from vehicle where status=?");
           ps11.setString(1,"NotBooked");
           ResultSet rs=ps.executeQuery();
           //DefaultTableModel
           DefaultTableModel dtm=(DefaultTableModel)jTable1.getModel();
           while(rs.next()){
           
            Object obj[]={rs.getString(2),rs.getString(1),rs.getString(3),rs.getString(4),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(10),rs.getString(9),rs.getString(11)}; 
         // jComboBox1.setModel((ComboBoxModel)rs.getString(2) );
            //jComboBox1.setModel(new ComboBoxModel<rs>);
   //      jComboBox1.addItem(rs.getString(1));
            dtm.addRow(obj);
           }
        ResultSet rs11=ps11.executeQuery();
           while(rs11.next())
           {
              jComboBox1.addItem(rs11.getString(1));
           }
           
           
           
 
           PreparedStatement ps1=con.prepareStatement("select * from recordtable where coustomer_id=?");   
          ps1.setString(1,index1.id);
           ResultSet rs1=ps1.executeQuery();
           //DefaultTableModel
      DefaultTableModel dtm1=(DefaultTableModel)jTable2.getModel();
           while(rs1.next()){
           
            Object obj1[]={rs1.getString(1),rs1.getString(2),rs1.getString(3),rs1.getString(4),rs1.getString(5)}; 
         // jComboBox1.setModel((ComboBoxModel)rs.getString(2) );
             dtm1.addRow(obj1);
           } 
           
       }
       catch(Exception Ex)
       {
          Ex.printStackTrace();
       }
        
    }

    @Override
    public void run() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try{
        jLabel6.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg1.jpg"));
       
        jLabel7.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg2.jpg"));
        
        jLabel8.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg3.jpg"));
      
          jLabel41.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg4.jpg"));
       
        jLabel42.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg5.jpg"));
        
        jLabel43.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg6.jpg"));
       
        
        
        Thread.sleep(2000);
        
        jLabel6.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg2.jpg"));
       
        jLabel7.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg3.jpg"));
        
        jLabel8.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg4.jpg"));
       
          jLabel41.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg5.jpg"));
       
        jLabel42.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg6.jpg"));
        
        jLabel43.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg1.jpg"));
       
        
        
        Thread.sleep(2000);
      
        
        
        jLabel6.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg3.jpg"));
       
        jLabel7.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg4.jpg"));
        
        jLabel8.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg5.jpg"));
       
        jLabel41.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg6.jpg"));
       
        jLabel42.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg1.jpg"));
        
        jLabel43.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg2.jpg"));
       
        
        Thread.sleep(2000);
        
         jLabel6.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg4.jpg"));
       
        jLabel7.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg5.jpg"));
        
        jLabel8.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg6.jpg"));
          jLabel41.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg1.jpg"));
       
        jLabel42.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg2.jpg"));
        
        jLabel43.setIcon(new ImageIcon("D:\\Advanced JAVA\\technoSoft\\for gallery\\gimg3.jpg"));
       
        
        
        Thread.sleep(2000);
        
        run();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }  
    
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton15 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jDatePicker1 = new org.jdatepicker.JDatePicker();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jDatePicker2 = new org.jdatepicker.JDatePicker();
        jLabel47 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel33 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPasswordField5 = new javax.swing.JPasswordField();
        jPasswordField7 = new javax.swing.JPasswordField();
        jPasswordField6 = new javax.swing.JPasswordField();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 51));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/printer-icon.png"))); // NOI18N
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 20, 120, 70));

        jLabel44.setBackground(new java.awt.Color(0, 51, 102));
        jLabel44.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 255, 0));
        jLabel44.setText("       Welcome  To Scooter Landing...  ");
        jLabel44.setOpaque(true);
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 390, 50));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/39420.gif"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 280, 150));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gif/39420.gif"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, -1));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 153)));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        jTabbedPane1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(153, 255, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-------select Vehicle id------" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 260, 50));

        jButton15.setBackground(new java.awt.Color(0, 51, 51));
        jButton15.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 51, 51));
        jButton15.setText("Book Vehicle");
        jButton15.setToolTipText("");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton15MouseClicked(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 300, 40));

        jScrollPane1.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(0, 153, 153));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 51)));
        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(204, 255, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User_id", "Vehicle_id", "Vehicle_name", "Vehicle Number", "ManufactureDate", "contanctNumber", "Availblity time", "Avaliblity Date", "Aprox_Charges", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1210, 200));

        jLabel5.setForeground(new java.awt.Color(153, 255, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1344, -1));

        jTabbedPane1.addTab("Home", new javax.swing.ImageIcon(getClass().getResource("/Candy-House-icon.png")), jPanel2); // NOI18N

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setOpaque(false);
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setBackground(new java.awt.Color(0, 51, 51));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 255, 0));
        jLabel10.setText("       ADD   Vehicle");
        jLabel10.setOpaque(true);
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 21, 289, 54));

        jLabel19.setBackground(new java.awt.Color(51, 0, 51));
        jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("number");
        jLabel19.setOpaque(true);
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 160, 30));

        jLabel21.setBackground(new java.awt.Color(51, 0, 51));
        jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Date of Purchase ");
        jLabel21.setOpaque(true);
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 180, 20));

        jLabel22.setBackground(new java.awt.Color(51, 0, 51));
        jLabel22.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Contact Number");
        jLabel22.setOpaque(true);
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 160, 30));

        jDatePicker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatePicker1ActionPerformed(evt);
            }
        });
        jPanel8.add(jDatePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 340, 250, 30));

        jTextField4.setOpaque(false);
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 230, 27));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 230, -1));

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 230, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 230, -1));

        jButton5.setBackground(new java.awt.Color(0, 51, 51));
        jButton5.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 51, 51));
        jButton5.setText("ADD");
        jButton5.setToolTipText("");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 450, 105, -1));

        jButton6.setBackground(new java.awt.Color(0, 51, 51));
        jButton6.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 51, 51));
        jButton6.setText("Back");
        jButton6.setToolTipText("");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 119, -1));

        jLabel23.setBackground(new java.awt.Color(51, 0, 51));
        jLabel23.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("User id");
        jLabel23.setOpaque(true);
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 101, 27));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 230, -1));

        jLabel35.setBackground(new java.awt.Color(51, 0, 51));
        jLabel35.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Company");
        jLabel35.setOpaque(true);
        jPanel8.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 101, -1));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        jPanel8.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 230, -1));

        jLabel45.setBackground(new java.awt.Color(51, 0, 51));
        jLabel45.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Availble time");
        jLabel45.setOpaque(true);
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 180, -1));

        jLabel46.setBackground(new java.awt.Color(51, 0, 51));
        jLabel46.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("Available Day");
        jLabel46.setOpaque(true);
        jPanel8.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 190, 30));

        jDatePicker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDatePicker2ActionPerformed(evt);
            }
        });
        jPanel8.add(jDatePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, 280, 30));

        jLabel47.setBackground(new java.awt.Color(51, 0, 51));
        jLabel47.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Name");
        jLabel47.setOpaque(true);
        jPanel8.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 100, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 880, 490));

        jLabel3.setForeground(new java.awt.Color(153, 255, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1344, -1));

        jTabbedPane1.addTab("Add", new javax.swing.ImageIcon(getClass().getResource("/Actions-contact-new-icon.png")), jPanel1); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setOpaque(false);

        jTable2.setBackground(new java.awt.Color(0, 102, 153));
        jTable2.setForeground(new java.awt.Color(153, 255, 51));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Seller_id", "Coustomerid", "vehicle_id", "date", "vihecle_number"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        jScrollPane7.setViewportView(jScrollPane3);

        jPanel3.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 50, 950, 280));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, -1));

        jTabbedPane1.addTab("Order", new javax.swing.ImageIcon(getClass().getResource("/Finance-Purchase-Order-icon.png")), jPanel3); // NOI18N

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setOpaque(false);
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setBackground(new java.awt.Color(0, 51, 51));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(153, 255, 0));
        jLabel25.setText("           Feedback Form");
        jLabel25.setOpaque(true);
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 21, 289, 54));

        jLabel29.setBackground(new java.awt.Color(51, 0, 51));
        jLabel29.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("  Write your feedbak here :");
        jLabel29.setOpaque(true);
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 230, -1));

        jButton7.setBackground(new java.awt.Color(0, 51, 51));
        jButton7.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 153, 255));
        jButton7.setText("Submit");
        jButton7.setToolTipText("");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 105, -1));

        jButton8.setBackground(new java.awt.Color(0, 51, 51));
        jButton8.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 51, 51));
        jButton8.setText("Back");
        jButton8.setToolTipText("");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 119, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane4.setViewportView(jTextArea1);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 370, 150));

        jLabel26.setBackground(new java.awt.Color(51, 0, 51));
        jLabel26.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("User id");
        jLabel26.setOpaque(true);
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 101, 27));

        jTextField9.setOpaque(false);
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel10.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 230, 27));

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 810, 440));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, -1));

        jTabbedPane1.addTab("Feedback", new javax.swing.ImageIcon(getClass().getResource("/Messages-icon.png")), jPanel4); // NOI18N

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setOpaque(false);
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setBackground(new java.awt.Color(0, 51, 51));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(153, 255, 0));
        jLabel27.setText("       Complain");
        jLabel27.setOpaque(true);
        jPanel11.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 21, 289, 54));

        jLabel30.setBackground(new java.awt.Color(51, 0, 51));
        jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("  Write your Complain here :");
        jLabel30.setOpaque(true);
        jPanel11.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 300, -1));

        jButton9.setBackground(new java.awt.Color(0, 51, 51));
        jButton9.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 102, 255));
        jButton9.setText("Submit");
        jButton9.setToolTipText("");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 105, -1));

        jButton10.setBackground(new java.awt.Color(0, 51, 51));
        jButton10.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 51, 51));
        jButton10.setText("Back");
        jButton10.setToolTipText("");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 119, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane5.setViewportView(jTextArea2);

        jPanel11.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 370, 150));

        jLabel28.setBackground(new java.awt.Color(51, 0, 51));
        jLabel28.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("User id");
        jLabel28.setOpaque(true);
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 101, 27));

        jTextField10.setOpaque(false);
        jTextField10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField10MouseClicked(evt);
            }
        });
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 230, 27));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 870, 440));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, -1));

        jTabbedPane1.addTab("Complaint", new javax.swing.ImageIcon(getClass().getResource("/msg-2-icon.png")), jPanel5); // NOI18N

        jPanel6.setOpaque(false);
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setOpaque(false);
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setBackground(new java.awt.Color(0, 51, 51));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(153, 255, 0));
        jLabel31.setText("               Quries  ?");
        jLabel31.setOpaque(true);
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, 289, 54));

        jLabel32.setBackground(new java.awt.Color(51, 0, 51));
        jLabel32.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("  Write your Query here :");
        jLabel32.setOpaque(true);
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 270, -1));

        jButton11.setBackground(new java.awt.Color(0, 51, 51));
        jButton11.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 102, 255));
        jButton11.setText("Submit");
        jButton11.setToolTipText("");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 105, -1));

        jButton12.setBackground(new java.awt.Color(0, 51, 51));
        jButton12.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 51, 51));
        jButton12.setText("Back");
        jButton12.setToolTipText("");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 119, -1));

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane6.setViewportView(jTextArea3);

        jPanel12.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 370, 150));

        jLabel33.setBackground(new java.awt.Color(51, 0, 51));
        jLabel33.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("User id");
        jLabel33.setOpaque(true);
        jPanel12.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 101, 27));

        jTextField11.setEditable(false);
        jTextField11.setOpaque(false);
        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel12.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 230, 27));

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 810, 440));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, -1));

        jTabbedPane1.addTab("Query", new javax.swing.ImageIcon(getClass().getResource("/help-file-icon.png")), jPanel6); // NOI18N

        jPanel14.setOpaque(false);
        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setOpaque(false);
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setBackground(new java.awt.Color(0, 51, 51));
        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(153, 255, 0));
        jLabel36.setText("                 Gallery");
        jLabel36.setOpaque(true);
        jPanel15.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 289, 54));

        jLabel6.setOpaque(true);
        jPanel15.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 300, 190));

        jLabel7.setOpaque(true);
        jPanel15.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 160, 300, 190));

        jLabel8.setOpaque(true);
        jPanel15.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 300, 190));

        jLabel41.setOpaque(true);
        jPanel15.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 300, 190));

        jLabel42.setOpaque(true);
        jPanel15.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 300, 190));

        jLabel43.setOpaque(true);
        jPanel15.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 300, 190));

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 980, 550));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, -1));

        jTabbedPane1.addTab("Gallery", new javax.swing.ImageIcon(getClass().getResource("/gif/gallery.png")), jPanel14); // NOI18N

        jPanel7.setOpaque(false);
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel13.setOpaque(false);
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setBackground(new java.awt.Color(0, 51, 51));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(153, 255, 0));
        jLabel34.setText("       Change Password");
        jLabel34.setOpaque(true);
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 289, 54));

        jLabel37.setBackground(new java.awt.Color(51, 0, 51));
        jLabel37.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Password");
        jLabel37.setOpaque(true);
        jPanel13.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 100, 30));

        jLabel38.setBackground(new java.awt.Color(51, 0, 51));
        jLabel38.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("New Password");
        jLabel38.setOpaque(true);
        jPanel13.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 180, -1));

        jLabel39.setBackground(new java.awt.Color(51, 0, 51));
        jLabel39.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Conf Password");
        jLabel39.setOpaque(true);
        jPanel13.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 160, -1));

        jTextField12.setOpaque(false);
        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel13.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 230, 27));

        jPasswordField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField5ActionPerformed(evt);
            }
        });
        jPanel13.add(jPasswordField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 220, 30));

        jPasswordField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField7ActionPerformed(evt);
            }
        });
        jPanel13.add(jPasswordField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 210, 30));

        jPasswordField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField6ActionPerformed(evt);
            }
        });
        jPanel13.add(jPasswordField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 220, 30));

        jButton13.setBackground(new java.awt.Color(0, 51, 51));
        jButton13.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 51, 51));
        jButton13.setText("Update");
        jButton13.setToolTipText("");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 140, 40));

        jButton14.setBackground(new java.awt.Color(0, 51, 51));
        jButton14.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 51, 51));
        jButton14.setText("Back");
        jButton14.setToolTipText("");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 119, -1));

        jLabel40.setBackground(new java.awt.Color(51, 0, 51));
        jLabel40.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("User id");
        jLabel40.setOpaque(true);
        jPanel13.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 101, 27));

        jPanel7.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, 680, 440));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, -1));

        jTabbedPane1.addTab("Password", new javax.swing.ImageIcon(getClass().getResource("/password-icon_1.png")), jPanel7); // NOI18N

        jPanel9.setOpaque(false);
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car-share-multiple-people-animated.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel9.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -30, 620, 360));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Car-Share - 19 Users Infographic - Wide.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel9.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -290, 960, 940));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maxresdefault.jpg"))); // NOI18N
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1356, -1));

        jTabbedPane1.addTab("Help", new javax.swing.ImageIcon(getClass().getResource("/Help-icon.png")), jPanel9); // NOI18N

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1360, 620));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/switch-turn-off-icon.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 0, 110, 110));

        jLabel2.setBackground(new java.awt.Color(153, 255, 153));
        jLabel2.setForeground(new java.awt.Color(153, 255, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Bikes.JPG"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1410, 760));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

        
// TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            
        String user_id=jTextField4.getText();
        String name=jTextField8.getText();
        String availbletime=jTextField5.getText();
        String Vehicle_number=jTextField6.getText();
        String Company=jTextField7.getText();
        String number=jTextField14.getText();
        DateModel dm2=jDatePicker2.getModel();
        String availbleDate=dm2.getDay()+"/"+dm2.getMonth()+"/"+dm2.getYear();
        //String date=new String(new Date());
//String password=new String(jPasswordField4.getPassword());
        DateModel dm =jDatePicker1.getModel();
  String date=dm.getDay()+"/"+dm.getMonth()+"/"+dm.getYear();
        
        if(user_id.equals(""))
        {
        JOptionPane.showMessageDialog(this,"id field Can not be left blank ");
        
        }
       else if(name.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Password field Can not be left blank ");
        
        }
              else if(number.equals(""))
        {
        JOptionPane.showMessageDialog(this,"number field Can not be left blank ");
        
        }
       
       
   else if(availbletime.equals(""))
        {
        JOptionPane.showMessageDialog(this,"availbletime field Can not be left blank ");
        
        }
      else if(Vehicle_number.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Vehicle_number field Can not be left blank ");
        
        } 
       else if(Company.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Company field Can not be left blank ");
        
        }  

      else{ 
        try{

              Class.forName("com.mysql.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");  
             
       PreparedStatement ps=con.prepareStatement("insert into vehicle(user_id,vname,vnumber,company,manufacture_date,contactnumber,availbletime,day) values(?,?,?,?,?,?,?,?)");
     
       // ps.setString(1,Vehicle_id);
        ps.setString(1,user_id);
       ps.setString(2,Vehicle_number);
       ps.setString(3,Vehicle_number);
       ps.setString(4,Company);
       ps.setString(5,date);
       ps.setString(6,number);
        ps.setString(7,availbletime);
       ps.setString(8,availbleDate);
       ps.executeUpdate();
       
       
          
             JOptionPane.showMessageDialog(this,"PRODUCT SUCCESFULLY ADDED" );
   
        User_Home ref=new User_Home();
             ref.setVisible(true);
             dispose();
        }catch(Exception ex)
        {
        ex.printStackTrace();
        }
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jPanel4.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked

        
                
        String user_id=jTextField4.getText();
        String name=jTextField8.getText();
        String Vehicle_id=jTextField5.getText();
     
        String Vehicle_number=jTextField6.getText();
        String Company=jTextField7.getText();
        String Number=jTextField7.getText();

//String password=new String(jPasswordField4.getPassword());
          if(user_id.equals(""))
        {
        JOptionPane.showMessageDialog(this,"id field Can not be left blank ");
        
        }
       else if(name.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Password field Can not be left blank ");
        
        }
   else if(Vehicle_id.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Vehicle_id field Can not be left blank ");
        
        }
      else if(Vehicle_number.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Vehicle_number field Can not be left blank ");
        
        } 
       else if(Company.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Company field Can not be left blank ");
        
        }  
          

// char[] ch=jPasswordField3.getPassword();
        //String password=new String(ch);
      else{ 
      /*  try{
            
           // Class.forName("com.mysql.jdbc.Driver");
              Class.forName("com.mysql.jdbc.Driver");
            //"jdbc:mysql://localhost:3306/scoter","root","root"); 
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");  
             
       PreparedStatement ps=con.prepareStatement("insert into uesr (?,?,?,?,?)");
     
        ps.setString(1,user_id);
        ps.setString(2,name);
       ps.setString(3,email);
       ps.setString(4,address);
       ps.setString(5,password);
    
       ps.executeUpdate();
       
       
          
             JOptionPane.showMessageDialog(this,"Sign up  Now login again" );
          
             index1 inf=new index1();
             setVisible(true);
             dispose();
             
             
        }catch(Exception ex)
        {
        ex.printStackTrace();
        }*/
      }

        // TODO add your handling code here:
        
        
        
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked

                   
        String user_id=jTextField9.getText();
        String feedback=jTextArea1.getText();
      
          if(user_id.equals(""))
        {
        JOptionPane.showMessageDialog(this,"id field Can't  left blank ");
        
        }
       else if(feedback.equals(""))
        {
        JOptionPane.showMessageDialog(this,"feedback field Can't left blank ");
        
        }
  
      else{ 
        try{
            
          
              Class.forName("com.mysql.jdbc.Driver");
          
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");  
             
       PreparedStatement ps=con.prepareStatement("insert into feedbacktable(userid,feedback) values(?,?)");
     
        ps.setString(1,user_id);
        ps.setString(2,feedback);
       
    ps.executeUpdate();
             
       JOptionPane.showMessageDialog(this,"Thank you for feedback");
             jTextArea1.setText("");
             jTextField9.setText("");
        }catch(Exception ex)
        {
        ex.printStackTrace();
        }
      }
        
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
                     
        String user_id=jTextField10.getText();
        String complain=jTextArea2.getText();
      
          if(user_id.equals(""))
        {
        JOptionPane.showMessageDialog(this,"id field Can't  left blank ");
        
        }
       else if(complain.equals(""))
        {
        JOptionPane.showMessageDialog(this,"Complain field Can't left blank ");
        
        }
  
      else{ 
          try{
            
          
              Class.forName("com.mysql.jdbc.Driver");
          
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");  
             
       PreparedStatement ps=con.prepareStatement("insert into complaintable(userid,complain) values(?,?)");
     
        ps.setString(1,user_id);
        ps.setString(2,complain);
        //ps.setString(2,complain);
       
    ps.executeUpdate();
             
       JOptionPane.showMessageDialog(this,"Thank your responce we will definatly work on it ");
             jTextArea2.setText("");
             jTextField10.setText("");
        }catch(Exception ex)
        {
        ex.printStackTrace();
        }
      }
        
        
        
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextField10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10MouseClicked

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        // TODO add your handling code here:
        
            String user_id=jTextField11.getText();
        String query=jTextArea3.getText();
      
          if(user_id.equals(""))
        {
        JOptionPane.showMessageDialog(this,"id field Can't  left blank ");
        
        }
       else if(query.equals(""))
        {
        JOptionPane.showMessageDialog(this,"query field Can't left blank ");
       
        }
  
      else{ 
        try{
            
          
              Class.forName("com.mysql.jdbc.Driver");
          
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");  
             
       PreparedStatement ps=con.prepareStatement("insert into queriestable(userid,query) values(?,?)");
     
        ps.setString(1,user_id);
        ps.setString(2,query);
       
    ps.executeUpdate();
             
       JOptionPane.showMessageDialog(this,"Thank your , Soon we will reply you ");
             jTextArea3.setText("");
             jTextField11.setText("");
        }catch(Exception ex)
        {
        ex.printStackTrace();
        }
      }
        
        
        
        
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
        int output=JOptionPane.showConfirmDialog(this,"Do You Want To SignOut");
        
        if(output==0){
            index1 ref=new index1();
            ref.setVisible(true);
            dispose();
                }
        
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        String v_id =(String)jComboBox1.getSelectedItem();
        JOptionPane.showMessageDialog(this,v_id);

     

        if(v_id.equals("-------select Vehicle id------"))
        {
            JOptionPane.showMessageDialog(this,"Select Vehicle id ");

        }

        else{
            try{

                Class.forName("com.mysql.jdbc.Driver");

                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");
         PreparedStatement ps=con.prepareStatement("select * from vehicle where vehicle_id=?");
         ps.setString(1,v_id);
         
          ResultSet rs=ps.executeQuery();
         String sellerid="";
          String vnumber="";
         while(rs.next()){ 
           sellerid=rs.getString(2);
          vnumber=rs.getString(4);
         }
         
            PreparedStatement ps2=con.prepareStatement("update vehicle set status=? where vehicle_id=?");
            ps2.setString(1,"Booked");       
            ps2.setString(2,v_id);
         
           ps2.executeUpdate();
         
          PreparedStatement ps1=con.prepareStatement("insert into recordtable values(?,?,?,?,?)");
      Date dt=new Date();
          String date=dt.toString();
                ps1.setString(1,sellerid);
                ps1.setString(2,index1.id);
                ps1.setString(3,v_id);
                ps1.setString(4,date);
                 ps1.setString(5,vnumber);
                
                
                
                ps1.executeUpdate();

                JOptionPane.showMessageDialog(this,"Your order is Booked Succesfully");

               User_Home inf=new User_Home();
              inf.setVisible(true);
               dispose();

            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jPasswordField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField5ActionPerformed

    private void jPasswordField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField7ActionPerformed

    private void jPasswordField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField6ActionPerformed

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked

        String user_id=jTextField12.getText();
        String oldPass=new String(jPasswordField5.getPassword());
        String newPass=new String(jPasswordField6.getPassword());
        String confPass=new String(jPasswordField7.getPassword());

        if(user_id.equals(""))
        {
            JOptionPane.showMessageDialog(this,"id field Can't  left blank ");

        }
        else if(oldPass.equals(""))
        {
            JOptionPane.showMessageDialog(this,"oldPass field Can't left blank ");
        }
        else if(newPass.equals(""))
        {
            JOptionPane.showMessageDialog(this,"newPass field Can't left blank ");

        }

        else if(confPass.equals(""))
        {
            JOptionPane.showMessageDialog(this,"confPass field Can't left blank ");

        }

        else if(confPass.equals(newPass))
        {
            //   JOptionPane.showMessageDialog(this,"Confpass and new password should be same!! ");

            try{

                Class.forName("com.mysql.jdbc.Driver");

                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/scoter","root","root");

                PreparedStatement ps=con.prepareStatement("select * from user where userid=? and password=?");

                ps.setString(1,user_id);
                ps.setString(2,oldPass);

                ResultSet rs= ps.executeQuery();

                if(rs.next())
                {
                    PreparedStatement ps1=con.prepareStatement("update user set password=? where userid=?");
                    ps1.setString(1,newPass);
                    ps1.setString(2,user_id);
                    ps1.executeUpdate();
                    JOptionPane.showMessageDialog(this,"New Password succesfuly save");
                    index1 ref=new index1();
                    ref.setVisible(true);
                    dispose();

                }else{
                    JOptionPane.showMessageDialog(this,"user id and password not match");
                }

            }catch(Exception ex)
            {
                ex.printStackTrace();
            }
        }
        // Need Updare Quries here for updateing
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jButton15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

   

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jDatePicker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatePicker1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDatePicker1ActionPerformed

    private void jDatePicker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDatePicker2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jDatePicker2ActionPerformed

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel14MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User_Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox jComboBox1;
    private org.jdatepicker.JDatePicker jDatePicker1;
    private org.jdatepicker.JDatePicker jDatePicker2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField5;
    private javax.swing.JPasswordField jPasswordField6;
    private javax.swing.JPasswordField jPasswordField7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
