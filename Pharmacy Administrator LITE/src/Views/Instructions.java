package Views;

import Controllers.InstructionsConfigurations;
import Interfaces.GraphicalConfiguration;
import Models.EmployeeActions;
import javax.swing.UnsupportedLookAndFeelException;

public class Instructions extends javax.swing.JFrame implements GraphicalConfiguration {

    private final EmployeeActions employeeActions = EmployeeActions.getInstance(); // Initialize EmployeeActions instance

    /**
     * Creates new form Instructions
     */
    public Instructions() throws UnsupportedLookAndFeelException {
        initComponents(); // Initialize the components of the JFrame
        // Apply personal settings to the frame, including title, size, and icon image
        framePersonalSettings(this, "Pharmacy Administrator", 650, 580, "Images/ImageIcon (1).png");

        // Initialize instructions configurations with the current frame and employee actions
        InstructionsConfigurations instructionsConfigurations = new InstructionsConfigurations(this, employeeActions);

        this.repaint(); // Refresh the frame to reflect any changes
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 35)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Instructions for use");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setForeground(new java.awt.Color(0, 0, 0));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 20)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("# User Guide for Pharmacy Management Application\n\n## Roles and Permissions\n\n### Owner and Administrators\n- **Owner**: Full access to all functions.\n- **Administrators**: Same permissions as the owner, designated by the owner.\n\n### Auxiliaries\n- Limited access to functions related to:\n  - Product purchases or inquiries.\n  - Queries regarding suppliers, customers, and reports.\n\n## Registration\n\nTo start using the application, you need to register. The registration button will be disabled after you register, so ensure you choose a username, password, and other details carefully. Upon registration, you will assume the role of the Owner.\n\n### Steps to Register:\n1. Navigate to the login window (the one with the image of a vase).\n2. Click the \"Sign up\" button.\n3. In the registration window (the one with the image of a building), fill in your details.\n4. Read the terms and conditions (recommended).\n5. Press the \"Register\" button.\n\n## Logging In\n\n### Steps to Log In:\n1. Enter your username and password in the login window.\n2. Press \"Start.\"\n\n## Navigating the Application\n\nUpon logging in, you will be redirected to the administration panel.\n\n### Navigation:\n- A menu on the left side contains various sections.\n- To navigate, hover over a section label and click to be redirected to the corresponding panel.\n\n## Cancelling Actions\n\nEach section has a \"Cancel\" button. Press it to stop the current action and clear the fields.\n\n## Employee Management\n\n### Registering an Employee:\n1. Go to the employee panel in the Administration window.\n2. Click on the employee section in the left menu.\n3. Fill in the employee's details and select their role (Administrator or Auxiliary).\n4. Press the \"Register\" button.\n\n### Modifying an Employee:\n1. In the employee panel, select the employee you wish to modify.\n2. Update the fields with the new details.\n3. Press the \"Modify\" button.\n\n### Deleting an Employee:\n1. In the employee panel, select the employee you wish to delete.\n2. Press the \"Delete\" button.\n\n## Customer Management\n\n### Registering a Customer:\n1. Go to the customer panel in the Administration window.\n2. Click on the customer section in the left menu.\n3. Fill in the customer's details.\n4. Press the \"Register\" button.\n\n### Modifying a Customer:\n1. In the customer panel, select the customer you wish to modify.\n2. Update the fields with the new details.\n3. Press the \"Modify\" button.\n\n### Deleting a Customer:\n1. In the customer panel, select the customer you wish to delete.\n2. Press the \"Delete\" button.\n\n## Supplier Management\n\n### Registering a Supplier:\n1. Go to the supplier panel in the Administration window.\n2. Click on the supplier section in the left menu.\n3. Fill in the supplier's details.\n4. Press the \"Register\" button.\n\n### Modifying a Supplier:\n1. In the supplier panel, select the supplier you wish to modify.\n2. Update the fields with the new details.\n3. Press the \"Modify\" button.\n\n### Deleting a Supplier:\n1. In the supplier panel, select the supplier you wish to delete.\n2. Press the \"Delete\" button.\n\n## Category Management\n\n### Registering a Category:\n1. Go to the category panel in the Administration window.\n2. Click on the category section in the left menu.\n3. Enter the category name and other details.\n4. Press the \"Register\" button.\n\n### Modifying a Category:\n1. In the category panel, select the category you wish to modify.\n2. Update the fields with the new details.\n3. Press the \"Modify\" button.\n\n### Deleting a Category:\n1. In the category panel, select the category you wish to delete.\n2. Press the \"Delete\" button.\n\n## Product Management\n\n### Registering a Product:\n1. Ensure you have at least one category registered.\n2. Go to the product panel.\n3. Fill in the product details and select its category.\n4. Press the \"Register\" button.\n\n### Modifying a Product:\n1. In the product panel, select the product you wish to modify.\n2. Update the fields with the new details.\n3. Press the \"Modify\" button.\n\n### Deleting a Product:\n1. In the product panel, select the product you wish to delete.\n2. Press the \"Delete\" button.\n\n## Purchases\n\n### Registering Purchases in Process:\n1. Ensure you have at least one product, customer, and supplier registered.\n2. Go to the purchase panel.\n3. Select the product, customer, and supplier, then fill in the \"Quantity\" field.\n4. Click \"Add\" to finalize each purchase.\n5. Click \"Buy\" to complete and record the purchase in the Reports section.\n\n### Deleting a Purchase in Process:\n1. Select the purchase in process you wish to delete.\n2. Press the \"Delete\" button.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextArea1.setCaretColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextArea1.setEnabled(false);
        jTextArea1.setSelectionColor(new java.awt.Color(102, 102, 255));
        jScrollPane1.setViewportView(jTextArea1);

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ImageBack (1).png"))); // NOI18N
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBack))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
