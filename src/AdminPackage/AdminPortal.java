package AdminPackage;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.Timer;
import javax.swing.UIManager;

import javax.swing.UnsupportedLookAndFeelException;

public class AdminPortal extends javax.swing.JFrame {

    private JDesktopPane theDesktop;
    CardLayout cards, cardStudent, cardEmployee;
    static Functions functions = new Functions();
    JInternalFrame frame;
    LibraryManager lib;

    public AdminPortal() {
        initComponents();
//        add(theDesktop);
//        theDesktop = new JDesktopPane();
        lib = new LibraryManager();
//        add(theDesktop);

        //
        frame = new JInternalFrame("Internal Frame", true, true, true, true);
        frame.setSize(300, 300);
        frame.setVisible(true);

        setTimeToLabel();
        cards = (CardLayout) jPanelCenter.getLayout();
        cardStudent = (CardLayout) jPanelMainStudentCardLayout.getLayout();
        cardEmployee = (CardLayout) jPanelMainEmployeeCardLayout.getLayout();

        // Adding ActionListener to all the buttons;
        btnStudentHome.addActionListener(new ButtonEvent());
        btnStudent.addActionListener(new ButtonEvent());
        btnViewStudent.addActionListener(new ButtonEvent());
        btnEditStudent.addActionListener(new ButtonEvent());
        btnAddStudent.addActionListener(new ButtonEvent());
        btnAddEmployee.addActionListener(new ButtonEvent());
        btnViewEmployee.addActionListener(new ButtonEvent());

        // Adding MouseListener to all the Labelss
        lblHome.addMouseListener(new MouseEvent());
        lblAddStudents_StudentHome.addMouseListener(new MouseEvent());
        lblAddStudent_Home.addMouseListener(new MouseEvent());
        lblStudentManager.addMouseListener(new MouseEvent());
    }

    public AdminPortal(CardLayout cards, CardLayout card2) throws HeadlessException {
        this.cards = cards;
        this.cardStudent = card2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel5 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblDate = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelLeftMenu = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        lblStudentManager = new javax.swing.JLabel();
        lblEmployee = new javax.swing.JLabel();
        lblFinance = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblLibraryManager = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanelCenter = new javax.swing.JPanel();
        jPanelHome = new javax.swing.JPanel();
        jPanelCenterMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnStudent = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanelCenterDashboard = new javax.swing.JPanel();
        jPanelCenterDashoardHome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        lblAddStudent_Home = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanelStudents = new javax.swing.JPanel();
        jPanelStudentCenterMenu = new javax.swing.JPanel();
        ButtonPane = new javax.swing.JPanel();
        btnStudentHome = new javax.swing.JButton();
        btnAddStudent = new javax.swing.JButton();
        btnEditStudent = new javax.swing.JButton();
        btnViewStudent = new javax.swing.JButton();
        btnRemoveStudent = new javax.swing.JButton();
        btnStudentPrivilleges = new javax.swing.JButton();
        btnStudentSettings = new javax.swing.JButton();
        btnStudentReports = new javax.swing.JButton();
        jPanelStudentCenterDashoardHome = new javax.swing.JPanel();
        jPanelMainStudentCardLayout = new javax.swing.JPanel();
        jPanelStudentPaneHome = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        lblAddStudents_StudentHome = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanelAddStudent = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField5 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField6 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel88 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jPanel19 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel90 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel94 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel98 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanelViewStudent = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel52 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelEditStudent = new javax.swing.JPanel();
        jPanelEmployee = new javax.swing.JPanel();
        jPanelEmployeeCenterMenu = new javax.swing.JPanel();
        ButtonPane1 = new javax.swing.JPanel();
        btnEmployeeHome = new javax.swing.JButton();
        btnAddEmployee = new javax.swing.JButton();
        btnEditEmployee = new javax.swing.JButton();
        btnViewEmployee = new javax.swing.JButton();
        btnRemoveEmployee = new javax.swing.JButton();
        btnEmployeePrivilleges = new javax.swing.JButton();
        btnEmployeeSettings = new javax.swing.JButton();
        btnEmployeeReports = new javax.swing.JButton();
        jPaneEmployeeCenterDashoardHome = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanelMainEmployeeCardLayout = new javax.swing.JPanel();
        jPanelEmployeePaneHome = new javax.swing.JPanel();
        jLabel62 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        lblAddEmployee_EmployeeHome = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jPanelViewEmployee = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jComboBox11 = new javax.swing.JComboBox();
        jLabel148 = new javax.swing.JLabel();
        jComboBox12 = new javax.swing.JComboBox();
        jLabel149 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jComboBox17 = new javax.swing.JComboBox();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel155 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel140 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanelAddEmployee = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel128 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel129 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jTextField21 = new javax.swing.JTextField();
        jComboBox8 = new javax.swing.JComboBox();
        jTextField22 = new javax.swing.JTextField();
        jLabel135 = new javax.swing.JLabel();
        jTextField23 = new javax.swing.JTextField();
        jLabel136 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();
        jLabel137 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox();
        jLabel160 = new javax.swing.JLabel();
        jComboBox16 = new javax.swing.JComboBox();
        jPanel29 = new javax.swing.JPanel();
        jLabel138 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel141 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel142 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel143 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jComboBox15 = new javax.swing.JComboBox();
        jTextField29 = new javax.swing.JTextField();
        jLabel161 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jLabel162 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel163 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel145 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jLabel146 = new javax.swing.JLabel();
        jComboBox10 = new javax.swing.JComboBox();
        jLabel147 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox();
        jTextField17 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jPanelEditEmployee = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();
        jLabel154 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CItadel (Admin Portal)");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1, 632));
        setPreferredSize(new java.awt.Dimension(1200, 720));
        getContentPane().setLayout(new java.awt.BorderLayout(25, 1));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new javax.swing.ImageIcon(getClass().getResource("/icons/border2.png")))); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(829, 40));

        lblDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/clock-24.png"))); // NOI18N
        lblDate.setText("Date:");
        lblDate.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblDate.setIconTextGap(5);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/advertising-24.png"))); // NOI18N
        jLabel22.setText("Notifications (0)");
        jLabel22.setIconTextGap(5);

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/preferences-other.png"))); // NOI18N
        jLabel49.setText("Settings");
        jLabel49.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel49.setIconTextGap(10);

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manager-24.png"))); // NOI18N
        jLabel50.setText("Welcome, Kapersky");
        jLabel50.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel50.setFocusable(false);
        jLabel50.setIconTextGap(5);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/comments-24.png"))); // NOI18N
        jLabel51.setText("Messages (0)");
        jLabel51.setIconTextGap(5);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 932, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(lblDate)
                            .addComponent(jLabel49)
                            .addComponent(jLabel22))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1755, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel5.add(jPanel22, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel5, java.awt.BorderLayout.NORTH);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new javax.swing.ImageIcon(getClass().getResource("/icons/border2.png")))); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1355, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1755, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanelLeftMenu.setBackground(new java.awt.Color(204, 204, 204));
        jPanelLeftMenu.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 10, new javax.swing.ImageIcon(getClass().getResource("/icons/borderR.png")))); // NOI18N
        jPanelLeftMenu.setMinimumSize(new java.awt.Dimension(200, 200));
        jPanelLeftMenu.setRequestFocusEnabled(false);
        jPanelLeftMenu.setVerifyInputWhenFocusTarget(false);

        lblHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblHome.setForeground(new java.awt.Color(255, 255, 255));
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("HOME");
        lblHome.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lblHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblStudentManager.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblStudentManager.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/manager-24.png"))); // NOI18N
        lblStudentManager.setText("Student Manager");
        lblStudentManager.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lblStudentManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblEmployee.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblEmployee.setForeground(new java.awt.Color(255, 255, 255));
        lblEmployee.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/businessman-24.png"))); // NOI18N
        lblEmployee.setText("Employee Manager ");
        lblEmployee.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lblEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEmployee.addMouseListener(new MouseEvent());

        lblFinance.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFinance.setForeground(new java.awt.Color(255, 255, 255));
        lblFinance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFinance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/currency_exchange-24.png"))); // NOI18N
        lblFinance.setText("Finance Manager");
        lblFinance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lblFinance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblFinance.addMouseListener(new MouseEvent());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Academic Manager");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblLibraryManager.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblLibraryManager.setForeground(new java.awt.Color(255, 255, 255));
        lblLibraryManager.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLibraryManager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/library-24.png"))); // NOI18N
        lblLibraryManager.setText("Library Manager");
        lblLibraryManager.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lblLibraryManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLibraryManager.addMouseListener(new MouseEvent());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Laboratory Manager");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Class Manager");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sms-24.png"))); // NOI18N
        jLabel9.setText("Message Manager");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Events Manager");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sports_mode-24.png"))); // NOI18N
        jLabel11.setText("Sports Manager");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Result Manager");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Reports Manager");
        jLabel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jSeparator8.setForeground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanelLeftMenuLayout = new javax.swing.GroupLayout(jPanelLeftMenu);
        jPanelLeftMenu.setLayout(jPanelLeftMenuLayout);
        jPanelLeftMenuLayout.setHorizontalGroup(
            jPanelLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator8)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLeftMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLibraryManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblStudentManager, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFinance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelLeftMenuLayout.setVerticalGroup(
            jPanelLeftMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLeftMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStudentManager, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFinance, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblLibraryManager, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        getContentPane().add(jPanelLeftMenu, java.awt.BorderLayout.LINE_START);

        jPanelCenter.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCenter.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelCenter.setPreferredSize(new java.awt.Dimension(1135, 743));
        jPanelCenter.setLayout(new java.awt.CardLayout());

        jPanelHome.setLayout(new java.awt.BorderLayout(0, 2));

        jPanelCenterMenu.setLayout(new java.awt.GridBagLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new javax.swing.ImageIcon(getClass().getResource("/icons/border2.png")))); // NOI18N
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("HOME");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jButton2.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton2.setPreferredSize(new java.awt.Dimension(45, 17));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("FINANCE");
        jButton3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jButton3.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton3.setOpaque(true);
        jButton3.setPreferredSize(new java.awt.Dimension(45, 17));

        btnStudent.setBackground(new java.awt.Color(204, 204, 255));
        btnStudent.setText("STUDENTS");
        btnStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnStudent.setContentAreaFilled(false);
        btnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudent.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnStudent.setMinimumSize(new java.awt.Dimension(0, 0));
        btnStudent.setOpaque(true);
        btnStudent.setPreferredSize(new java.awt.Dimension(45, 17));

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setText("LIBRARY");
        jButton5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jButton5.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton5.setOpaque(true);

        jButton6.setBackground(new java.awt.Color(204, 204, 255));
        jButton6.setText("SPORTS");
        jButton6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jButton6.setContentAreaFilled(false);
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jButton6.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton6.setOpaque(true);
        jButton6.setPreferredSize(new java.awt.Dimension(45, 17));

        jButton7.setBackground(new java.awt.Color(204, 204, 255));
        jButton7.setText("TEACHERS");
        jButton7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jButton7.setContentAreaFilled(false);
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton7.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jButton7.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton7.setOpaque(true);
        jButton7.setPreferredSize(new java.awt.Dimension(45, 17));

        jButton8.setBackground(new java.awt.Color(204, 204, 255));
        jButton8.setText("SETTINGS");
        jButton8.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jButton8.setContentAreaFilled(false);
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton8.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jButton8.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton8.setOpaque(true);
        jButton8.setPreferredSize(new java.awt.Dimension(45, 17));

        jButton9.setBackground(new java.awt.Color(204, 204, 255));
        jButton9.setText("REPORTS");
        jButton9.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        jButton9.setContentAreaFilled(false);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jButton9.setMinimumSize(new java.awt.Dimension(0, 0));
        jButton9.setOpaque(true);
        jButton9.setPreferredSize(new java.awt.Dimension(45, 17));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanelCenterMenu.add(jPanel3, gridBagConstraints);

        jPanelHome.add(jPanelCenterMenu, java.awt.BorderLayout.PAGE_START);

        jPanelCenterDashboard.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCenterDashboard.setPreferredSize(new java.awt.Dimension(967, 701));
        jPanelCenterDashboard.setLayout(new java.awt.CardLayout());

        jPanelCenterDashoardHome.setPreferredSize(new java.awt.Dimension(967, 701));
        jPanelCenterDashoardHome.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 70, 50));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel23.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel23.setMaximumSize(new java.awt.Dimension(2000, 2000));
        jLabel23.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.add(jLabel23);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel25);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel27.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel27);

        lblAddStudent_Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon_1.png"))); // NOI18N
        lblAddStudent_Home.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAddStudent_Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddStudent_Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lblAddStudent_Home);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel36.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel36);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel40.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel40);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel45.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel45.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel45);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon_1.png"))); // NOI18N
        jLabel47.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel47);

        jPanelCenterDashoardHome.add(jPanel1, java.awt.BorderLayout.CENTER);
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jPanelCenterDashboard.add(jPanelCenterDashoardHome, "card5");

        jPanelHome.add(jPanelCenterDashboard, java.awt.BorderLayout.CENTER);

        jPanelCenter.add(jPanelHome, "card4");

        jPanelStudents.setLayout(new java.awt.BorderLayout());

        jPanelStudentCenterMenu.setMinimumSize(new java.awt.Dimension(5, 30));
        jPanelStudentCenterMenu.setPreferredSize(new java.awt.Dimension(810, 75));
        jPanelStudentCenterMenu.setLayout(new java.awt.GridBagLayout());

        ButtonPane.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new javax.swing.ImageIcon(getClass().getResource("/icons/border2.png")))); // NOI18N
        ButtonPane.setPreferredSize(new java.awt.Dimension(805, 40));

        btnStudentHome.setBackground(new java.awt.Color(204, 204, 255));
        btnStudentHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnStudentHome.setText("Home");
        btnStudentHome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnStudentHome.setContentAreaFilled(false);
        btnStudentHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudentHome.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnStudentHome.setMinimumSize(new java.awt.Dimension(0, 0));
        btnStudentHome.setPreferredSize(new java.awt.Dimension(40, 17));

        btnAddStudent.setBackground(new java.awt.Color(204, 204, 255));
        btnAddStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddStudent.setText("Add Students");
        btnAddStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnAddStudent.setContentAreaFilled(false);
        btnAddStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddStudent.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnAddStudent.setMinimumSize(new java.awt.Dimension(0, 0));
        btnAddStudent.setOpaque(true);
        btnAddStudent.setPreferredSize(new java.awt.Dimension(40, 17));

        btnEditStudent.setBackground(new java.awt.Color(204, 204, 255));
        btnEditStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditStudent.setText("Edit Students");
        btnEditStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnEditStudent.setContentAreaFilled(false);
        btnEditStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditStudent.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnEditStudent.setMinimumSize(new java.awt.Dimension(0, 0));
        btnEditStudent.setOpaque(true);
        btnEditStudent.setPreferredSize(new java.awt.Dimension(40, 17));

        btnViewStudent.setBackground(new java.awt.Color(204, 204, 255));
        btnViewStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewStudent.setText("View Students");
        btnViewStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnViewStudent.setContentAreaFilled(false);
        btnViewStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewStudent.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnViewStudent.setMinimumSize(new java.awt.Dimension(0, 0));
        btnViewStudent.setOpaque(true);
        btnViewStudent.setPreferredSize(new java.awt.Dimension(40, 17));

        btnRemoveStudent.setBackground(new java.awt.Color(204, 204, 255));
        btnRemoveStudent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRemoveStudent.setText("Remove Students");
        btnRemoveStudent.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnRemoveStudent.setContentAreaFilled(false);
        btnRemoveStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveStudent.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnRemoveStudent.setMinimumSize(new java.awt.Dimension(0, 0));
        btnRemoveStudent.setOpaque(true);
        btnRemoveStudent.setPreferredSize(new java.awt.Dimension(40, 17));

        btnStudentPrivilleges.setBackground(new java.awt.Color(204, 204, 255));
        btnStudentPrivilleges.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnStudentPrivilleges.setText("Privilleges");
        btnStudentPrivilleges.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnStudentPrivilleges.setContentAreaFilled(false);
        btnStudentPrivilleges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudentPrivilleges.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnStudentPrivilleges.setMinimumSize(new java.awt.Dimension(0, 0));
        btnStudentPrivilleges.setOpaque(true);
        btnStudentPrivilleges.setPreferredSize(new java.awt.Dimension(40, 17));

        btnStudentSettings.setBackground(new java.awt.Color(204, 204, 255));
        btnStudentSettings.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnStudentSettings.setText("Student Reports");
        btnStudentSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnStudentSettings.setContentAreaFilled(false);
        btnStudentSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudentSettings.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnStudentSettings.setMinimumSize(new java.awt.Dimension(0, 0));
        btnStudentSettings.setOpaque(true);
        btnStudentSettings.setPreferredSize(new java.awt.Dimension(40, 17));

        btnStudentReports.setBackground(new java.awt.Color(204, 204, 255));
        btnStudentReports.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnStudentReports.setText("Settings");
        btnStudentReports.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnStudentReports.setContentAreaFilled(false);
        btnStudentReports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStudentReports.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnStudentReports.setMinimumSize(new java.awt.Dimension(0, 0));
        btnStudentReports.setOpaque(true);
        btnStudentReports.setPreferredSize(new java.awt.Dimension(40, 14));

        javax.swing.GroupLayout ButtonPaneLayout = new javax.swing.GroupLayout(ButtonPane);
        ButtonPane.setLayout(ButtonPaneLayout);
        ButtonPaneLayout.setHorizontalGroup(
            ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPaneLayout.createSequentialGroup()
                .addComponent(btnStudentHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnStudentPrivilleges, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnStudentSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnStudentReports, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        ButtonPaneLayout.setVerticalGroup(
            ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ButtonPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudentHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentPrivilleges, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStudentReports, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanelStudentCenterMenu.add(ButtonPane, gridBagConstraints);

        jPanelStudents.add(jPanelStudentCenterMenu, java.awt.BorderLayout.PAGE_START);

        jPanelStudentCenterDashoardHome.setBackground(new java.awt.Color(255, 255, 255));
        jPanelStudentCenterDashoardHome.setLayout(new java.awt.BorderLayout());

        jPanelMainStudentCardLayout.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelMainStudentCardLayout.setLayout(new java.awt.CardLayout());

        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 70, 50);
        flowLayout1.setAlignOnBaseline(true);
        jPanelStudentPaneHome.setLayout(flowLayout1);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel56.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel56.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel56.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelStudentPaneHome.add(jLabel56);

        jLabel58.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/businessman-192.png"))));
        jLabel58.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel58.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel58.setMaximumSize(null);
        jLabel58.setMinimumSize(null);
        jLabel58.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelStudentPaneHome.add(jLabel58);

        jLabel61.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/currency_exchange-192.png"))));
        jLabel61.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel61.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel61.setMaximumSize(null);
        jLabel61.setMinimumSize(null);
        jLabel61.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelStudentPaneHome.add(jLabel61);

        lblAddStudents_StudentHome.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/manager-192.png"))));
        lblAddStudents_StudentHome.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAddStudents_StudentHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddStudents_StudentHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAddStudents_StudentHome.setMaximumSize(null);
        lblAddStudents_StudentHome.setMinimumSize(null);
        lblAddStudents_StudentHome.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelStudentPaneHome.add(lblAddStudents_StudentHome);

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel65.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel65.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel65.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel65.setMaximumSize(null);
        jLabel65.setMinimumSize(null);
        jPanelStudentPaneHome.add(jLabel65);

        jLabel66.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/sms-192.png"))));
        jLabel66.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel66.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel66.setMaximumSize(null);
        jLabel66.setMinimumSize(null);
        jLabel66.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelStudentPaneHome.add(jLabel66);

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel68.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel68.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel68.setMaximumSize(null);
        jLabel68.setMinimumSize(null);
        jPanelStudentPaneHome.add(jLabel68);

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel70.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel70.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel70.setMaximumSize(null);
        jLabel70.setMinimumSize(null);
        jPanelStudentPaneHome.add(jLabel70);

        jPanelMainStudentCardLayout.add(jPanelStudentPaneHome, "card2");

        jPanelAddStudent.setPreferredSize(new java.awt.Dimension(947, 553));

        jPanel17.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Profiles"));

        jLabel2.setText("First Name:");

        jLabel80.setText("Last Name:");

        jLabel81.setText("Other Name:");

        jLabel82.setText("Gender:");

        jLabel83.setText("Date Of Birth:");

        jLabel84.setText("State Of Origin:");

        jLabel85.setText("Place Of Birth");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel86.setText("Mother's Name:");

        jLabel87.setText("Previous Class:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basic 1", "Basic 2", "Basic 3", "Basic 4", "Basic 5", "Basic 6", "Jss 1", "Jss 2", "Jss 3", "Ss 1", "Ss 2", "Ss 3" }));

        jLabel88.setText("Password:");

        jLabel96.setText("Previous School:");

        jLabel97.setText("Assign Class:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basic 1", "Basic 2", "Basic 3", "Basic 4", "Basic 5", "Basic 6", "Jss 1", "Jss 2", "Jss 3", "Ss 1", "Ss 2", "Ss 3" }));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel96)
                    .addComponent(jLabel86)
                    .addComponent(jLabel83)
                    .addComponent(jLabel82)
                    .addComponent(jLabel81))
                .addGap(26, 26, 26)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField14, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, 327, Short.MAX_VALUE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE))
                .addGap(49, 49, 49)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel85, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel84, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel88, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel80, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel97))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox4, 0, 328, Short.MAX_VALUE)
                    .addComponent(jComboBox3, 0, 328, Short.MAX_VALUE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jComboBox2, 0, 328, Short.MAX_VALUE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        jPanel18Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, jLabel81, jLabel82, jLabel83, jLabel86});

        jPanel18Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel80, jLabel84, jLabel85, jLabel87, jLabel88});

        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel80)
                    .addComponent(jTextField3))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel88)
                    .addComponent(jTextField15))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jComboBox2))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jTextField6))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3)
                    .addComponent(jLabel87))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(jComboBox4))
                .addGap(3, 3, 3))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4)
                    .addComponent(jLabel81))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1)
                    .addComponent(jLabel82))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5)
                    .addComponent(jLabel83))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7)
                    .addComponent(jLabel86))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14)
                    .addComponent(jLabel96)))
        );

        jPanel18Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel81, jLabel82, jLabel83, jLabel86});

        jPanel18Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel80, jLabel84, jLabel85, jLabel87, jLabel88});

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel89.setToolTipText("");
        jLabel89.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel89.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jButton1.setText("Photos...");
        jButton1.setPreferredSize(new java.awt.Dimension(85, 23));

        jButton19.setText("Webcam...");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel89, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addContainerGap())
        );

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder("Address & Contacts"));

        jLabel90.setText("Address:");

        jLabel91.setText("Address 2:");

        jLabel92.setText("City:");

        jLabel93.setText("Phone:");

        jLabel94.setText("Guardians Phone:");

        jLabel95.setText("Email Address:");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel90)
                    .addComponent(jLabel94)
                    .addComponent(jLabel92))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField10)
                    .addComponent(jTextField12)
                    .addComponent(jTextField8, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
                .addGap(55, 55, 55)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel95)
                    .addComponent(jLabel93)
                    .addComponent(jLabel91))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField9, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
                    .addComponent(jTextField11)
                    .addComponent(jTextField13))
                .addGap(48, 48, 48))
        );

        jPanel20Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel91, jLabel93, jLabel95});

        jPanel20Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel90, jLabel92, jLabel94});

        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90)
                            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel91)
                                .addComponent(jTextField9)))
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField13)
                                    .addComponent(jLabel92)
                                    .addComponent(jLabel95)))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel94)
                                    .addComponent(jLabel93)
                                    .addComponent(jTextField11))
                                .addGap(47, 47, 47))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jTextField8)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jTextField10))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jTextField12)
                                .addGap(47, 47, 47)))))
                .addContainerGap())
        );

        jPanel20Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel91, jLabel93, jLabel95});

        jPanel20Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel90, jLabel92, jLabel94});

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder("Additional Information"));

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        jLabel98.setText("Comments:");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(345, 345, 345))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel98)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Code:");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1)
                        .addGap(169, 169, 169))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(35, 35, 35))))
        );

        javax.swing.GroupLayout jPanelAddStudentLayout = new javax.swing.GroupLayout(jPanelAddStudent);
        jPanelAddStudent.setLayout(jPanelAddStudentLayout);
        jPanelAddStudentLayout.setHorizontalGroup(
            jPanelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelAddStudentLayout.setVerticalGroup(
            jPanelAddStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        jPanelMainStudentCardLayout.add(jPanelAddStudent, "card3");

        jPanelViewStudent.setPreferredSize(new java.awt.Dimension(947, 553));

        jScrollPane7.setPreferredSize(new java.awt.Dimension(452, 400));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SN", "First Name", "Last Name", "Code", "Password", "Class", "Phone"
            }
        ));
        jScrollPane7.setViewportView(jTable1);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By:"));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel52.setText("Search By Teachers:");

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basic 1", "Basic 2", "Basic 3", "Basic 4", "Basic 5", "Basic 6", "Jss 1", "Jss 2", "Jss 3", "Ss 1", "Ss 2", "Ss 3" }));

        jLabel29.setText("Search By Class:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(jLabel29))
                        .addGap(0, 128, Short.MAX_VALUE))
                    .addComponent(jComboBox6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder("Search:"));
        jPanel16.setPreferredSize(new java.awt.Dimension(579, 155));

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Total By Gender"));

        jLabel55.setText("Male:");

        jLabel99.setText("Female:");

        jLabel102.setText("jLabel102");

        jLabel103.setText("jLabel103");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel99))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLabel102))
                .addGap(28, 28, 28)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel99)
                    .addComponent(jLabel103))
                .addContainerGap())
        );

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Students:"));

        jLabel53.setText("Total Students:");

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setText("10000");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53))
            .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53)
                .addGap(0, 0, 0)
                .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Total by Class:"));

        jLabel100.setText("Total In:");

        jLabel101.setText("100");

        jLabel104.setText("Name Of Teacher: ");

        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("jLabel169");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel100)
                            .addComponent(jLabel104))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel104))
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel105.setText("By All:");

        jTextField16.setPreferredSize(new java.awt.Dimension(6, 371));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(5, 5, 5))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel105))
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel42.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelViewStudentLayout = new javax.swing.GroupLayout(jPanelViewStudent);
        jPanelViewStudent.setLayout(jPanelViewStudentLayout);
        jPanelViewStudentLayout.setHorizontalGroup(
            jPanelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1511, Short.MAX_VALUE)
                    .addGroup(jPanelViewStudentLayout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelViewStudentLayout.setVerticalGroup(
            jPanelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewStudentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViewStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelMainStudentCardLayout.add(jPanelViewStudent, "card4");

        jPanelEditStudent.setPreferredSize(new java.awt.Dimension(947, 553));

        javax.swing.GroupLayout jPanelEditStudentLayout = new javax.swing.GroupLayout(jPanelEditStudent);
        jPanelEditStudent.setLayout(jPanelEditStudentLayout);
        jPanelEditStudentLayout.setHorizontalGroup(
            jPanelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1531, Short.MAX_VALUE)
        );
        jPanelEditStudentLayout.setVerticalGroup(
            jPanelEditStudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 537, Short.MAX_VALUE)
        );

        jPanelMainStudentCardLayout.add(jPanelEditStudent, "card5");

        jPanelStudentCenterDashoardHome.add(jPanelMainStudentCardLayout, java.awt.BorderLayout.CENTER);

        jPanelStudents.add(jPanelStudentCenterDashoardHome, java.awt.BorderLayout.CENTER);

        jPanelCenter.add(jPanelStudents, "card3");

        jPanelEmployee.setLayout(new java.awt.BorderLayout());

        jPanelEmployeeCenterMenu.setMinimumSize(new java.awt.Dimension(5, 30));
        jPanelEmployeeCenterMenu.setPreferredSize(new java.awt.Dimension(810, 75));
        jPanelEmployeeCenterMenu.setLayout(new java.awt.GridBagLayout());

        ButtonPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new javax.swing.ImageIcon(getClass().getResource("/icons/border2.png")))); // NOI18N
        ButtonPane1.setPreferredSize(new java.awt.Dimension(805, 40));

        btnEmployeeHome.setBackground(new java.awt.Color(204, 204, 255));
        btnEmployeeHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEmployeeHome.setText("Home");
        btnEmployeeHome.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnEmployeeHome.setContentAreaFilled(false);
        btnEmployeeHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployeeHome.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnEmployeeHome.setMinimumSize(new java.awt.Dimension(0, 0));
        btnEmployeeHome.setPreferredSize(new java.awt.Dimension(40, 17));

        btnAddEmployee.setBackground(new java.awt.Color(204, 204, 255));
        btnAddEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAddEmployee.setText("Add Employee");
        btnAddEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnAddEmployee.setContentAreaFilled(false);
        btnAddEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddEmployee.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnAddEmployee.setMinimumSize(new java.awt.Dimension(0, 0));
        btnAddEmployee.setOpaque(true);
        btnAddEmployee.setPreferredSize(new java.awt.Dimension(40, 17));

        btnEditEmployee.setBackground(new java.awt.Color(204, 204, 255));
        btnEditEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEditEmployee.setText("Edit Employee");
        btnEditEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnEditEmployee.setContentAreaFilled(false);
        btnEditEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditEmployee.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnEditEmployee.setMinimumSize(new java.awt.Dimension(0, 0));
        btnEditEmployee.setOpaque(true);
        btnEditEmployee.setPreferredSize(new java.awt.Dimension(40, 12));

        btnViewEmployee.setBackground(new java.awt.Color(204, 204, 255));
        btnViewEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnViewEmployee.setText("View Employee");
        btnViewEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnViewEmployee.setContentAreaFilled(false);
        btnViewEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewEmployee.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnViewEmployee.setMinimumSize(new java.awt.Dimension(0, 0));
        btnViewEmployee.setOpaque(true);
        btnViewEmployee.setPreferredSize(new java.awt.Dimension(40, 12));

        btnRemoveEmployee.setBackground(new java.awt.Color(204, 204, 255));
        btnRemoveEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRemoveEmployee.setText("Remove Employee");
        btnRemoveEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnRemoveEmployee.setContentAreaFilled(false);
        btnRemoveEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRemoveEmployee.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnRemoveEmployee.setMinimumSize(new java.awt.Dimension(0, 0));
        btnRemoveEmployee.setOpaque(true);
        btnRemoveEmployee.setPreferredSize(new java.awt.Dimension(40, 12));

        btnEmployeePrivilleges.setBackground(new java.awt.Color(204, 204, 255));
        btnEmployeePrivilleges.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEmployeePrivilleges.setText("Privilleges");
        btnEmployeePrivilleges.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnEmployeePrivilleges.setContentAreaFilled(false);
        btnEmployeePrivilleges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployeePrivilleges.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnEmployeePrivilleges.setMinimumSize(new java.awt.Dimension(0, 0));
        btnEmployeePrivilleges.setOpaque(true);
        btnEmployeePrivilleges.setPreferredSize(new java.awt.Dimension(40, 12));

        btnEmployeeSettings.setBackground(new java.awt.Color(204, 204, 255));
        btnEmployeeSettings.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEmployeeSettings.setText("Employee Reports");
        btnEmployeeSettings.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnEmployeeSettings.setContentAreaFilled(false);
        btnEmployeeSettings.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployeeSettings.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnEmployeeSettings.setMinimumSize(new java.awt.Dimension(0, 0));
        btnEmployeeSettings.setOpaque(true);
        btnEmployeeSettings.setPreferredSize(new java.awt.Dimension(40, 12));

        btnEmployeeReports.setBackground(new java.awt.Color(204, 204, 255));
        btnEmployeeReports.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnEmployeeReports.setText("Settings");
        btnEmployeeReports.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true)));
        btnEmployeeReports.setContentAreaFilled(false);
        btnEmployeeReports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEmployeeReports.setMaximumSize(new java.awt.Dimension(2000, 2000));
        btnEmployeeReports.setMinimumSize(new java.awt.Dimension(0, 0));
        btnEmployeeReports.setOpaque(true);
        btnEmployeeReports.setPreferredSize(new java.awt.Dimension(40, 14));

        javax.swing.GroupLayout ButtonPane1Layout = new javax.swing.GroupLayout(ButtonPane1);
        ButtonPane1.setLayout(ButtonPane1Layout);
        ButtonPane1Layout.setHorizontalGroup(
            ButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ButtonPane1Layout.createSequentialGroup()
                .addComponent(btnEmployeeHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEditEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnViewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnRemoveEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEmployeePrivilleges, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEmployeeSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEmployeeReports, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );
        ButtonPane1Layout.setVerticalGroup(
            ButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ButtonPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(ButtonPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmployeeHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployeePrivilleges, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployeeSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployeeReports, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.RELATIVE;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 5;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 30, 0);
        jPanelEmployeeCenterMenu.add(ButtonPane1, gridBagConstraints);

        jPanelEmployee.add(jPanelEmployeeCenterMenu, java.awt.BorderLayout.PAGE_START);

        jPaneEmployeeCenterDashoardHome.setBackground(new java.awt.Color(255, 255, 255));
        jPaneEmployeeCenterDashoardHome.setLayout(new java.awt.BorderLayout());

        jPanel40.setBackground(new java.awt.Color(0, 26, 66));

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1531, Short.MAX_VALUE)
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPaneEmployeeCenterDashoardHome.add(jPanel40, java.awt.BorderLayout.SOUTH);

        jPanelMainEmployeeCardLayout.setPreferredSize(new java.awt.Dimension(0, 0));
        jPanelMainEmployeeCardLayout.setLayout(new java.awt.CardLayout());

        java.awt.FlowLayout flowLayout2 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 70, 50);
        flowLayout2.setAlignOnBaseline(true);
        jPanelEmployeePaneHome.setLayout(flowLayout2);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel62.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelEmployeePaneHome.add(jLabel62);

        jLabel107.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/businessman-192.png"))));
        jLabel107.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel107.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel107.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel107.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelEmployeePaneHome.add(jLabel107);

        jLabel110.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/currency_exchange-192.png"))));
        jLabel110.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel110.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel110.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel110.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelEmployeePaneHome.add(jLabel110);

        lblAddEmployee_EmployeeHome.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/manager-192.png"))));
        lblAddEmployee_EmployeeHome.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblAddEmployee_EmployeeHome.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAddEmployee_EmployeeHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblAddEmployee_EmployeeHome.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelEmployeePaneHome.add(lblAddEmployee_EmployeeHome);

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel113.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel113.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel113.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelEmployeePaneHome.add(jLabel113);

        jLabel114.setIcon(resizeImage(new ImageIcon(getClass().getResource("/icons/sms-192.png"))));
        jLabel114.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel114.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel114.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel114.setPreferredSize(new java.awt.Dimension(128, 128));
        jPanelEmployeePaneHome.add(jLabel114);

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel116.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel116.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel116.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelEmployeePaneHome.add(jLabel116);

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel118.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel118.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel118.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanelEmployeePaneHome.add(jLabel118);
        jPanelEmployeePaneHome.add(jSeparator13);

        jPanelMainEmployeeCardLayout.add(jPanelEmployeePaneHome, "card2");

        jPanelViewEmployee.setPreferredSize(new java.awt.Dimension(813, 553));

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder("Search By:"));

        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Head Teacher", "HOD", "Head Of Prefects" }));

        jLabel148.setText("Search By Duty:");

        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basic 1", "Basic 2", "Basic 3", "Basic 4", "Basic 5", "Basic 6", "Jss 1", "Jss 2", "Jss 3", "SS 1", "SS 2", "SS 3", " " }));

        jLabel149.setText("Search By Class:");

        jLabel139.setText("Search By Position:");

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Teachers", "Minders", "Secretary", "Cashier", "Library Attendant", "Laboratory Attendant", "Drivers", "Admin" }));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox17, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel32Layout.createSequentialGroup()
                        .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel148)
                            .addComponent(jLabel149)
                            .addComponent(jLabel139))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addComponent(jLabel139)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel149)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel148)
                .addGap(4, 4, 4)
                .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder("Search:"));

        jPanel34.setBorder(javax.swing.BorderFactory.createTitledBorder("Total By Gender"));

        jLabel150.setText("Male:");

        jLabel151.setText("Female:");

        jLabel152.setText("199");

        jLabel153.setText("29");

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel34Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel150)
                    .addComponent(jLabel151))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel152, javax.swing.GroupLayout.DEFAULT_SIZE, 655, Short.MAX_VALUE)
                    .addComponent(jLabel153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel34Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel150)
                    .addComponent(jLabel152))
                .addGap(28, 28, 28)
                .addGroup(jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel151)
                    .addComponent(jLabel153))
                .addContainerGap())
        );

        jPanel35.setBorder(javax.swing.BorderFactory.createTitledBorder("Total Employee:"));

        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("10000");

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel35Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel155, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel155, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel36.setBorder(javax.swing.BorderFactory.createTitledBorder("Total by Positions:"));

        jLabel156.setText("Total In Position:");

        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("100");
        jLabel157.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel156)
                .addGap(18, 18, 18)
                .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel36Layout.createSequentialGroup()
                .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel159.setText("By All:");

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel33Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField32))
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)))
                .addContainerGap())
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel33Layout.createSequentialGroup()
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel33Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel159))
                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("View Image"));

        jLabel140.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel39.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SN", "First Name", "Last Name", "Code", "Password", "Position", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane9.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9)
                    .addContainerGap()))
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
            .addGroup(jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel39Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanelViewEmployeeLayout = new javax.swing.GroupLayout(jPanelViewEmployee);
        jPanelViewEmployee.setLayout(jPanelViewEmployeeLayout);
        jPanelViewEmployeeLayout.setHorizontalGroup(
            jPanelViewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelViewEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelViewEmployeeLayout.createSequentialGroup()
                        .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelViewEmployeeLayout.setVerticalGroup(
            jPanelViewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelViewEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelViewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelViewEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel32, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelMainEmployeeCardLayout.add(jPanelViewEmployee, "card4");

        jPanelAddEmployee.setPreferredSize(new java.awt.Dimension(940, 553));

        jPanel27.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel27.setPreferredSize(new java.awt.Dimension(920, 568));

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder("Profiles"));

        jLabel128.setText("First Name:");

        jLabel129.setText("Last Name:");

        jLabel130.setText("Other Name:");

        jLabel131.setText("Gender:");

        jLabel132.setText("Date Of Birth:");

        jLabel133.setText("State Of Origin:");

        jLabel134.setText("Place Of Birth");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jComboBox8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Basic 1", "Basic 2", "Basic 3", "Basic 4", "Basic 5", "Basic 6", "Jss 1", "Jss 2", "Jss 3", "Ss 1", "Ss 2", "Ss 3" }));

        jLabel135.setText("Mother's Name:");

        jLabel136.setText("Assign Position:");

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Teachers", "Minders", "Secretary", "Cashier", "Library Attendant", "Laboratory Attendant", "Drivers", "Admin" }));

        jLabel137.setText("Password:");

        jLabel3.setText("Assign Class:");

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel160.setText("Assign Duty:");

        jComboBox16.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Head Teacher", "HOD", "Labour Supervisor", "Punctuality Supervisor", "Chapel Supersor", "Sanitary Supersor" }));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel136)
                    .addComponent(jLabel135)
                    .addComponent(jLabel132)
                    .addComponent(jLabel131)
                    .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel128))
                .addGap(37, 37, 37)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox7, 0, 150, Short.MAX_VALUE)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel160)
                    .addComponent(jLabel3)
                    .addComponent(jLabel134)
                    .addComponent(jLabel133)
                    .addComponent(jLabel137)
                    .addComponent(jLabel129))
                .addGap(29, 29, 29)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField24)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox14, jComboBox16, jComboBox7, jComboBox8, jComboBox9, jTextField18, jTextField19, jTextField20, jTextField21, jTextField22, jTextField23, jTextField24});

        jPanel28Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel129, jLabel133, jLabel134, jLabel137, jLabel160, jLabel3});

        jPanel28Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel128, jLabel130, jLabel131, jLabel132, jLabel135, jLabel136});

        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel129))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel137)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel131)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel133)
                    .addComponent(jComboBox14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel134)
                    .addComponent(jLabel132)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel135)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel160)
                    .addComponent(jComboBox16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel136)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel28Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox14, jComboBox16, jComboBox7, jComboBox8, jComboBox9, jTextField18, jTextField19, jTextField20, jTextField21, jTextField22, jTextField23, jTextField24});

        jPanel28Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel129, jLabel133, jLabel134, jLabel137, jLabel160, jLabel3});

        jPanel28Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel128, jLabel130, jLabel131, jLabel132, jLabel135, jLabel136});

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Image", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Add-Male-User-icon.png"))); // NOI18N
        jLabel138.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jLabel138.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel138.setPreferredSize(null);

        jButton4.setText("Photos...");
        jButton4.setPreferredSize(new java.awt.Dimension(85, 23));

        jButton20.setText("Webcam...");

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20))
                .addContainerGap())
        );

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder("Address & Contacts"));

        jLabel141.setText("City:");

        jLabel142.setText("Account Number:");

        jLabel143.setText("Marital Status:");

        jLabel144.setText("Email Address:");

        jTextField30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField30ActionPerformed(evt);
            }
        });

        jComboBox15.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single", "Married" }));

        jLabel161.setText("Bank Name:");

        jLabel162.setText("Phone:");

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane8.setViewportView(jTextArea7);

        jLabel163.setText("Address:");

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel143)
                    .addComponent(jLabel141)
                    .addComponent(jLabel163))
                .addGap(41, 41, 41)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel142)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addComponent(jLabel161)
                        .addGap(44, 44, 44)
                        .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel162)
                            .addComponent(jLabel144))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField30)
                            .addComponent(jTextField33, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))))
                .addGap(36, 36, 36))
        );

        jPanel30Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel141, jLabel143, jLabel144, jLabel163});

        jPanel30Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox15, jTextField27, jTextField28, jTextField29, jTextField30, jTextField33});

        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel161))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel142)))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel163)))
                .addGap(18, 18, 18)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel141))
                            .addComponent(jLabel162))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel144)))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel143))))
                .addContainerGap())
        );

        jPanel30Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel141, jLabel143, jLabel144, jLabel163});

        jPanel30Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox15, jTextField27, jTextField28, jTextField29, jTextField30, jTextField33});

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder("Educational Information"));

        jLabel145.setText("Document ID 1");

        jLabel146.setText("Document ID 2");

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel147.setText("Educational Level");

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PhD", "Masters Degree", "BSC", "BSE", "HND", "OND", "WAEC", "NECO", "GCE", " " }));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel145)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel146)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel147)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel145)
                    .addComponent(jLabel146)
                    .addComponent(jLabel147))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel17.setText("Code:");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanelAddEmployeeLayout = new javax.swing.GroupLayout(jPanelAddEmployee);
        jPanelAddEmployee.setLayout(jPanelAddEmployeeLayout);
        jPanelAddEmployeeLayout.setHorizontalGroup(
            jPanelAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(601, Short.MAX_VALUE))
        );
        jPanelAddEmployeeLayout.setVerticalGroup(
            jPanelAddEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMainEmployeeCardLayout.add(jPanelAddEmployee, "card3");

        jPanelEditEmployee.setMinimumSize(new java.awt.Dimension(950, 581));
        jPanelEditEmployee.setPreferredSize(new java.awt.Dimension(950, 553));
        jPanelEditEmployee.setRequestFocusEnabled(false);
        jPanelEditEmployee.setVerifyInputWhenFocusTarget(false);

        jPanel37.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel37.setPreferredSize(new java.awt.Dimension(930, 470));

        jPanel38.setMinimumSize(new java.awt.Dimension(290, 255));
        jPanel38.setPreferredSize(new java.awt.Dimension(290, 255));

        jLabel154.setText("Students");

        jLabel158.setText("Employee");

        jLabel164.setText("Academic");

        jLabel165.setText("Finance");

        jLabel166.setText("Create");

        jLabel167.setText("Edit");

        jLabel168.setText("Delete");

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator14)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel154)
                            .addComponent(jLabel158)
                            .addComponent(jLabel164)
                            .addComponent(jLabel165))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel166)
                                    .addComponent(jCheckBox1))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel38Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel167))
                                    .addComponent(jCheckBox2)))
                            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel38Layout.createSequentialGroup()
                                    .addComponent(jCheckBox7)
                                    .addGap(40, 40, 40)
                                    .addComponent(jCheckBox8))
                                .addGroup(jPanel38Layout.createSequentialGroup()
                                    .addComponent(jCheckBox10)
                                    .addGap(40, 40, 40)
                                    .addComponent(jCheckBox12))
                                .addGroup(jPanel38Layout.createSequentialGroup()
                                    .addComponent(jCheckBox4)
                                    .addGap(40, 40, 40)
                                    .addComponent(jCheckBox5))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel168)
                                .addComponent(jCheckBox3))
                            .addGroup(jPanel38Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBox6)
                                    .addComponent(jCheckBox9)
                                    .addComponent(jCheckBox11))))
                        .addGap(15, 15, 15))
                    .addComponent(jSeparator15, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel38Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel167)
                            .addComponent(jLabel168)
                            .addComponent(jLabel166))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox3)))
                    .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel154)
                        .addComponent(jCheckBox1)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addComponent(jCheckBox6)
                        .addGap(29, 29, 29)
                        .addComponent(jCheckBox9)
                        .addGap(29, 29, 29)
                        .addComponent(jCheckBox11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel38Layout.createSequentialGroup()
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox5)
                            .addComponent(jLabel158, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox7)
                            .addComponent(jCheckBox8)
                            .addComponent(jLabel164, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox10)
                            .addComponent(jCheckBox12)
                            .addComponent(jLabel165, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel37Layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(229, 229, 229))
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelEditEmployeeLayout = new javax.swing.GroupLayout(jPanelEditEmployee);
        jPanelEditEmployee.setLayout(jPanelEditEmployeeLayout);
        jPanelEditEmployeeLayout.setHorizontalGroup(
            jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, 927, 927, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelEditEmployeeLayout.setVerticalGroup(
            jPanelEditEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEditEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelMainEmployeeCardLayout.add(jPanelEditEmployee, "card5");

        jPaneEmployeeCenterDashoardHome.add(jPanelMainEmployeeCardLayout, java.awt.BorderLayout.CENTER);

        jPanelEmployee.add(jPaneEmployeeCenterDashoardHome, java.awt.BorderLayout.CENTER);

        jPanelCenter.add(jPanelEmployee, "card3");

        getContentPane().add(jPanelCenter, java.awt.BorderLayout.CENTER);

        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setOpaque(false);

        jMenu1.setText("Home");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Student");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Employee");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Attendance");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Accounts");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Fee");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Tools");
        jMenuBar1.add(jMenu7);

        jMenu8.setText("Help");
        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField30ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        try {
            // OpenCVFrameGrabber grab;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        try {

            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPortal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdminPortal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonPane;
    private javax.swing.JPanel ButtonPane1;
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JButton btnAddStudent;
    private javax.swing.JButton btnEditEmployee;
    private javax.swing.JButton btnEditStudent;
    private javax.swing.JButton btnEmployeeHome;
    private javax.swing.JButton btnEmployeePrivilleges;
    private javax.swing.JButton btnEmployeeReports;
    private javax.swing.JButton btnEmployeeSettings;
    private javax.swing.JButton btnRemoveEmployee;
    private javax.swing.JButton btnRemoveStudent;
    private javax.swing.JButton btnStudent;
    private javax.swing.JButton btnStudentHome;
    private javax.swing.JButton btnStudentPrivilleges;
    private javax.swing.JButton btnStudentReports;
    private javax.swing.JButton btnStudentSettings;
    private javax.swing.JButton btnViewEmployee;
    private javax.swing.JButton btnViewStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox14;
    private javax.swing.JComboBox jComboBox15;
    private javax.swing.JComboBox jComboBox16;
    private javax.swing.JComboBox jComboBox17;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPaneEmployeeCenterDashoardHome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel jPanelAddEmployee;
    public javax.swing.JPanel jPanelAddStudent;
    public javax.swing.JPanel jPanelCenter;
    private javax.swing.JPanel jPanelCenterDashboard;
    private javax.swing.JPanel jPanelCenterDashoardHome;
    private javax.swing.JPanel jPanelCenterMenu;
    private javax.swing.JPanel jPanelEditEmployee;
    private javax.swing.JPanel jPanelEditStudent;
    public javax.swing.JPanel jPanelEmployee;
    private javax.swing.JPanel jPanelEmployeeCenterMenu;
    private javax.swing.JPanel jPanelEmployeePaneHome;
    public javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelLeftMenu;
    public javax.swing.JPanel jPanelMainEmployeeCardLayout;
    public javax.swing.JPanel jPanelMainStudentCardLayout;
    private javax.swing.JPanel jPanelStudentCenterDashoardHome;
    private javax.swing.JPanel jPanelStudentCenterMenu;
    private javax.swing.JPanel jPanelStudentPaneHome;
    public javax.swing.JPanel jPanelStudents;
    private javax.swing.JPanel jPanelViewEmployee;
    private javax.swing.JPanel jPanelViewStudent;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    public javax.swing.JLabel lblAddEmployee_EmployeeHome;
    public javax.swing.JLabel lblAddStudent_Home;
    public javax.swing.JLabel lblAddStudents_StudentHome;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblFinance;
    public javax.swing.JLabel lblHome;
    private javax.swing.JLabel lblLibraryManager;
    public javax.swing.JLabel lblStudentManager;
    // End of variables declaration//GEN-END:variables

    private void setTimeToLabel() {
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblDate.setText("Date: " + functions.getTime());
            }

        }).start();

    }

    public ImageIcon resizeImage(ImageIcon Path) {
        Image image1 = Path.getImage();
        Image newImage = image1.getScaledInstance(128, 128, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(newImage);
        return icon;
    }

    private class ButtonEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == btnStudentHome) {
                cardStudent.addLayoutComponent(jPanelStudentPaneHome, "Student Panel");
                cardStudent.show(jPanelMainStudentCardLayout, "Student Panel");

            } else if (e.getSource() == btnStudent) {
                cards.addLayoutComponent(jPanelStudents, "Student Panel");
                cards.show(jPanelCenter, "Student Panel");

            } else if (e.getSource() == btnAddStudent) {
                cardStudent.addLayoutComponent(jPanelAddStudent, "Add Student");
                cardStudent.show(jPanelMainStudentCardLayout, "Add Student");

            } else if (e.getSource() == btnViewStudent) {
                cardStudent.addLayoutComponent(jPanelViewStudent, "View Student");
                cardStudent.show(jPanelMainStudentCardLayout, "View Student");
            } else if (e.getSource() == btnAddEmployee) {
                cardEmployee.addLayoutComponent(jPanelAddEmployee, "Add Employee");
                cardEmployee.show(jPanelMainEmployeeCardLayout, "Add Employee");

            } else if (e.getSource() == btnViewEmployee) {
                cardEmployee.addLayoutComponent(jPanelAddEmployee, "View Employee");
                cardEmployee.show(jPanelMainEmployeeCardLayout, "View Employee");
            }

        }
    }

    private class MouseEvent implements MouseListener {

        @Override
        public void mouseClicked(java.awt.event.MouseEvent e) {

        }

        @Override
        public void mousePressed(java.awt.event.MouseEvent e) {
            if (e.getSource() == lblAddStudent_Home || e.getSource() == lblAddStudents_StudentHome) {
                cardStudent.addLayoutComponent(jPanelAddStudent, "Add Student");
                cardStudent.show(jPanelMainStudentCardLayout, "Add Student");

            } else if (e.getSource() == lblStudentManager) {
                cards.addLayoutComponent(jPanelStudents, "Student Panel");
                cards.show(jPanelCenter, "Student Panel");
            } else if (e.getSource() == lblHome) {
                cards.addLayoutComponent(jPanelHome, "Home");
                cards.show(jPanelCenter, "Home");

            } else if (e.getSource() == lblEmployee) {
                cards.addLayoutComponent(jPanelEmployee, "Employee Panel");
                cards.show(jPanelCenter, "Employee Panel");
            } else if (e.getSource() == lblFinance) {
                new Finance(AdminPortal.this, true).setVisible(true);
            } else if (e.getSource() == lblLibraryManager) {
                
            }

        }

        @Override
        public void mouseReleased(java.awt.event.MouseEvent e) {

        }

        @Override
        public void mouseEntered(java.awt.event.MouseEvent e) {

        }

        @Override
        public void mouseExited(java.awt.event.MouseEvent e) {

        }

    }

}
