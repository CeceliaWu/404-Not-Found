package javaEditor;

import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

//Syntax Editor Library
import org.fife.ui.rtextarea.*;
import org.fife.ui.rsyntaxtextarea.*;

//File IO Library
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader; 
import java.util.Scanner;

public class JavaEditorFrame extends javax.swing.JFrame {

    public JavaEditorFrame() {
        initComponents();
        initMenuTree();
        this.setLocationRelativeTo(null);
    }
	
    // <editor-fold defaultstate="collapsed" desc="Init menu tree">
    private void initMenuTree() {
        DefaultMutableTreeNode c_1 = new DefaultMutableTreeNode("Chapter 1. Java Application Security");
        c_1.add(new DefaultMutableTreeNode("1.1 What Is Security"));
        c_1.add(new DefaultMutableTreeNode("1.2 Software Used in This Book"));
        c_1.add(new DefaultMutableTreeNode("1.3 The Java SandBox"));
        c_1.add(new DefaultMutableTreeNode("1.4 Security Debugging"));
        c_1.add(new DefaultMutableTreeNode("1.5 Summary"));

        DefaultMutableTreeNode c_2 = new DefaultMutableTreeNode("Chapter 2. The Default Sandbox");
        c_2.add(new DefaultMutableTreeNode("2.1 Elements of the Java Sandbox"));
        c_2.add(new DefaultMutableTreeNode("2.2 Permissions"));
        c_2.add(new DefaultMutableTreeNode("2.3 Keystores"));
        c_2.add(new DefaultMutableTreeNode("2.4 Code Sources"));
        c_2.add(new DefaultMutableTreeNode("2.5 Policy Files"));
        c_2.add(new DefaultMutableTreeNode("2.6 The Default Sandbox"));
        c_2.add(new DefaultMutableTreeNode("2.7 The java.security File"));
        c_2.add(new DefaultMutableTreeNode("2.8 Comparison with Previous Releases"));
        c_2.add(new DefaultMutableTreeNode("2.9 Summary"));

        DefaultMutableTreeNode c_3 = new DefaultMutableTreeNode("Chapter 3. Java Language Security");
        c_3.add(new DefaultMutableTreeNode("3.1"));
        c_3.add(new DefaultMutableTreeNode("3.2"));
        c_3.add(new DefaultMutableTreeNode("3.3"));
        c_3.add(new DefaultMutableTreeNode("3.4"));

        DefaultMutableTreeNode c_4 = new DefaultMutableTreeNode("Chapter 4. The Security Manager");
        c_4.add(new DefaultMutableTreeNode("4.1"));
        c_4.add(new DefaultMutableTreeNode("4.2"));
        c_4.add(new DefaultMutableTreeNode("4.3"));
        c_4.add(new DefaultMutableTreeNode("4.4"));
        c_4.add(new DefaultMutableTreeNode("4.5"));

        DefaultMutableTreeNode c_5 = new DefaultMutableTreeNode("Chapter 5. The Access Controller");
        c_5.add(new DefaultMutableTreeNode("5.1"));
        c_5.add(new DefaultMutableTreeNode("5.2"));
        c_5.add(new DefaultMutableTreeNode("5.3"));
        c_5.add(new DefaultMutableTreeNode("5.4"));
        c_5.add(new DefaultMutableTreeNode("5.5"));
        c_5.add(new DefaultMutableTreeNode("5.6"));
        c_5.add(new DefaultMutableTreeNode("5.7"));
        c_5.add(new DefaultMutableTreeNode("5.8"));

        DefaultMutableTreeNode c_6 = new DefaultMutableTreeNode("Chapter 6. Java Class Loaders");
        c_6.add(new DefaultMutableTreeNode("6.1"));
        c_6.add(new DefaultMutableTreeNode("6.2"));
        c_6.add(new DefaultMutableTreeNode("6.3"));
        c_6.add(new DefaultMutableTreeNode("6.4"));
        c_6.add(new DefaultMutableTreeNode("6.5"));
        c_6.add(new DefaultMutableTreeNode("6.6"));

        DefaultMutableTreeNode c_7 = new DefaultMutableTreeNode("Chapter 7. Introduction to Cryptography");
        c_7.add(new DefaultMutableTreeNode("7.1"));
        c_7.add(new DefaultMutableTreeNode("7.2"));
        c_7.add(new DefaultMutableTreeNode("7.3"));
        c_7.add(new DefaultMutableTreeNode("7.4"));

        DefaultMutableTreeNode c_8 = new DefaultMutableTreeNode("Chapter 8. Security Providers");
        c_8.add(new DefaultMutableTreeNode("8.1"));
        c_8.add(new DefaultMutableTreeNode("8.2"));
        c_8.add(new DefaultMutableTreeNode("8.3"));
        c_8.add(new DefaultMutableTreeNode("8.4"));
        c_8.add(new DefaultMutableTreeNode("8.5"));
        c_8.add(new DefaultMutableTreeNode("8.6"));

        DefaultMutableTreeNode c_9 = new DefaultMutableTreeNode("Chapter 9. Keys and Certificates");
        c_9.add(new DefaultMutableTreeNode("9.1 Keys"));
        c_9.add(new DefaultMutableTreeNode("9.2 Generating Keys"));
        c_9.add(new DefaultMutableTreeNode("9.3 Key Factories"));
        c_9.add(new DefaultMutableTreeNode("9.4 Certificates"));
        c_9.add(new DefaultMutableTreeNode("9.5 Keys,Certificates,and Object Serialization"));
        c_9.add(new DefaultMutableTreeNode("9.6 Comparison with Previous Releases"));
        c_9.add(new DefaultMutableTreeNode("9.7 Summary"));

        DefaultMutableTreeNode c_10 = new DefaultMutableTreeNode("Chapter 10. Key Management");
        c_10.add(new DefaultMutableTreeNode("10.1"));

        DefaultMutableTreeNode c_11 = new DefaultMutableTreeNode("Chapter 11. Message Digests");
        c_11.add(new DefaultMutableTreeNode("11.1"));

        DefaultMutableTreeNode c_12 = new DefaultMutableTreeNode("Chapter 12. Digital Signatures");
        c_12.add(new DefaultMutableTreeNode("12.1"));

        DefaultMutableTreeNode c_13 = new DefaultMutableTreeNode("Chapter 13. Cipher-Based Encryption");
        c_13.add(new DefaultMutableTreeNode("13.1"));

        DefaultMutableTreeNode c_14 = new DefaultMutableTreeNode("Chapter 14. SSL and HTTPS");
        c_14.add(new DefaultMutableTreeNode("14.1"));

        DefaultMutableTreeNode c_15 = new DefaultMutableTreeNode("Chapter 15. Authentication and Authorization");
        c_15.add(new DefaultMutableTreeNode("15.1"));

        DefaultMutableTreeNode top = new DefaultMutableTreeNode("OReilly Java Security 2nd Edition");
        top.add(c_1);
        top.add(c_2);
        top.add(c_3);
        top.add(c_4);
        top.add(c_5);
        top.add(c_6);
        top.add(c_7);
        top.add(c_8);
        top.add(c_9);
        top.add(c_10);
        top.add(c_11);
        top.add(c_12);
        top.add(c_13);
        top.add(c_14);
        top.add(c_15);
        DefaultTreeModel MenuModel = new DefaultTreeModel(top);
        menuTree.setModel(MenuModel);

        menuTree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode node = (DefaultMutableTreeNode) menuTree.getLastSelectedPathComponent();
                label.setText((String) node.getUserObject());
            }
        });
    }//</editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitMenuAndText = new javax.swing.JSplitPane();
        textPanel = new javax.swing.JPanel();
        hSplitPane = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        scrollPaneCompile = new javax.swing.JScrollPane();
        
        jPanel2 = new javax.swing.JPanel();
        scrollPaneCode = new javax.swing.JScrollPane();
        resultArea = new javax.swing.JTextArea();
        label = new javax.swing.JLabel();
        toolBar = new javax.swing.JToolBar();
        run = new javax.swing.JButton();
        fillerLeft = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Build = new javax.swing.JButton();
        fillerRight = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        testButton = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        menuTree = new javax.swing.JTree();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuEdit = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OReilly Java Security");
        setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        setLocation(new java.awt.Point(0, 0));
        setName("frame"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1500, 900));

        splitMenuAndText.setBorder(null);
        splitMenuAndText.setDividerLocation(300);
        splitMenuAndText.setDividerSize(5);

        hSplitPane.setBorder(null);
        hSplitPane.setDividerLocation(600);
        hSplitPane.setDividerSize(5);
        hSplitPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        hSplitPane.setLastDividerLocation(0);
        hSplitPane.setMinimumSize(new java.awt.Dimension(0, 0));

        codeArea.setColumns(20);
        codeArea.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        codeArea.setRows(15);
		//Add syntax editor
		codeArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
		codeArea.setCodeFoldingEnabled(true);
		//end of syntax editor
		//Read text from files
        try{
			File CodeFile = new File("MySampleCode.java");
			FileReader fr = new FileReader(CodeFile);
			BufferedReader br = new BufferedReader(fr); 
			String codes;
			String codesDisplay="";
			while((codes = br.readLine()) != null) { 
				codesDisplay += codes +" \n"; 
			} 
			fr.close();
			codeArea.setText(codesDisplay);
		}
		catch(Exception ex)
		{	
        
		}
		//end of setText
        codeArea.setToolTipText("");
        codeArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 0));
        codeArea.setFocusTraversalPolicyProvider(true);
        scrollPaneCompile.setViewportView(codeArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneCompile, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCompile, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        hSplitPane.setTopComponent(jPanel1);

        resultArea.setEditable(false);
        resultArea.setBackground(new java.awt.Color(238, 238, 238));
        resultArea.setColumns(20);
        resultArea.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        resultArea.setRows(5);
        resultArea.setText("Test Test Test Test Test Test");
        resultArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 0));
        resultArea.setMinimumSize(new java.awt.Dimension(164, 50));
        scrollPaneCode.setViewportView(resultArea);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneCode, javax.swing.GroupLayout.DEFAULT_SIZE, 1171, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollPaneCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
        );

        hSplitPane.setRightComponent(jPanel2);

        label.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        label.setText("OReilly Java Security");

        toolBar.setBorder(null);
        toolBar.setFloatable(false);
        toolBar.setRollover(true);

        run.setBackground(java.awt.Color.white);
        run.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaEditor/run.png"))); // NOI18N
        run.setText("Run  ");
        run.setToolTipText("Run Code");
        run.setAutoscrolls(true);
        run.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        run.setFocusable(false);
        run.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        run.setIconTextGap(3);
        run.setMargin(new java.awt.Insets(0, 20, 0, 20));
        run.setName(""); // NOI18N
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });
        toolBar.add(run);
        toolBar.add(fillerLeft);

        Build.setBackground(java.awt.Color.white);
        Build.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        Build.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaEditor/compile.png"))); // NOI18N
        Build.setText("Compile");
        Build.setToolTipText("Compile");
        Build.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Build.setFocusable(false);
        Build.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Build.setIconTextGap(3);
        Build.setMargin(new java.awt.Insets(0, 20, 0, 20));
        Build.setMaximumSize(new java.awt.Dimension(90, 25));
        Build.setMinimumSize(new java.awt.Dimension(90, 25));
        Build.setPreferredSize(new java.awt.Dimension(90, 25));
        toolBar.add(Build);
        Build.getAccessibleContext().setAccessibleName("Build");

        toolBar.add(fillerRight);

        testButton.setBackground(java.awt.Color.white);
        testButton.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        testButton.setText("Test Button");
        testButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        testButton.setFocusable(false);
        testButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        testButton.setMargin(new java.awt.Insets(0, 20, 0, 20));
        testButton.setMaximumSize(new java.awt.Dimension(90, 25));
        testButton.setMinimumSize(new java.awt.Dimension(90, 25));
        testButton.setPreferredSize(new java.awt.Dimension(90, 25));
        testButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(testButton);

        javax.swing.GroupLayout textPanelLayout = new javax.swing.GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        textPanelLayout.setVerticalGroup(
            textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, textPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(textPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hSplitPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        splitMenuAndText.setRightComponent(textPanel);

        menuTree.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 1, 1));
        menuTree.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        menuTree.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        menuTree.setToolTipText("Table of Contents");
        menuTree.setRowHeight(18);
        scrollPanel.setViewportView(menuTree);

        splitMenuAndText.setLeftComponent(scrollPanel);

        menuBar.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0));
        menuBar.setForeground(new java.awt.Color(60, 63, 65));
        menuBar.setToolTipText("");
        menuBar.setMaximumSize(new java.awt.Dimension(65, 32767));
        menuBar.setMinimumSize(new java.awt.Dimension(65, 25));
        menuBar.setPreferredSize(new java.awt.Dimension(65, 25));

        menuFile.setText("File");
        menuBar.add(menuFile);

        menuEdit.setText("Edit");
        menuBar.add(menuEdit);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitMenuAndText, javax.swing.GroupLayout.DEFAULT_SIZE, 1488, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(splitMenuAndText)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleDescription("OReilly Java Security");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        // TODO add your handling code here:
         try {
                        RunSample runFunction = new RunSample();
                        //String program="public class Class { public static void main(String[] args) {System.out.println("Test!");}}";
                        String result = null;
                        String program= codeArea.getText();
                        String className = null;
                        String[] words = program.split(" ");
                        
                        for (int count = 0; count < words.length; count++) {
                            // You may want to check for a non-word character before blindly
                            // performing a replacement
                            // It may also be necessary to adjust the character class
                            
                            if(words[count].equals("class")){
                                className = words[count+1];
                                break;
                            }
                            else className = null;
                        }
						
                        resultArea.setText(className);
						
                        File newJavaFile = new File(className+".java");
                        File newClassFile = new File(className+".class");
                         FileWriter fw = new FileWriter(newJavaFile);
                        fw.write(program);
                        fw.close();
                        
                        runFunction.runProcess("javac "+className+".java");
                        result = runFunction.runProcess("java "+className);
                        resultArea.setText(result);
                       // newJavaFile.delete();
                        //newClassFile.delete();
                       
              } catch (Exception ex) {
                        ex.printStackTrace();
                    }
    }//GEN-LAST:event_runActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Build;
    private javax.swing.Box.Filler fillerLeft;
    private javax.swing.Box.Filler fillerRight;
    private javax.swing.JSplitPane hSplitPane;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JTree menuTree;
    private javax.swing.JTextArea resultArea;
    private javax.swing.JButton run;
    private javax.swing.JScrollPane scrollPaneCode;
    private javax.swing.JScrollPane scrollPaneCompile;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JSplitPane splitMenuAndText;
    private javax.swing.JButton testButton;
    private javax.swing.JPanel textPanel;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables
    //Declarate Our Own Variables
    private RSyntaxTextArea codeArea = new RSyntaxTextArea();
    //End of declaration
}
