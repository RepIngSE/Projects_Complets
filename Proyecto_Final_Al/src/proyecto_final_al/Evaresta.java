
package proyecto_final_al;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;


public class Evaresta extends javax.swing.JFrame {
    int cont = 0; 
    int a1,a2,b1,b2,c1,c2,d1,d2,e1,e2,f1,f2,g1,g2,h1,h2,i1,i2,j1,j2;
    DefaultListModel modelolista;
    
    public Evaresta() {
        this.getContentPane().setBackground(new java.awt.Color(221, 253, 154));
        this.setLocationRelativeTo(null);//centro de la pantalla 
        this.setResizable(true);
        initComponents();
        
        a1=(int)(Math.random()*10+5);
        jTextField3.setText(String.valueOf(a1));
        a2=(int)(Math.random()*5);
        jTextField11.setText(String.valueOf(a2));
        b1=(int)(Math.random()*10+5);
        jTextField7.setText(String.valueOf(b1));
        b2=(int)(Math.random()*5);
        jTextField12.setText(String.valueOf(b2));
        c1=(int)(Math.random()*10+5);
        jTextField8.setText(String.valueOf(c1));
        c2=(int)(Math.random()*5);
        jTextField13.setText(String.valueOf(c2));
        d1=(int)(Math.random()*10+5);
        jTextField1.setText(String.valueOf(d1));
        d2=(int)(Math.random()*5);
        jTextField14.setText(String.valueOf(d2));
        e1=(int)(Math.random()*10+5);
        jTextField2.setText(String.valueOf(e1));
        e2=(int)(Math.random()*5);
        jTextField15.setText(String.valueOf(e2));
        f1=(int)(Math.random()*10+5);
        jTextField6.setText(String.valueOf(f1));
        f2=(int)(Math.random()*5);
        jTextField16.setText(String.valueOf(f2));
        g1=(int)(Math.random()*10+5);
        jTextField5.setText(String.valueOf(g1));
        g2=(int)(Math.random()*5);
        jTextField17.setText(String.valueOf(g2));
        h1=(int)(Math.random()*10+5);
        jTextField4.setText(String.valueOf(h1));
        h2=(int)(Math.random()*5);
        jTextField18.setText(String.valueOf(h2));
        i1=(int)(Math.random()*10+5);
        jTextField9.setText(String.valueOf(i1));
        i2=(int)(Math.random()*5);
        jTextField19.setText(String.valueOf(i2));
        j1=(int)(Math.random()*10+5);
        jTextField10.setText(String.valueOf(j1));
        j2=(int)(Math.random()*5);
        jTextField20.setText(String.valueOf(j2));
        
        modelolista=new  DefaultListModel();
        jList1.setModel(modelolista);
    }

    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel83 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setText("Poyecto");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton5.setText("Ir a resta");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Evaluación resta");

        jList1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jScrollPane1.setViewportView(jList1);

        jPanel1.setBackground(new java.awt.Color(191, 243, 95));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(218, 247, 166));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(218, 247, 166));
        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(218, 247, 166));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(218, 247, 166));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(218, 247, 166));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(218, 247, 166));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(218, 247, 166));
        jTextField8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField8.setText(" ");

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(218, 247, 166));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(218, 247, 166));
        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(218, 247, 166));
        jTextField10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel63.setText(" -");

        jLabel64.setText(" -");

        jLabel65.setText(" -");

        jLabel66.setText(" -");

        jLabel67.setText(" -");

        jLabel68.setText(" -");

        jLabel69.setText(" -");

        jLabel70.setText(" -");

        jLabel72.setText(" -");

        jLabel75.setText("  -");

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(218, 247, 166));
        jTextField11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jTextField11.setText(" ");

        jTextField12.setEditable(false);
        jTextField12.setBackground(new java.awt.Color(218, 247, 166));
        jTextField12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField13.setEditable(false);
        jTextField13.setBackground(new java.awt.Color(218, 247, 166));
        jTextField13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField14.setEditable(false);
        jTextField14.setBackground(new java.awt.Color(218, 247, 166));
        jTextField14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField15.setEditable(false);
        jTextField15.setBackground(new java.awt.Color(218, 247, 166));
        jTextField15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField16.setEditable(false);
        jTextField16.setBackground(new java.awt.Color(218, 247, 166));
        jTextField16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField17.setEditable(false);
        jTextField17.setBackground(new java.awt.Color(218, 247, 166));
        jTextField17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField18.setEditable(false);
        jTextField18.setBackground(new java.awt.Color(218, 247, 166));
        jTextField18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField19.setEditable(false);
        jTextField19.setBackground(new java.awt.Color(218, 247, 166));
        jTextField19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTextField20.setEditable(false);
        jTextField20.setBackground(new java.awt.Color(218, 247, 166));
        jTextField20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });

        jLabel71.setText("  = ");

        jLabel73.setText("  = ");

        jLabel74.setText("  = ");

        jLabel76.setText("  = ");

        jLabel77.setText("  = ");

        jLabel78.setText("  = ");

        jLabel79.setText("  = ");

        jLabel80.setText("  = ");

        jLabel81.setText("  = ");

        jTextField21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField21MouseEntered(evt);
            }
        });

        jTextField22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField22MouseEntered(evt);
            }
        });

        jTextField23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField23MouseEntered(evt);
            }
        });

        jTextField24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField24MouseEntered(evt);
            }
        });

        jTextField25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField25MouseEntered(evt);
            }
        });

        jTextField26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField26MouseEntered(evt);
            }
        });

        jTextField27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField27MouseEntered(evt);
            }
        });

        jTextField28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField28MouseEntered(evt);
            }
        });

        jTextField29.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField29MouseEntered(evt);
            }
        });

        jTextField30.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTextField30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField30MouseEntered(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton7.setText("Comprobar");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
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

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton6.setText("Reintentar");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel83.setText("  = ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel83, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField2)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel78, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel77, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField19)
                                                .addGap(18, 18, 18))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel81, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel65, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                            .addComponent(jTextField7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel68, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel72, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel70, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField12)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel73, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jTextField13, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel74, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel76, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField21, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                .addComponent(jTextField22)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel63)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel71)
                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel73)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel66)
                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel74)
                        .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel67)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel77)
                    .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel68)
                        .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel78)
                        .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel69)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel79)
                    .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel72)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel80)
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel81)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel75)
                        .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel83)
                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Proyecto proyecto=new Proyecto();
        proyecto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Pantalla2 res=new Pantalla2();
        res.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        //int a1;
        //a1 = jTextField3.setSelectionStart((Math.random()*10));
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

        int a=Integer.parseInt(jTextField21.getText());
        int b=Integer.parseInt(jTextField22.getText());
        int c=Integer.parseInt(jTextField23.getText());
        int d=Integer.parseInt(jTextField24.getText());
        int e=Integer.parseInt(jTextField25.getText());
        int f=Integer.parseInt(jTextField26.getText());
        int g=Integer.parseInt(jTextField27.getText());
        int h=Integer.parseInt(jTextField28.getText());
        int i=Integer.parseInt(jTextField29.getText());
        int j=Integer.parseInt(jTextField30.getText());

        if (a==(a1-a2)){
            modelolista.addElement("1- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel2.setIcon(icono);
            cont=cont+1;
        } else {
            modelolista.addElement("1- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel2.setIcon(icono);
        }
        if (b==(b1-b2)){
            modelolista.addElement("2- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel3.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("2- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel3.setIcon(icono);
        }
        if (c==(c1-c2)){
            modelolista.addElement("3- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel4.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("3- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel4.setIcon(icono);
        }
        if (d==(d1-d2)){
            modelolista.addElement("4- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel5.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("4- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel5.setIcon(icono);
        }
        if (e==(e1-e2)){
            modelolista.addElement("5- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel6.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("5- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel6.setIcon(icono);
        }
        if (f==(f1-f2)){
            modelolista.addElement("6- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel7.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("6- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel7.setIcon(icono);
        }
        if (g==(g1-g2)){
            modelolista.addElement("7- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel8.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("7- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel8.setIcon(icono);
        }
        if (h==(h1-h2)){
            modelolista.addElement("8- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel9.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("8- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel9.setIcon(icono);
        }
        if (i==(i1-i2)){
            modelolista.addElement("9- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel10.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("9- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel10.setIcon(icono);
        }
        if (j==(j1-j2)){
            modelolista.addElement("10- Gano");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-feliz-24.PNG"));
            jLabel11.setIcon(icono);
            cont=cont+1;
        }else {
            modelolista.addElement("10- Perdio");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/icons8-triste-24.PNG"));
            jLabel11.setIcon(icono);
        }
        if(cont>=0 && cont<3){
            modelolista.addElement("                                                      ------Obtuvo un puntaje bajo----- ");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/triste-tristeza (2)_1.gif"));
            jLabel12.setIcon(icono);
        }
        if(cont>=3 && cont<6){
            modelolista.addElement("                                                      ------Obtuvo un puntaje basico----- ");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/Basico (1).gif"));
            jLabel12.setIcon(icono);
        }
        if(cont>=6 && cont<8){
            modelolista.addElement("                                                      ------Obtuvo un puntaje alto----- ");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/muy-bien-minion (1) (1).gif"));
            jLabel12.setIcon(icono);
        }
        if(cont>=8 && cont<=10){
            modelolista.addElement("                                                      ------Obtuvo un puntaje sobresaliente----- ");
            ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/the-simpsons-excellent (1) (1) (1) (1).gif"));
            jLabel12.setIcon(icono);
        }
        cont = 0;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Evaresta sum=new Evaresta();
        sum.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jButton7.setBackground(new java.awt.Color(221, 253, 154));
         jButton6.setBackground(new java.awt.Color(221, 253, 154));
         jButton5.setBackground(new java.awt.Color(191,243,95));
         jButton3.setBackground(new java.awt.Color(191,243,95));
         
    }//GEN-LAST:event_jButton7MouseClicked

    private void jTextField21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField21MouseEntered
            jTextField21.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField21MouseEntered

    private void jTextField22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField22MouseEntered
           jTextField22.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField22MouseEntered

    private void jTextField23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField23MouseEntered
           jTextField23.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField23MouseEntered

    private void jTextField24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField24MouseEntered
           jTextField24.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField24MouseEntered

    private void jTextField25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField25MouseEntered
            jTextField25.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField25MouseEntered

    private void jTextField26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField26MouseEntered
           jTextField26.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField26MouseEntered

    private void jTextField27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField27MouseEntered
           jTextField27.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField27MouseEntered

    private void jTextField28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField28MouseEntered
            jTextField28.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField28MouseEntered

    private void jTextField29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField29MouseEntered
            jTextField29.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField29MouseEntered

    private void jTextField30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField30MouseEntered
            jTextField30.setBackground(new java.awt.Color(218, 247, 166));
    }//GEN-LAST:event_jTextField30MouseEntered

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
            java.util.logging.Logger.getLogger(Evaresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Evaresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Evaresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Evaresta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Evaresta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}