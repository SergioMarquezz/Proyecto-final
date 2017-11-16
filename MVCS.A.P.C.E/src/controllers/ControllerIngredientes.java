/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.JOptionPane;
import models.ModelIngredientes;
import models.ModelConectar;
import views.ViewIngredientes;

public class ControllerIngredientes {
    
    ModelIngredientes model_ingredientes;
    ModelConectar model_conectar;
    ViewIngredientes view_ingredientes;
    String ingrediente = "Ingrediente 0";
    String registro;
    int confirmar;
    
    public ControllerIngredientes(ModelIngredientes model_ingredientes,ModelConectar model_conectar,ViewIngredientes view_ingredientes){
        
        this.model_conectar = model_conectar;
        this.model_ingredientes = model_ingredientes;
        this.view_ingredientes = view_ingredientes;
        
        initView();
        
        view_ingredientes.jbtn_primero.addActionListener(e -> this.jbtnPrimero());
        view_ingredientes.jbtn_siguiente.addActionListener(e -> this.jbtnSiguiente());
        view_ingredientes.jbtn_ultimo.addActionListener(e -> this.jbtnUltimo());
        view_ingredientes.jbtn_anterior.addActionListener(e -> this.jbtnAnterior());
        view_ingredientes.jbtn_nuevo.addActionListener(e -> this.jbtnNuevo());
        view_ingredientes.jbtn_guardar.addActionListener(e -> this.jbtnGuardar());
        view_ingredientes.jbtn_modificar.addActionListener(e -> this.jbtnActualizar());
        view_ingredientes.jbtn_eliminar.addActionListener(e -> this.jbtnEliminar());
        
    }
    
    public void initView(){
        
        model_conectar.conectarBD();
        model_ingredientes.seleccionarIngrediente();
        getValores();
    }
    
    public void getValores(){
        
        view_ingredientes.jtf_codigo.setText(ingrediente+model_ingredientes.getIdIngrediente());
        view_ingredientes.jtf_ingrediente.setText(model_ingredientes.getIngrediente());
    }
    
    public void setValores(){
        
        //model_ingredientes.setIdIngrediente(Integer.parseInt(view_ingredientes.jtf_codigo.getText()));
        model_ingredientes.setIngrediente(view_ingredientes.jtf_ingrediente.getText());
    }
    
    public void jbtnPrimero(){
        
        model_ingredientes.primerIngrediente();
        getValores();
    }
    
    public void jbtnUltimo(){
        
        model_ingredientes.ultimoIngrediente();
        getValores();
        
    }
    
    public void jbtnSiguiente(){
        
        model_ingredientes.siguienteIngrediente();
        getValores();
    }
    
    public void jbtnAnterior(){
        
        model_ingredientes.anteriorIngrediente();
        getValores();
    }
    
    public void jbtnNuevo(){
        
        view_ingredientes.jtf_codigo.setText("");
        view_ingredientes.jtf_ingrediente.setText("");
    }
    
    public void jbtnGuardar(){
        
        registro = view_ingredientes.jtf_ingrediente.getText();
        
        confirmar = JOptionPane.showConfirmDialog(null,"¿Desea guardar el ingrediente "+registro+"?","Guardar Registro",JOptionPane.YES_NO_OPTION);
        
        if(JOptionPane.OK_OPTION == confirmar){
            
            setValores();
            model_ingredientes.insertarIngrediente();
            getValores();
            model_ingredientes.seleccionarIngrediente();
            
        }
        
        else{
            
            model_ingredientes.primerIngrediente();
            getValores();
        }
       
    }
    
    public void jbtnActualizar(){
        
        registro = view_ingredientes.jtf_ingrediente.getText();
        
        confirmar = JOptionPane.showConfirmDialog(null, "¿Desea modificar el ingrediente "+registro+"?","Modificar Registro",JOptionPane.WARNING_MESSAGE,JOptionPane.WARNING_MESSAGE);
        
        if(JOptionPane.OK_OPTION == confirmar){
            
            setValores();
            model_ingredientes.actulizarIngrediente();
            getValores();
            model_ingredientes.seleccionarIngrediente();
            
        }
        
        else{
            
            model_ingredientes.primerIngrediente();
            getValores();
        }
        
    
    }
    
    public void jbtnEliminar(){
        
        registro = view_ingredientes.jtf_ingrediente.getText();
        
        confirmar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el ingrediente "+registro+"?","Eliminar Registro",JOptionPane.WARNING_MESSAGE, JOptionPane.ERROR_MESSAGE);
        
        if(JOptionPane.OK_OPTION == confirmar){
            
             setValores();
             model_ingredientes.eliminarIngrediente();
             getValores();
             model_ingredientes.seleccionarIngrediente();
            
        }
        
        else{
            
            model_ingredientes.primerIngrediente();
            getValores();
        }
       
    }
    
}
