/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Calculation extends javax.swing.JFrame {
	
	Log l = new Log();
	
	double first = 0, second = 0, temp = 0, finish = 0;
	String type, log_message;
     
    public Calculation() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    protected void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        textDisplay = new javax.swing.JTextField();
        Button2 = new javax.swing.JButton();
        Button1 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button_plus = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button_minus = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        Button_multiple = new javax.swing.JButton();
        Button_dot = new javax.swing.JButton();
        Button0 = new javax.swing.JButton();
        Button_reverse = new javax.swing.JButton();
        Button_divide = new javax.swing.JButton();
        Button_clear = new javax.swing.JButton();
        Button_result = new javax.swing.JButton();
        Button_module = new javax.swing.JButton();
        Button_square = new javax.swing.JButton();
        Button_record = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textDisplay.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        textDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textDisplay.setText("0");
        textDisplay.setEditable(false);
        
        Button1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button1.setText("1");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button2.setText("2");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button3.setText("3");
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button4.setText("4");
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button5.setText("5");
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button6.setText("6");
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button7.setText("7");
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button8.setText("8");
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button9.setText("9");
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        Button_dot.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_dot.setText(".");
        Button_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_dotActionPerformed(evt);
            }
        });

        Button0.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button0.setText("0");
        Button0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button0ActionPerformed(evt);
            }
        });

        Button_reverse.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_reverse.setText("¡¾");
        Button_reverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_reverseActionPerformed(evt);
            }
        });
        
        Button_plus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_plus.setText("+");
        Button_plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_plusActionPerformed(evt);
            }
        });
        
        Button_minus.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_minus.setText("-");
        Button_minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_minusActionPerformed(evt);
            }
        });
        
        Button_multiple.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_multiple.setText("*");
        Button_multiple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_multipleActionPerformed(evt);
            }
        });

        Button_divide.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_divide.setText("/");
        Button_divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_divideActionPerformed(evt);
            }
        });

        Button_clear.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_clear.setText("C");
        Button_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_clearActionPerformed(evt);
            }
        });

        Button_result.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_result.setText("=");
        Button_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_resultActionPerformed(evt);
            }
        });

        Button_module.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Button_module.setText("%");
        Button_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_moduleActionPerformed(evt);
            }
        });

        Button_square.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button_square.setText("x©÷ ");
        Button_square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_squareActionPerformed(evt);
            }
        });

        Button_record.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Button_record.setText("±â·Ï");
        Button_record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_recordActionPerformed(evt);
                
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()	
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(textDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Button_multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Button_clear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Button_reverse, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Button_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Button_result, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button_module, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_square, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_record, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(textDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_plus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_module, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_minus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_square, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Button_multiple, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Button0, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_reverse, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Button_divide, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Button_clear, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(Button_result, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(Button_record, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }                    

    protected void Button1ActionPerformed(java.awt.event.ActionEvent evt) {
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "1"); 
    }     
    
    protected void Button2ActionPerformed(java.awt.event.ActionEvent evt) { 
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "2"); 
    }
    
    protected void Button3ActionPerformed(java.awt.event.ActionEvent evt) {  
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "3"); 
    }
    
    protected void Button4ActionPerformed(java.awt.event.ActionEvent evt) {  
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "4"); 
    }
    
    protected void Button5ActionPerformed(java.awt.event.ActionEvent evt) {  
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "5"); 
    }
    
    protected void Button6ActionPerformed(java.awt.event.ActionEvent evt) { 
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "6"); 
    }
    
    protected void Button7ActionPerformed(java.awt.event.ActionEvent evt) { 
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "7");    
    }
    
    protected void Button8ActionPerformed(java.awt.event.ActionEvent evt) {  
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "8"); 
    }
    
    protected void Button9ActionPerformed(java.awt.event.ActionEvent evt) { 
    	if(textDisplay.getText().equals("0")){
    		textDisplay.setText("");
    	}
    	textDisplay.setText( textDisplay.getText() + "9"); 
    }
    
    protected void Button_dotActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	if(textDisplay.getText().contains(".")){
    		return;
    	}
        textDisplay.setText( textDisplay.getText() + ".");
    }
    
    protected void Button0ActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    	if(textDisplay.getText().equals("0")){
    		return;
    	}
    	textDisplay.setText( textDisplay.getText() + "0"); 
    }
    
    protected void Button_reverseActionPerformed(java.awt.event.ActionEvent evt) { 
    	
    }
    
    protected void Button_plusActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	first = Double.parseDouble(textDisplay.getText());
    	type = "+";
       
    }
    
    protected void Button_minusActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }
    
    protected void Button_multipleActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }
    
    protected void Button_divideActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }
    
    protected void Button_clearActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }
    
    protected void Button_moduleActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }
    
    protected void Button_squareActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    }

    protected void Button_resultActionPerformed(java.awt.event.ActionEvent evt) {                                              
        
    }
    
    protected void Button_recordActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	l.setVisible(true);
    	 
    }

                                              
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculation().setVisible(true);
                
                
                
            }
        });
    }
                
    protected javax.swing.JButton Button_dot;
    protected javax.swing.JButton Button0;
    protected javax.swing.JButton Button1;
    protected javax.swing.JButton Button2;
    protected javax.swing.JButton Button3;
    protected javax.swing.JButton Button4;
    protected javax.swing.JButton Button5;
    protected javax.swing.JButton Button6;
    protected javax.swing.JButton Button7;
    protected javax.swing.JButton Button8;
    protected javax.swing.JButton Button9;
    protected javax.swing.JButton Button_reverse;
    protected javax.swing.JButton Button_plus;
    protected javax.swing.JButton Button_minus;
    protected javax.swing.JButton Button_multiple;
    protected javax.swing.JButton Button_divide;
    protected javax.swing.JButton Button_module;
    protected javax.swing.JButton Button_clear;
    protected javax.swing.JButton Button_square;
    protected javax.swing.JButton Button_result;
    protected javax.swing.JButton Button_record;
    protected javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTable jTable1;
    protected javax.swing.JTextField textDisplay;                  
}
