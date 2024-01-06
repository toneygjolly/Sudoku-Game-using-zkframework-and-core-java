package SUDO;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class checkingsudo  extends SelectorComposer<Window>{
	private static final long serialVersionUID=1L;
	@Wire
    private Textbox b1, b2, b3, b4, b5, b6, b7, b8, b9,b11,b12, b13, b14, b15, b16, b17, b18, b19,
    b21, b22, b23, b24, b25, b26, b27, b28, b29;
	@Wire
    private Textbox c1,c2,c3,c4,c5,c6,c7,c8,c9,c11,c12,c13,c14,c15,c16,c17,c18,c19,
    c21,c22,c23,c24,c25,c26,c27,c28,c29;
	@Wire
    private Textbox d1,d2,d3,d4,d5,d6,d7,d8,d9,d11,d12,d13,d14,d15,d16,d17,d18,d19,
    d21,d22,d23,d24,d25,d26,d27,d28,d29;
	@Wire
	private Button checkButton;
	    @Listen("onClick=#checkButton")
	    public void calculateSum() {
	        int sum = getValueFromTextbox(b1) + getValueFromTextbox(b2) + getValueFromTextbox(b3)
	                + getValueFromTextbox(b4) + getValueFromTextbox(b5) + getValueFromTextbox(b6)
	                + getValueFromTextbox(b7) + getValueFromTextbox(b8) + getValueFromTextbox(b9);
	        int sum2 = getValueFromTextbox(b11) + getValueFromTextbox(b12) + getValueFromTextbox(b13)
            + getValueFromTextbox(b14) + getValueFromTextbox(b15) + getValueFromTextbox(b16)
            + getValueFromTextbox(b17) + getValueFromTextbox(b18) + getValueFromTextbox(b19);
	        int sum3 = getValueFromTextbox(b21) + getValueFromTextbox(b22) + getValueFromTextbox(b23)
            + getValueFromTextbox(b24) + getValueFromTextbox(b25) + getValueFromTextbox(b26)
            + getValueFromTextbox(b27) + getValueFromTextbox(b28) + getValueFromTextbox(b29);
	        int sumc1 = getValueFromTextbox(c1) + getValueFromTextbox(c2) + getValueFromTextbox(c3)
            + getValueFromTextbox(c4) + getValueFromTextbox(c5) + getValueFromTextbox(c6)
            + getValueFromTextbox(c7) + getValueFromTextbox(c8) + getValueFromTextbox(c9);
	        int sumc2 = getValueFromTextbox(c11) + getValueFromTextbox(c12) + getValueFromTextbox(c13)
            + getValueFromTextbox(c14) + getValueFromTextbox(c15) + getValueFromTextbox(c16)
            + getValueFromTextbox(c17) + getValueFromTextbox(c18) + getValueFromTextbox(c19);
	        int sumc3 = getValueFromTextbox(c21) + getValueFromTextbox(c22) + getValueFromTextbox(c23)
            + getValueFromTextbox(c24) + getValueFromTextbox(c25) + getValueFromTextbox(c26)
            + getValueFromTextbox(c27) + getValueFromTextbox(c28) + getValueFromTextbox(c29);
	        int sumd1 = getValueFromTextbox(d1) + getValueFromTextbox(d2) + getValueFromTextbox(d3)
            + getValueFromTextbox(d4) + getValueFromTextbox(d5) + getValueFromTextbox(d6)
            + getValueFromTextbox(d7) + getValueFromTextbox(d8) + getValueFromTextbox(d9);
	        int sumd2 = getValueFromTextbox(d11) + getValueFromTextbox(d12) + getValueFromTextbox(d13)
            + getValueFromTextbox(d14) + getValueFromTextbox(d15) + getValueFromTextbox(d16)
            + getValueFromTextbox(d17) + getValueFromTextbox(d18) + getValueFromTextbox(d19);
	        int sumd3 = getValueFromTextbox(d21) + getValueFromTextbox(d2) + getValueFromTextbox(d23)
            + getValueFromTextbox(d24) + getValueFromTextbox(d25) + getValueFromTextbox(d26)
            + getValueFromTextbox(d27) + getValueFromTextbox(d28) + getValueFromTextbox(d29);
	        int sumaa = getValueFromTextbox(b1) + getValueFromTextbox(b11) + getValueFromTextbox(c1)
            + getValueFromTextbox(c11) + getValueFromTextbox(d1) + getValueFromTextbox(d11)
            + getValueFromTextbox(b21) + getValueFromTextbox(c21) + getValueFromTextbox(d21);
	        int sumab = getValueFromTextbox(b2) + getValueFromTextbox(b12) + getValueFromTextbox(b22)
            + getValueFromTextbox(c2) + getValueFromTextbox(c12) + getValueFromTextbox(c22)
            + getValueFromTextbox(d2) + getValueFromTextbox(d12) + getValueFromTextbox(d22);
	        int sumac = getValueFromTextbox(b3) + getValueFromTextbox(b13) + getValueFromTextbox(b23)
            + getValueFromTextbox(c3) + getValueFromTextbox(c13) + getValueFromTextbox(c23)
            + getValueFromTextbox(d3) + getValueFromTextbox(d13) + getValueFromTextbox(d23);
	        int sumad = getValueFromTextbox(b4) + getValueFromTextbox(b14) + getValueFromTextbox(b24)
            + getValueFromTextbox(c4) + getValueFromTextbox(c14) + getValueFromTextbox(c24)
            + getValueFromTextbox(d4) + getValueFromTextbox(d14) + getValueFromTextbox(d24);
	        int sumba = getValueFromTextbox(b5) + getValueFromTextbox(b15) + getValueFromTextbox(b25)
            + getValueFromTextbox(c5) + getValueFromTextbox(c15) + getValueFromTextbox(c25)
            + getValueFromTextbox(d5) + getValueFromTextbox(d15) + getValueFromTextbox(d25);
	        int sumbb = getValueFromTextbox(b6) + getValueFromTextbox(b16) + getValueFromTextbox(b26)
            + getValueFromTextbox(c6) + getValueFromTextbox(c16) + getValueFromTextbox(c26)
            + getValueFromTextbox(d6) + getValueFromTextbox(d16) + getValueFromTextbox(d26);
	        int sumbc = getValueFromTextbox(b7) + getValueFromTextbox(b17) + getValueFromTextbox(b27)
            + getValueFromTextbox(c7) + getValueFromTextbox(c17) + getValueFromTextbox(c27)
            + getValueFromTextbox(d7) + getValueFromTextbox(d17) + getValueFromTextbox(d27);
	        int sumbd = getValueFromTextbox(b8) + getValueFromTextbox(b18) + getValueFromTextbox(b28)
            + getValueFromTextbox(c8) + getValueFromTextbox(c18) + getValueFromTextbox(c28)
            + getValueFromTextbox(d8) + getValueFromTextbox(d18) + getValueFromTextbox(d28);
	        int sumdd = getValueFromTextbox(b9) + getValueFromTextbox(b19) + getValueFromTextbox(b29)
            + getValueFromTextbox(c9) + getValueFromTextbox(c19) + getValueFromTextbox(c29)
            + getValueFromTextbox(d9) + getValueFromTextbox(d19) + getValueFromTextbox(d29);
	   
	        if (sum == 45 && sum2 == 45 && sum3 ==45 &&  sumc1==45 && sumc2==45 && sumc3==45 && sumd1==45
	        		&& sumd2 ==45 && sumd3==45 && sumaa==45 && sumab==45 && sumac==45 && sumad==45
	        		&& sumba==45 && sumbb==45 && sumbc==45 && sumbd==45 && sumbd==45) {
	            // Sum is 45
	            alert("correct good");
	        } else {
	            // Sum is not 45
	            alert("wrong try again");
	        }
	    }

	    private int getValueFromTextbox(Textbox textbox) {
	        try {
	            return Integer.parseInt(textbox.getValue());
	        } catch (NumberFormatException e) {
	            return 0;
	        }
	    }

	  	
@Wire
private Button start;
@Listen("onClick=#start")
public void start() {
	b5.setValue("5");
	b5.setDisabled(true);
	b27.setValue("5");
	b27.setDisabled(true);
	d15.setValue("9");
	d15.setDisabled(true);
	c1.setValue("3");
	c1.setDisabled(true);
	c21.setValue("1");
	c21.setDisabled(true);
	d19.setValue("1");
	d19.setDisabled(true);
	d23.setValue("9");
	d23.setDisabled(true);
}

	  

}
