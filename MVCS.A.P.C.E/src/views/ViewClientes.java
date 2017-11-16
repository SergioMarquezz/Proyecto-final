/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author SergioMarquez
 */
public class ViewClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewClientes
     */
    public ViewClientes() {
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jl_codigo = new javax.swing.JLabel();
        jl_nombre = new javax.swing.JLabel();
        jl_apellido_paterno = new javax.swing.JLabel();
        jl_domicilio = new javax.swing.JLabel();
        jl_telefono = new javax.swing.JLabel();
        jtf_apellido_paterno = new javax.swing.JTextField();
        jtf_codigo = new javax.swing.JTextField();
        jtf_nombre = new javax.swing.JTextField();
        jtf_domicilio = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtf_apellido_materno = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jbtn_nuevo = new javax.swing.JButton();
        jbtn_guardar = new javax.swing.JButton();
        jbtn_modificar = new javax.swing.JButton();
        jbtn_eliminar = new javax.swing.JButton();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jbtn_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_clientes = new javax.swing.JTable();
        jl_buscar = new javax.swing.JLabel();
        jtf_buscar = new javax.swing.JTextField();
        jbtn_mostrar = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("CLIENTES");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registro Clientes"));
        jPanel1.setLayout(null);

        jl_codigo.setText("Codigo");
        jPanel1.add(jl_codigo);
        jl_codigo.setBounds(20, 20, 90, 20);

        jl_nombre.setText("Nombre");
        jPanel1.add(jl_nombre);
        jl_nombre.setBounds(20, 70, 80, 20);

        jl_apellido_paterno.setText("Apellido Paterno");
        jPanel1.add(jl_apellido_paterno);
        jl_apellido_paterno.setBounds(20, 100, 130, 20);

        jl_domicilio.setText("Domicilio");
        jPanel1.add(jl_domicilio);
        jl_domicilio.setBounds(20, 160, 80, 20);

        jl_telefono.setText("Telefono");
        jPanel1.add(jl_telefono);
        jl_telefono.setBounds(20, 190, 80, 20);
        jPanel1.add(jtf_apellido_paterno);
        jtf_apellido_paterno.setBounds(150, 100, 130, 20);

        jtf_codigo.setForeground(new java.awt.Color(0, 0, 255));
        jtf_codigo.setSelectedTextColor(new java.awt.Color(0, 204, 0));
        jPanel1.add(jtf_codigo);
        jtf_codigo.setBounds(80, 20, 110, 18);
        jPanel1.add(jtf_nombre);
        jtf_nombre.setBounds(90, 70, 110, 18);
        jPanel1.add(jtf_domicilio);
        jtf_domicilio.setBounds(90, 160, 180, 18);
        jPanel1.add(jtf_telefono);
        jtf_telefono.setBounds(90, 190, 140, 18);

        jLabel1.setText("Apellido Materno");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 130, 130, 20);
        jPanel1.add(jtf_apellido_materno);
        jtf_apellido_materno.setBounds(150, 130, 130, 20);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jbtn_nuevo.setText("Nuevo");
        jPanel2.add(jbtn_nuevo);
        jbtn_nuevo.setBounds(10, 20, 100, 24);

        jbtn_guardar.setText("Guardar");
        jPanel2.add(jbtn_guardar);
        jbtn_guardar.setBounds(120, 20, 110, 24);

        jbtn_modificar.setText("Modificar");
        jPanel2.add(jbtn_modificar);
        jbtn_modificar.setBounds(10, 60, 100, 24);

        jbtn_eliminar.setText("Eliminar");
        jPanel2.add(jbtn_eliminar);
        jbtn_eliminar.setBounds(120, 60, 110, 24);

        jbtn_primero.setText("|<");
        jPanel2.add(jbtn_primero);
        jbtn_primero.setBounds(10, 140, 50, 24);

        jbtn_anterior.setText("<");
        jPanel2.add(jbtn_anterior);
        jbtn_anterior.setBounds(70, 140, 50, 24);

        jbtn_siguiente.setText(">");
        jPanel2.add(jbtn_siguiente);
        jbtn_siguiente.setBounds(130, 140, 50, 24);

        jbtn_ultimo.setText(">|");
        jPanel2.add(jbtn_ultimo);
        jbtn_ultimo.setBounds(190, 140, 50, 24);

        jbtn_cancelar.setText("Cancelar");
        jPanel2.add(jbtn_cancelar);
        jbtn_cancelar.setBounds(70, 100, 100, 24);

        jtable_clientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtable_clientes);

        jl_buscar.setText("Buscar");

        jbtn_mostrar.setText("Mostrar Todos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(20, 20, 20)
                        .addComponent(jbtn_mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_mostrar))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_cancelar;
    public javax.swing.JButton jbtn_eliminar;
    public javax.swing.JButton jbtn_guardar;
    public javax.swing.JButton jbtn_modificar;
    public javax.swing.JButton jbtn_mostrar;
    public javax.swing.JButton jbtn_nuevo;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    private javax.swing.JLabel jl_apellido_paterno;
    private javax.swing.JLabel jl_buscar;
    private javax.swing.JLabel jl_codigo;
    private javax.swing.JLabel jl_domicilio;
    private javax.swing.JLabel jl_nombre;
    private javax.swing.JLabel jl_telefono;
    public javax.swing.JTable jtable_clientes;
    public javax.swing.JTextField jtf_apellido_materno;
    public javax.swing.JTextField jtf_apellido_paterno;
    public javax.swing.JTextField jtf_buscar;
    public javax.swing.JTextField jtf_codigo;
    public javax.swing.JTextField jtf_domicilio;
    public javax.swing.JTextField jtf_nombre;
    public javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
