/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase.StudentForm;
import com.sun.webkit.graphics.WCImage;
import studentdatabase.Login.Login;
import studentdatabase.StudentRegistration.StudentRegistration;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.io.File;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;
import studentdatabase.DbConnection.DBConnection;


public class StudentInformationSystem extends javax.swing.JFrame {
    public StudentInformationSystem() throws SQLException {
            
            initComponents();
            setTitle("Student Information System");
            
            setResizable(false);
            getContentPane().setBackground(Color.DARK_GRAY);
            
            Add.setToolTipText("Add"); Add.setContentAreaFilled(false);Add.setOpaque(true);Add.setBorderPainted(false);
            Refresh.setToolTipText("Refresh");Refresh.setContentAreaFilled(false);Refresh.setOpaque(true);
            Delete.setToolTipText("Delete");Delete.setContentAreaFilled(false);Delete.setOpaque(true);
            Clear.setToolTipText("Clear");Clear.setContentAreaFilled(false);Clear.setOpaque(true);
            Update.setToolTipText("Update");Update.setContentAreaFilled(false);Update.setOpaque(true);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate localDate = LocalDate.now();
            jLabel22.setText(dtf.format(localDate));
            int row=jTable1.getRowCount();
            String rows=Integer.toString(row);
            jLabel14.setText("Curre"
                    + "nt number of students is " +rows);
            DBConnection.refreshTable(jTable1);
            jTable1.setEnabled(false); 
            jComboBox1.setRenderer(new DefaultListCellRenderer(){
            public void paint(Graphics g){
            setForeground(Color.YELLOW);
            setBackground(Color.DARK_GRAY);
            super.paint(g);
                }
            });
             String [] lista={"Select","Php","C#","C++","Java","Javascipt","Python","Html","SQL"};
            for (String subject : lista) 
            {
            jComboBox1.addItem(subject);
            }
     }
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("BazaPodataka?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        add = new javax.swing.JMenuItem();
        refresh = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        jScrollBar1 = new javax.swing.JScrollBar();
        entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("bazapodataka?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        studentsQuery = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT s FROM Students s");
        studentsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentsQuery.getResultList();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        contactField = new javax.swing.JTextField();
        stateField = new javax.swing.JTextField();
        cityField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        surnameField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Clear = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        courseField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        dobField = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/if_user-add_216490.png"))); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/refresh.png"))); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/if_delete_326606.png"))); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Contact:");

        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("E-mail:");

        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Name:");

        jLabel2.setForeground(new java.awt.Color(255, 153, 51));
        jLabel2.setText("Surname:");

        jLabel3.setForeground(new java.awt.Color(255, 153, 51));
        jLabel3.setText("Student ID:");

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setForeground(new java.awt.Color(255, 153, 51));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(0, 0, 0));
        Update.setForeground(new java.awt.Color(255, 153, 51));
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(0, 0, 0));
        Delete.setForeground(new java.awt.Color(255, 153, 51));
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        contactField.setBackground(new java.awt.Color(102, 102, 102));
        contactField.setForeground(new java.awt.Color(255, 255, 0));

        stateField.setBackground(new java.awt.Color(102, 102, 102));
        stateField.setForeground(new java.awt.Color(255, 255, 0));

        cityField.setBackground(new java.awt.Color(102, 102, 102));
        cityField.setForeground(new java.awt.Color(255, 255, 0));

        emailField.setBackground(new java.awt.Color(102, 102, 102));
        emailField.setForeground(new java.awt.Color(255, 255, 0));

        surnameField.setBackground(new java.awt.Color(102, 102, 102));
        surnameField.setForeground(new java.awt.Color(255, 255, 0));

        nameField.setBackground(new java.awt.Color(102, 102, 102));
        nameField.setForeground(new java.awt.Color(255, 255, 0));

        idField.setEditable(false);
        idField.setBackground(new java.awt.Color(102, 102, 102));
        idField.setForeground(new java.awt.Color(255, 255, 0));

        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("State:");

        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("City:");

        addressField.setBackground(new java.awt.Color(102, 102, 102));
        addressField.setForeground(new java.awt.Color(255, 255, 0));

        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Address:");

        Clear.setBackground(new java.awt.Color(0, 0, 0));
        Clear.setForeground(new java.awt.Color(255, 153, 51));
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Refresh.setBackground(new java.awt.Color(0, 0, 0));
        Refresh.setForeground(new java.awt.Color(255, 153, 51));
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Course:");

        courseField.setBackground(new java.awt.Color(102, 102, 102));
        courseField.setForeground(new java.awt.Color(255, 255, 0));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/35778-200.png"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dobField.setBackground(new java.awt.Color(102, 102, 102));
        dobField.setForeground(new java.awt.Color(255, 255, 0));
        dobField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("d/M/yyyy"))));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, studentsList, jTable1);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${studentId}"));
        columnBinding.setColumnName("Student Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${surname}"));
        columnBinding.setColumnName("Surname");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${contact}"));
        columnBinding.setColumnName("Contact");
        columnBinding.setColumnClass(java.math.BigInteger.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${state}"));
        columnBinding.setColumnName("State");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${city}"));
        columnBinding.setColumnName("City");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${course}"));
        columnBinding.setColumnName("Course");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dateofbirth}"));
        columnBinding.setColumnName("Dateofbirth");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel13.setForeground(new java.awt.Color(255, 153, 51));

        jLabel14.setForeground(new java.awt.Color(255, 153, 51));

        jLabel15.setForeground(new java.awt.Color(255, 153, 51));
        jLabel15.setText("Date of birth:");

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setForeground(new java.awt.Color(255, 255, 0));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Search table:");

        jTextField2.setBackground(new java.awt.Color(102, 102, 102));
        jTextField2.setForeground(new java.awt.Color(255, 255, 0));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 153, 51));
        jLabel16.setText("Search by name:");

        jLabel17.setForeground(new java.awt.Color(255, 153, 51));
        jLabel17.setText("Search by surname");

        jLabel18.setForeground(new java.awt.Color(255, 153, 51));
        jLabel18.setText("Search by ID:");

        jTextField3.setBackground(new java.awt.Color(102, 102, 102));
        jTextField3.setForeground(new java.awt.Color(255, 255, 0));
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });

        jLabel20.setForeground(new java.awt.Color(255, 153, 0));
        jLabel20.setText("(example:dd/mm/yyyy)");

        jLabel21.setForeground(new java.awt.Color(255, 153, 0));
        jLabel21.setText("(example:name@gmail.rs/.com)");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel22.setForeground(new java.awt.Color(255, 153, 51));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/book-stack-128.gif"))); // NOI18N

        jMenu1.setText("Registration");

        jMenuItem2.setBackground(new java.awt.Color(0, 102, 153));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/Users-Student-Filled-icon.png"))); // NOI18N
        jMenuItem2.setText("Register Student");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/if_sign-out_298869.png"))); // NOI18N
        jMenuItem1.setText("Log Out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/if_icons_exit2_1564506.png"))); // NOI18N
        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Options");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/if_ic_palette_48px_352576.png"))); // NOI18N
        jMenuItem3.setText("Change background");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/img.png"))); // NOI18N
        jMenuItem6.setText("Attach image");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentdatabase/images/if_info_293683.png"))); // NOI18N
        jMenuItem4.setText("About");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel15)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(surnameField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel21)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dobField, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(143, 143, 143)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel11)
                    .addComponent(jLabel18)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(surnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(stateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(courseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
            About a=new About();
            a.setVisible(true);   
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
            JColorChooser jcc=new JColorChooser();
            Color colorchooser=jcc.showDialog(getContentPane(),"Choose color",Color.yellow);
            getContentPane().setBackground(colorchooser);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
            if(JOptionPane.YES_OPTION == JOptionPane.showConfirmDialog(this, "Do you really want to exit?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION)){
            {
                System.exit(0);
            }
        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
            StudentRegistration register=new StudentRegistration();
            register.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
    try 
        {
            if(idField.getText().equals(""))
            {
                jLabel12.setText("First select student from the table!");
            }else
            {
                int id=Integer.parseInt(idField.getText());
                DBConnection.delete(id);
                DBConnection.refreshTable(jTable1);
                JOptionPane.showMessageDialog(rootPane,"Data deleted successfully!");
                jLabel12.setText(null);
            }
        }catch (Exception e) 
            {
            JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_DeleteActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
            String emptyString="";
            String message="Some fields are missing!";
            String contact_pattern="^[0-9]{1,20}$";
            Pattern contactp=Pattern.compile(contact_pattern);
            Matcher contactm=contactp.matcher(contactField.getText());
            String email_pattern="^[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z]{2,3}$";
            Pattern p=Pattern.compile(email_pattern);
            Matcher m=p.matcher(emailField.getText());
             if(contactField.getText().length()>13){
                JOptionPane.showMessageDialog(rootPane,"Number can't contain more than 13 digits!");
                return;
            }else{
                jLabel12.setText(emptyString);   
            }
           if(contactField.getText().equals(emptyString)||!contactm.matches()){
                JOptionPane.showMessageDialog(rootPane,"Contact can only contain numbers and cant be left empty!");
                jLabel12.setText(message);
                contactField.setText(emptyString);
                return;
            }else{
                jLabel12.setText(emptyString);
            }
           if(emailField.getText().equals(emptyString)||!m.matches())
            {
                JOptionPane.showMessageDialog(rootPane,"Incorrect mail format!");
                emailField.setText(emptyString);
                jLabel12.setText(message);
                return;
             }else{
                jLabel12.setText(emptyString);
            }
            if(surnameField.getText().equals(emptyString)){
                jLabel12.setText(message);
                return;
            }else
            {
                jLabel12.setText(emptyString);
            }
            if(cityField.getText().equals(emptyString))
            {
                jLabel12.setText(message);
                return;
            }else {
                jLabel12.setText(emptyString);
            }
             if(stateField.getText().equals(emptyString)){
                jLabel12.setText(message);
                return;
            }else{
                jLabel12.setText(emptyString);
            }
            if(addressField.getText().equals(emptyString)){
                jLabel12.setText(message);
                return;
            }else{
                jLabel12.setText(emptyString);
            }
            if(courseField.getText().equals(emptyString))
            {
                jLabel12.setText(message);
                return;
            }else{
                jLabel12.setText(emptyString);
            }
            if(dobField.getText().equals(emptyString)){
                jLabel12.setText(message);
                return;
            }else{
                jLabel12.setText(emptyString);
            }
            if(nameField.getText().equals(emptyString))
            {
                jLabel12.setText(message);
                return;
            }else{
                jLabel12.setText(emptyString);
            }         
    try
        {
  
            long contact=Long.parseLong(contactField.getText());
            DBConnection.add(nameField.getText(),surnameField.getText(),contact,emailField.getText(),stateField.getText(),cityField.getText(),addressField.getText(),courseField.getText(),dobField.getText());
            JOptionPane.showMessageDialog(rootPane,"Student added!");
            DBConnection.refreshTable(jTable1);
            jTable1.setEnabled(false);
            int rows=jTable1.getRowCount();
            String rowses=Integer.toString(rows);
            jLabel14.setText("Current number of students is " +rowses);
        }catch (Exception ex) 
        {
               JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_AddActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
            String emptyString="";
            String message="Please fill in required fields!";
            String contact_pattern="^[0-9]{1,25}$";
            Pattern contactp=Pattern.compile(contact_pattern);
            Matcher contactm=contactp.matcher(contactField.getText());
            
            if(contactField.getText().equals(emptyString)||!contactm.matches())
            {
                JOptionPane.showMessageDialog(rootPane,"Contact can only contain numbers and cant be left empty!");
                jLabel12.setText(message);
                contactField.setText(emptyString);
              
            }else if(contactField.getText().length()>13){
                JOptionPane.showMessageDialog(rootPane,"Number can't contain more than 10 digits!");
                return;
            }else
            {
                jLabel12.setText(emptyString);   
            }
            
            String email_pattern="^[a-zA-Z0-9]{1,20}@[a-zA-Z0-9]{1,20}.[a-zA-Z]{2,3}$";
            Pattern mailp=Pattern.compile(email_pattern);
            Matcher mailm=mailp.matcher(emailField.getText());
        if(emailField.getText().equals(emptyString)||!mailm.matches())
        {
                JOptionPane.showMessageDialog(rootPane,"Incorrect mail format!");
                emailField.setText(emptyString);
                jLabel12.setText(message);
                return;
        }else
        {
                jLabel12.setText(emptyString);
        }
        
        if(courseField.getText().equals(emptyString))
        {
            jLabel12.setText(message);
                return;
        }else
        {
            jLabel12.setText(emptyString);
        }
        if(nameField.getText().equals(emptyString))
        {
            jLabel12.setText(message);
            return;
        }else
        {
            jLabel12.setText(emptyString);
        }
        if(surnameField.getText().equals(emptyString))
        {
            jLabel12.setText(message);
            return;
        }else
        {
            jLabel12.setText(emptyString);
        }
        if(cityField.getText().equals(emptyString))
        {
            jLabel12.setText(message);
            return;
        }else
        {
            jLabel12.setText(emptyString);
        }
        if(stateField.getText().equals(emptyString))
        {
            jLabel12.setText(message);
            return;
        }else
        {
            jLabel12.setText(emptyString);
        }
        if(addressField.getText().equals(emptyString))
        {
            jLabel12.setText(message);
            return;
        }else
        {
            jLabel12.setText(emptyString);
        }
        if(dobField.getText().equals(emptyString))
        {
            jLabel12.setText(message);
            return;
        }else
        {
            jLabel12.setText(emptyString);
        }
 try
      {
        int student_id=Integer.parseInt(idField.getText());
        long contacts=Long.parseLong(contactField.getText());
        DBConnection.update(student_id,nameField.getText(),surnameField.getText(),contacts,emailField.getText(),stateField.getText(),cityField.getText(),addressField.getText(),courseField.getText(),dobField.getText());
        JOptionPane.showMessageDialog(rootPane,"Data updated successfully!");
        DBConnection.refreshTable(jTable1);
      }catch (Exception e)
        {
             JOptionPane.showMessageDialog(this,"You have to select student before updating data!","Error",JOptionPane.ERROR_MESSAGE);
        }
        int row=jTable1.getRowCount();
        String rows=Integer.toString(row);
        jLabel14.setText("Current number of students is " +rows);
    }//GEN-LAST:event_UpdateActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        String emptyString=""; 
        idField.setText(emptyString);surnameField.setText(emptyString);nameField.setText(emptyString);
        contactField.setText(emptyString);stateField.setText(emptyString);emailField.setText(emptyString);
        cityField.setText(emptyString);addressField.setText(emptyString);courseField.setText(emptyString);
        dobField.setText(emptyString);jLabel12.setText(emptyString);jLabel19.setText(emptyString);
    }//GEN-LAST:event_ClearActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
    try 
        {
            DBConnection.refreshTable(jTable1);
            JOptionPane.showMessageDialog(rootPane,"Data refreshed!");
            jTable1.setEnabled(false);
            jLabel12.setText("");
            int rows=jTable1.getRowCount();
            String rowses=Integer.toString(rows);
            jLabel14.setText("Current number of students is " +rowses);
        }catch (SQLException ex) 
        {
                JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }  
    }//GEN-LAST:event_RefreshActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            int selectedrow=jTable1.getSelectedRow();  
            TableModel model=jTable1.getModel();
            idField.setText(model.getValueAt(selectedrow,0).toString());
            nameField.setText(model.getValueAt(selectedrow,1).toString());
            surnameField.setText(model.getValueAt(selectedrow,2).toString());
            contactField.setText(model.getValueAt(selectedrow,3).toString());
            emailField.setText(model.getValueAt(selectedrow,4).toString());
            stateField.setText(model.getValueAt(selectedrow,5).toString());
            cityField.setText(model.getValueAt(selectedrow,6).toString());
            addressField.setText(model.getValueAt(selectedrow,7).toString());
            courseField.setText(model.getValueAt(selectedrow,8).toString());
            dobField.setText(model.getValueAt(selectedrow,9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
            
            JPopupMenu popupMenu = new JPopupMenu();
            popupMenu.add(add);
            popupMenu.add(refresh);
            popupMenu.add(delete);
            jTable1.setComponentPopupMenu(popupMenu);
            Point point = evt.getPoint();
            int currentRow =jTable1.rowAtPoint(point);
            jTable1.setRowSelectionInterval(currentRow, currentRow);
            
    }//GEN-LAST:event_jTable1MouseReleased

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
                StudentRegistration sr=new StudentRegistration();
                sr.setVisible(true);
               
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       try 
        {
            int id=Integer.parseInt(idField.getText());
            DBConnection.delete(id);
            DBConnection.refreshTable(jTable1);
            JOptionPane.showMessageDialog(rootPane,"Data deleted successfully!");
        }catch (SQLException ex)
             {
                JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
             }
    }//GEN-LAST:event_deleteActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
       try 
        {
            DBConnection.refreshTable(jTable1); 
            JOptionPane.showMessageDialog(rootPane,"Data refreshed!");
        }catch (SQLException ex) 
            {
             JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
            }        
    }//GEN-LAST:event_refreshActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(JOptionPane.OK_OPTION==JOptionPane.showConfirmDialog(this,"Return to login screen?","Confirm",JOptionPane.OK_CANCEL_OPTION))
        {
            this.dispose();
            Login login=new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
         try 
        {
        if(jTextField1.getText().equals("")&& jTextField2.getText().equals("")&& jTextField3.getText().equals("")){
   
                DBConnection.refreshTable(jTable1);
       
        }else
        {
    
                DBConnection.searchname(jTable1,jTextField1);
        } 
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
       try 
        {
        if(jTextField2.getText().equals("")&& jTextField1.getText().equals("")&& jTextField3.getText().equals("")){
   
                DBConnection.refreshTable(jTable1);
       
        }else
        {
    
                DBConnection.searchsurname(jTable1,jTextField2);
        } 
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
      try 
        {
             if(jTextField3.getText().equals("")&& jTextField2.getText().equals("")&& jTextField1.getText().equals("") ){
    
                DBConnection.refreshTable(jTable1);
        
             }else
                 {
 
                DBConnection.searchID(jTable1,jTextField3);
                 }
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this,"Something went wrong","Error",JOptionPane.ERROR_MESSAGE);
        }
                                         
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String s=(String) jComboBox1.getSelectedItem();
        courseField.setText(s);
        if(jComboBox1.getSelectedItem().equals("Select")){
            courseField.setText("");
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        JFileChooser chooseer=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("*.image","jpg");
        chooseer.addChoosableFileFilter(filter);
        chooseer.showOpenDialog(null);
        File f=chooseer.getSelectedFile();
        String img_path=f.getAbsolutePath();
        ImageIcon icon=new ImageIcon(img_path);
        Image img=icon.getImage().getScaledInstance(jLabel10.getWidth(),jLabel10.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image=new ImageIcon(img);
        jLabel10.setIcon(image);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentInformationSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new StudentInformationSystem().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(StudentInformationSystem.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Update;
    private javax.swing.JMenuItem add;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField cityField;
    private javax.swing.JTextField contactField;
    private javax.swing.JTextField courseField;
    private javax.swing.JMenuItem delete;
    private javax.swing.JFormattedTextField dobField;
    private javax.swing.JTextField emailField;
    private javax.persistence.EntityManager entityManager;
    private javax.persistence.EntityManager entityManager0;
    private javax.swing.JTextField idField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField nameField;
    private javax.swing.JMenuItem refresh;
    private javax.swing.JTextField stateField;
    private java.util.List<studentdatabase.DbConnection.Students> studentsList;
    private javax.persistence.Query studentsQuery;
    private javax.swing.JTextField surnameField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
