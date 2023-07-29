
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.print.PrintService;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.PrintQuality;
import javax.print.attribute.standard.PrinterResolution;
import javax.print.attribute.standard.Sides;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author riyan
 */
public class PrintFrame extends javax.swing.JFrame {

    /**
     * Creates new form PrintFrame
     */
    public PrintFrame() {
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
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 7), new java.awt.Dimension(0, 7), new java.awt.Dimension(32767, 7));
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        certificates = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 210));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel2.setText("Certificates");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 160, 50));

        filler1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 153, 153), new java.awt.Color(255, 153, 153), null));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 10, 530));

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("jLabel3");
        name.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), new java.awt.Color(255, 153, 153)));
        name.setOpaque(true);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 440, 70));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 800, 90));

        certificates.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        certificates.setText("aaaa");
        certificates.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), null));
        jPanel1.add(certificates, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 520, 90));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setText("Profile");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 160, 50));

        profile.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        profile.setText("aaaa");
        profile.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 204, 204), null));
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 520, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 800, 680));

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 36)); // NOI18N
        jLabel5.setText("Resume Builder");

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Print/ Save as pdf");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Get the default printer job instance, which allows us to interact with the printer
        PrinterJob job = PrinterJob.getPrinterJob();

// Display the print dialog to allow the user to choose printer settings and confirm printing
        if (job.printDialog()) {
            try {
                // Set the desired resolution (dots per inch) for the image
                int dpi = 1200;

                // Calculate the scaling factor to achieve the desired DPI
                double scaleFactor = dpi / 72.0; // 72 DPI is the default resolution

                // Calculate the width and height of the BufferedImage based on the panel size and the desired DPI
                int width = (int) (jPanel1.getWidth() * scaleFactor);
                int height = (int) (jPanel1.getHeight() * scaleFactor);

                // Create a BufferedImage with the calculated width, height, and RGB color type
                BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

                // Create a Graphics2D object to draw on the BufferedImage
                Graphics2D graphics2D = image.createGraphics();

                // Scale the graphics to the desired DPI, effectively increasing the resolution of the image
                graphics2D.scale(scaleFactor, scaleFactor);

                // Print the content of jPanel1 to the BufferedImage, effectively capturing the panel content
                jPanel1.print(graphics2D);

                // Create a File object to specify the output file path for the generated PDF
                File outputFile = new File("panel_content.pdf");

                // Write the BufferedImage to the PDF file using Apache PDFBox library
                ImageIO.write(image, "pdf", outputFile);

                // Create a set of attributes to specify printing options (e.g., paper size, orientation, etc.)
                PrintRequestAttributeSet attr = new HashPrintRequestAttributeSet();

                // Add ISO A4 as the media size (standard A4 paper size: 210 x 297 mm)
                attr.add(MediaSizeName.ISO_A4);

                // Set the orientation to portrait (vertically aligned)
                attr.add(OrientationRequested.PORTRAIT);

                // Set the print quality to high
                attr.add(PrintQuality.HIGH);

                // Set the printer resolution to the desired DPI
                attr.add(new PrinterResolution(dpi, dpi, PrinterResolution.DPI));

                // Set the number of sides to be printed (in this case, one-sided printing)
                attr.add(Sides.ONE_SIDED);

                // Set the ImagePrintable instance as the Printable for the printer job
                job.setPrintable(new ImagePrintable(image, job.getPrintService()));

                // Print the panel content to the selected printer with the specified print attributes
                job.print(attr);
            } catch (PrinterException | IOException ex) {
                // Handle any exceptions that may occur during the printing process
                ex.printStackTrace();
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Define a class that implements the Printable interface, which is used for printing custom content
    private static class ImagePrintable implements Printable {

        // Declare two instance variables to store the BufferedImage and PrintService
        private final BufferedImage image;
        private final PrintService printService;

        // Constructor to initialize the instance variables when an object of this class is created
        public ImagePrintable(BufferedImage image, PrintService printService) {
            // Store the provided BufferedImage and PrintService in the instance variables
            this.image = image;
            this.printService = printService;
        }

        // Implement the print() method from the Printable interface
        @Override
        public int print(Graphics g, PageFormat pageFormat, int pageIndex) {
            // Check if the current page index is greater than 0, indicating a non-existent page
            if (pageIndex > 0) {
                // Return a flag indicating that there is no such page to print
                return Printable.NO_SUCH_PAGE;
            }

            // Cast the Graphics object to Graphics2D, which allows more advanced graphics operations
            Graphics2D g2d = (Graphics2D) g;

            // Translate the origin of the graphics to the starting point of the printable area
            g2d.translate(pageFormat.getImageableX(), pageFormat.getImageableY());

            // Draw the BufferedImage on the printable area, scaling it to fit the page
            g2d.drawImage(image, 0, 0, (int) pageFormat.getImageableWidth(), (int) pageFormat.getImageableHeight(), null);

            // Return a flag indicating that the page exists and has been printed successfully
            return Printable.PAGE_EXISTS;
        }
    }

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
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel certificates;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    public javax.swing.JLabel name;
    public javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
