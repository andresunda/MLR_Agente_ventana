

package com.company;

import jade.core.*;
import jade.core.behaviours.*;

public class MLRAgente extends Agent {
    private Gui Gui;
    @Override
    protected void setup() {
        System.out.println("Agent " + this.getLocalName() + " started.");
        DataSet datos = new DataSet();
        datos.Datos();
        Gui g = new Gui(this);
        g.showGui();
    }

    public void ObtenerYhat(double x1, double x2){
        System.out.println("-Agente activado-");
        addBehaviour(new Behaviour(){
            boolean end=false;
            @Override
            public void action(){

                MLR Yhat = new MLR();
                System.out.printf("El resultado es: %.4f\n",Yhat.getYhat(x1,x2));
                end =true;
            }

            public boolean done() {
                if (end==true){
                    return true;
                }
                else{
                    return false;
                }
            }

            public int onEnd(){
                System.out.println("-Agente muriendo-");
                myAgent.doDelete();
                return super.onEnd();
            }
        });
    }
}
